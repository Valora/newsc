package com.sc.domain.manage;

import lombok.Data;

import java.util.Date;

/**商家信息
 * Created by valora on 2017/4/25.
 */
@Data
public class UserInfo {
    private String cmShopname;
    private String cmPax;
    private String cmTelephone;
    private String cmContactphone;
    private String cmName;
    private String cmUserid;
    private String cmShopaddress;
    private Long cmPhone;
    private Date cmCreatetime;
}
