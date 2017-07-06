package com.sc.domain.login;

import lombok.Data;

/**
 * 管理员登录信息类
 * Created by valora on 2017/4/20.
 */
@Data
public class AdminLogin {
    private String CM_ADMINID;
    private Integer CM_LEVEL;
    private String CM_NAME;
    private MenuInfo TB_MENU;
}
