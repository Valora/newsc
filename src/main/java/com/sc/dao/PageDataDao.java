package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.Classifys;
import com.sc.domain.generator.ClassifysExample;
import com.sc.domain.generator.Goods;
import com.sc.domain.generator.GoodsExample;
import com.sc.domain.generator.GoodsWithBLOBs;
import com.sc.domain.pagedata.PageGoods;
import com.sc.domain.pagedata.PageShow;
import com.sc.mapper.generator.ClassifysMapper;
import com.sc.mapper.generator.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页数据获取
 * Created by valora on 2017/5/3.
 */
@Component
public class PageDataDao {

    private final GoodsMapper goodsMapper;

    private final ClassifysMapper classifysMapper;

    @Autowired
    public PageDataDao(GoodsMapper goodsMapper, ClassifysMapper classifysMapper) {
        this.goodsMapper = goodsMapper;
        this.classifysMapper = classifysMapper;
    }


    /**
     * 获得推荐商品
     *
     * @return 推荐商品
     */
    public List<PageShow> queryShows() {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIsoffEqualTo(0);
        goodsExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(1, 10);
        List<Goods> shows = goodsMapper.selectByExample(goodsExample);
        List<PageShow> pageShows = new ArrayList<>();
        for (Goods show : shows) {
            PageShow pageShow = new PageShow();
            pageShow.setCmGoodsid(show.getCmGoodsid());
            pageShow.setCmCreatetime(show.getCmCreatetime());
            pageShow.setCmMainfigurepath(show.getCmMainfigurepath());
            pageShows.add(pageShow);
        }
        return pageShows;
    }

    /**
     * 获得商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @return 首页商品
     */
    public List<PageGoods> queryGoods(Integer pageNum, Integer pageSize, String Order) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIsoffEqualTo(0);
        goodsExample.setOrderByClause(Order + " DESC");
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 商品列表转换
     *
     * @param goods 商品列表
     * @return 用于显示列表
     */
    private List<PageGoods> goodsToPageGoods(List<GoodsWithBLOBs> goods) {
        List<PageGoods> pageGoods = new ArrayList<>();
        for (Goods good : goods) {
            PageGoods pageGood = new PageGoods();
            pageGood.setCmBrandid(good.getCmBrandid());
            pageGood.setCmFigurespath(good.getCmHorizontalpath());
            pageGood.setCmGoodsid(good.getCmGoodsid());
            pageGood.setCmMainfigurepath(good.getCmMainfigurepath());
            pageGood.setCmPresentprice(good.getCmPresentprice());
            pageGood.setCmOriginalprice(good.getCmOriginalprice());
            pageGood.setCmSales(good.getCmSales());
            pageGood.setCmTitle(good.getCmTitle());
            pageGood.setCmCreatetime(good.getCmCreatetime());
            pageGood.setCmIsoff(good.getCmIsoff());
            pageGood.setCmSellerid(good.getCmSellerid());
            pageGood.setCmGoodsartnum(good.getCmGoodsartnum());
            pageGoods.add(pageGood);
        }
        return pageGoods;
    }

    /**
     * 获得商品数量
     *
     * @return 数量
     */
    public Long getGoodsCount() {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIsoffEqualTo(0);
        return goodsMapper.countByExample(goodsExample);
    }

