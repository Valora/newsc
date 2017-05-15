package com.sc.web;

import com.sc.service.CustomServiceService;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by valora on 2017/5/12.
 */
@RestController
@Api("CustomService")
public class CustomServiceController {
    private final static String URL = "/api/CustomService/";

    private final JWT jwt;

    private final CustomServiceService customServiceService;

    @Autowired
    public CustomServiceController(JWT jwt, CustomServiceService customServiceService) {
        this.jwt = jwt;
        this.customServiceService = customServiceService;
    }

    @RequestMapping(value = URL + "UploadGoods", method = RequestMethod.POST)
    @ApiOperation("上传商品{goodsid商品ID（编辑HTML上传图片时返回的商品ID），token秘钥，goodsartnum商品码(限15字符)，sellerid厂家ID，classifyid大类ID(只属于一个大类)， classifytabs子类ID(如：1|2|3|,最后一个字符必须为\"|\")，brandid品牌ID，title标题(限25个字符)，originalprice原价，presentprice现价，stock库存， html展示内容，chtml展示内容(APP小图)，ispromotion是否推荐(0:不，1：推荐)，colors颜色(如：红色|黄色|酒红色|,单种颜色限5个字符,最后一个字符必须为\"|\"),spec规格(如：29/74A_10|30/76A_100|,最后一个字符必须为\"|\",请注意特殊字符，不能影响字符切割)，图片必须有name属性（主图：main,展示图:show,颜色图：color)}")
    public Result uploadGoods() {
        return null;
    }

    @RequestMapping(value = URL + "ReviceGoods", method = RequestMethod.POST)
    @ApiOperation("修改商品{goodsid商品ID，token秘钥，goodsartnum商品码(限15字符)， sellerid厂家ID，classifyid大类ID(只属于一个大类)，classifytabs子类ID(如：1|2|3|,最后一个字符必须为\"|\")，brandid品牌ID，title标题(限25个字符)，originalprice原价，presentprice现价，stock库存，html展示内容，chtml展示内容(APP小图)，ispromotion是否推荐(0:不，1：推荐)，spec规格(如：29/74A_10|30/76A_100|,最后一个字符必须为\"|\",请注意特殊字符，不能影响字符切割)，图片必须有name属性（主图：main,展示图:show)changetab(多张修改用|拼接，如0|1|)}")
    public Result reviseGoods() {
        return null;
    }

    @RequestMapping(value = URL + "ReciceGoodsDetails", method = RequestMethod.POST)
    @ApiOperation("修改商品详细(颜色，颜色图){token：秘钥，goodsdetailsid：商品详细ID,color:颜色，stock：库存，图片自定}")
    public Result reviseGoodsDetails() {
        return null;
    }

    @RequestMapping(value = URL + "AddGoodsDetails", method = RequestMethod.POST)
    @ApiOperation("添加商品详细{token：秘钥，goodsid：商品ID，color：颜色，stock：库存，图片自定}")
    public Result addGoodsDetails() {
        return null;
    }

    @RequestMapping(value = URL + "DelGoodsDetails", method = RequestMethod.GET)
    @ApiOperation("删除商品详细")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsdetailsid", value = "商品详细ID", required = true, dataType = "Integer", paramType = "query")
    })
    public Result delGoodsDetails(@RequestParam("token") String token, @RequestParam("goodsdetailsid") Integer goodsdetailsid) {
        return null;
    }

    @RequestMapping(value = URL + "DelGoodsShowImg", method = RequestMethod.GET)
    @ApiOperation("删除商品详细")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsid", value = "商品ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "delnum", value = "图片序号(从0开始)", required = true, dataType = "Integer", paramType = "query")
    })
    public Result delGoodsShowImg(@RequestParam("token") String token, @RequestParam("goodsid") String goodsid, @RequestParam("delnum") Integer delnum) {
        return null;
    }

    @RequestMapping(value = URL + "UploadGoodsImg", method = RequestMethod.POST)
    @ApiOperation("上传商品HTML内容中的图片{token秘钥,goodsid商品ID(如果为第一次上传则输入null或者\"\"),图片必须有name属性，上传成功后返回商品ID和图片地址}")
    public Result uploadGoodsImg() {
        return null;
    }

    @RequestMapping(value = URL + "SearchSellers", method = RequestMethod.GET)
    @ApiOperation("搜索厂家(由于厂家较多，所以使用厂家名模糊查询)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "搜索内容", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "Integer", paramType = "query")
    })
    public Result searchSellers(@RequestParam("token") String token, @RequestParam("content") String content) {
        return null;
    }

    @RequestMapping(value = URL + "QuerySellers", method = RequestMethod.GET)
    @ApiOperation("获取厂家列表(一次获取全部)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "Integer", paramType = "query")
    })
    public Result querySellers(@RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "SearchBrands", method = RequestMethod.GET)
    @ApiOperation("搜索品牌(由于品牌较多，所以使用品牌名模糊查询)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "搜索内容", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "Integer", paramType = "query")
    })
    public Result searchBrands(@RequestParam("token") String token, @RequestParam("content") String content) {
        return null;
    }

    @RequestMapping(value = URL + "QueryBrands", method = RequestMethod.GET)
    @ApiOperation("获取品牌列表(一次获取全部)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryBrands(@RequestParam("token") String token) {
        return null;
    }
}
