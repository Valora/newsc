package com.sc.service;

import com.sc.dao.PageDataDao;
import com.sc.domain.generator.Classifys;
import com.sc.domain.pagedata.FirstPage;
import com.sc.domain.pagedata.PageGoods;
import com.sc.domain.pagedata.PageShow;
import com.sc.utils.GetResult;
import com.sc.utils.Result;
import com.sc.utils.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.toIntExact;

/**
 * 页面数据管理
 * Created by valora on 2017/5/3.
 */
@Service
public class PageDataService {

    private final PageDataDao pageDataDao;

    @Autowired
    public PageDataService(PageDataDao pageDataDao) {
        this.pageDataDao = pageDataDao;
    }

    /**
     * 获取首页商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param isFirst  是否第一次加载(1:第一次，0：不是)
     * @return 首页商品
     */
    public Result queryFirstData(Integer pageNum, Integer pageSize, Integer isFirst) {
        try {
            FirstPage firstPage = new FirstPage();
            List<PageShow> shows;
            shows = isFirst == 0 ? null : pageDataDao.queryShows();
            String order = "CM_CREATETIME";
            List<PageGoods> goods = pageDataDao.queryFirstGoods(pageNum, pageSize, order);
            firstPage.setShows(shows);
            firstPage.setGoods(goods);
            Integer i = toIntExact(pageDataDao.getGoodsCount());
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, firstPage, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 获取最新商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @return Result
     */
    public Result queryNewData(Integer pageNum, Integer pageSize) {
        try {
            String order = "CM_CREATETIME";
            List<PageGoods> goods = pageDataDao.queryGoods(pageNum, pageSize, order);
            Integer i = toIntExact(pageDataDao.getGoodsCount());
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, goods, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 获取热销商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @return 热销商品
     */
    public Result queryHotData(Integer pageNum, Integer pageSize) {
        try {
            String order = "CM_SALES";
            List<PageGoods> goods = pageDataDao.queryHotData(pageNum, pageSize, order);
            Integer i = toIntExact(pageDataDao.getGoodsCount());
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, goods, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 通过大类/子分类查询商品
     *
     * @param type       查询类型（1：大类，2：子类）
     * @param classifyID 分类ID
     * @param pageNum    页码
     * @param pageSize   页码大小
     * @return 商品列表
     */
    public Result queryClassifyData(Integer type, Integer classifyID, Integer pageNum, Integer pageSize) {
        try {
            if (type == 1) {
                List<PageGoods> goods = pageDataDao.queryClassifyData(classifyID, pageNum, pageSize);
                Integer i = toIntExact(pageDataDao.getGoodsCount(classifyID));
                i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
                return GetResult.toJson(0, null, null, goods, i);
            } else {
                String classifyid = Integer.toString(classifyID);
                List<PageGoods> goods = pageDataDao.queryClassifyData(classifyid, pageNum, pageSize);
                Integer i = toIntExact(pageDataDao.getGoodsCount(classifyid));
                return GetResult.toJson(0, null, null, goods, i);
            }
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询推荐商品
     * @param type 查询类型（0：不分类，1：大类，2：子类）
     * @param classifyID 大/子分类ID
     * @param pageNum 页码
     * @param pageSize 页码大小
     * @return 推荐商品
     */
    public Result queryPromotionData(Integer type, Integer classifyID, Integer pageNum, Integer pageSize) {
        try {
            if (type == 0) {
                List<PageGoods> goods = pageDataDao.queryPromotionData(pageNum, pageSize);
                Integer i = pageDataDao.getPromotionDataCount();
                i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
                return GetResult.toJson(0, null, null, goods, i);
            } else if (type == 1) {
                List<PageGoods> goods = pageDataDao.queryPromotionData(pageNum, pageSize, classifyID);
                Integer i = pageDataDao.getPromotionDataCount(classifyID);
                i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
                return GetResult.toJson(0, null, null, goods, i);
            } else {
                String classifyid = Integer.toString(classifyID);
                List<PageGoods> goods = pageDataDao.queryPromotionData(pageNum, pageSize, classifyid);
                Integer i = pageDataDao.getPromotionDataCount(classifyid);
                i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
                return GetResult.toJson(0, null, null, goods, i);
            }
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询商品详情
     * @param goodsid 商品ID
     * @param tk 密钥
     * @return 商品详情
     */
    public Result queryGoodsDetails(String goodsid, Token tk) {
        //todo
        return null;
    }

    /**
     * 搜索商品
     * @param content 商品编号或品牌
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @return 商品列表
     */
    public Result searchGoods(String content, Integer pageNum, Integer pageSize) {
        try {
            List<PageGoods> goods = pageDataDao.searchGoods(content, pageNum, pageSize);
            Integer i = toIntExact(pageDataDao.getSearchGoodsCount(content));
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, goods, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 获取分类/二级分类
     * @param type 查询类型（1：大类,2：子类）
     * @param classifyid 大类ID，如果查询大类则输入0
     * @return 分类列表
     */
    public Result getSubClassification(Integer type, Integer classifyid) {
        try {
            List<Classifys> classifys = new ArrayList<>();
            if (type == 1) {
                classifys = pageDataDao.getSunClassification(0);
            }
            if (type == 2 && classifyid != 0) {
                classifys = pageDataDao.getSunClassification(classifyid);
            }
            return GetResult.toJson(0, null, null, classifys, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 获取所有分类（大分类包含小分类）
     * @return 所有分类
     */
    public Result getClassify() {
        //todo
        return null;
    }
}
