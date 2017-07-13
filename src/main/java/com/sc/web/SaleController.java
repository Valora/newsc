package com.sc.web;

import com.sc.service.SaleService;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.Token;
import com.sc.utils.pay.MD5;
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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
    public Result userApplication(HttpServletRequest request, @RequestParam("files") MultipartFile[] files) {
        String token = request.getParameter("token");
        String address = request.getParameter("address");
        String pwd = request.getParameter("pwd");
        String pwdagain = request.getParameter("pwdagain");
        String cardno = request.getParameter("cardno");
        String phone1 = request.getParameter("phone");
        Long phone = Long.valueOf(request.getParameter("phone"));
        String code1 = request.getParameter("code");
        Integer code = Integer.valueOf(request.getParameter("code"));
        String lon1 = request.getParameter("lon");
        Double lon = Double.valueOf(request.getParameter("lon"));
        String lat1 = request.getParameter("lat");
        Double lat = Double.valueOf(request.getParameter("lat"));
        String shopname = request.getParameter("shopname");
        String personname = request.getParameter("personname");
        String contactname = request.getParameter("contactname");
        String contactphone = request.getParameter("contactphone");
        String telephone = request.getParameter("telephone");
        String pax = request.getParameter("pax");
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        if (StringUtils.isBlank(token) || StringUtils.isBlank(address) || StringUtils.isBlank(pwd) || StringUtils.isBlank(pwdagain) || StringUtils.isBlank(cardno) || StringUtils.isBlank(phone1) || StringUtils.isBlank(code1) || StringUtils.isBlank(lon1) || StringUtils.isBlank(lat1) || StringUtils.isBlank(shopname) || StringUtils.isBlank(personname) || StringUtils.isBlank(contactname) || StringUtils.isBlank(contactphone) || StringUtils.isBlank(telephone) || StringUtils.isBlank(pax)) {
            return GetResult.toJson(38, null, null, null, 0);
        }
        if (!Objects.equals(pwd, pwdagain)) {
            return GetResult.toJson(55, null, null, null, 0);
        }
        return saleService.UserApplication(tk.getUserId(), phone, code, address, lon, lat, pwd, cardno, shopname, personname, contactname, contactphone, telephone, pax, files);
    }

    @RequestMapping(value = URL + "SellerApplication", method = RequestMethod.POST)
    @ApiOperation("(商家)申请{token秘钥,phone电话,code验证码,shopname店铺名称，address地址,lon经度,lat纬度,pwd密码,pwdagain确认密码,cardno身份证号码，personname用户姓名,contactname紧急联系人姓名，contactphone紧急联系人电话，telephone固定电话,pax固定电话,图片{身份证以及人name:card,店铺name:store,营业执照以及证件name:license}")
    public Result sellerApplication(HttpServletRequest request, @RequestParam("files") MultipartFile[] files) {
        String token = request.getParameter("token");
        String address = request.getParameter("address");
        String pwd = request.getParameter("pwd");
        String pwdagain = request.getParameter("pwdagain");
        String cardno = request.getParameter("cardno");
        String phone1 = request.getParameter("phone");
        Long phone = Long.valueOf(request.getParameter("phone"));
        Integer code = Integer.valueOf(request.getParameter("code"));
        String code1 = request.getParameter("code");
        String lon1 = request.getParameter("lon");
        Double lon = Double.valueOf(request.getParameter("lon"));
        Double lat = Double.valueOf(request.getParameter("lat"));
        String lat1 = request.getParameter("lat");
        String companyname = request.getParameter("companyname");
        String personname = request.getParameter("personname");
        String contactname = request.getParameter("contactname");
        String contactphone = request.getParameter("contactphone");
        String telephone = request.getParameter("telephone");
        String pax = request.getParameter("pax");
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        if (StringUtils.isBlank(token) || StringUtils.isBlank(address) || StringUtils.isBlank(pwd) || StringUtils.isBlank(pwdagain) || StringUtils.isBlank(cardno) || StringUtils.isBlank(phone1) || StringUtils.isBlank(code1) || StringUtils.isBlank(lon1) || StringUtils.isBlank(lat1) || StringUtils.isBlank(companyname) || StringUtils.isBlank(personname) || StringUtils.isBlank(contactname) || StringUtils.isBlank(contactphone) || StringUtils.isBlank(telephone) || StringUtils.isBlank(pax)) {
            return GetResult.toJson(38, null, null, null, 0);
        }
        if (!Objects.equals(pwd, pwdagain)) {
            return GetResult.toJson(55, null, null, null, 0);
        }
        return saleService.SellerApplication(tk.getUserId(), phone, code, address, lon, lat, pwd, cardno, companyname, personname, contactname, contactphone, telephone, pax, files);
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
        return saleService.ResettingPassword(phone, code, MD5.MD5Encode(newpassword, null));
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
        return saleService.BackAccount(phone, code);
    }
}
