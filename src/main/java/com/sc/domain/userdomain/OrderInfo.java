package com.sc.domain.userdomain;

import lombok.Data;

/**
 * Created by valora on 2017/7/14.
 */
@Data
public class OrderInfo {
    private Integer CM_ORDER_STATE;
    private Integer CM_DETAILS_STATE;
    private String CM_ORDERDETAILSID;
    private String CM_SELLERID;
    private Integer CM_SERVICESTATE;
}
