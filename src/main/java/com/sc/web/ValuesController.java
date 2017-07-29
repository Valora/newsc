package com.sc.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取错误码信息
 * Created by valora on 2017/4/11.
 */
@RestController
@Api("Values")
public class ValuesController {
    private final static String URL = "/api/Values/";

    @RequestMapping(value = URL + "GetErrorMessages", method = RequestMethod.GET)
    @ApiOperation("获取返回码对应异常信息")
    public Map getErrorMessages() {
        Map<String, String> result = new HashMap<>();
        result.put("0", "成功");
        result.put("101", "秘钥空或错");
        result.put("200", "数据库异常，操作失败");
        result.put("1", "账号或密码为空");
        result.put("2", "发送短信失败");
        result.put("3", "短信发送超过上限");
        result.put("4", "手机号码为空");
        result.put("5", "手机号码格式错误");
        result.put("6", "账号或密码错误");
        result.put("7", "未获取验证码");
        result.put("8", "验证码错");
        result.put("9", "商品信息为空");
        result.put("10", "商品信息错误");
        result.put("11", "商品ID错误");
        result.put("12", "商品规格错误");
        result.put("13", "商品规格排序错误");
        result.put("14", "商品购买数量错误");
        result.put("15", "库存不足，注意此处有库存不足的数据返回!");
        result.put("16", "查询内容为空");
        result.put("17", "商品ID为空或错");
        result.put("18", "您附近一千米范围内有用户购买过此商品");
        result.put("19", "可使用积分小于抵扣积分");
        result.put("20", "请选择服务类型");
        result.put("21", "请选择申请售后的商品");
        result.put("22", "请申请售后输入原因");
        result.put("23", "图片数量超限");
        result.put("24", "订单详情ID错误");
        result.put("25", "请先确认收货");
        result.put("26", "已申请售后");
        result.put("27", "售后类型错误");
        result.put("28", "图片错误");
        result.put("29", "售后服务ID错误");
        result.put("30", "收藏ID错误或该商品已删除");
        result.put("31", "订单ID错误或该订单已删除");
        result.put("32", "该订单未完成，无法删除");
        result.put("33", "订单ID为空");
        result.put("34", "使用积分超过实际积分");
        result.put("35", "该商品已收藏");
        result.put("36", "请输入分类名称");
        result.put("37", "无此权限");
        result.put("38", "提交信息不完整");
        result.put("39", "两次输入密码不一致");
        result.put("40", "新密码不能和旧密码相同");
        result.put("41", "旧密码错误");
        result.put("42", "收货地址为空");
        result.put("43", "商品参数不完整");
        result.put("44", "商品参数异常");
        result.put("45", "无此权限");
        result.put("46", "未上传图片");
        result.put("47", "图片保存失败");
        result.put("48", "该申请不存在");
        result.put("49", "状态异常");
        result.put("50", "单号错误");
        result.put("51", "服务单号错");
        result.put("52", "服务状态异常");
        result.put("53", "参数异常");
        result.put("54", "删除失败");
        result.put("55", "两次输入密码不一致");
        result.put("56", "用户ID错误");
        result.put("57", "余额不足");
        result.put("58", "必须上传图片");
        result.put("59", "查询信息为空");
        result.put("60", "此号码已注册");
        result.put("61", "短信发送间隔为一分钟");
        result.put("62", "此订单为退货");
        result.put("63", "订单号错,无法支付");
        result.put("64", "身份证号已注册");
        result.put("65", "商品颜色和库存不一致");
        return result;
    }

    @RequestMapping(value = URL + "GetAllTableName", method = RequestMethod.GET)
    @ApiOperation("获取所有表名")
    public Map getAllTableName() {
        Map<String, String> result = new HashMap<>();
        result.put("TB_ADDRESSES", "收货地址");
        result.put("TB_CLASSIFYS", "商品类目");
        result.put("TB_COLLECTIONS", "商品收藏");
        result.put("TB_BRANDS", "品牌");
        result.put("TB_GOODS", "商品");
        result.put("TB_GOODSDETAILS", "商品详细");
        result.put("TB_ORDERS", "订单");
        result.put("TB_ORDERDETAILS", "订单详情");
        result.put("TB_LOGISTICSS", "物流");
        result.put("TB_USERS", "（商家）用户");
        result.put("TB_SELLERS", "厂家");
        result.put("TB_AFTERSERVICES", "售后服务");
        result.put("TB_SERVICEDETAILS", "售后服务流程");
        result.put("TB_ADMINS", "管理员");
        result.put("TB_NOTICES", "对厂家的公告");
        return result;
    }

