package com.sc.utils;

import java.util.Random;

/**
 * 生成随机数
 * Created by valora on 2017/4/27.
 */
public class GetRandomNumber {
    public static String genRandomNum(int pwd_len) {
        final int maxNum = 10;
        int i; // 生成的随机数  
        int count = 0; // 生成的密码的长度

        char[] str = { '0', '1', '2', '3', '5', '6', '7', '8', '9' };

        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while (count < pwd_len) {
            // 生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum));

            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }
}
