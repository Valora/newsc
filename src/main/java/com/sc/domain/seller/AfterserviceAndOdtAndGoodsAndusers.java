package com.sc.domain.seller;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/22.
 */
@Data
public class AfterserviceAndOdtAndGoodsAndusers {
    private String CM_AFTERSERVICEID;
    private Integer CM_TYPE;
    private Integer CM_STATE;
    private Date CM_CREATETIME;
    private String CM_ORDERDETAILSID;

    private String CM_GOODSID;
    private Integer CM_NUMBER;
    private Double CM_MONEY;
    private Integer CM_SERVICESTATE;
    private Integer CM_SELLERSTATE;
    private String CM_SPECNUMDETAILS;
    private String CM_TITLE;

    private String CM_MAINFIGUREPATH;

    private String CM_NAME;
    private String CM_SHOPEADDRESS;
    private Long CM_PHONE;
}
