package com.sc.domain.pagedata;

import lombok.Data;

import java.util.Date;

/**
 * 商品信息
 * Created by valora on 2017/5/3.
 */
@Data
public class PageGoods {
    private Integer CM_BRANDID;
    private String CM_FIGURESPATH;
    private String CM_GOODSID;
    private String CM_MAINFIGUREPATH;
    private Double CM_PRESENTPRICE;
    private Double CM_ORIGINALPRICE;
    private Integer CM_SALES;
    private String CM_TITILE;
    private Date CM_CREATETIME;
    private Integer CM_ISOFF;
    private String CM_SELLERID;
    private String CM_GOODSARTNUM;
}
