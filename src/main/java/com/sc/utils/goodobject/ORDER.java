package com.sc.utils.goodobject;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 订单类
 * Created by valora on 2017/5/16.
 */
@Data
@AllArgsConstructor
public class ORDER {
    private List<GOODS> GOODSLIST;
}
