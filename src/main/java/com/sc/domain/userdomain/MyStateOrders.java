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
    private Date cmCreatetime;
    private String cmOrderid;
    private Integer cmNumbersun;
    private Double cmMoneysun;
    private String cmOrderdetailsids;
    private Integer cmState;
    private String cmUserid;
    private List<MyOrderDetails> tbOrderdetails;
}
