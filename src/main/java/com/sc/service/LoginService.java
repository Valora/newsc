package com.sc.service;

import com.sc.dao.UserDao;
import com.sc.domain.User;
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
    private UserDao userDao;

    @Autowired
    private JWT jwt;

    /**
     * 获得token
     * @param account 账号
     * @param password 密码
     * @return token
     */
    public Result GetToken(String account, String password) {
        List<User> result = userDao.getUserByAccountAndPassword(account, password);
        if (result.size() == 0) {
            return GetResult.toJson(6, null, null, null, 0);
        }
        String userID = result.get(0).getCmUserid();
        return GetResult.toJson(0, null, jwt.createJWT(userID), null, 0);
    }

    /**
     * 用户登录
     * @param account 账号
     * @param password 密码
     * @param code 验证码
     * @return Result
     */
    public Result userLogin(String account, String password, Integer code) {
        
        
        return null;
    }
}
