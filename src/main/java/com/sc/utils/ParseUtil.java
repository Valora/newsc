package com.sc.utils;

import java.math.BigDecimal;

/**
 * Created by valora on 2017/6/7.
 */
public class ParseUtil {
    public static Boolean parseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Boolean parseDecimal(String value) {
        try {
            BigDecimal bd = new BigDecimal(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Boolean parseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
