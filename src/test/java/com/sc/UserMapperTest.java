package com.sc;

import com.sc.dao.UserDoMainDao;
import com.sc.domain.login.AdminLogin;
import com.sc.domain.userdomain.MyOrders;
import com.sc.mapper.login.LoginMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valora on 2017/5/22.
 */
@RunWith(JUnit4.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserDoMainDao userDoMainDao;

    @Autowired
    private LoginMapper loginMapper;
    
    @Test
    public void testUserMapper(){
        String userId = "20170329111549790";
        List<MyOrders> myOrders = new ArrayList<>();
        try {
            myOrders = userDoMainDao.getMyOrdersAll(1, 10, userId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Assert.assertNotNull(myOrders);
    }
    
//    @Test
//    public void testLogin() {
//        String accont = "121212";
//        String password = "121212";
//        AdminLogin adminLogin = loginMapper.getAdminLoginInfo(accont, password);
//        Assert.assertNotNull(adminLogin);
//    }
}
