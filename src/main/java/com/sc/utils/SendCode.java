package com.sc.utils;

import com.yunpian.sdk.YunpianClient;

import java.util.Map;

/**
 * 验证码发送
 * Created by valora on 2017/4/15.
 */
public class SendCode {
    public static Boolean send(Long Phone, int code) {
        YunpianClient clnt = new YunpianClient("").init();

        Map<String, String> param = clnt.newParam(3);
        param.put(YunpianClient.EMERGENCY_CONTACT, "yunpian");
        param.put(YunpianClient.EMERGENCY_MOBILE, "11111111111");
        param.put(YunpianClient.ALARM_BALANCE, "10");
//        clnt.sms();
        clnt.close();

        return false;
    }
}
