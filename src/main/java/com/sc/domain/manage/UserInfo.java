package com.sc.domain.manage;

import lombok.Data;

import java.util.Date;

/**
 * 商家信息
 * Created by valora on 2017/4/25.
 */
@Data
public class UserInfo {
    private String CM_SHOPNAME;
    private String CM_PAX;
    private String CM_TELEPHONE;
    private String CM_CONTACTPHONE;
    private String CM_CONTACTNAME;
    private String CM_NAME;
    private String CM_USERID;
    private String CM_SHOPADDRESS;
    private Long CM_PHONE;
    private Date CM_CREATETIME;
}
