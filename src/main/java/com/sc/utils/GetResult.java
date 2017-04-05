package com.sc.utils;

/**
 * 返回结果类
 * Created by valora on 2017/4/5.
 */
public class GetResult {
    private static Result res = null;
    private static final Object plock = new Object();

    public static Result toJson(int errorCode, String errorMsg, String token, Object obj, int pageNum) {
        if (res == null) {
            res = new Result(errorCode, errorMsg, token, obj, pageNum);
        } else {
            res.errorCode = errorCode;
            res.errorMsg = errorMsg;
            res.token = token;
            res.result = obj;
            res.pageNum = pageNum;
        }

        return res;
    }
}
