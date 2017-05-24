package com.sc.mapper.login;

import com.sc.domain.login.AdminLogin;

/**
 * Created by valora on 2017/5/24.
 */
public interface LoginMapper {
    AdminLogin getAdminLoginInfo(String account, String password);
}
