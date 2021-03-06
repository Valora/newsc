package com.sc.mapper.pagedata;

import com.sc.domain.pagedata.Classify;
import com.sc.domain.pagedata.GoodDetail;
import com.sc.domain.pagedata.GoodDetailWithOutUserid;
import com.sc.domain.pagedata.PageGoods;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valora on 2017/6/9.
 */
public interface PageDataMapper {
    GoodDetail getGoodsDetailsWithUserid(@Param("userID") String userID, @Param("goodsid") String goodsid);

    GoodDetailWithOutUserid getGoodsDetailsWithOutUserid(String goodsid);

    ArrayList<Classify> getClassify();

    List<PageGoods> searchGoods(@Param("content") String content);

    List<PageGoods> searchGoodsByAdmin(@Param("content") String content);
}
