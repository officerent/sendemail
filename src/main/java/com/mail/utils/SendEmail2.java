package com.mail.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mail.entity.Mail;
import com.mail.model.GetEmailsResult;
import com.mail.utils.EmailUtils;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class SendEmail2{
	//private static String host="smtp.92yangmao.com";
	private static String emailPlaceHolder="\\{email\\}";
	private static String url="http://www.92yangmao.com/ajax/get_emails";
	private static int timeOut=20000;
	static String  machineName="unknow";
	private static Date lastNotifyTime=null;
	private static long sentAmount=0;
	static Logger log = LoggerFactory.getLogger(SendEmail2.class);
	public static void main( String[] args ) throws Exception{
		
		String isTest=System.getProperty("is_test");
		String needSender=System.getProperty("need_sender");
		machineName=System.getProperty("machine_name");
		String delayTime=System.getProperty("delay_time");
		Long maxDelay=Long.parseLong(delayTime);//in ms
		
		GetEmailsResult getEmailsResult=null;

		if("Y".equalsIgnoreCase(isTest)){//是测试
			getEmailsResult=getEmails(isTest,needSender);
			List<String> receivers=new ArrayList<String>();
			receivers.add("xuxim99@hotmail.com");
			receivers.add("86960536@qq.com");
			receivers.add("15301392163@163.com");	
			receivers.add("ximingxu99@163.com");
			if(getEmailsResult!=null){					
				for(String receiver:receivers){
					try{
						sendEmail("root@92yangmao.com","羊毛情报站","!!!yangmao2@@@",
								"localhost",getEmailsResult.getEmailTitle(),getEmailsResult.getEmailContent(),receiver);
					}catch(Exception e){
						log.error("bad email get result",e);
					}
				}										
			}else{
				log.error("bad email get result");
			}						
		}else{//不是测试
			while(true){
				if(delayTime!=null){
					Double delay=Double.parseDouble(delayTime)*Math.random();
					Thread.sleep(delay.longValue());
				}				
				getEmailsResult=getEmails("N",needSender);
				if(getEmailsResult!=null&&getEmailsResult.getReceivers()!=null&&!getEmailsResult.getReceivers().isEmpty()){					
					for(String receiver:getEmailsResult.getReceivers()){
						if(delayTime!=null){
							Double delay=Double.parseDouble(delayTime)*Math.random();
							Thread.sleep(delay.longValue());
						}		
						try{
							sendEmail("yangmao2@92yangmao.com","羊毛情报站","yangmao-2",
									"localhost",getEmailsResult.getEmailTitle(),getEmailsResult.getEmailContent(),receiver);
							//sendEmail(getEmailsResult.getSenderEmail(),getEmailsResult.getSenderName(),getEmailsResult.getSenderPassword(),
							//	getEmailsResult.getSenderHost(),getEmailsResult.getEmailTitle(),getEmailsResult.getEmailContent(),receiver);
								sentAmount++;
								if(sentAmount%100==0){
									log.info("sent "+sentAmount+" emails till now");
								}
						}catch(EmailException e){
							log.error("bad email send result",e);
							//log.info("xxm debug1"+JSON.toJSONString(e.getStackTrace()));
							//log.info("xxm debug2"+JSON.toJSONString(e.getMessage()));
							String stackStr=getStackTrace(e);	
							if(stackStr.contains("exceed the daily limit")||
							   stackStr.contains("Daily user sending quota exceeded")||
							   stackStr.contains("User in blacklist")){
								invalidateEmail(getEmailsResult.getSenderEmail());
							}							
						}catch(Exception e){
							log.error("exception when sending email",e);
						}
					}										
				}else{
					log.error("bad email get result");
				}
			}
		}
	}
	
	
    private static void invalidateEmail(String senderEmail) {
    	log.info("invalidating email:"+senderEmail);
    	String url="http://www.92yangmao.com/ajax/invalidate_sender";
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create(); 
		HttpPost request = new HttpPost(url);
		RequestConfig config = RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).build();		
		
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();  
		request.setConfig(config);	  
		CloseableHttpResponse response=null;	
		try {
			request.addHeader("content-type", "application/x-www-form-urlencoded");
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();  
			nameValuePairs.add(new BasicNameValuePair("email", senderEmail));
			request.setEntity(new UrlEncodedFormEntity(nameValuePairs,"UTF-8")); 
			response = closeableHttpClient.execute(request);
			if (response.getStatusLine().getStatusCode() == 200) {
				String httpResult = EntityUtils.toString(response.getEntity());
				if (httpResult != null) {
					JSONObject json = JSON.parseObject(httpResult);
					log.info("http response for invalidating email is "+json);
//					if(json.getInteger("code")!=0){
//						log.error("92yangmao return bad response for invalidating email");					
//						//throw new RebatesException(Messages.FAIL_TO_GET_ORDER_KEY_CODE,Messages.FAIL_TO_GET_ORDER_KEY_MSG);
//					}			
				} else {
					log.error("http response body is null!");
				}
			} else {
				log.error("fail to invalidate email by http request:"+ response.getStatusLine().getStatusCode());
			}
		} catch (ClientProtocolException e) {
			log.error("fail to invalidate email by http request",e);
		} catch (IOException e) {
			log.error("fail to invalidate email by http request",e);
		}finally{
			try {
				if(response!=null) response.close();
				closeableHttpClient.close();
			} catch (IOException e) {
				log.error("fail to close http client",e);
			}
		}
		
	}


	private static GetEmailsResult getEmails(String isTest,String needSender) {
    	GetEmailsResult getEmailsResult=null;
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create(); 
		HttpGet request=null;
		String urlStr;
		if("Y".equalsIgnoreCase(isTest)){//测试
			urlStr=url+"?isTest=Y";
		}else{//非测试
			urlStr=url;
		}
		
		if("N".equalsIgnoreCase(needSender)){//是否需要发送者
			if(urlStr.contains("?")){
				urlStr=urlStr+"&needSender=N";
			}else{
				urlStr=urlStr+"?needSender=N";
			}
		}
		 
		request= new HttpGet(urlStr);
		RequestConfig config = RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).build();		
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();  
	 //HttpPost httpPost = new HttpPost(props.get("sms.url")); 
		request.setConfig(config);	 
		CloseableHttpResponse response=null;	
		try {
			response = closeableHttpClient.execute(request);
			if (response.getStatusLine().getStatusCode() == 200) {
				String httpResult = EntityUtils.toString(response.getEntity());
				if (httpResult != null) {
					JSONObject json = JSON.parseObject(httpResult);
					//log.info("http response for getting emails is"+json);
					if(json.getInteger("errCode")!=0){
						log.error("92yangmao return bad response");
						if(json.getInteger("errCode")==1000){
							log.error("need to change ip address");
							notifyChangeIp();
						}
					}else{
						JSONObject result=json.getJSONObject("data");
						getEmailsResult=JSON.parseObject(result.toJSONString(), GetEmailsResult.class);
						log.info("sending email "+getEmailsResult.getEmailTitle()+" to receivers:"+getEmailsResult.getReceivers()+
								" by sender:"+getEmailsResult.getSenderEmail());
					}					
				} else {
					log.error("http response body is null!");
				}
			} else {
				log.error("fail to get emails by http request:"+ response.getStatusLine().getStatusCode());
			}
		} catch (ClientProtocolException e) {
			log.error("fail to call 92yangmao to get emails",e);
		} catch (IOException e) {
			log.error("fail to call 92yangmao to get emails",e);
		}finally{
			try {
				if(response!=null) response.close();
				closeableHttpClient.close();
			} catch (IOException e) {
				log.error("fail to close http client",e);
			}
		}
		return getEmailsResult;
	}


	private static void notifyChangeIp() {
		Date now=new Date();
		if(lastNotifyTime==null||(now.getTime()-lastNotifyTime.getTime())>1000*60*60*24){
			//GetEmailsResult getEmailsResult=getEmails("Y");
			List<String> receivers=new ArrayList<String>();
			receivers.add("xuxim99@hotmail.com");
			receivers.add("86960536@qq.com");
			receivers.add("15301392163@163.com");	
			receivers.add("ximingxu99@163.com");
			//if(getEmailsResult!=null){					
				for(String receiver:receivers){
					try{
						sendEmail("yangmao1@92yangmao.com","羊毛情报站","yangmao_1",
								"localhost","机器"+machineName+"需要更换IP","机器"+machineName+"需要更换IP",receiver);
					}catch(Exception e){
						log.error("fail to send notify email",e);
					}
				}										
			//}else{
			//	log.error("bad email get result");
			//}
			lastNotifyTime=now;
		}
		
	}


	private static void sendEmail(String senderEmail, String senderName, String senderPassword, String senderHost,
			String emailTitle,String emailContent, String receiver) throws IOException,EmailException{
		log.info("sending "+emailTitle+" to receiver:"+receiver);
		Mail mail = new Mail();
        mail.setHost(senderHost); // 设置邮件服务器,如果不用163的,自己找找看相关的
        mail.setSender(senderEmail);
        //mail.set
        //mail.setReceiver("15301392163@163.com"); // 接收人
        mail.setReceiver(receiver); // 接收人
        mail.setUsername(senderEmail); // 登录账号,一般都是和邮箱名一样吧
//        if(senderPassword!=null){
//        	byte[] decodedPW=Base64.decode(senderPassword);
//        	mail.setPassword(new String(decodedPW)); // 发件人邮箱的登录密码
//        }
        
        mail.setPassword(new String(senderPassword)); // 发件人邮箱的登录密码
        
        mail.setSubject("📣 "+emailTitle);
        mail.setName(" 🐑 "+senderName);
        if(emailContent!=null){
        	 mail.setMessage(emailContent.replaceAll(emailPlaceHolder, receiver));
        }
              
        EmailUtils.send(mail);
	}

	public static String getStackTrace(Throwable aThrowable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        aThrowable.printStackTrace(printWriter);
        return result.toString();
      }

}