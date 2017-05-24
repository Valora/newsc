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
    private Date cmCreatetime;
    private String cmOrderid;
    private Double cmNumbersun;
    private Double cmMoneysun;
    private Integer cmState;
    private List<MyOrderDetails> tbOrderdetails;
}
