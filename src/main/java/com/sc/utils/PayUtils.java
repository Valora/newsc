package com.sc.utils;

import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.util.SignUtils;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by valora on 2017/5/27.
 */
public class PayUtils {
    @Value("${wechat.pay.mchId}")
    private static String MCHID;

    @Value("${wechat.pay.mchKey}")
    private static String KEY;

    @Value("${wechat.pay.appId}")
    private static String APPID;

    /**
     * 生成商户订单号
     *
     * @return
     */
    public static String generateOutTradeNo() {
        return "{0}{1}{2}" + MCHID + DateUtils.todayYyyyMmDdHhMmSs() + GetRandomNumber.genRandomNum(3);
    }

    /**
     * 生成签名
     *
     * @return
     */
    public static String createSign() {
        Map<String, String> params = new HashMap<>();
        params.put("mch_id", MCHID);
        params.put("key", KEY);
        params.put("appid", APPID);
        return SignUtils.createSign(params, KEY);
    }

    /**
     * WexinApp 用payjson
     *
     * @param result
     * @return
     */
    public static String getPayJson(WxPayUnifiedOrderResult result) {
        String prepay_id = result.getPrepayId();
        String nonce_str = result.getNonceStr();
        String appid = result.getAppid();
        String sign = result.getSign();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateUtils.DF_YYYY_MM_DD_HH_MM_SS));
        return "{\"appId\":\"" + appid + "\",\"timeStamp\":\"" + timestamp + "\",\"nonceStr\":\"" + nonce_str + "\",\"package\":\"prepay_id=" + prepay_id + "\",\"signType\":\"MD5\",\"paySign\":\"" + sign + "\"}";
    }
}
