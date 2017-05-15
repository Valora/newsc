package com.sc.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by valora on 2017/5/12.
 */
@RestController
@Api("GetImages")
public class GetImagesController {
    private final static String URL = "/api/GetImages/";

    @RequestMapping(value = URL + "Get", method = RequestMethod.GET)
    @ApiOperation("读取图片")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "path", value = "图片地址", required = true, dataType = "String", paramType = "query")
    })
    public void get(@RequestParam("path") String path) {
        
    }

    @RequestMapping(value = URL + "GetVideo", method = RequestMethod.GET)
    @ApiOperation("获取视频文件")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "path", value = "视频地址", required = true, dataType = "String", paramType = "query")
    })
    public void getVideo(@RequestParam("path") String path) {

    }
}
