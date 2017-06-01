package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class OdersAndOrderdetails {
    private Integer cmOrderState;
    private Date cmCreatetime;
    private Double cmMoneysun;
    private Integer cmNumbersun;
    private String cmOrderid;
    private String cmOrderdetailsid;
    private Double cmMoney;
    private Integer cmNumber;
    private Integer cmServiceState;
    private String cmGoodsid;
    private String cmTitle;
    private String cmMainfigurepath;
    private Double cmPresentprice;
    private String cmSellerid2;
    private String cmSellername;
    private Integer value;
    private List<OrderdetailsAndGoodsAndSellers> tborderdetails;
}
