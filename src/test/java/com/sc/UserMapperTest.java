package com.sc;

import com.sc.domain.User;
import com.sc.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * user mapper test
 * Created by valora on 2017/4/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper UserMapper;
    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setCmAccount("sun");
        user.setCmPassword("sunyaofeng");
        Assert.assertEquals(3, UserMapper.insert(user));
    }
}
