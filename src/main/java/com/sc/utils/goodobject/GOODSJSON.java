package com.sc.utils.goodobject;

import lombok.Data;

import java.util.List;

/**
 * 提交订单用
 * Created by valora on 2017/5/16.
 */
@Data
public class GOODSJSON {
    private Integer INTEGRAL;
    private Double BALANCE;
    private List<ORDER> ORDERS;
}
