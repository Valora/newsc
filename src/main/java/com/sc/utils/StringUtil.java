package com.sc.utils;

import java.util.ArrayList;

public class StringUtil {
    public static String join(String join, ArrayList<String> strAry) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strAry.size(); i++) {
            sb.append(strAry.get(i)).append(join);
        }
        return sb.toString();
    }
}
