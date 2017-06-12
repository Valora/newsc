package com.sc.mapper.login;

import com.sc.domain.login.AdminLoginInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * 管理员登录接口
 * Created by valora on 2017/4/20.
 */
@Deprecated
public interface AdminLoginMapper {
    @SelectProvider(type = SellerLoginSqlProvider.class, method = "selectLoginInfo")
    @Results({
            @Result(column = "CM_ADMINID", property = "cmAdminid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LEVEL", property = "cmLevel", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_NAME", property = "cmName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_MENUURL", property = "cmMenuurl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_MENUNAME", property = "cmMenuname", jdbcType = JdbcType.VARCHAR)
    })
    List<AdminLoginInfo> selectLoginInfo(String account, String password);
}
