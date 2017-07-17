package com.sc.web;

import com.sc.service.PageDataService;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取信息
 * Created by valora on 2017/5/3.
 */
@RestController
@Api("PageData")
public class PageDataController {
    private static final String URL = "/api/PageData/";

    private final JWT jwt;

    private final PageDataService pageDataService;

    @Autowired
    public PageDataController(JWT jwt, PageDataService pageDataService) {
        this.jwt = jwt;
        this.pageDataService = pageDataService;
    }

    @RequestMapping(value = URL + "QueryFirstData", method = RequestMethod.GET)
    @ApiOperation("获取首页商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "isFirst", value = "是否第一次加载(1:第一次，0：不是)", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryFirstData(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize, @RequestParam(value = "isFirst") Integer isFirst) {
        pageNum = pageNum < 1 ? 1 : pageNum;
        pageSize = pageSize < 1 ? 10 : pageSize;
        return pageDataService.queryFirstData(pageNum, pageSize, isFirst);
    }

    @RequestMapping(value = URL + "QueryNewData", method = RequestMethod.GET)
    @ApiOperation("获取最新商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryNewData(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        pageNum = pageNum < 1 ? 1 : pageNum;
        pageSize = pageSize < 1 ? 10 : pageSize;
        
        return pageDataService.queryNewData(pageNum, pageSize);
    }
    
    @RequestMapping(value = URL + "QueryHotData", method = RequestMethod.GET)
    @ApiOperation("获取热销商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryHotData(@RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        pageNum = pageNum < 1 ? 1 : pageNum;
        pageSize = pageSize < 1 ? 10 : pageSize;
        return pageDataService.queryHotData(pageNum, pageSize);
    }
    
    @RequestMapping(value = URL + "QueryClassifyData", method = RequestMethod.GET)
    @ApiOperation("通过大类/子分类查询商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "查询类型（1：大类，2：子类）", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "classifyID", value = "分类ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryClassifyData(@RequestParam(value = "type") Integer type, @RequestParam(value = "classifyID") Integer classifyID, @RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        pageNum = pageNum < 1 ? 1 : pageNum;
        pageSize = pageSize < 1 ? 10 : pageSize;
        return pageDataService.queryClassifyData(type, classifyID, pageNum, pageSize);
    }

    @RequestMapping(value = URL + "QueryPromotionData", method = RequestMethod.GET)
    @ApiOperation("获取推荐商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "查询类型（1：大类，2：子类）", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "classifyID", value = "分类ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryPromotionData(@RequestParam(value = "type") Integer type, @RequestParam(value = "classifyID") Integer classifyID, @RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        pageNum = pageNum < 1 ? 1 : pageNum;
        pageSize = pageSize < 1 ? 10 : pageSize;
        return pageDataService.queryPromotionData(type, classifyID, pageNum, pageSize);
    }

    @RequestMapping(value = URL + "QueryGoodsDetails", method = RequestMethod.GET)
    @ApiOperation("查询商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsid", value = "商品ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥(若传空字符串，则不返回CM_ISCOLLECTION，0未收藏，1已收藏)", required = true, dataType = "String", paramType = "query")
    })
    public Result queryGoodsDetails(@RequestParam(value = "goodsid") String goodsid, @RequestParam(value = "token") String token) {
        if (StringUtils.isEmpty(goodsid) || StringUtils.isBlank(goodsid)) {
            return GetResult.toJson(17, null, null, null, 0);
        }
        Token tk = jwt.checkJWT(token);
        return pageDataService.queryGoodsDetails(goodsid, tk);
    }

    @RequestMapping(value = URL + "SearchGoods", method = RequestMethod.GET)
    @ApiOperation("查询商品详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "商品编号或品牌", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result searchGoods(@RequestParam(value = "content") String content, @RequestParam(value = "pageNum") Integer pageNum, @RequestParam(value = "pageSize") Integer pageSize) {
        if (StringUtils.isEmpty(content) || StringUtils.isBlank(content)) {
            return GetResult.toJson(16, null, null, null, 0);
        }

        pageNum = pageNum < 1 ? 1 : pageNum;
        pageSize = pageSize < 1 ? 10 : pageSize;

        return pageDataService.searchGoods(content, pageNum, pageSize);
    }

    @RequestMapping(value = URL + "GetSubclassification", method = RequestMethod.GET)
    @ApiOperation("获取分类/二级分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "查询类型（1：大类,2：子类）", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "classifyid", value = "大类ID，如果查询大类则输入0", required = true, dataType = "Integer", paramType = "query")
    })
    public Result getSubClassification(@RequestParam(value = "type") Integer type, @RequestParam(value = "classifyid") Integer classifyid) {

        return pageDataService.getSubClassification(type, classifyid);
    }
    
    @RequestMapping(value = URL + "GetClassify", method = RequestMethod.GET)
    @ApiOperation("获取所有分类（大分类包含小分类）")
    public Result getClassify() {
        return pageDataService.getClassify();
    }
}
