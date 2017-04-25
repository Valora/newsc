package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.Admins;
import com.sc.domain.generator.AdminsExample;
import com.sc.domain.generator.User;
import com.sc.domain.generator.UserExample;
import com.sc.domain.manage.AdminsInfo;
import com.sc.domain.manage.UserInfo;
import com.sc.mapper.generator.AdminsMapper;
import com.sc.mapper.generator.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
    private UserMapper userMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获得管理员信息
     *
     * @param adminId 管理员ID
     * @return 信息列表
     */
    public List<Admins> selectAdminsByAdminId(String adminId) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCmAdminidEqualTo(adminId);
        List<Admins> result = adminsMapper.selectByExample(adminsExample);
        return result;
    }

    /**
     * 获得账号
     *
     * @return 账号
     * @throws DataAccessException
     */
    public Long getAct() throws DataAccessException {
        String sql = "SELECT MAX(cast(CM_ACCOUNT AS UNSIGNED INTEGER))FROM TB_ADMINS";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    /**
     * 添加客服／销售
     *
     * @param admins 客服／销售
     * @return
     */
    public int insertAdmin(Admins admins) {
        return adminsMapper.insert(admins);
    }

    /**
     * 删除客服／销售
     *
     * @param id ID
     * @return
     */
    public int delEmployee(int id) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCmAdminidEqualTo(Integer.toString(id));
        return adminsMapper.deleteByExample(adminsExample);
    }

    /**
     * 查询客服／销售
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 客服列表
     */
    public List<AdminsInfo> queryEmplyees(int pagenum, int pagesize) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCmLevelNotEqualTo(1);
        PageHelper.startPage(pagenum, pagesize);
        List<Admins> results = adminsMapper.selectByExample(adminsExample);
        List<AdminsInfo> result = new ArrayList<>();
        if (!results.isEmpty()) {
            for (int i = 0; i < results.size(); i++) {
                AdminsInfo adminsInfo = new AdminsInfo();
                adminsInfo.setCmLevel(results.get(i).getCmLevel());
                adminsInfo.setCmAdminid(results.get(i).getCmAdminid());
                adminsInfo.setCmName(results.get(i).getCmName());
                adminsInfo.setCmPhone(results.get(i).getCmPhone());
            }
        }
        return result;
    }

    /**
     * 分页用
     * @return 销售数量
     */
    public Long getAdminCount() {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCmLevelNotEqualTo(1);
        return adminsMapper.countByExample(adminsExample);
    }

    /**
     * 查询商家列表
     * @param pagenum 页码
     * @param pagesize 页面大小
     * @return 商家列表
     */
    public List<UserInfo> queryUsers(int pagenum, int pagesize) {
        UserExample userExample = new UserExample();
        List<User> results = userMapper.selectByExample(userExample);
        PageHelper.startPage(pagenum, pagesize);
        //todo
        return null;
    }

    /**
     * 查询商家数量
     * @return 商家数量
     */ 
    public int getUsersCount() {
        UserExample userExample = new UserExample();
        return userMapper.deleteByExample(userExample);
    }
}
