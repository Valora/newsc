package com.sc.domain.manage;

import lombok.Data;

import java.util.Date;

/**
 * 商家详细信息
 * Created by valora on 2017/4/26.
 */
@Data
public class UserDetail {
    private String CM_USERID;
    private Date CM_CREATETIME;
    private Long CM_PHONE;
    private String CM_SHOPADDRESS;
    private String CM_NAME;
    private String CM_CONTACTNAME;
    private String CM_CONTACTPHONE;
    private String CM_TELEPHONE;
    private String CM_PAX;
    private String CM_SHOPNAME;
    private String CM_STOREPATH;
    private String CM_CARDNO;
    private String CM_CARDPATH;
    private Integer CM_ISEXAMINE;
    private Integer CM_LEVEL;
    private String CMLICENSEPATH;
    private String CMREASON;
    private Double CM_SHOPLAT;
    private Double CM_SHOPLON;
}
