package com.sc.web;

import com.alipay.api.AlipayApiException;
import com.sc.service.PayService;
import com.sc.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 支付用Controller
 * Created by valora on 2017/5/13.
 */
@RestController
@Api("PayStartCall")
public class PayStartCallController {
    private static final String URL = "/api/PayStartCall/";

    @Autowired
    private PayService payService;

    @RequestMapping(value = URL + "WechatPay_app", method = RequestMethod.GET)
    @ApiOperation("微信（APP）")
    @ApiImplicitParam(name = "orderids", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public Result wechatPayApp(@RequestParam("orderids") String orderids) {
        return payService.wechatPayApp(orderids);
    }

    @RequestMapping(value = URL + "WechatPay_pc", method = RequestMethod.GET)
    @ApiOperation("微信（PC）")
    @ApiImplicitParam(name = "orderids", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public Result wechatPayPc(@RequestParam("orderids") String orderids) {
        return payService.wechatPayPC(orderids);
    }

    @RequestMapping(value = URL + "AliPay_app", method = RequestMethod.GET)
    @ApiOperation("支付宝（APP）")
    @ApiImplicitParam(name = "orderids", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public Result aliPayApp(@RequestParam("orderids") String orderids) {
        return payService.aliPayApp(orderids);
    }

    @RequestMapping(value = URL + "AliPay_pc", method = RequestMethod.GET)
    @ApiOperation("支付宝（PC）")
    @ApiImplicitParam(name = "orderids", value = "订单ID", required = true, dataType = "String", paramType = "query")
    public void aliPayPc(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        payService.aliPayPc(request, response);
    }

//    @RequestMapping(value = "/alinotify", method = RequestMethod.GET)
//    public String aliNotify(HttpServletRequest request, HttpServletResponse response) throws AlipayApiException {
//        payService.aliNotify(request, response);
//        return "addd";
//    }

    @RequestMapping(value = "/alinotify", method = RequestMethod.GET)
    public Map phone() {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        return result;
    }

    @RequestMapping(value = "/wxnotify")
    public void wxNotify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        payService.wxNotify(request, response);
    }
}
