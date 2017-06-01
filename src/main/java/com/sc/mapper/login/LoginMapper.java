package com.sc.mapper.login;

import com.sc.domain.login.AdminLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by valora on 2017/5/24.
 */
@Mapper
public interface LoginMapper {
    AdminLogin getAdminLoginInfo(@Param("account") String account, @Param("password") String password);
}
