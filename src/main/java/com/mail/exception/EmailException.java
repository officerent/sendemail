package com.mail.exception;

/**
 * email异常
 * Created by liyongfeng on 16/8/23.
 */
public class EmailException extends RuntimeException {

    /**
     * 错误编码
     */
    private String errCode;

    /**
     * 错误消息
     */
    private String errMessage;

    public EmailException(){

    }

    public EmailException(String errCode, String errMessage){
        super(errMessage);
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }
}
