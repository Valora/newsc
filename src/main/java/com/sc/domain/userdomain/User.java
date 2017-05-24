package com.sc.domain.userdomain;

import lombok.Data;

import java.util.List;

/**
 * 提交订单用
 * Created by valora on 2017/5/16.
 */
@Data
public class User {
    private String cmUserid;
    private Double cmShoplon;
    private Double cmShoplat;
    private Double cmBalance;
    private Integer cmIntegral;
    private List<TBUSERS> tbUsers;
}
