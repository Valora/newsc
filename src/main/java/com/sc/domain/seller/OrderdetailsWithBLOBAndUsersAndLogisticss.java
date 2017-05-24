package com.sc.domain.seller;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/19.
 */
@Data
public class OrderdetailsWithBLOBAndUsersAndLogisticss {
    private Date cmCreatetime;
    private String cmSpecnumdetails;
    private Double cmMoney;
    private Integer cmNumber;
    private Integer cmSellerstate;
    private Integer cmServicestate;
    private String cmLogisticsnum;
    private Integer cmLogisticsid;
    private String cmLogisticsinfo;
    private String cmLogisticsname;
    private Long cmPhone;
    private String cmShopeaddress;
    private String cmNickname;
}
