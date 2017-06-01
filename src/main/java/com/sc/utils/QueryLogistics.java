package com.sc.utils;

import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 物流用
 * Created by valora on 2017/6/1.
 */
public class QueryLogistics {
    private final static String HOST = "https://ali-deliver.showapi.com";
    private final static String PATH = "/showapi_expInfo";
    private final static String method = "GET";
    private final static String appcode = "72955388d1a94df7900d3ccb26e00c95";

    /**
     * 查询物流
     *
     * @param number 物流单号
     * @return
     */
    public static String query(String number) {
        Map<String, String> headers = new HashMap<>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<>();
        querys.put("com", "auto");
        querys.put("nu", number);
        try {
            HttpResponse response = HttpUtils.doGet(HOST, PATH, method, headers, querys);
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
