package com.sc.domain.manage;

import lombok.Data;

import java.util.Date;

/**
 * 厂家详情
 * Created by valora on 2017/4/26.
 */
@Data
public class SellerDetail {
    private Date cmCreatetime;
    private Long cmPhone;
    private String cmName;
    private String cmContactname;
    private String cmContactphone;
    private String cmPax;
    private String cmStorepath;
    private String cmCardno;
    private String cmCardpath;
    private Integer cmIsexamine;
    private String cmLicensepath;
    private String cmReason;
    private String cmSellerid;
    private String cmAddress;
    private String cmSellername;
    private Double cmLat;
    private Double cmLon;
    private String cmBrand;
}
