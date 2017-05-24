package com.sc.domain.userdomain;

import lombok.Data;

/**
 * 我的订单详情
 * Created by valora on 2017/5/18.
 */
@Data
public class MyOrderDetails {
    private String cmGoodsid;
    private String cmMainfigurepath;
    private String cmTitle;
    private Double cmPresentprice;
    private Double cmMoney;
    private Integer cmNumber;
    private String cmSellerid;
    private String cmSellername;
}
