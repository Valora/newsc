package com.sc.domain.pagedata;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by valora on 2017/6/9.
 */
@Data
public class GoodDetailWithOutUserid {
    private String cmGoodsid;
    private String cmTitle;
    private Integer cmSales;
    private String cmHtml;
    private Integer cmBrandid;
    private String cmMainfigurepath;
    private String cmFigurespath;
    private Date cmCreatetime;
    private Double cmOriginalprice;
    private String cmPresentprice;
    private Integer cmIsoff;
    private String cmSellerid;
    private String cmSellername;
    private List<GoodDetailsOther> cmOther;
}
