package com.sc.utils.goodobject;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 商品类
 * Created by valora on 2017/5/16.
 */
@Data
@AllArgsConstructor
public class GOODS {
    private String SELLERID;
    private String GOODSID;
    private List<GOODSDETAILS> GOODSDETAILS;
}
