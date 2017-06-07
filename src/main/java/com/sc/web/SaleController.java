package com.sc.web;

import com.sc.domain.sale.SellerApplication;
import com.sc.domain.sale.UserApplication;
import com.sc.service.SaleService;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.Token;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * SaleController
 * Created by valora on 2017/5/9.
 */
@RestController
@Api("Sale")
public class SaleController {
    private final static String URL = "/api/Sale/";

    private final JWT jwt;

    private final SaleService saleService;

    @Autowired
    public SaleController(JWT jwt, SaleService saleService) {
        this.jwt = jwt;
        this.saleService = saleService;
    }

    @RequestMapping(value = URL + "SendApplicationCode", method = RequestMethod.GET)
    @ApiOperation("发送申请验证码")
    @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Integer", paramType = "query")
    public Result sendApplocationCode(@RequestParam("phone") Long phone) {
        return saleService.sendApplocationCodeS(phone, 1);
    }

    @RequestMapping(value = URL + "UserApplication", method = RequestMethod.POST)
    @ApiOperation("(商家)申请{token秘钥,phone电话,code验证码,shopname店铺名称，address地址,lon经度,lat纬度,pwd密码,pwdagain确认密码,cardno身份证号码，personname用户姓名,contactname紧急联系人姓名，contactphone紧急联系人电话，telephone固定电话,pax固定电话,图片{身份证以及人name:card,店铺name:store,营业执照以及证件name:license}")
    public Result userApplication(@ModelAttribute UserApplication user, BindingResult result) {
        Token tk = jwt.checkJWT(user.getToken());
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        if (result.hasErrors()) {
            return GetResult.toJson(38, null, null, null, 0);
        }

        if (!Objects.equals(user.getPwd(), user.getPwdagain())) {
            return GetResult.toJson(55, null, null, null, 0);
        }
        return saleService.UserApplication(tk.getUserId(), user.getPhone(), user.getCode(), user.getAddress(), user.getLon(), user.getLat(), user.getPwd(), user.getCardno(), user.getShopname(), user.getPersonname(), user.getContactname(), user.getContactphone(), user.getTelephone(), user.getPax(), user.getFiles());
    }
    @RequestMapping(value = URL + "SellerApplication", method = RequestMethod.POST)
    @ApiOperation("(商家)申请{token秘钥,phone电话,code验证码,shopname店铺名称，address地址,lon经度,lat纬度,pwd密码,pwdagain确认密码,cardno身份证号码，personname用户姓名,contactname紧急联系人姓名，contactphone紧急联系人电话，telephone固定电话,pax固定电话,图片{身份证以及人name:card,店铺name:store,营业执照以及证件name:license}")
    public Result sellerApplication(@ModelAttribute SellerApplication seller, BindingResult result) {
        Token tk = jwt.checkJWT(seller.getToken());
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        if (result.hasErrors()) {
            return GetResult.toJson(38, null, null, null, 0);
        }

        if (!Objects.equals(seller.getPwd(), seller.getPwdagain())) {
            return GetResult.toJson(55, null, null, null, 0);
        }
        return saleService.SellerApplication(tk.getUserId(), seller.getPhone(), seller.getCode(), seller.getAddress(), seller.getLon(), seller.getLat(), seller.getPwd(), seller.getCardno(), seller.getCompanyname(), seller.getPersonname(), seller.getContactname(), seller.getContactphone(), seller.getTelephone(), seller.getPax(), seller.getFiles());
    }

    @RequestMapping(value = URL + "QueryUsersByMap", method = RequestMethod.GET)
    @ApiOperation("根据经纬度获取商家列表（暂时2公里）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "lon", value = "经度", required = true, dataType = "Double", paramType = "query"),
            @ApiImplicitParam(name = "lat", value = "纬度", required = true, dataType = "Double", paramType = "query"),
            @ApiImplicitParam(name = "distance", value = "距离（0：默认2公里，其他自传；一公里为0.01）", required = true, dataType = "Double", paramType = "query")
    })
    public Result queryUsersByMap(@RequestParam("token") String token, @RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("distance") Double distance) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        } else {
            return saleService.QueryUsersByMap(tk.getUserId(), lon, lat, distance);
        }
    }

    @RequestMapping(value = URL + "QuerySellersByMap", method = RequestMethod.GET)
    @ApiOperation("根据经纬度获取厂家列表（暂时2公里）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "lon", value = "经度", required = true, dataType = "Double", paramType = "query"),
            @ApiImplicitParam(name = "lat", value = "纬度", required = true, dataType = "Double", paramType = "query"),
            @ApiImplicitParam(name = "distance", value = "距离（0：默认2公里，其他自传；一公里为0.01）", required = true, dataType = "Double", paramType = "query")
    })
    public Result querySellersByMap(@RequestParam("token") String token, @RequestParam("lon") Double lon, @RequestParam("lat") Double lat, @RequestParam("distance") Double distance) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        } else {
            return saleService.QuerySellerByMap(tk.getUserId(), lon, lat, distance);
        }
    }

    @RequestMapping(value = URL + "SendRetrieveCode", method = RequestMethod.GET)
    @ApiOperation("发送找回密码验证码（业务人员）")
    @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Integer", paramType = "query")
    public Result sendRetrieveCode(@RequestParam("phone") Long phone) {
        return saleService.sendApplocationCodeS(phone, 4);
    }

    @RequestMapping(value = URL + "ResettingPassword", method = RequestMethod.GET)
    @ApiOperation("设置找回密码新密码（业务人员）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "newpassword", value = "新密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "confirmpassword", value = "确认密码", required = true, dataType = "String", paramType = "query")
    })
    public Result resettingPassword(@RequestParam("phone") Long phone, @RequestParam("code") Integer code, @RequestParam("newpassword") String newpassword, @RequestParam("confirmpassword") String confirmpassword) {
        if (newpassword.isEmpty() || confirmpassword.isEmpty()) {
            return GetResult.toJson(38, null, null, null, 0);
        }
        if (newpassword.equals(confirmpassword)) {
            return GetResult.toJson(39, null, null, null, 0);
        }
        return saleService.ResettingPassword(phone, code, newpassword);
    }

    @RequestMapping(value = URL + "SendBackAccountCode", method = RequestMethod.GET)
    @ApiOperation("发送找回用户名验证码（业务人员）")
    @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Integer", paramType = "query")
    public Result sendBackAccountCode(@RequestParam("phone") Long phone) {
        return saleService.sendApplocationCodeS(phone, 1);
    }

    @RequestMapping(value = URL + "BackAccount", method = RequestMethod.GET)
    @ApiOperation("找回账号（业务人员）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query")
    })

    public Result backAccount(@RequestParam("phone") Long phone, @RequestParam("code") Integer code) {
        return saleService.BackAccount(phone,code);
    }
}
