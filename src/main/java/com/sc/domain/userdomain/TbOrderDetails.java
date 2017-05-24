package com.sc.domain.userdomain;

import lombok.Data;

/**
 * 订单详情
 * Created by valora on 2017/5/23.
 */
@Data
public class TbOrderDetails {
    private String cmGoodsid;
    private String cmMainfigurepath;
    private String cmTitle;
    private Double cmPresentprice;
    private Double cmMoney;
    private Integer cmNumber;
    private String cmSpecnumdetails;
    private String cmSellerid;
    private String cmSellername;
    private Integer cmLogisticsid;
    private String cmLogisticsinfo;
    private String cmLogisticsnum;
}
