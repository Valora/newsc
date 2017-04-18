package com.sc;

import com.sc.domain.generator.User;
import com.sc.domain.generator.UserExample;
import com.sc.domain.UserLogin;
import com.sc.mapper.UserLoginMapper;
import com.sc.mapper.generator.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * user mapper test
 * Created by valora on 2017/4/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper UserMapper;
    @Autowired
    private UserLoginMapper userLoginMapper;
    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setCmUserid("20161210184432500");
        user.setCmAccount("sun");
        user.setCmPassword("sunyaofeng");
        Assert.assertEquals(1, UserMapper.insert(user));
    }
    
    @Test
    public void testSelect() throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCmPasswordEqualTo("sunyaofeng");
        Assert.assertNotNull(UserMapper.selectByExample(userExample));
    }
    
    @Test
    public void testUpdate() throws Exception{
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCmPasswordEqualTo("sunyaofeng");
        User user = new User();
        Long phone = new Long("18658343330");
        user.setCmPhone(phone);
        Assert.assertEquals(1, UserMapper.updateByExampleSelective(user, userExample));
    }
    
    @Test
    public void testDelete() throws Exception{
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCmPasswordEqualTo("sunyaofeng");
        Assert.assertEquals(1, UserMapper.deleteByExample(userExample));
    }
    
    @Test
    public void testSelectLoginInfo() throws Exception {
        List<UserLogin> result = userLoginMapper.selectLoginInfo("111111", "222222");
        Assert.assertNotNull(result);
    }
}
