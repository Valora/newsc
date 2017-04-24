package com.sc.domain.login;

import lombok.Data;

/**
 * Created by valora on 2017/4/21.
 */
@Data
public class AdminLoginInfo {
    private String cmAdminid;
    private Integer cmLevel;
    private String cmName;
    private String cmMenuurl;
    private String cmMenuname;
}
