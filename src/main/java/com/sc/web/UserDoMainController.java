package com.sc.web;

import com.sc.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * userDoMainController
 * Created by valora on 2017/5/12.
 */
@RestController
@Api("UserDoMain")
public class UserDoMainController {
    private final static String URL = "/api/UserDoMain/";

    @RequestMapping(value = URL + "SubmitOrder", method = RequestMethod.POST)
    @ApiOperation("提交订单{传入参数-->秘钥:token，商品信息:goodsjson}")
    public Result submitOrder() {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyOrders_All", method = RequestMethod.GET)
    @ApiOperation("查询我的所有订单(测试请用账号毛泽东)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页码大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyOrdersAll(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyOrders_Arrearage", method = RequestMethod.GET)
    @ApiOperation("查询我的待付款订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页码大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyOrdersArrearage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyOrders_Settlement", method = RequestMethod.GET)
    @ApiOperation("查询我的待收货订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页码大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyOrdersSettlement(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "QueryOrderDetails", method = RequestMethod.GET)
    @ApiOperation("查询订单详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryOrderDetails(@RequestParam("orderid") String orderid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "DelMyOrder", method = RequestMethod.GET)
    @ApiOperation("删除我的订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result delMyOrder(@RequestParam("orderid") String orderid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "ConfirmOrderByDetailid", method = RequestMethod.GET)
    @ApiOperation("确认收货（根据订单详情）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderdetailid", value = "订单详情ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result confirmOrderByDetailid(@RequestParam("orderdetailid") Long orderdetailid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "ConfirmOrderByOrderid", method = RequestMethod.GET)
    @ApiOperation("确认收货（根据订单）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result confirmOrderByOrderid(@RequestParam("orderdetailid") Long orderdetailid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyCanAfterService", method = RequestMethod.GET)
    @ApiOperation("查询我的可售后服务商品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页码大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyCanAfterService(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyAfterService", method = RequestMethod.GET)
    @ApiOperation("查询我的售后服务单(退/换/返修)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页码大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyAfterService(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "ApplyAfterService", method = RequestMethod.POST)
    @ApiOperation("申请售后服务(退换货){传入参数{订单详情ID:orderdetailsid，操作类型:type(1：退换，2：换货3：返修),秘钥：token，原因：reason}(请用账号333333，密码123456测试)")
    public Result applyAfterService() {
        return null;
    }

    @RequestMapping(value = URL + "SendBackGoods", method = RequestMethod.GET)
    @ApiOperation("填写售后发货信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "afierserviceid", value = "售后服务ID", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "logisticsid", value = "物流ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "logisticsnum", value = "物流单号", required = true, dataType = "String", paramType = "query")
    })
    public Result sendBackGoods(@RequestParam("token") String token, @RequestParam("afierserviceid") Integer afierserviceid, @RequestParam("logisticsid") Integer logisticsid, @RequestParam("logisticsnum") String logisticsnum) {
        return null;
    }

    @RequestMapping(value = URL + "ConfirmAfterService", method = RequestMethod.GET)
    @ApiOperation("确认售后服务完成(确认收到退/换的商品)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "afterserviceid", value = "售后服务ID", required = true, dataType = "String", paramType = "query")
    })
    public Result confirmAfterService(@RequestParam("token") String token, @RequestParam("afterserviceid") String afterserviceid) {
        return null;
    }

    @RequestMapping(value = URL + "CancelAfterService", method = RequestMethod.GET)
    @ApiOperation("取消售后服务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "afterserviceid", value = "售后服务ID", required = true, dataType = "String", paramType = "query")
    })
    public Result cancelAfterService(@RequestParam("token") String token, @RequestParam("afterserviceid") String afterserviceid) {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyCollection", method = RequestMethod.GET)
    @ApiOperation("查询我的收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页码大小", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyCollection(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "DelMyCollection", method = RequestMethod.GET)
    @ApiOperation("删除我的收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsid", value = "商品ID", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result delMyCollection(@RequestParam("goodsid") Long goodsid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "JoinMyCollection", method = RequestMethod.GET)
    @ApiOperation("加入收藏")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "goodsid", value = "商品ID", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result joinMyCollection(@RequestParam("goodsid") Long goodsid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "AddAddress", method = RequestMethod.GET)
    @ApiOperation("增加收货地址")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "address", value = "收货地址", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "收货人姓名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "phone", value = "联系电话", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "isfirst", value = "是否设为默认(0不是，1是)", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result addAddress(@RequestParam("address") String address, @RequestParam("name") String name, @RequestParam("phone") Long phone, @RequestParam("isfirst") Integer isfirst, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "DelAdress", method = RequestMethod.GET)
    @ApiOperation("删除收货地址")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "addressid", value = "地址ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result delAdress(@RequestParam("addressid") Integer addressid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "SetUpFirstAddress", method = RequestMethod.GET)
    @ApiOperation("设置默认地址")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "addressid", value = "地址ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result setUpFirstAddress(@RequestParam("addressid") Integer addressid, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "QueryMyInformation", method = RequestMethod.GET)
    @ApiOperation("查询我的个人信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result queryMyInformation(@RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "ModifyPassword", method = RequestMethod.GET)
    @ApiOperation("用户修改密码（商家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oldpassword", value = "旧密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "newpassword", value = "新密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "confirmpassword", value = "确认密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")
    })
    public Result modifyPassword(@RequestParam("oldpassword") String oldpassword, @RequestParam("newpassword") String newpassword, @RequestParam("confirmpassword") String confirmpassword, @RequestParam("token") String token) {
        return null;
    }

    @RequestMapping(value = URL + "SendRetrieveCode", method = RequestMethod.GET)
    @ApiOperation("发送找回密码验证码（商家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Long", paramType = "query")
    })
    public Result sendRetrieveCode(@RequestParam("phone") Long phone) {
        return null;
    }

    @RequestMapping(value = URL + "ResettingPassword", method = RequestMethod.GET)
    @ApiOperation("设置新密码(找回密码)（商家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "newpassword", value = "新密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "confirmpassword", value = "确认密码", required = true, dataType = "String", paramType = "query")
    })
    public Result resettingPassword(@RequestParam("phone") Long phone, @RequestParam("code") Integer code, @RequestParam("newpassword") String newpassword, @RequestParam("confirmpassword") String confirmpassword) {
        return null;
    }

