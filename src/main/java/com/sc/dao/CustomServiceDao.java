package com.sc.dao;

import com.sc.domain.generator.Brands;
import com.sc.domain.generator.BrandsExample;
import com.sc.domain.generator.GooddetailsExample;
import com.sc.domain.generator.Goods;
import com.sc.domain.generator.GoodsExample;
import com.sc.domain.generator.GoodsWithBLOBs;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample;
import com.sc.mapper.generator.BrandsMapper;
import com.sc.mapper.generator.GooddetailsMapper;
import com.sc.mapper.generator.GoodsMapper;
import com.sc.mapper.generator.SellersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by valora on 2017/5/12.
 */
@Component
public class CustomServiceDao {
    private final GooddetailsMapper gooddetailsMapper;
    private final GoodsMapper goodsMapper;
    private final SellersMapper sellersMapper;
    private final BrandsMapper brandsMapper;

    @Autowired
    public CustomServiceDao(GooddetailsMapper gooddetailsMapper, GoodsMapper goodsMapper, SellersMapper sellersMapper, BrandsMapper brandsMapper) {
        this.gooddetailsMapper = gooddetailsMapper;
        this.goodsMapper = goodsMapper;
        this.sellersMapper = sellersMapper;
        this.brandsMapper = brandsMapper;
    }

    /**
     * 删除商品详情
     *
     * @param goodsdetailsid 商品详情id
     * @return 是否删除
     */
    public int delGoodsDetailsD(Integer goodsdetailsid) {
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCmGoodsdetailsidEqualTo(goodsdetailsid);
        return gooddetailsMapper.deleteByExample(gooddetailsExample);
    }

    /**
     * 根据goodid查询goods
     *
     * @param goodsid goodsid
     * @return goods集合
     */
    public List<Goods> selectGoodsByGoodsid(String goodsid) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmGoodsidEqualTo(goodsid);
        return goodsMapper.selectByExample(goodsExample);
    }

    /**
     * 更新goods
     *
     * @param goodsWithBLOBs 需要更新的对象
     * @return 是否更新成功
     */
    public int updateGoods(GoodsWithBLOBs goodsWithBLOBs) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmGoodsidEqualTo(goodsWithBLOBs.getCmGoodsid());
        return goodsMapper.updateByExampleWithBLOBs(goodsWithBLOBs, goodsExample);
    }

    /**
     * 根据输入的厂家名，模糊查询厂家
     *
     * @param content 输入的厂家名
     * @return 厂家集合
     */
    public List<Sellers> selectSellerByLikeD(String content) {
        SellersExample sellersExample = new SellersExample();
        SellersExample.Criteria criteria = sellersExample.createCriteria();
        String string = "%" + content + "%";
        criteria.andCmSellernameLike(string);
        return sellersMapper.selectByExample(sellersExample);
    }

    /**
     * 查询所有sellers
     *
     * @return sellers集合
     */
    public List<Sellers> queryAllSellersD() {
        SellersExample sellersExample = new SellersExample();
        return sellersMapper.selectByExample(sellersExample);
    }

    /**
     * 模糊查询品牌
     *
     * @param content 所有的条件
     * @return 品牌集合
     */
    public List<Brands> searchBrandsByLikeD(String content) {
        BrandsExample brandsExample = new BrandsExample();
        BrandsExample.Criteria criteria = brandsExample.createCriteria();
        String string = "%" + content + "%";
        criteria.andCmBrandLike(string);
        return brandsMapper.selectByExample(brandsExample);
    }

    /**
     * 查询所有品牌
     *
     * @return Brands集合
     */
    public List<Brands> queryAllBrandsD() {
        BrandsExample brandsExample = new BrandsExample();
        return brandsMapper.selectByExample(brandsExample);
    }
}
