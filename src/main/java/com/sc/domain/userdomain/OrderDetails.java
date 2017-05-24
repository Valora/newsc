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
    private Date cmCreatetime;
    private String cmOrderid;
    private Integer cmNumbersun;
    private Double cmMoneysun;
    private String cmOrderdetailsids;
    private Integer cmState;
    private String cmUserid;
    private Integer cmUsescore;
    private String cmNickname;
    private Long cmPhone;
    private String cmShopeaddress;
    private List<TbOrderDetails> tbOrderDetails;
}
