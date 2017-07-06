package com.sc.domain.login;

import lombok.Data;

/**
 * Created by valora on 2017/4/21.
 */
@Data
public class AdminLoginInfo {
    private String CM_ADMINID;
    private Integer CM_LEVEL;
    private String CM_NAME;
    private String CM_MENUURL;
    private String CM_MENUNAME;
}
