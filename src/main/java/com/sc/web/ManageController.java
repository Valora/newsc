package com.sc.web;

import com.sc.service.ManageService;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.Token;
import com.sc.utils.pay.MD5;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 后台管理
 * Created by Sun on 2017/4/21.
 */
@RestController
@Api("Manage")
public class ManageController {
    private final static String URL = "/api/Values/";

    private final JWT jwt;

    private final ManageService manageService;

    @Autowired
    public ManageController(JWT jwt, ManageService manageService) {
        this.jwt = jwt;
        this.manageService = manageService;
    }

    @RequestMapping(value = URL + "AddEmployee", method = RequestMethod.GET)
    @ApiOperation("添加客服/销售(账号自动生成)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "phone", value = "手机", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "类型（2：销售，3：客服）", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query")
    })
    public Result addEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "password") String password, @RequestParam(value = "phone") Long phone, @RequestParam(value = "type") Integer type, @RequestParam(value = "token") String token) {
        if (name.isEmpty() || password.isEmpty()) {
            return GetResult.toJson(38, null, null, null, 0);
        }
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.addEmployee(name, MD5.MD5Encode(password, null), phone, type, tk.getUserId());
    }

    @RequestMapping(value = URL + "DelEmployee", method = RequestMethod.GET)
    @ApiOperation("删除客服/销售(CM_LEVEL:2销售，3客服)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminid", value = "被删除客服／销售ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query")
    })
    public Result delEmployee(@RequestParam(value = "adminid") Integer adminid, @RequestParam(value = "token") String token) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.delEmployee(adminid, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryEmployee", method = RequestMethod.GET)
    @ApiOperation("查询客服/销售列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryEmployees(@RequestParam(value = "token") String token, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryEmployees(pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryUser", method = RequestMethod.GET)
    @ApiOperation("查询商家列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryUsers(@RequestParam(value = "token") String token, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryUsers(pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "QuerySeller", method = RequestMethod.GET)
    @ApiOperation("查询厂家列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result querySeller(@RequestParam(value = "token") String token, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.querySellers(pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryUserInfo", method = RequestMethod.GET)
    @ApiOperation("查询商家详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userid", value = "商家ID", required = true, dataType = "String", paramType = "query")
    })
    public Result queryUserInfo(@RequestParam(value = "token") String token, @RequestParam(value = "userid") String userid) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.queryUserInfo(userid, tk.getUserId());
    }

    @RequestMapping(value = URL + "QuerySellerInfo", method = RequestMethod.GET)
    @ApiOperation("查询厂家详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "sellerid", value = "厂家ID", required = true, dataType = "String", paramType = "query")
    })
    public Result querySellerInfo(@RequestParam(value = "token") String token, @RequestParam(value = "userid") String sellerid) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        return manageService.querySellerInfo(sellerid, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryEmployeesByUserInfo", method = RequestMethod.GET)
    @ApiOperation("根据客服/销售信息（模糊）查询客服/销售详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "搜索内容(名称，账号)", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "String", paramType = "query")
    })
    public Result queryEmployeesByUserInfo(@RequestParam(value = "token") String token, @RequestParam(value = "content") String content, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        if (content.isEmpty()) {
            return GetResult.toJson(59, null, null, null, 0);
        }
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryEmployeesByUserInfo(content, pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryUsersByUserInfo", method = RequestMethod.GET)
    @ApiOperation("根据商家信息（模糊）查询商家详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "搜索内容(用户姓名，账号，店铺名称，店铺地址)", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "String", paramType = "query")
    })
    public Result queryUsersByUserInfo(@RequestParam(value = "token") String token, @RequestParam(value = "content") String content, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        if (content.isEmpty()) {
            return GetResult.toJson(59, null, null, null, 0);
        }
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryUserByUserInfo(content, pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "QuerySellersBySellerInfo", method = RequestMethod.GET)
    @ApiOperation("根据厂家信息（模糊）查询厂家详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "密钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "搜索内容(用户姓名，账号，店铺名称，公司地址)", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "String", paramType = "query")
    })
    public Result querySellersBySellerInfo(@RequestParam(value = "token") String token, @RequestParam(value = "content") String content, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        if (content.isEmpty()) {
            return GetResult.toJson(59, null, null, null, 0);
        }
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.querySellersBySellerInfo(content, pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "AddClassify", method = RequestMethod.POST)
    @ApiOperation("添加商品分类和子分类{classifyname分类名称, type分类类型（0：大类，1：子类）,parentid上级分类（如果是大类，则输入0）,token秘钥, 图片}")
    public Result addClassify(HttpServletRequest request, @RequestParam("file") MultipartFile[] files) {
        System.out.println(files);
        String classifyname = request.getParameter("classifyname");
        String type = request.getParameter("type");
        String parentid = request.getParameter("parentid");
        String token = request.getParameter("token");
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }
        return manageService.addClassify(classifyname, type, parentid, tk.getUserId(), files);
    }

    @RequestMapping(value = URL + "ReviceClassify", method = RequestMethod.POST)
    @ApiOperation("修改商品分类和子分类{classifyid分类ID，classifyname分类名称,type分类类型（0：大类，1：子类）,parentid上级分类（如果是大类，则输入0）,token秘钥,图片}")
    public Result reviceClassify(HttpServletRequest request, @RequestParam("file") MultipartFile[] files) {
        String classifyname = request.getParameter("classifyname");
        String classifyid = request.getParameter("classifyid");
        String type = request.getParameter("type");
        String parentid = request.getParameter("parentid");
        String token = request.getParameter("token");
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.reviceClassify(classifyid, classifyname, type, parentid, tk.getUserId(), files);
    }

    @RequestMapping(value = URL + "QueryClassifies", method = RequestMethod.GET)
    @ApiOperation("查询分类/二级分类列表（删除或排序时使用）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "查询类型（1：大类,2：子类）", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryClassifies(@RequestParam(value = "type") Integer type, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryClassifies(type, pagenum, pagesize);
    }

    @RequestMapping(value = URL + "ClassifySort", method = RequestMethod.GET)
    @ApiOperation("分类排序")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "classifyid", value = "分类ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "sort", value = "序号(从小到大排序，大类和小类分开排序)", required = true, dataType = "Integer", paramType = "query")
    })
    public Result classifySort(@RequestParam(value = "token") String token, @RequestParam(value = "classifyid") Integer classifyid, @RequestParam(value = "sort") Integer sort) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.classifySort(classifyid, sort, tk.getUserId());
    }

    @RequestMapping(value = URL + "DelClassify", method = RequestMethod.GET)
    @ApiOperation("删除商品分类和子分类")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classifyid", value = "分类ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query")

    })
    public Result delClassify(@RequestParam(value = "classifyid") Integer classifyid, @RequestParam(value = "token") String token) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.delClassify(classifyid, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryBrands", method = RequestMethod.GET)
    @ApiOperation("查询品牌列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryBrands(@RequestParam(value = "token") String token, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryBrands(pagenum, pagesize);
    }

    @RequestMapping(value = URL + "AddBrand", method = RequestMethod.GET)
    @ApiOperation("添加品牌")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "brand", value = "品牌", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "introduce", value = "介绍", required = true, dataType = "String", paramType = "query")
    })
    public Result addBrand(@RequestParam(value = "token") String token, @RequestParam(value = "brand") String brand, @RequestParam(value = "introduce") String introduce) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.addBrand(tk.getUserId(), brand, introduce);
    }

    @RequestMapping(value = URL + "DelBrand", method = RequestMethod.GET)
    @ApiOperation("删除品牌")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "brandid", value = "品牌ID", required = true, dataType = "Integer", paramType = "query")
    })
    public Result delBrands(@RequestParam(value = "token") String token, @RequestParam(value = "brandid") Integer brandid) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.delBrands(tk.getUserId(), brandid);
    }

    @RequestMapping(value = URL + "QueryApplications", method = RequestMethod.GET)
    @ApiOperation("查询店铺注册申请(全部数据都已提供，可以不使用详情接口)")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryApplications(@RequestParam(value = "token") String token, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryApplications(pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "QueryApplicationDetail", method = RequestMethod.GET)
    @ApiOperation("查询店铺注册申请详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userid", value = "用户ID", required = true, dataType = "String", paramType = "query")
    })
    public Result queryApplicationDetail(@RequestParam(value = "token") String token, @RequestParam(value = "userid") String userid) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.queryApplicationDetail(userid, tk.getUserId());
    }

    @RequestMapping(value = URL + "ThroughAudit", method = RequestMethod.GET)
    @ApiOperation("通过审核")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userid", value = "用户ID", required = true, dataType = "String", paramType = "query")
    })
    public Result throughAudit(@RequestParam(value = "token") String token, @RequestParam(value = "userid") String userid) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.throughAudit(tk.getUserId(), userid);
    }

    @RequestMapping(value = URL + "AuditFailure", method = RequestMethod.GET)
    @ApiOperation("审核失败")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userid", value = "用户ID", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "reason", value = "失败原因", required = true, dataType = "String", paramType = "query")
    })
    public Result auditFailure(@RequestParam(value = "token") String token, @RequestParam(value = "userid") String userid, @RequestParam(value = "reason") String reason) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.auditFailure(tk.getUserId(), userid, reason);
    }

    @RequestMapping(value = URL + "QueryNotices", method = RequestMethod.GET)
    @ApiOperation("查询公告列表（对厂家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "页码", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面大小", required = true, dataType = "Integer", paramType = "query")
    })
    public Result queryNotices(@RequestParam(value = "token") String token, @RequestParam(value = "pagenum") Integer pagenum, @RequestParam(value = "pagesize") Integer pagesize) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        pagenum = pagenum < 1 ? 1 : pagenum;
        pagesize = pagesize < 1 ? 10 : pagesize;

        return manageService.queryNotices(pagenum, pagesize, tk.getUserId());
    }

    @RequestMapping(value = URL + "AddNotices", method = RequestMethod.POST)
    @ApiOperation("添加公告(对厂家){token秘钥，title标题，content内容，creator公告者，other其他，deadline过期时间}")
    public Result addNotices(@RequestParam("token") String token, @RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("creator") String creator, @RequestParam("other") String other, @RequestParam("deadline") String deadline) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        LocalDate now = LocalDate.now();
        LocalDate deadLine = LocalDate.parse(deadline, DateTimeFormatter.ISO_LOCAL_DATE);
        if (title.isEmpty() || content.isEmpty() || creator.isEmpty() || deadLine.isBefore(now)) {
            return GetResult.toJson(53, null, null, null, 0);
        }
        return manageService.addNotices(tk.getUserId(), title, content, creator, other, deadLine);
    }

    @RequestMapping(value = URL + "DelNotices", method = RequestMethod.GET)
    @ApiOperation("删除公告（对厂家）")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "秘钥", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "noticeid", value = "公告ID", required = true, dataType = "Integer", paramType = "query")
    })
    public Result delNotices(@RequestParam(value = "token") String token, @RequestParam(value = "noticeid") Integer noticeid) {
        Token tk = jwt.checkJWT(token);
        if (tk == null) {
            return GetResult.toJson(101, null, null, null, 0);
        }

        return manageService.delNotices(tk.getUserId(), noticeid);
    }
}
