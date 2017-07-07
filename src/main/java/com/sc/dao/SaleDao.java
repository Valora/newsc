package com.sc.dao;

import com.sc.domain.generator.Admins;
import com.sc.domain.generator.AdminsExample;
import com.sc.domain.generator.Register;
import com.sc.domain.generator.RegisterExample;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample;
import com.sc.domain.generator.Users;
import com.sc.domain.generator.UsersExample;
import com.sc.mapper.generator.AdminsMapper;
import com.sc.mapper.generator.RegisterMapper;
import com.sc.mapper.generator.SellersMapper;
import com.sc.mapper.generator.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * SaleDao
 * Created by valora on 2017/5/12.
 */
@Component
public class SaleDao {
    private final RegisterMapper registerMapper;

    private final UsersMapper usersMapper;
    private final SellersMapper sellersMapper;
    private final AdminsMapper adminsMapper;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SaleDao(RegisterMapper registerMapper, UsersMapper usersMapper, SellersMapper sellersMapper, AdminsMapper adminsMapper, JdbcTemplate jdbcTemplate) {
        this.registerMapper = registerMapper;
        this.usersMapper = usersMapper;
        this.sellersMapper = sellersMapper;
        this.adminsMapper = adminsMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 根据电话号码查询注册人员
     *
     * @param phone 查询条件
     * @return 查询结果集
     */
    public List<Register> selectregisterbyphone(Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        return registerMapper.selectByExample(registerExample);
    }

    /**
     * 新用户时，对表进行insert操作
     *
     * @param register register对象
     */
    public void addregister(Register register) {
        registerMapper.insert(register);
    }

    /**
     * 不是新用户时，对表进行更新操作
     *
     * @param register register对象
     * @param phone    手机号码
     */
    public void updateregister(Register register, Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        registerMapper.updateByExample(register, registerExample);
    }

    /**
     * 根据经纬度获取商家列表
     *
     * @param lon1 最小经度
     * @param lon2 最大经度
     * @param lat1 最小纬度
     * @param lat2 最大纬度
     * @return 商家列表
     */
    public List<Users> selectuserByMap(double lon1, double lon2, double lat1, double lat2) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_SHOPLONGreaterThan(lon1);
        criteria.andCM_SHOPLONLessThan(lon2);
        criteria.andCM_SHOPLATGreaterThan(lat1);
        criteria.andCM_SHOPLATLessThan(lat2);
        List<Users> list = usersMapper.selectByExample(usersExample);
        return list;
    }

    /**
     * 根据经纬度获取厂家列表
     *
     * @param lon1 最小经度
     * @param lon2 最大经度
     * @param lat1 最小纬度
     * @param lat2 最大纬度
     * @return 厂家列表
     */
    public List<Sellers> selectSellersByMap(double lon1, double lon2, double lat1, double lat2) {
        SellersExample sellersExample = new SellersExample();
        SellersExample.Criteria criteria = sellersExample.createCriteria();
        criteria.andCM_LONGreaterThan(lon1);
        criteria.andCM_LONLessThan(lon2);
        criteria.andCM_LONGreaterThan(lat1);
        criteria.andCM_LATLessThan(lat2);
        List<Sellers> list = sellersMapper.selectByExample(sellersExample);
        return list;
    }

    /**
     * 根据手机号码查询admin
     *
     * @param phone 手机号码
     * @return admin对象
     */
    public Admins selectadminbyphone(Long phone) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        List<Admins> list = adminsMapper.selectByExample(adminsExample);
        Admins admins = new Admins();
        if(list!=null&&list.size()>0){
            admins=list.get(0);
        }
        return admins;

    }

    /**
     * 更新业务人员的密码
     *
     * @param admins 业务人员对象
     */
    public void updateAdminPassword(Admins admins) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_ADMINIDEqualTo(admins.getCM_ADMINID());
        adminsMapper.updateByExample(admins, adminsExample);
    }

    /**
     * 查询手机号为phone，Lelve不为1的业务人员
     *
     * @param phone 手机号
     * @param i     Lelve
     * @return 业务人员
     */
    public Admins selectadminbyphone_and_Level(Long phone, int i) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        List<Integer> list = new ArrayList<Integer>();
        list.add(i);
        criteria.andCM_LEVELNotIn(list);
        List<Admins> list2 = adminsMapper.selectByExample(adminsExample);
        if (list2 != null && list2.size() > 0) {
            return list2.get(0);
        }
        return null;
    }

    /**
     * 获得管理员信息
     *
     * @param userId 管理员ID
     * @return
     */
    public Admins getAdminByAdminId(String userId) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_ADMINIDEqualTo(userId);
        Admins admins = adminsMapper.selectByExample(adminsExample).get(0);
        if (admins == null) {
            return null;
        } else {
            return admins;
        }
    }

    /**
     * 检查当前手机号有没有注册(商家)
     *
     * @param phone
     * @return
     */
    public int getUserCount(Long phone) {
        UsersExample example = new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        return (int) usersMapper.countByExample(example);
    }

    /**
     * 账号值
     *
     * @return
     */
    public Long getUserMaxAccount() {
        String sql = "SELECT MAX(cast(CM_ACCOUNT AS UNSIGNED INTEGER))FROM TB_USERS";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    /**
     * 商家申请
     *
     * @param users
     */
    public void userApplication(Users users) {
        usersMapper.insert(users);
    }

    /**
     * 检查当前手机号有没有注册(厂家)
     *
     * @param phone
     * @return
     */
    public int getSellerCount(Long phone) {
        SellersExample example = new SellersExample();
        SellersExample.Criteria criteria = example.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        return (int) sellersMapper.countByExample(example);
    }

    /**
     * 厂家账号值
     *
     * @return
     */
    public Long getSellerMaxAccount() {
        String sql = "SELECT MAX(cast(CM_ACCOUNT AS UNSIGNED INTEGER))FROM TB_SELLERS";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    /**
     * 厂家申请
     *
     * @param sellers
     */
    public void sellerApplication(Sellers sellers) {
        sellersMapper.insert(sellers);
    }
}
