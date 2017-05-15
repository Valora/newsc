package com.sc.web;

import com.sc.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付用Controller
 * Created by valora on 2017/5/13.
 */
@RestController
@Api("PayStartCall")
public class PayStartCallController {
    private static final String URL = "/api/PayStartCall/";

    @RequestMapping(value = "WechatPay_app", method = RequestMethod.GET)
    @ApiOperation("微信（APP）")
    @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public Result wechatPayApp(@RequestParam("orderid") String orderid) {
        return null;
    }

    @RequestMapping(value = "WechatPay_pc", method = RequestMethod.GET)
    @ApiOperation("微信（PC）")
    @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public Result wechatPayPc(@RequestParam("orderid") String orderid) {
        return null;
    }

    @RequestMapping(value = "AliPay_app", method = RequestMethod.GET)
    @ApiOperation("支付宝（APP）")
    @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public Result aliPayApp(@RequestParam("orderid") String orderid) {
        return null;
    }
}
