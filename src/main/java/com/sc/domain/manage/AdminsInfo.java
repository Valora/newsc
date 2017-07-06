package com.sc.domain.manage;

import lombok.Data;

/**
 * 客服／销售 信息
 * Created by valora on 2017/4/25.
 */
@Data
public class AdminsInfo {
    private Integer CM_LEVEL;
    private String CM_ADMINID;
    private String CM_NAME;
    private Long CM_PHONE;
}
