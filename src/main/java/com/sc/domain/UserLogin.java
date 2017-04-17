package com.sc.domain;

import lombok.Data;

/**
 * 返回登录信息类
 * Created by valora on 2017/4/17.
 */
@Data
public class UserLogin {
    private String cmUserid;
    private Double cmBanlance; 
    private String cmPhone;
    private Integer cmLevel;
    private String cmNickname;
    private Integer cmIntegral;
    private Integer cmCode;
}
