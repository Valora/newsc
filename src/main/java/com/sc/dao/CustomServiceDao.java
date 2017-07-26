package com.sc.dao;

import com.sc.domain.generator.*;
import com.sc.mapper.generator.*;
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
    private final AdminsMapper adminsMapper;

    @Autowired
    public CustomServiceDao(GooddetailsMapper gooddetailsMapper, GoodsMapper goodsMapper, SellersMapper sellersMapper, BrandsMapper brandsMapper, AdminsMapper adminsMapper) {
        this.gooddetailsMapper = gooddetailsMapper;
        this.goodsMapper = goodsMapper;
        this.sellersMapper = sellersMapper;
        this.brandsMapper = brandsMapper;
        this.adminsMapper = adminsMapper;
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
        criteria.andCM_GOODSDETAILSIDEqualTo(goodsdetailsid);
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
        criteria.andCM_GOODSIDEqualTo(goodsid);
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
        criteria.andCM_GOODSIDEqualTo(goodsWithBLOBs.getCM_GOODSID());
        return goodsMapper.updateByExampleSelective(goodsWithBLOBs, goodsExample);
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
        criteria.andCM_SELLERNAMELike(string);
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
        criteria.andCM_BRANDLike(string);
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

    /**
     * 管理员信息
     *
     * @param userId
     * @return
     */
    public Admins selectAdminInfo(String userId) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_ADMINIDEqualTo(userId);
        Admins admins = new Admins();
        List<Admins> list = adminsMapper.selectByExample(adminsExample);
        if (list != null && list.size() > 0) {
            admins = list.get(0);
            return admins;
        }
        return null;
    }

    /**
     * 添加商品详情
     *
     * @param details
     */
    public void insertGoodDetails(GooddetailsWithBLOBs details) {
        gooddetailsMapper.insert(details);
    }

    /**
     * 添加商品
     *
     * @param goods
     */
    public void insertGoods(GoodsWithBLOBs goods) {
        goodsMapper.insert(goods);
    }

    /**
     * 根据商品id查询商品详情
     *
     * @param goodsid 商品 id
     * @return GooDetail对象
     */
    public List<GooddetailsWithBLOBs> selectGooddetailBygoodid(String goodsid) {
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCM_GOODSIDEqualTo(goodsid);
        return gooddetailsMapper.selectByExampleWithBLOBs(gooddetailsExample);
    }

    /**
     * 根据商品的详细id查询商品详细对象
     *
     * @param goodsdetailsid 商品的详细id
     * @return 商品详细对象
     */
    public GooddetailsWithBLOBs selectGooddetailBygooddetailsid(String goodsdetailsid) {
        GooddetailsWithBLOBs gooddetailsWithBLOBs = new GooddetailsWithBLOBs();
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCM_GOODSDETAILSIDEqualTo(Integer.valueOf(goodsdetailsid));
        List<GooddetailsWithBLOBs> list = gooddetailsMapper.selectByExampleWithBLOBs(gooddetailsExample);
        if (list != null && list.size() > 0) {
            gooddetailsWithBLOBs = list.get(0);
        }
        return gooddetailsWithBLOBs;
    }

    /**
     * 更新商品详情
     *
     * @param gooddetailsWithBLOBs 需要更新的商品详情
     */
    public void updateGooddetails(GooddetailsWithBLOBs gooddetailsWithBLOBs) {
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCM_GOODSDETAILSIDEqualTo(gooddetailsWithBLOBs.getCM_GOODSDETAILSID());
        gooddetailsMapper.updateByExampleSelective(gooddetailsWithBLOBs, gooddetailsExample);
    }
}
