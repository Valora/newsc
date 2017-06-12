package com.sc.mapper.login;

import org.apache.ibatis.jdbc.SQL;

/**
 * 管理员登录类sql
 * Created by valora on 2017/4/21.
 */
@Deprecated
public class AdminLoginSqlProvider {
    public String selectLoginInfo(String account, String password){
        SQL sql = new SQL();
        sql.SELECT();
        return sql.toString();
    }
}
