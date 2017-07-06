package com.sc.domain.userdomain;

import lombok.Data;

import java.util.List;

/**
 * 提交订单用
 * Created by valora on 2017/5/16.
 */
@Data
public class User {
    private String CM_USERID;
    private Double CM_SHOPLON;
    private Double CM_SHOPLAT;
    private Double CM_BLANCE;
    private Integer CM_INTEGRAL;
    private List<TBUSERS> TB_USERS;
}
