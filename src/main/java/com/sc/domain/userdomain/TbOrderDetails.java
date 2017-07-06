package com.sc.domain.userdomain;

import lombok.Data;

/**
 * 订单详情
 * Created by valora on 2017/5/23.
 */
@Data
public class TbOrderDetails {
    private String CM_GOODSID;
    private String CM_MAINFIGUREPATH;
    private String CM_TITLE;
    private Double CM_PRESENTPRICE;
    private Double CM_MONEY;
    private Integer CM_NUMBER;
    private String CM_SPECNUMDETAILS;
    private String CM_SELLERID;
    private String CM_SELLERNAME;
    private Integer CM_LOGISTICSID;
    private String CM_LOGISTICSINFO;
    private String CM_LOGISTICSNUM;
}
