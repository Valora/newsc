package com.sc.domain.seller;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/19.
 */
@Data
public class OrderdetailsWithBLOBAndUsersAndLogisticss {
    private Date CM_CREATETIME;
    private String CM_SPECNUMDETAILS;
    private Double CM_MONEY;
    private Integer CM_NUMBER;
    private Integer CM_SELLERSTATE;
    private Integer CM_SERVICESTATE;
    private String CM_LOGISTICSNUM;
    private Integer CM_LOGISTICSID;
    private String CM_LOGISTICSINFO;
    private String CM_LOGISTICSNAME;
    private Long CM_PHONE;
    private String CM_SHOPEADDRESS;
    private String CM_NICKNAME;
}