    /**
     * 获得分类商品数量
     *
     * @param classifyID 分类ID
     * @return 数量
     */
    public Long getGoodsCount(Integer classifyID) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmClassifyidEqualTo(classifyID);
        return goodsMapper.countByExample(goodsExample);
    }

    /**
     * 获得分类商品数量
     *
     * @param classifyid 分类ID
     * @return 数量
     */
    public Long getGoodsCount(String classifyid) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmClassifytabsLike("%" + classifyid + "%");
        return goodsMapper.countByExample(goodsExample);
    }

    /**
     * 查询首页商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param order    排序
     * @return 商品列表
     */
    public List<PageGoods> queryFirstGoods(Integer pageNum, Integer pageSize, String order) {
        return queryGoods(pageNum, pageSize, order);
    }

    /**
     * 获取热销商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @return 热销商品
     */
    public List<PageGoods> queryHotData(Integer pageNum, Integer pageSize, String order) {
        return queryGoods(pageNum, pageSize, order);
    }


    /**
     * 通过大类/子分类查询商品
     *
     * @param classifyID 分类ID
     * @param pageNum    页码
     * @param pageSize   页面大小
     * @return 商品列表
     */
    public List<PageGoods> queryClassifyData(Integer classifyID, Integer pageNum, Integer pageSize) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmClassifyidEqualTo(classifyID);
        goodsExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 通过大类/子分类查询商品
     *
     * @param classifyid 分类ID
     * @param pageNum    页码
     * @param pageSize   页面大小
     * @return 商品列表
     */
    public List<PageGoods> queryClassifyData(String classifyid, Integer pageNum, Integer pageSize) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmClassifytabsLike("%" + classifyid + "%");
        goodsExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 查询推荐商品
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @return 推荐商品
     */
    public List<PageGoods> queryPromotionData(Integer pageNum, Integer pageSize) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIspromotionEqualTo(1);
        goodsExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 查询推荐商品数量
     * @return 推荐商品数量
     */
    public Integer getPromotionDataCount() {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIspromotionEqualTo(1);
        return Math.toIntExact(goodsMapper.countByExample(goodsExample));
    }

    /**
     * 查询推荐商品
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @param classifyID 分类ID
     * @return 商品列表
     */
    public List<PageGoods> queryPromotionData(Integer pageNum, Integer pageSize, Integer classifyID) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIspromotionEqualTo(1);
        criteria.andCmClassifyidEqualTo(classifyID);
        goodsExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 获得分类商品数量
     * @param classifyID 分类ID
     * @return 商品列表
     */
    public Integer getPromotionDataCount(Integer classifyID) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIspromotionEqualTo(1);
        criteria.andCmClassifyidEqualTo(classifyID);
        return Math.toIntExact(goodsMapper.countByExample(goodsExample));
    }

    /**
     * 查询推荐商品
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @param classifyid 分类ID
     * @return 商品列表
     */
    public List<PageGoods> queryPromotionData(Integer pageNum, Integer pageSize, String classifyid) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIspromotionEqualTo(1);
        criteria.andCmClassifytabsLike("%" + classifyid + "%");
        goodsExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 获得分类商品数量
     * @param classifyid 分类ID
     * @return 商品列表
     */
    public Integer getPromotionDataCount(String classifyid) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmIspromotionEqualTo(1);
        criteria.andCmClassifytabsLike("%" + classifyid + "%");
        return Math.toIntExact(goodsMapper.countByExample(goodsExample));
    }

    /**
     * 搜索商品
     * @param content 商品编号或品牌
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @return 商品列表
     */
    public List<PageGoods> searchGoods(String content, Integer pageNum, Integer pageSize) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        goodsExample.or(criteria.andCmGoodsartnumLike("%" + content + "%"));
        goodsExample.or(criteria.andCmTitleLike("%"+ content + "%"));
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsWithBLOBs> goods = goodsMapper.selectByExampleWithBLOBs(goodsExample);
        return goodsToPageGoods(goods);
    }

    /**
     * 获得搜多商品数量
     * @param content 商品编号或品牌
     * @return 数量
     */
    public Long getSearchGoodsCount(String content) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        goodsExample.or(criteria.andCmGoodsartnumLike("%" + content + "%"));
        goodsExample.or(criteria.andCmTitleLike("%"+ content + "%"));
        return goodsMapper.countByExample(goodsExample);
    }

    /**
     *  获取分类/二级分类
     * @param classifyid 查询类型（1：大类,2：子类）
     * @return 分类/二级分类
     */
    public List<Classifys> getSunClassification(Integer classifyid) {
        ClassifysExample classifysExample = new ClassifysExample();
        ClassifysExample.Criteria criteria = classifysExample.createCriteria();
        criteria.andCmClassifyidEqualTo(classifyid);
        classifysExample.setOrderByClause("CM_SORT");
        return classifysMapper.selectByExample(classifysExample);
    }
}