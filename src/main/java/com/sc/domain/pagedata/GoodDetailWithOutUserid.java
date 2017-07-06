package com.sc.domain.pagedata;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by valora on 2017/6/9.
 */
@Data
public class GoodDetailWithOutUserid {
    private String CM_GOODSID;
    private String CM_TITLE;
    private Integer CM_SALES;
    private String CM_HTML;
    private Integer CM_BRANDID;
    private String CM_MAINFIGUREPATH;
    private String CM_FIGURESPATH;
    private Date CM_CREATETIME;
    private Double CM_ORIGINALPRICE;
    private String CM_PRESENTPRICE;
    private Integer CM_ISOFF;
    private String CM_SELLERID;
    private String CM_SELLERNAME;
    private List<GoodDetailsOther> CM_OTHER;
}
