package com.sc.utils.goodobject;

import lombok.Data;

import java.util.List;

/**
 * 商品类
 * Created by valora on 2017/5/16.
 */
@Data
public class GOODS {
    private String SELLERID;
    private String GOODSID;
    private List<GOODSDETAILS> GOODDETAILS;
}
