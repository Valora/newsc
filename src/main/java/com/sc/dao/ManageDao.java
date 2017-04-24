package com.sc.dao;

import com.sc.domain.generator.Admins;
import com.sc.domain.generator.AdminsExample;
import com.sc.mapper.generator.AdminsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 管理类
 * Created by valora on 2017/4/21.
 */
@Component
public class ManageDao {
    @Autowired
    private AdminsMapper adminsMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获得管理员信息
     * @param adminId 管理员ID
     * @return 信息列表
     */
    public List selectAdminsByAdminid(String adminId) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCmAdminidEqualTo(adminId);
        List<Admins> result = adminsMapper.selectByExample(adminsExample);
        return result;
    }
    
    public Long getAct() throws DataAccessException{
        String sql = "select MAX(cast(CM_ACCOUNT as UNSIGNED INTEGER))from TB_ADMINS";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }
}
