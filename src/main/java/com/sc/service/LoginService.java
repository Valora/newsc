package com.sc.service;

import com.sc.domain.User;
import com.sc.domain.UserExample;
import com.sc.mapper.UserMapper;
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
    private UserMapper userMapper;
    
    public Result GetToken(String account, String password) {
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andCmAccountEqualTo(account);
            criteria.andCmPasswordEqualTo(password);
            List<User> result = userMapper.selectByExample(userExample);
            if (result.size() == 0) {
                return GetResult.toJson(6, null, null, null, 0);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return GetResult.toJson(0, null, JWT.createJWT(account), null, 0);
    }
}
