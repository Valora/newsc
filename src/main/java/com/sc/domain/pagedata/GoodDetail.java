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
    private String CM_GOODSID;
    private String CM_TITLE;
    private Integer CM_SALES;
    private String CM_HTML;
    private String CM_CHTML;
    private Integer CM_BRANDID;
    private String CM_MAINFIGUREPATH;
    private String CM_FIGURESPATH;
    private Date CM_CREATETIME;
    private Double CM_ORIGINALPRICE;
    private Integer CM_CLASSIFYID;
    private String CM_CLASSIFYTABS;
    private Double CM_PRESENTPRICE;
    private Integer CM_ISOFF;
    private String CM_SELLERID;
    private String CM_GOODSARTNUM;
    private Integer CM_ISPROMOTION;
    private String CM_SELLERNAME;
    private Integer CM_ISCOLLECTION;
    private String CM_SPEC;
    private List<GoodDetailsOther> CM_OTHER;
}
