package com.sc.domain.login;

import lombok.Data;

/**
 * 商家登录信息类
 * Created by valora on 2017/4/17.
 */
@Data
public class UserLogin {
    private String CM_USERID;
    private String CM_SHOPEADDRESS;
    private Double CM_BALANCE;
    private Long CM_PHONE;
    private Integer CM_LEVEL;
    private String CM_SHOPNAME;
    private Integer CM_INTEGRAL;
    private Integer CM_CODE;
}
