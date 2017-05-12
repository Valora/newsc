package com.sc.domain.pagedata;

import lombok.Data;

import java.util.Date;

/**
 * 商品信息
 * Created by valora on 2017/5/3.
 */
@Data
public class PageGoods {
    private Integer cmBrandid;
    private String cmFigurespath;
    private String cmGoodsid;
    private String cmMainfigurepath;
    private Double cmPresentprice;
    private Double cmOriginalprice;
    private Integer cmSales;
    private String cmTitle;
    private Date cmCreatetime;
    private Integer cmIsoff;
    private String cmSellerid;
    private String cmGoodsartnum;
}
