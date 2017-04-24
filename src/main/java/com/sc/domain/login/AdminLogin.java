package com.sc.domain.login;

import lombok.Data;

/**
 * 管理员登录信息类
 * Created by valora on 2017/4/20.
 */
@Data
public class AdminLogin {
    private String cmAdminid;
    private Integer cmLevel;
    private String cmName;
    private MenuInfo tbMenu; 
}
