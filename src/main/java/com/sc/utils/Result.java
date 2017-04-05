package com.sc.utils;

import lombok.Data;

/**
 * 结果类
 * Created by valora on 2017/4/5.
 */
@Data
public class Result {
    public int errorCode;
    public String errorMsg;
    public String token;
    public int pageNum;
    public Object result;

    public Result(int errorCode, String errorMsg, String token, Object result, int pageNum) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.token = token;
        this.pageNum = pageNum;
        this.result = result;
    }
}
