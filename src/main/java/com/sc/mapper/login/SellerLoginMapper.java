package com.sc.mapper.login;

import com.sc.domain.login.SellerLogin;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * 厂家登录Mapper
 * Created by valora on 2017/4/18.
 */
public interface SellerLoginMapper {
    @SelectProvider(type = SellerLoginSqlProvider.class, method = "selectLoginInfo")
    @Results({
            @Result(column = "CM_SELLERID", property = "CM_SELLERID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CODE", property = "CM_CODE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SELLERNAME", property = "CM_SELLERNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.BIGINT)
    })
    List<SellerLogin> selectLoginInfo(String account, String password); 
}
