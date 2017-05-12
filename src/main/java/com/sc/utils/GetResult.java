package com.sc.utils;

/**
 * 返回结果
 * Created by valora on 2017/4/27.
 */
public class GetResult {
    private static Result res = null;

    public static synchronized Result toJson(int errorCode, String errorMsg, String token, Object obj, int pageNum) {
        if (res == null) {
            res = new Result(errorCode, errorMsg, token, obj, pageNum);
        } else {
            res.setErrorCode(errorCode);
            res.setErrorMsg(errorMsg);
            res.setPageNum(pageNum);
            res.setResult(obj);
            res.setToken(token);
        }

        return res;
    }
}
