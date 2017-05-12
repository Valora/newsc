package com.sc.web;

import com.sc.service.LoginService;
import com.sc.utils.GetResult;
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
    public void sendLoginCode(@RequestParam(value = "phone") String phone) {
        loginService.send(phone, 2);
    }

    @RequestMapping(value = URL + "GetToken", method = RequestMethod.GET)
    @ApiOperation("商家(用户)登录(获取默认密钥)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")
    })

    public Result getToken(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password) {
        if (account.isEmpty() || password.isEmpty()){
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.GetToken(account, password);
    }

    @RequestMapping(value = URL + "UserLogin", method = RequestMethod.GET)
    @ApiOperation("商家(用户)登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query"),
    })
    public Result userLogin(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password, @RequestParam(value = "code") Integer code){
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.userLogin(account, password, code);
    }

    @RequestMapping(value = URL + "SellerLogin", method = RequestMethod.GET)
    @ApiOperation("厂家登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, dataType = "Integer", paramType = "query"),
    })
    public Result sellerLogin(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password, @RequestParam(value = "code") Integer code){
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.sellerLogin(account, password, code);
    }

    @RequestMapping(value = URL + "AdminLogin", method = RequestMethod.GET)
    @ApiOperation("后台管理员登录(返回有权限的URL)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")
    })
    public Result adminLogin(@RequestParam(value = "account") String account, @RequestParam(value = "password") String password){
        if (account.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(1, null, null, null, 0);
        }
        return loginService.adminLogin(account, password);
    }
}
