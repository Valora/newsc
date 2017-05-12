package com.sc.utils;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/*
 * Created by valora on 2017/5/12.
 */
public class SendCode {
    private static final String ACCOUNT = "23746703";
    private static final String PASSWORD = "30d8dfba2daaf3aec1939f27c7de95f5";
    private static final String URL = "http://gw.api.taobao.com/router/rest";
    public static boolean sendCode(String phone, Integer code, Integer type) {
        String smsTemplateCode = "";
        String smsParam = "";
        switch (type) {
            case 1:
                smsTemplateCode = "SMS_61045125";
                smsParam = "{'code':'" + code + "','product':'童E家'}";
                break;
            case 2:
                smsTemplateCode = "SMS_61045123";
                smsParam = "{'code':'" + code + "','product':'童E家'}";
                break;
            case 3:
                smsTemplateCode = "SMS_61045121";
                smsParam = "{'code':'" + code + "','product':'童E家'}";
                break;
            case 4:
                smsTemplateCode = "SMS_61045119";
                smsParam = "{'code':'" + code + "','product':'童E家'}";
                break;
        }
        TaobaoClient client = new DefaultTaobaoClient(URL, ACCOUNT, PASSWORD, "json");
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setSmsType("normal");
        req.setSmsParamString(smsParam);
        req.setRecNum(phone);
        req.setSmsFreeSignName("浙江汉联");
        req.setSmsTemplateCode(smsTemplateCode);
        try {
            AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
            if (rsp.getBody().contains("true")) {
                return true;
            } else {
                return false;
            }
        } catch (ApiException e) {
            return false;
        }
    }
}
