package com.sc.utils.pay;

import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.sc.utils.DateUtils;
import com.sc.utils.GetRandomNumber;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(MCHID).append(DateUtils.todayYyyyMmDdHhMmSs()).append(GetRandomNumber.genRandomNum(3));
        return stringBuffer.toString();
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
