package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/25.
 */
@Data
public class AfsAndOdtAndGoodsAndSellers {
    private String cmOrderid;
    private String cmAfterserviceid;
    private String cmGoodsid;
    private String cmOrderdetailsid;
    private Integer cmState;
    private Date cmCreatetime;
    private String cmMainfigurepath;
    private String cmTitle;
    private String cmSellerid;
    private String cmSellername;
    private String cmLogisticsnum;
    private String cmLogisticsinfo;
}
