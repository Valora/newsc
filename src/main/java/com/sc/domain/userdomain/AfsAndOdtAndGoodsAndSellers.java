package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class AfsAndOdtAndGoodsAndSellers {
    private String CM_ORDERID;
    private String CM_AFTERSERVICEID;
    private String CM_GOODSID;
    private String CM_ORDERDETAILSID;
    private Integer CM_STATE;
    private Date CM_CREATETIME;
    private String CM_MAINFIGUREPATH;
    private String CM_TITLE;
    private String CM_SELLERID;
    private String CM_SELLERNAME;
    private String CM_LOGISTICSNUM;
    private String CM_LOGISTICSINFO;
}
