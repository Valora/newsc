package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 *  未付款订单
 * Created by valora on 2017/5/23.
 */
@Data
public class MyStateOrders {
    private Date CM_CREATETIME;
    private String CM_ORDERID;
    private Integer CM_NUMBERSUN;
    private Double CM_MONEYSUN;
    private String CM_ORDERDETAILSIDS;
    private Integer CM_STATE;
    private String CM_USERID;
    private List<MyOrderDetails> TB_ORDERDETAILS;
}
