package com.sc.domain.manage;

import lombok.Data;

import java.util.Date;

/**
 * 商家详细信息
 * Created by valora on 2017/4/26.
 */
@Data
public class UserDetail {
    private String cmUserid;
    private Date cmCreatetime;
    private Long cmPhone;
    private String cmShopaddress;
    private String cmName;
    private String cmContactname;
    private String cmContactphone;
    private String cmTelephone;
    private String cmPax;
    private String cmShopname;
    private String cmStorepath;
    private String cmCardno;
    private String cmCardpath;
    private Integer cmIsexamine;
    private Integer cmLevel;
    private String cmLicensepath;
    private String cmReason;
    private Double cmShoplat;
    private Double cmShoplon;
}
