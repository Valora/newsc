package com.sc;

import com.sc.domain.User;
import com.sc.domain.UserExample;
import com.sc.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * user mapper test
 * Created by valora on 2017/4/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper UserMapper;
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
}
