package com.sc.web;

import com.sc.service.LoginService;
import com.sc.utils.GetResult;
import com.sc.utils.Result;
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

/**
 * Login API
 * Created by valora on 2017/3/30.
 */
@RestController
@Api("Login")
public class LoginController {

    private static final String URL = "/api/Login/";

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = URL + "SendLoginCode", method = RequestMethod.GET)
    @ApiOperation("发送登录验证码")
    @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "String", paramType = "query")
    public Result sendLoginCode(@RequestParam(value = "phone") String phone) {
        return loginService.send(phone, 2);
    }

    @RequestMapping(value = URL + "GetToken", method = RequestMethod.GET)
    @ApiOperation("商家(用户)登录(获取默认密钥)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")
    })

    public Result getToken(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password) {
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.GetToken(account, MD5.MD5Encode(password, null));
    }

    @RequestMapping(value = URL + "UserLogin", method = RequestMethod.GET)
    @ApiOperation("商家(用户)登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query"),
    })
    public Result userLogin(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password, @RequestParam(value = "code") Integer code) {
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.userLogin(account, MD5.MD5Encode(password, null), code);
    }

    //新增
    @RequestMapping(value = URL + "userLoginByAccountAndPassword", method = RequestMethod.GET)
    @ApiOperation("商家（用户）只用账号密码登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
    })
    public Result userLoginByAccountAndPassword(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password) {
        if (StringUtils.isBlank(account) || StringUtils.isBlank(password)) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.userLoginByAccountAndPasswordS(account,  MD5.MD5Encode(password, null));
    }

    //新增
    @RequestMapping(value = URL + "userLoginByPhoneAndCode", method = RequestMethod.GET)
    @ApiOperation("商家（用户）只用电话号码和验证码登入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "String", paramType = "query"),
    })
    public Result userLoginByPhoneAndCode(@RequestParam(value = "phone") String phone, @RequestParam(value = "code") String code) {
        return loginService.userLoginByPhoneAndCodeS(phone, code);
    }

    @RequestMapping(value = URL + "SellerLogin", method = RequestMethod.GET)
    @ApiOperation("厂家登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query"),
    })
    public Result sellerLogin(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password, @RequestParam(value = "code") Integer code) {
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.sellerLogin(account,  MD5.MD5Encode(password, null), code);
    }

    @RequestMapping(value = URL + "AdminLogin", method = RequestMethod.GET)
    @ApiOperation("后台管理员登录(返回有权限的URL)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")
    })
    public Result adminLogin(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password) {
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.adminLogin(account,  MD5.MD5Encode(password, null));
    }
}
