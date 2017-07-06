package com.sc.dao;

import com.sc.domain.generator.RadCode;
import com.sc.domain.generator.RadCodeExample;
import com.sc.mapper.generator.RadCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 随机码生成(token用)
 * Created by valora on 2017/4/27.
 */
@Component
public class RadCodeDao {
    private final RadCodeMapper radCodeMapper;

    @Autowired
    public RadCodeDao(RadCodeMapper radCodeMapper) {
        this.radCodeMapper = radCodeMapper;
    }

    /**
     * 随机码
     *
     * @param userId 商家ID
     * @return 随机码
     */
    public List<RadCode> getRcByUserID(String userId) {
        RadCodeExample rc = new RadCodeExample();
        RadCodeExample.Criteria criteria = rc.createCriteria();
        criteria.andCM_USERIDEqualTo(userId);
        return radCodeMapper.selectByExample(rc);
    }

    /**
     * 插入随机码
     *
     * @param userId 商家ID
     * @param code   随机码
     */
    public void insert(String userId, int code) {
        RadCode rc = new RadCode();
        rc.setCM_USERID(userId);
        rc.setCM_CODE(code);
        radCodeMapper.insert(rc);
    }

    /**
     * 更新随机码
     *
     * @param userID 商家ID
     * @param code   随机码
     */
    public void updateCode(String userID, int code) {
        RadCodeExample radCodeExample = new RadCodeExample();
        RadCodeExample.Criteria criteria = radCodeExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userID);
        RadCode rc = new RadCode();
        rc.setCM_CODE(code);
        radCodeMapper.updateByExampleSelective(rc, radCodeExample);
    }
}
