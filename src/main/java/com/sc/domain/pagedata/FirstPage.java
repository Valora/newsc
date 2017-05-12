package com.sc.domain.pagedata;

import lombok.Data;

import java.util.List;

/**
 * 首页数据
 * Created by valora on 2017/5/3.
 */
@Data
public class FirstPage {
    private List<PageShow> shows;
    private List<PageGoods> goods;
}
