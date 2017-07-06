package com.sc.domain.userdomain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 订单详情
 * Created by valora on 2017/5/23.
 */
@Data
public class OrderDetails {
    private Date CM_CREATETIME;
    private String CM_ORDERID;
    private Integer CM_NUMBERSUN;
    private Double CM_MONEYSUN;
    private String CM_ORDERDETAILSIDS;
    private Integer CM_STATE;
    private String CM_USERID;
    private Integer CM_USESCORE;
    private String CM_NICKNAME;
    private Long CM_PHONE;
    private String CM_SHOPADDRESS;
    private List<TbOrderDetails> TB_ORDERDETAILS;
}
