package com.sc.mapper.login;

import org.apache.ibatis.jdbc.SQL;

/**
 * 商家登录类SQL
 * Created by valora on 2017/4/18.
 */
public class UserLoginSqlProvider {
    public String selectLoginInfo(String account, String password) {
        SQL sql = new SQL();
        sql.SELECT("  a.CM_USERID,\n" +
                "  a.CM_BALANCE,\n" +
                "  a.CM_PHONE,\n" +
                "  a.CM_SHOPEADDRESS,\n" +
                "  a.CM_NAME,\n" +
                "  a.CM_LEVEL,\n" +
                "  a.CM_SHOPNAME,\n" +
                "  a.CM_INTEGRAL,\n" +
                "  b.CM_CODE");
        sql.FROM("TB_USERS a");
        sql.INNER_JOIN("TB_REGISTER b ON a.CM_PHONE = b.CM_PHONE");
        sql.WHERE("a.CM_ACCOUNT = " + account + " AND a.CM_PASSWORD ='" + password + "'");
        System.out.println(sql.toString());
        return sql.toString();
    }


    public String selectLoginInfo2(String account, String password) {
        SQL sql = new SQL();
        sql.SELECT(" CM_USERID,\n" +
                " CM_BALANCE,\n" +
                " CM_PHONE,\n" +
                " CM_LEVEL,\n" +
                " CM_SHOPNAME,\n" +
                " CM_INTEGRAL\n");
        sql.FROM("TB_USERS");
        sql.WHERE("CM_ACCOUNT = " + account + " AND CM_PASSWORD ='" + password + "'");
        return sql.toString();
    }


    public String selectLoginInfoByPhoneAndCodeI(String phone, String code) {
        SQL sql = new SQL();
        sql.SELECT("  a.CM_USERID,\n" +
                "  a.CM_BALANCE,\n" +
                "  a.CM_PHONE,\n" +
                "  a.CM_LEVEL,\n" +
                "  a.CM_SHOPNAME,\n" +
                "  a.CM_INTEGRAL,\n" +
                "  b.CM_CODE");
        sql.FROM("TB_USERS a");
        sql.INNER_JOIN("TB_REGISTER b ON a.CM_PHONE = b.CM_PHONE");
        sql.WHERE("b.CM_CODE = " + code + " AND b.CM_PHONE =" + phone);
        return sql.toString();


    }
}
