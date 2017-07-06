package com.sc.domain.login;

import lombok.Data;

/**
 * 厂家登录信息类
 * Created by valora on 2017/4/18.
 */
@Data
public class SellerLogin {
    private String CM_SELLERID;
    private Integer CM_CODE;
    private String CM_SELLERNAME;
    private Long CM_PHONE;
}
