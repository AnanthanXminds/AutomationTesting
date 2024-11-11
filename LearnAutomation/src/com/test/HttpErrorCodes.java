package com.test;

import java.util.Arrays;
import java.util.Scanner;

public enum HttpErrorCodes {
    NOT_FOUND("404","Resource Not Found"),
    SERVER_ERROR("500","Internal Server Error"),
    BAD_REQUEST("400","Bad Request"),
    ACCESS_FORBIDDEN("403","Forbidden error");
    private final String errorCode;
    private final String errorMessage;
    HttpErrorCodes(String errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public String getStatusCode(){
        return errorCode;
    }
    public static String getErrorMessage(String errorCode){
        for (HttpErrorCodes codes : HttpErrorCodes.values()){
            if (codes.getStatusCode().equals(errorCode)){
                return codes.errorMessage;
            }
        }
        return "Invalid error code";
    }
}
