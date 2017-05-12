package com.sc.utils;

import java.security.MessageDigest;

/**
 * 生成MD5
 * Created by valora on 2017/4/27.
 */
public class MD5 {
    public static String getMD5(String inStr) {
        MessageDigest md5 = null;
        try {
            //初始化md5算法对象
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        //将消息变成byte数组
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];

        //计算后获得字节数组
        byte[] md5Bytes = md5.digest(byteArray);

        StringBuffer hexValue = new StringBuffer();

        //转成16进制
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString();
    }
}
