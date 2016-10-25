package com.mail.utils;


import com.mail.entity.Mail;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * 邮件发送工具实现类
 *
 * @author shadow
 * @create 2013/07/12
 */
@Slf4j
public class EmailUtils {


    /**
     * 发送邮件公共方法
     * @param mail 邮件内容
     * @return
     */
    public static void send(Mail mail) throws EmailException{
        // 发送email
        HtmlEmail email = new HtmlEmail();
//        try {
            // 这里是SMTP发送服务器的名字：163的如下："smtp.163.com"

            email.setHostName(mail.getHost());
            // 字符编码集的设置
            email.setCharset(Mail.ENCODEING);
            // 收件人的邮箱
            email.addTo(mail.getReceiver());
            // 发送人的邮箱
            email.setFrom(mail.getSender(), mail.getName());
            // 如果需要认证信息的话，设置认证：用户名-密码。分别为发件人在邮件服务器上的注册名称和密码
            email.setAuthentication(mail.getUsername(), mail.getPassword());
            // 要发送的邮件主题
            email.setSubject(mail.getSubject());
            // 要发送的信息，由于使用了HtmlEmail，可以在邮件内容中使用HTML标签
            email.setMsg(mail.getMessage());
            
            if("smtp.gmail.com".equals(mail.getHost())||
            	"smtp.qq.com".equals(mail.getHost())){
            	email.setSSL(true);
            }
          
            // 发送
            email.send();

//            return true;
//        } catch (EmailException e) {
//        	log.info("fail to send to email addr:"+mail.getReceiver()+" by sender:"+mail.getSender(),e);
//            return false;
//        }
    }

}