    @RequestMapping(value = URL + "SendBackAccountCode", method = RequestMethod.GET)
    @ApiOperation("发送找回用户名验证码（商家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Long", paramType = "query")
    })
    public Result sendBackAccountCode(@RequestParam("phone") Long phone) {
        return null;
    }

    @RequestMapping(value = URL + "BackAccount", method = RequestMethod.GET)
    @ApiOperation("找回账号（商家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query")
    })
    public Result BackAccount(@RequestParam("phone") Long phone, @RequestParam("code")Integer code) {
        return null;
    }

    @RequestMapping(value = URL + "QueryLogisticsInfo_one", method = RequestMethod.GET)
    @ApiOperation("查询物流信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderdetailid", value = "订单详情ID", required = true, dataType = "Long", paramType = "query")
    })
    public Result queryLogisticsInfoOne(@RequestParam("orderdetailid") String orderdetailid) {
        return null;
    }

    @RequestMapping(value = URL + "QueryLogisticsInfo_two", method = RequestMethod.GET)
    @ApiOperation("查询物流信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "afterserviceid", value = "售后服务ID", required = true, dataType = "Long", paramType = "query")
    })
    public Result queryLogisticsInfoTwo(@RequestParam("afterserviceid") String afterserviceid) {
        return null;
    }

    @RequestMapping(value = URL + "QueryLogisticsInfo_three", method = RequestMethod.GET)
    @ApiOperation("查询物流信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "servicedetailsid", value = "售后服务详情ID", required = true, dataType = "Long", paramType = "query")
    })
    public Result queryLogisticsInfoThree(@RequestParam("servicedetailsid") String servicedetailsid) {
        return null;
    }
}
