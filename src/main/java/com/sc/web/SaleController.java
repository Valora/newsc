package com.sc.web;

import com.sc.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * SaleController
 * Created by valora on 2017/5/9.
 */
@RestController
@Api("Sale")
public class SaleController {
    private final static String URL = "/api/Sale/";

    @RequestMapping(value = URL + "SendApplicationCode", method = RequestMethod.GET)
    @ApiOperation("发送申请验证码")
    @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Integer", paramType = "query")
    public Result sendApplocationCode(@RequestParam("phone") Long phone) {
        return null;
    }

    @RequestMapping(value = URL + "UserApplication", method = RequestMethod.POST)
    @ApiOperation("(商家)申请{token秘钥,phone电话,code验证码,shopname店铺名称，address地址,lon经度,lat纬度,pwd密码,pwdagain确认密码,cardno身份证号码，personname用户姓名,contactname紧急联系人姓名，contactphone紧急联系人电话，telephone固定电话,pax固定电话,图片{身份证以及人name:card,店铺name:store,营业执照以及证件name:license}")
    public Result userApplication(@RequestParam("form") Map<String, Object> form) {
        return null;
    }

    @RequestMapping(value = URL + "SellerApplication", method = RequestMethod.POST)
    @ApiOperation("(商家)申请{token秘钥,phone电话,code验证码,shopname店铺名称，address地址,lon经度,lat纬度,pwd密码,pwdagain确认密码,cardno身份证号码，personname用户姓名,contactname紧急联系人姓名，contactphone紧急联系人电话，telephone固定电话,pax固定电话,图片{身份证以及人name:card,店铺name:store,营业执照以及证件name:license}")
    public Result sellerApplication(@RequestParam("form") Map<String, Object> form) {
        return null;
    }
}
