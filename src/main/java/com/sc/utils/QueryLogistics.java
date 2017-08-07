package com.sc.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 物流用
 * Created by valora on 2017/6/1.
 */
public class QueryLogistics {

    /**
     * 查询物流
     *
     * @param number 物流单号
     * @return
     */
    public static String query(String number) {
        String host = "https://ali-deliver.showapi.com";
        String path = "/showapi_expInfo";
        String method = "GET";
        String appcode = "72955388d1a94df7900d3ccb26e00c95";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();

        String expName = queryExpName(number);
        querys.put("com", expName);
        querys.put("nu", number);
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            JSONObject json = JSON.parseObject(EntityUtils.toString(response.getEntity()));
            return json.isEmpty() ? null : json.get("data").toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String queryExpName(String number) {
        String host = "https://ali-deliver.showapi.com";
        String path = "/fetchCom";
        String method = "GET";
        String appcode = "72955388d1a94df7900d3ccb26e00c95";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("nu", number);
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            JSONObject json = JSON.parseObject(EntityUtils.toString(response.getEntity()));
            String expName = "";
            if (Integer.valueOf(json.get("ret_code").toString()) == 0) {
                String data = json.get("data").toString();
                JSONObject dataJson = JSON.parseObject(data);
                expName = dataJson.get("expName").toString();
            }
            return expName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
