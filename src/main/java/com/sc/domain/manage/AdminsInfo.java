package com.sc.domain.manage;

import lombok.Data;

/**
 * 客服／销售 信息
 * Created by valora on 2017/4/25.
 */
@Data
public class AdminsInfo {
    private Integer cmLevel;
    private String cmAdminid;
    private String cmName;
    private Long cmPhone;
}
