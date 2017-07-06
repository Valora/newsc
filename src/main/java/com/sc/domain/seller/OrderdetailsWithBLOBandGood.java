package com.sc.domain.seller;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/17.
 */
@Data
public class OrderdetailsWithBLOBandGood {
    private String CM_GOODSID;
    private String CM_ORDERDETAILSID;
    private String CM_MAINFIGUREPATH;
    private String CM_TITLE;
    private Date CM_ORDERCREATETIME;
    private Double CM_PRESENTPRICE;
    private Double CM_ORIGINALPRICE;
    private Integer CM_NUMBER;
    private Double CM_MONEY;
    private String CM_SPECNUMDETAILS;
    private Integer CM_SELLERSTATE;
}
