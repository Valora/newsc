package com.sc;

import com.sc.dao.ManageDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ManageDaoTest
 * Created by valora on 2017/4/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ManageDaoTest {
    @Autowired
    private ManageDao manageDao;
    
    @Test
    public void testGetAct() {
        Long result = manageDao.getAct();
        System.out.println(result);
        Assert.assertNotNull(result);
    }
}
