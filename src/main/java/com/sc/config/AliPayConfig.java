package com.sc.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by valora on 2017/5/31.
 */
public class AliPayConfig {
    @Value("${alipay.appId}")
    public static String APPID;
    
    @Value("${alipay.appSecretKey}")
    public static String APPPRIVATEKEY;
    
    @Value("${alipay.charset}")
    public static String CHARSET;
    
    @Value("${alipay.alipayPublicKey}")
    public static String ALIPAYPUBLICKEY;
    
    @Value("${alipay.notifyUrl}")
    public static String NOTIFYURL;
}
