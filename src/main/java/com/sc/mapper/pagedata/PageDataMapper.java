package com.sc.mapper.pagedata;

import com.sc.domain.pagedata.GoodDetail;
import com.sc.domain.pagedata.GoodDetailWithOutUserid;

/**
 * Created by valora on 2017/6/9.
 */
public interface PageDataMapper {
    GoodDetail getGoodsDetailsWithUserid(String userID, String goodsid);

    GoodDetailWithOutUserid getGoodsDetailsWithOutUserid(String goodsid);
}
