package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 我的所有订单
 * Created by valora on 2017/5/18.
 */
@Data
public class MyOrders {
    private Date CM_CREATETIME;
    private String CM_ORDERID;
    private Double CM_NUMBERSUN;
    private Double CM_MONEYSUN;
    private Integer CM_STATE;
    private List<MyOrderDetails> TB_ORDERDETAILS;
}
