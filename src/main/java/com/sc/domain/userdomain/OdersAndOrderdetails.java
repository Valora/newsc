package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class OdersAndOrderdetails {
    private Integer CM_ORDER_STATE;
    private Date CM_CREATETIME;
    private Double CM_MONEYSUN;
    private Integer CM_NUMBERSUN;
    private String CM_ORDERID;
    private String CM_ORDERDETAILSID;
    private Double CM_MONEY;
    private Integer CM_NUMBER;
    private Integer CM_SERVICESTATE;
    private String CM_GOODSID;
    private String CM_TITLE;
    private String CM_MAINFIGUREPATH;
    private Double CM_PRESENTPRICE;
    private String CM_SELLERID2;
    private String CM_SELLERNAME;
    private Integer VALUE;
    private List<OrderdetailsAndGoodsAndSellers> TB_ORDERDETAILS;
}