    @RequestMapping(value = URL + "GetTableMeaning", method = RequestMethod.GET)
    @ApiOperation("根据表名获表取字段含义")
    @ApiImplicitParam(name = "tablename", value = "表名", required = true, dataType = "String", paramType = "query")
    public Map getTableMeaning(@RequestParam(value = "tablename") String tablename) {
        Map<String, String> result = new HashMap<>();
        switch (tablename) {
            case "TB_ADDRESSES":
                result.put("CM_ADDRESSID", "地址ID");
                result.put("CM_ADDRESSNAME", "地址");
                result.put("CM_USERID", "用户ID");
                result.put("CM_ISFIRST", "是否为默认地址；1是默认，0不是");
                break;
            case "TB_CLASSIFYS":
                result.put("CM_CLASSIFYID", "类别ID");
                result.put("CM_CLASSIFYNAME", "类名");
                result.put("CM_PARENTID", "父类ID");
                result.put("CM_IMGPATH", "图片地址");
                break;
            case "TB_COLLECTIONS":
                result.put("CM_COLLECTIONID", "收藏ID");
                result.put("CM_USERID", "用户ID");
                result.put("CM_GOODSID", "商品ID");
                result.put("CM_JOINTIME", "加入时间");
                break;
            case "TB_BRANDS":
                result.put("CM_BRANDID", "品牌ID");
                result.put("CM_BRAND", "品牌名称");
                result.put("CM_OTHER", "品牌介绍及备注");
                break;
            case "TB_GOODS":
                result.put("CM_GOODSID", "商品ID");
                result.put("CM_GOODSARTNUM", "自编码");
                result.put("CM_SELLERID", "厂家ID");
                result.put("CM_CLASSIFYID", "大类ID");
                result.put("CM_CLASSIFYTABS", "子类ID集合");
                result.put("CM_BRANDID", "品牌ID");
                result.put("CM_TITLE", "商品标题");
                result.put("CM_SALES", "销量");
                result.put("CM_ORIGINALPRICE", "原价");
                result.put("CM_PRESENTPRICE", "现价");
                result.put("CM_HTML", "商品详情HTML");
                result.put("CM_MAINFIGUREPATH", "主图地址");
                result.put("CM_HORIZONTALPATH", "暂未使用");
                result.put("CM_FIGURESPATH", "展示图地址集合，用|分割");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_ISOFF", "是否下架，0上架，1下架");
                result.put("CM_ISPROMOTION", "是否推荐，0不推荐，1推荐");
                result.put("CM_SPEC", "规格，用_分割");
                break;
            case "TB_GOODSDETAILS":
                result.put("CM_GOODSDETAILSID", "商品规格详情ID");
                result.put("CM_GOODSID", "商品ID");
                result.put("CM_COLOR", "颜色");
                result.put("CM_IMAGEPATH", "颜色图片地址");
                result.put("CM_SPEC_STOCK", "规格库存集合用|和_分割");
                break;
            case "TB_ORDERS":
                result.put("CM_ORDERID", "订单ID");
                result.put("CM_ORDERDETAILSIDS", "订单详情ID集合（|分割）");
                result.put("CM_USERID", "用户ID");
                result.put("CM_USESCORE", "使用积分数");
                result.put("CM_NUMBERSUN", "总数量");
                result.put("CM_MONEYSUN", "总金额");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_STATE", "状态（0待支付，1已取消，2待发货，3已发货，4已完成）");
                break;
            case "TB_ORDERDETAILS":
                result.put("CM_ORDERDETAILSID", "订单详情ID");
                result.put("CM_ORDERID", "订单ID");
                result.put("CM_GOODSID", "商品ID");
                result.put("CM_USERID", "用户ID");
                result.put("CM_SPECNUMDETAILS", "规格以及数量集合");
                result.put("CM_NUMBER", "总数量");
                result.put("CM_MONEY", "总金额");
                result.put("CM_SELLERID", "厂家ID");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_SERVICESTATE", "售后状态（0正常，1待审核，2待用户寄回，3待商家收货，4待商家寄出，5待用户收货，7待用户确认，8待商家确认，9:完成，10取消）");
                result.put("CM_SELLERSTATE", "销售状态（0待支付，1已取消，2待发货，3已发货，4已完成）");
                result.put("CM_LOGISTICSNUM", "物流名称");
                result.put("CM_LOGISTICSID", "物流ID");
                break;
            case "TB_LOGISTICSS":
                result.put("CM_LOGISTICSID", "物流ID");
                result.put("CM_LOGISTICSNAME", "物流名称");
                break;
            case "TB_USERS":
                result.put("CM_USERID", "商家（用户）ID");
                result.put("CM_NICKNAME", "名称");
                result.put("CM_PHONE", "电话");
                result.put("CM_ACCOUNT", "账号");
                result.put("CM_PASSWORD", "密码");
                result.put("CM_INTEGRAL", "积分");
                result.put("CM_BALANCE", "余额");
                result.put("CM_CARDFACEPATH", "身份证正面");
                result.put("CM_CARDBACKPATH", "身份证反面");
                result.put("CM_PERSONALPATH", "手持身份证");
                result.put("CM_LICENSEPATH", "营业执照");
                result.put("CM_SHOPEADDRESS", "店铺地址");
                result.put("CM_SHOPLON", "经度");
                result.put("CM_SHOPLAT", "纬度");
                result.put("CM_LEVEL", "等级（暂未使用）");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_ISEXAMINE", "是否通过审核（0未审核，1失败，2成功）");
                result.put("CM_REASON", "审核失败原因");
                result.put("CM_CARDNO", "身份证号");
                break;
            case "TB_SELLERS":
                result.put("CM_SELLERID", "厂家ID");
                result.put("CM_SELLERNAME", "名称");
                result.put("CM_PHONE", "电话");
                result.put("CM_ACCOUNT", "账号");
                result.put("CM_PASSWORD", "密码");
                result.put("CM_BRANDID", "品牌ID");
                result.put("CM_CARDFACEPATH", "身份证正面");
                result.put("CM_CARDBACKPATH", "身份证反面");
                result.put("CM_PERSONALPATH", "手持身份证");
                result.put("CM_LICENSEPATH", "营业执照");
                result.put("CM_ADDRESS", "店铺地址");
                result.put("CM_LON", "经度");
                result.put("CM_LAT", "纬度");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_ISEXAMINE", "是否通过审核（0未审核，1失败，2成功）");
                result.put("CM_REASON", "审核失败原因");
                result.put("CM_CARDNO", "身份证号");
                result.put("CM_TAX", "税收号");
                break;
            case "TB_AFTERSERVICES":
                result.put("CM_AFTERSERVICEID", "售后服务ID");
                result.put("CM_SELLERID", "厂家ID");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_USERID", "用户ID");
                result.put("CM_ORDERDETAILSID", "订单详情ID");
                result.put("CM_REASON", "售后原因");
                result.put("CM_TYPE", "售后类型（1退货，2换货，3返修）");
                result.put("CM_STATE", "售后状态（0正常，1待审核，2待用户寄回，3待商家收货，4待商家寄出，5待用户收货，7待用户确认，8待商家确认，9:完成，10取消）");
                result.put("CM_IMGPATHS", "图片集合（用|分割）");
                break;
            case "TB_SERVICEDETAILS":
                result.put("CM_ID", "售后服务流程ID");
                result.put("CM_AFTERSERVICEID", "售后服务ID");
                result.put("CM_CREATETIME", "创建时间");
                result.put("CM_TYPE", "流程类型（0正常，1待审核，2待用户寄回，3待商家收货，4待商家寄出，5待用户收货，7待用户确认，8待商家确认，9:完成，10取消）");
                result.put("CM_LOGISTICSNUM", "物流单号");
                result.put("CM_LOGISTICSID", "物流ID");
                break;
            case "TB_ADMINS":
                result.put("CM_ADMINID", "管理员ID");
                result.put("CM_NAME", "管理员名称");
                result.put("CM_ACCOUNT", "账号");
                result.put("CM_PASSWORD", "密码");
                result.put("CM_LEVEL", "等级；1系统管理员，2：销售，3：客服");
                result.put("CM_PHONE", "手机");
                break;
            case "TB_NOTICES":
                result.put("CM_NOTICEIID", "公告ID");
                result.put("CM_TITLE", "标题");
                result.put("CM_CONTENT", "公告内容");
                result.put("CM_OTHER", "其他及备注");
                result.put("CM_CREATOR", "发布者昵称");
                result.put("CM_DEADLINE", "截止时间");
                result.put("CM_ADMINID", "管理员ID");
                result.put("CM_CREATETIME", "创建时间");
                break;
        }
        return result;
    }
}
