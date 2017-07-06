package com.sc.domain.userdomain;

import lombok.Data;

/**
 * 我的订单详情
 * Created by valora on 2017/5/18.
 */
@Data
public class MyOrderDetails {
    private String CM_GOODSID;
    private String CM_MAINFIGUREPATH;
    private String CM_TITLE;
    private Double CM_PRESENTPRICE;
    private Double CM_MONEY;
    private Integer CM_NUMBER;
    private String CM_SELLERID;
    private String CM_SELLERNAME;
}
