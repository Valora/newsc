package com.sc.dao;

import com.sc.domain.User;
import com.sc.domain.UserExample;
import com.sc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * UserDao
 * Created by valora on 2017/4/14.
 */
@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUserByAccountAndPassword(String account, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCmAccountEqualTo(account);
        criteria.andCmPasswordEqualTo(password);
        return userMapper.selectByExample(userExample);
    }
}
