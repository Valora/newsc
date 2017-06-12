package com.sc.domain.pagedata;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 查询商品用
 * Created by valora on 2017/5/6.
 */
@Data
public class GoodDetail {
    private String cmGoodsid;
    private String cmTitle;
    private Integer cmSales;
    private String cmHtml;
    private String cmChtml;
    private Integer cmBrandid;
    private String cmMainfigurepath;
    private String cmFigurespath;
    private Date cmCreatetime;
    private Double cmOriginalprice;
    private Integer cmClassifyid;
    private String cmClassifytabs;
    private Double cmPresentprice;
    private Integer cmIsoff;
    private String cmSellerid;
    private String cmGoodsartnum;
    private Integer cmIspromotion;
    private String cmSellername;
    private Integer cmIscollection;
    private List<GoodDetailsOther> cmOther;
}
