package com.sc.mapper.login;

import com.sc.domain.login.UserLogin;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * 商家登录Mapper
 * Created by valora on 2017/4/18.
 */
public interface UserLoginMapper {
    @SelectProvider(type = UserLoginSqlProvider.class, method = "selectLoginInfo")
    @Results({
            @Result(column = "CM_USERID", property = "CM_USERID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPNAME", property = "CM_SHOPNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.BIGINT),
            @Result(column = "CM_INTEGRAL", property = "CM_INTEGRAL", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_BALANCE", property = "CM_BALANCE", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_LEVEL", property = "CM_LEVEL", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_CODE", property = "CM_CODE", jdbcType = JdbcType.INTEGER)
    })
    List<UserLogin> selectLoginInfo(String account, String password);

    @SelectProvider(type = UserLoginSqlProvider.class, method = "selectLoginInfo2")
    @Results({
            @Result(column = "CM_USERID", property = "CM_USERID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPNAME", property = "CM_SHOPNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.BIGINT),
            @Result(column = "CM_INTEGRAL", property = "CM_INTEGRAL", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_BALANCE", property = "CM_BALANCE", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_LEVEL", property = "CM_LEVEL", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_CODE", property = "CM_CODE", jdbcType = JdbcType.INTEGER)
    })
    List<UserLogin> selectLoginInfo2(String account, String password);


    @SelectProvider(type = UserLoginSqlProvider.class, method = "selectLoginInfoByPhoneAndCodeI")
    @Results({
            @Result(column = "CM_USERID", property = "CM_USERID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPNAME", property = "CM_SHOPNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.BIGINT),
            @Result(column = "CM_INTEGRAL", property = "CM_INTEGRAL", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_BALANCE", property = "CM_BALANCE", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_LEVEL", property = "CM_LEVEL", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_CODE", property = "CM_CODE", jdbcType = JdbcType.INTEGER)
    })
    List<UserLogin> selectLoginInfoByPhoneAndCode(String phone, String code);
}
