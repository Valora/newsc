package com.sc.dao;

import com.sc.domain.generator.RegisterExample;
import com.sc.mapper.generator.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 用户验证码信息操作类
 * Created by valora on 2017/4/18.
 */
@Component
public class RegisterDao {
    @Autowired
    private RegisterMapper registerMapper;

    public void deleteCode(Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCmPhoneEqualTo(phone);
        registerMapper.deleteByExample(registerExample);
    }
}
