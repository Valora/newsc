package com.sc.utils;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 结果类
 * Created by valora on 2017/4/27.
 */
public class Result {
    public int getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(int errorCode) {
        ErrorCode = errorCode;
    }

    public String getErrorMsg() {
        return ErrorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        ErrorMsg = errorMsg;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public Object getResult() {
        return Result;
    }

    public void setResult(Object result) {
        Result = result;
    }

    public int getPageNum() {
        return PageNum;
    }

    public void setPageNum(int pageNum) {
        PageNum = pageNum;
    }

    public Result(int errorCode, String errorMsg, String token, Object result, int pageNum) {
        ErrorCode = errorCode;
        ErrorMsg = errorMsg;
        Token = token;
        Result = result;
        PageNum = pageNum;
    }

    @JSONField(name = "ErrorCode")
    private int ErrorCode;
    @JSONField(name = "ErrorMsg")
    private String ErrorMsg;
    @JSONField(name = "Token")
    private String Token;
    @JSONField(name = "Result")
    private Object Result;
    @JSONField(name = "PageNum")
    private int PageNum;
}
