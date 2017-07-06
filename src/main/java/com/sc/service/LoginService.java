package com.sc.service;

import com.sc.dao.LoginDao;
import com.sc.domain.generator.Register;
import com.sc.domain.generator.Users;
import com.sc.domain.login.AdminLogin;
import com.sc.domain.login.SellerLogin;
import com.sc.domain.login.UserLogin;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.SendCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 登录服务
 * Created by valora on 2017/4/7.
 */
@Service
public class LoginService {
    private final LoginDao loginDao;

    private final JWT jwt;

    @Autowired
    public LoginService(LoginDao loginDao, JWT jwt) {
        this.loginDao = loginDao;
        this.jwt = jwt;
    }

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
        String userID = result.get(0).getCM_USERID();
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
        if (userLoginInfo.getCM_CODE() == null) {
            return GetResult.toJson(7, null, null, null, 0);
        }
        if (!userLoginInfo.getCM_CODE().equals(code)) {
            return GetResult.toJson(8, null, null, null, 0);
        }
        //更新code值
        loginDao.deleteCode(userLoginInfo.getCM_PHONE());

        return GetResult.toJson(0, null, jwt.createJWT(userLoginInfo.getCM_USERID()), userLoginInfo, 0);
    }

    /**
     * 商家（用户）只用账号密码登录
     *
     * @param account  账号
     * @param password 密码
     * @return
     */
    public Result userLoginByAccountAndPasswordS(String account, String password) {
        UserLogin userLoginInfo = loginDao.getUserLoginInfo(account, password);
        if (userLoginInfo == null) {
            return GetResult.toJson(6, null, null, null, 0);
        }
        return GetResult.toJson(0, null, jwt.createJWT(userLoginInfo.getCM_USERID()), userLoginInfo, 0);
    }

    /**
     * 商家（用户）只用手机号和验证码登入
     *
     * @param phone
     * @param code
     * @return
     */
    public Result userLoginByPhoneAndCodeS(String phone, String code) {
        Register register = loginDao.selectByPhoneAndCodeD(phone, code);
        if (register == null) {
            return GetResult.toJson(6, null, null, null, 0);
        }
        Users users = loginDao.getUserLoginInfoByPhone(phone);
        return GetResult.toJson(0, null, jwt.createJWT(users.getCM_USERID()), users, 0);
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
        if (sellerLoginInfo.getCM_CODE() == null) {
            return GetResult.toJson(7, null, null, null, 0);
        }
        if (!sellerLoginInfo.getCM_CODE().equals(code)) {
            return GetResult.toJson(8, null, null, null, 0);
        }

        loginDao.deleteCode(sellerLoginInfo.getCM_PHONE());

        return GetResult.toJson(0, null, jwt.createJWT(sellerLoginInfo.getCM_SELLERID()), sellerLoginInfo, 0);
    }

    /**
     * 后台管理员登录
     *
     * @param account  账号
     * @param password 密码
     * @return 登录结果
     */
    public Result adminLogin(String account, String password) {
        try {
            AdminLogin adminLoginInfo = loginDao.getAdminLoginInfo(account, password);
            if (adminLoginInfo == null) {
                return GetResult.toJson(6, null, null, null, 0);
            }
            return GetResult.toJson(0, null, jwt.createJWT(adminLoginInfo.getCM_ADMINID()), adminLoginInfo, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 发送验证码
     *
     * @param phone 手机号码
     * @param type  类型
     */
    public Result send(String phone, int type) {
        try {
            Register reg = loginDao.getRegisterInfo(phone);
            String code = GetRandomNumber.genRandomNum(4);
            Date time = new Date();
            if (SendCode.sendCode(phone, Integer.valueOf(code), type)) {
                if (reg == null) {
                    loginDao.insertReg(phone, code, time);
                } else {
                    loginDao.updateReg(phone, code, time);
                }
                return GetResult.toJson(0, null, null, null, 0);
            } else {
                return GetResult.toJson(2, null, null, null, 0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }


}
