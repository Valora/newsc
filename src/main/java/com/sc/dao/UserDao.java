package com.sc.dao;

import com.sc.domain.User;
import com.sc.domain.UserExample;
import com.sc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDao
 * Created by valora on 2017/4/14.
 */
@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    /**
     * 获得User
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

    public ArrayList getUserLoginInfo(String account, String password, Integer code) {
        //
        User user = new User();
        
        ArrayList<User> result = new ArrayList();
        return result;
    }
}
