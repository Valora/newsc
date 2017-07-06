package com.sc.domain.manage;

import lombok.Data;

import java.util.Date;

/**
 * 厂家详情
 * Created by valora on 2017/4/26.
 */
@Data
public class SellerDetail {
    private Date CM_CREATETIME;
    private Long CM_PHONE;
    private String CM_NAME;
    private String CM_CONTACTNAME;
    private String CM_CONTACTPHONE;
    private String CM_PAX;
    private String CM_STOREPATH;
    private String CM_CARDNO;
    private String CM_CARDPATH;
    private Integer CM_ISEXMINE;
    private String CM_LICENSEPATH;
    private String CM_REASON;
    private String CM_SELLERID;
    private String CM_ADDRESS;
    private String CM_SELLERNAME;
    private Double CM_LAT;
    private Double CM_LON;
    private String CM_BRAND;
}
