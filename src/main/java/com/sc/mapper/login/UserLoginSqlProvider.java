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
                "  a.CM_LEVEL,\n" +
                "  a.CM_NICKNAME,\n" +
                "  a.CM_INTEGRAL,\n" +
                "  b.CM_CODE");
        sql.FROM("TB_USERS a");
        sql.INNER_JOIN("TB_REGISTER b ON a.CM_PHONE = b.CM_PHONE");
        sql.WHERE("a.CM_ACCOUNT = " + account + " AND a.CM_PASSWORD =" + password);
        return sql.toString();
    }
}
