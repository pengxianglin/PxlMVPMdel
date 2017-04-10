package com.example.pengxl.pxlmvpmdel.base.http;

/**
 * Created by pengxl on 2017-2-15.
 */
public class ApiException extends RuntimeException {
    private static final int PASSWORD_ERROR = 101;
    private static final int USER_NOT_FOUND = 102;

    public ApiException(int resultCode) {
        this(getApiExceotionMessage(resultCode));
    }

    public ApiException(String Message) {
        super(Message);
    }

    private static String getApiExceotionMessage(int code) {
        String message = "";
        switch (code) {
            case PASSWORD_ERROR:
                message = "密码错误";
                break;
            case USER_NOT_FOUND:
                message = "该账号不存在";
                break;
            default:
                message = "未知错误，请联系管理员";
                break;
        }
        return message;
    }
}
