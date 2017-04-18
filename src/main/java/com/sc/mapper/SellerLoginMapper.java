package com.sc.mapper;

import com.sc.domain.SellerLogin;
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
            @Result(column = "CM_SELLERID", property = "cmSellerid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CODE", property = "cmCode", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SELLERNAME", property = "cmSellerName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "cmPhone", jdbcType = JdbcType.BIGINT)
    })
    List<SellerLogin> selectLoginInfo(String account, String password); 
}
