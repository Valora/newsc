package com.sc.dao;

import com.sc.domain.generator.RadCode;
import com.sc.domain.generator.RadCodeExample;
import com.sc.mapper.generator.RadCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户随机码操作类。随机码用来生成token
 * Created by valora on 2017/4/14.
 */
@Component
public class RadCodeDao {
    @Autowired
    private RadCodeMapper radCodeMapper;
    
    public List<RadCode> getRcByUserID(String userId) {
        RadCodeExample rc = new RadCodeExample();
        RadCodeExample.Criteria criteria = rc.createCriteria();
        criteria.andCmUseridEqualTo(userId);
        return radCodeMapper.selectByExample(rc);
    }

    public void insert(String userId, int code) {
        RadCode rc = new RadCode();
        rc.setCmUserid(userId);
        rc.setCmCode(code);
        radCodeMapper.insert(rc);
    }

    public void updateCode(String userID, int code) {
        RadCodeExample radCodeExample = new RadCodeExample();
        RadCodeExample.Criteria criteria = radCodeExample.createCriteria();
        criteria.andCmUseridEqualTo(userID);
        RadCode rc = new RadCode();
        rc.setCmCode(code);
        radCodeMapper.updateByExampleSelective(rc, radCodeExample);
    }
}
