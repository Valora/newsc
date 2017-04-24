package com.sc.dao;

import com.sc.domain.generator.RadCode;
import com.sc.domain.generator.RadCodeExample;
import com.sc.mapper.generator.RadCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 随机码存储类(用来验证token)
 * Created by valora on 2017/4/21.
 */
@Component
public class RadCodeDao {
    @Autowired
    private RadCodeMapper radCodeMapper;

    /**
     * 随机码
     * @param userId 商家ID
     * @return 随机码
     */
    public List<RadCode> getRcByUserID(String userId) {
        RadCodeExample rc = new RadCodeExample();
        RadCodeExample.Criteria criteria = rc.createCriteria();
        criteria.andCmUseridEqualTo(userId);
        return radCodeMapper.selectByExample(rc);
    }

    /**
     * 插入随机码
     * @param userId 商家ID
     * @param code 随机码
     */
    public void insert(String userId, int code) {
        RadCode rc = new RadCode();
        rc.setCmUserid(userId);
        rc.setCmCode(code);
        radCodeMapper.insert(rc);
    }

    /**
     * 更新随机码
     * @param userID 商家ID
     * @param code 随机码
     */
    public void updateCode(String userID, int code) {
        RadCodeExample radCodeExample = new RadCodeExample();
        RadCodeExample.Criteria criteria = radCodeExample.createCriteria();
        criteria.andCmUseridEqualTo(userID);
        RadCode rc = new RadCode();
        rc.setCmCode(code);
        radCodeMapper.updateByExampleSelective(rc, radCodeExample);
    }
}
