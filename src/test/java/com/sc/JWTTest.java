package com.sc;

import com.sc.utils.JWT;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JWTTest
 * Created by valora on 2017/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JWTTest {
    @Autowired
    private JWT jwt;
    
    @Test
    public void testCheckToke() {
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJjb2RlIjoxMjkyMywidXNlcklkIjoiMjAxNjEyMTAxODE2MTI1NDEifQ.nPz4HZhEM7c7imZEDi00JTW_tCmM5i45siseWy0J7Y_kCVccxeNt-S5irb3QRm8rBLWSq0R5kKWMuzyl89V5qQ";
        Assert.assertNotNull(jwt.checkJWT(token));
    }
}
