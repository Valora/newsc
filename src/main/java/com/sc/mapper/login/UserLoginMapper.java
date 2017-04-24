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
            @Result(column = "CM_USERID", property = "cmUserid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_NICKNAME", property = "cmNickname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "cmPhone", jdbcType = JdbcType.BIGINT),
            @Result(column = "CM_INTEGRAL", property = "cmIntegral", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_BALANCE", property = "cmBalance", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_LEVEL", property = "cmLevel", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_CODE", property = "cmCode", jdbcType = JdbcType.INTEGER)
    })
    List<UserLogin> selectLoginInfo(String account, String password);
}
