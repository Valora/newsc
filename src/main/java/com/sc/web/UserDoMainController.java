package com.sc.web;

import com.sc.utils.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * userDoMainController
 * Created by valora on 2017/5/12.
 */
@RestController
public class UserDoMainController {
    private final static String URL = "/api/UserDoMain/";

    @RequestMapping(value = URL + "SubmitOrder", method = RequestMethod.POST)
    @ApiOperation("提交订单{传入参数-->秘钥:token，商品信息:goodsjson}")
    public Result submitOrder() {
        return null;
    }
}
