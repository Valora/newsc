package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class CollectionAndGoods {
    private Integer CM_BRANDID;
    private String CM_FIGURESPATH;
    private String CM_GOODSID;
    private String CM_MAINFIGUREPATH;
    private Double CM_PRESENTPRICE;
    private Double CM_ORIGINALPRICE;
    private Integer CM_SALES;
    private String CM_TITLE;
    private Date CM_JOINTIME;
    private Integer CM_COLLECTIONID;
}
