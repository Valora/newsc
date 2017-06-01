package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class CollectionAndGoods {
    private Integer cmBrandid;
    private String cmFigurespath;
    private String cmGoodsid;
    private String cmMainfigurepath;
    private Double cmPresentprice;
    private Double cmOriginalprice;
    private Integer cmSales;
    private String cmTitle;
    private Date cmJointime;
    private Integer cmCollectionid;
}
