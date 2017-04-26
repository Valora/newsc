package com.sc.service;

import com.sc.dao.LoginDao;
import com.sc.domain.generator.Users;
import com.sc.domain.login.AdminLogin;
import com.sc.domain.login.SellerLogin;
import com.sc.domain.login.UserLogin;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 登录服务
 * Created by valora on 2017/4/7.
 */
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    @Autowired
    private JWT jwt;

    /**
     * 获得token
     *
     * @param account  账号
     * @param password 密码
     * @return token
     */
    public Result GetToken(String account, String password) {
        List<Users> result = loginDao.getUserByAccountAndPassword(account, password);
        if (result.size() == 0) {
            return GetResult.toJson(6, null, null, null, 0);
        }
        String userID = result.get(0).getCmUserid();
        return GetResult.toJson(0, null, jwt.createJWT(userID), null, 0);
    }

    /**
     * 用户登录
     *
     * @param account  账号
     * @param password 密码
     * @param code     验证码
     * @return Result
     */
    public Result userLogin(String account, String password, Integer code) {
        UserLogin userLoginInfo = loginDao.getUserLoginInfo(account, password);
        if (userLoginInfo == null) {
            return GetResult.toJson(6, null, null, null, 0);
        }
        if (userLoginInfo.getCmCode() == null) {
            return GetResult.toJson(7, null, null, null, 0);
        }
        if (!userLoginInfo.getCmCode().equals(code)) {
            return GetResult.toJson(8, null, null, null, 0);
        }

        //更新code值
        loginDao.deleteCode(userLoginInfo.getCmPhone());

        return GetResult.toJson(0, null, jwt.createJWT(userLoginInfo.getCmUserid()), userLoginInfo, 0);
    }

    /**
     * 厂家登录
     *
     * @param account  账号
     * @param password 密码
     * @param code     验证码
     * @return Result
     */
    public Result sellerLogin(String account, String password, Integer code) {
        SellerLogin sellerLoginInfo = loginDao.getSellerLoginInfo(account, password);
        if (sellerLoginInfo == null) {
            return GetResult.toJson(6, null, null, null, 0);
        }
        if (sellerLoginInfo.getCmCode() == null) {
            return GetResult.toJson(7, null, null, null, 0);
        }
        if (!sellerLoginInfo.equals(code)) {
            return GetResult.toJson(8, null, null, null, 0);
        }

        loginDao.deleteCode(sellerLoginInfo.getCmPhone());

        return GetResult.toJson(0, null, jwt.createJWT(sellerLoginInfo.getCmSellerid()), sellerLoginInfo, 0);
    }

    /**
     * 后台管理员登录
     *
     * @param account  账号
     * @param password 密码
     * @return
     */
    public Result adminLogin(String account, String password) {
        try {
            AdminLogin adminLoginInfo = loginDao.getAdminLoginInfo(account, password);
            if (adminLoginInfo == null) {
                return GetResult.toJson(6, null, null, null, 0);
            }
            return GetResult.toJson(0, null, jwt.createJWT(adminLoginInfo.getCmAdminid()), adminLoginInfo, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
