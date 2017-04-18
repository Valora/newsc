package com.sc.dao;

import com.sc.domain.UserLogin;
import com.sc.domain.generator.User;
import com.sc.domain.generator.UserExample;
import com.sc.mapper.UserLoginMapper;
import com.sc.mapper.generator.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户登录类
 * Created by valora on 2017/4/14.
 */
@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserLoginMapper userLoginMapper;
    /**
     * 获得厂家
     * @param account 账号
     * @param password 密码
     * @return User
     */
    public List<User> getUserByAccountAndPassword(String account, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCmAccountEqualTo(account);
        criteria.andCmPasswordEqualTo(password);
        return userMapper.selectByExample(userExample);
    }

    public UserLogin getUserLoginInfo(String account, String password) {
        //登录信息类
        UserLogin userLoginInfo = new UserLogin();
        
        List<UserLogin> result = userLoginMapper.selectLoginInfo(account, password);
        userLoginInfo.setCmUserid(result.get(0).getCmUserid());
        userLoginInfo.setCmBalance(result.get(0).getCmBalance());
        userLoginInfo.setCmNickname(result.get(0).getCmNickname());
        userLoginInfo.setCmLevel(result.get(0).getCmLevel());
        userLoginInfo.setCmIntegral(result.get(0).getCmIntegral());
        userLoginInfo.setCmCode(result.get(0).getCmCode());
        userLoginInfo.setCmPhone(result.get(0).getCmPhone());
        return userLoginInfo;
    }
}
