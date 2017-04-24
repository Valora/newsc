package com.sc.mapper.login;

import org.apache.ibatis.jdbc.SQL;

/**
 * 厂家登录类SQL
 * Created by valora on 2017/4/18.
 */
public class SellerLoginSqlProvider {
    public String selectLoginInfo(String account, String password){
        SQL sql = new SQL();
        sql.SELECT("a.CM_SELLERID, b.CM_CODE, a.CM_SELLERNAME, a.CM_PHONE");
        sql.FROM("TB_SELLERS a");
        sql.INNER_JOIN("TB_REGISTER b ON a.CM_PHONE = b.CM_PHONE");
        sql.WHERE("a.CM_ACCOUNT=" + account + "a.CM_PASSWORD" + password);
        return sql.toString();
    };
}
