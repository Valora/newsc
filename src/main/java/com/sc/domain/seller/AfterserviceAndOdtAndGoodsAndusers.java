package com.sc.domain.seller;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/22.
 */
@Data
public class AfterserviceAndOdtAndGoodsAndusers {
    private String cmAfterserviceid;
    private Integer cmType;
    private Integer cmState;
    private Date cmCreatetime;
    private String cmOrderdetailsid;

    private String cmGoodsid;
    private Integer cmNumber;
    private Double cmMoney;
    private Integer cmServicestate;
    private Integer cmSellerstate;
    private String cmSpecnumdetails;
    private String cmTitle;

    private String cmMainfigurepath;

    private String cmName;
    private String cmShopeaddress;
    private Long cmPhone;
}
