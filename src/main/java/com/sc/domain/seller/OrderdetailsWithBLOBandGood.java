package com.sc.domain.seller;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/17.
 */
@Data
public class OrderdetailsWithBLOBandGood {
    private String cmGoodsid;
    private String cmOrderdetailsid;
    private String cmMainfigurepath;
    private String cmTitle;
    private Date cmOrdercreatetime;
    private Double cmPresentprice;
    private Double cmOriginalprice;
    private Integer cmNumber;
    private Double cmMoney;
    private String cmSpecnumdetails;
    private Integer cmSellerstate;
}
