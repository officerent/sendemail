package com.mail.constant;

/**
 * Created by liyongfeng on 16/8/23.
 */
public enum EmailEnum {

    SUCCESSED("0","发送成功"),
    EMAIL_IS_NULL("10000","邮件缺少关键信息"),
    FAILED("1","发送失败");

    /**
     * 状态码
     */
    private String statusCode;

    /**
     * 状态消息
     */
    private String statusMessage;

    EmailEnum(String statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * 获取消息
     * @param code 状态码
     * @return
     */
    public static String getMessage(String code){
        for(EmailEnum status: values()){
            if(status.getStatusCode().equals(code)){
                return status.getStatusMessage();
            }
        }
        return null;
    }
}
