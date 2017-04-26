package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.Admins;
import com.sc.domain.generator.AdminsExample;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample;
import com.sc.domain.generator.Users;
import com.sc.domain.generator.UsersExample;
import com.sc.domain.manage.AdminsInfo;
import com.sc.domain.manage.SellerDetail;
import com.sc.domain.manage.SellerInfo;
import com.sc.domain.manage.UserDetail;
import com.sc.domain.manage.UserInfo;
import com.sc.mapper.generator.AdminsMapper;
import com.sc.mapper.generator.SellersMapper;
import com.sc.mapper.generator.UsersMapper;
import com.sc.mapper.manage.SellerDetailMapper;
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
    private UsersMapper usersMapper;

    @Autowired
    private SellersMapper sellersMapper;

    @Autowired
    private SellerDetailMapper sellerDetailMapper;

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
    public List<AdminsInfo> queryEmployees(int pagenum, int pagesize) {
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
                result.add(adminsInfo);
            }
        }
        return result;
    }

    /**
     * 分页用
     *
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
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 商家列表
     */
    public List<UserInfo> queryUsers(int pagenum, int pagesize) {
        UsersExample userExample = new UsersExample();
        List<Users> results = usersMapper.selectByExample(userExample);
        PageHelper.startPage(pagenum, pagesize);
        List<UserInfo> result = new ArrayList<>();
        if (!results.isEmpty()) {
            for (int i = 0; i < results.size(); i++) {
                UserInfo userInfo = new UserInfo();
                userInfo.setCmShopname(results.get(i).getCmShopname());
                userInfo.setCmPax(results.get(i).getCmPax());
                userInfo.setCmTelephone(results.get(i).getCmTelephone());
                userInfo.setCmContactphone(results.get(i).getCmContactphone());
                userInfo.setCmContactname(results.get(i).getCmContactname());
                userInfo.setCmName(results.get(i).getCmName());
                userInfo.setCmUserid(results.get(i).getCmUserid());
                userInfo.setCmShopaddress(results.get(i).getCmShopeaddress());
                userInfo.setCmPhone(results.get(i).getCmPhone());
                userInfo.setCmCreatetime(results.get(i).getCmCreatetime());
                result.add(userInfo);
            }
        }
        return result;
    }

    /**
     * 查询商家数量
     *
     * @return 商家数量
     */
    public int getUsersCount() {
        UsersExample userExample = new UsersExample();
        return (int) usersMapper.countByExample(userExample);
    }

    /**
     * 查询厂家
     * @param pagenum 页码
     * @param pagesize 页面大小
     * @return
     */
    public List<SellerInfo> querySellers(int pagenum, int pagesize) {
        SellersExample sellersExample = new SellersExample();
        List<Sellers> results = sellersMapper.selectByExample(sellersExample);
        PageHelper.startPage(pagenum, pagesize);
        List<SellerInfo> result = new ArrayList<>();
        if (!results.isEmpty()) {
            SellerInfo sellerInfo = new SellerInfo();
            for (int i = 0; i < results.size(); i++) {
                sellerInfo.setCmSellername(results.get(i).getCmSellername());
                sellerInfo.setCmPax(results.get(i).getCmPax());
                sellerInfo.setCmTelephone(results.get(i).getCmTelephone());
                sellerInfo.setCmContactname(results.get(i).getCmSellername());
                sellerInfo.setCmContactphone(results.get(i).getCmContactphone());
                sellerInfo.setCmName(results.get(i).getCmName());
                sellerInfo.setCmSellerid(results.get(i).getCmSellerid());
                sellerInfo.setCmAddress(results.get(i).getCmAddress());
                sellerInfo.setCmPhone(results.get(i).getCmPhone());
                sellerInfo.setCmCreatetime(results.get(i).getCmCreatetime());
                sellerInfo.setCmAccount(results.get(i).getCmAccount().substring(3,7));
                result.add(sellerInfo);
            }
        }
        return result;
    }

    /**
     * 查询厂家数量
     *
     * @return 厂家数量
     */
    public int getSellersCount() {
        SellersExample sellersExample = new SellersExample();
        return (int) sellersMapper.countByExample(sellersExample);
    }

    /**
     * 查询商家详细信息
     * @param userid 商家ID
     */
    public List<UserDetail> queryUserInfo(String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCmUseridEqualTo(userid);
        List<Users> results = usersMapper.selectByExample(usersExample);
        List<UserDetail> result = new ArrayList<>();
        if (!results.isEmpty()) {
            for (int i = 0; i < results.size(); i++) {
                UserDetail userDetail = new UserDetail();
                userDetail.setCmUserid(results.get(i).getCmUserid());
                userDetail.setCmCreatetime(results.get(i).getCmCreatetime());
                userDetail.setCmPhone(results.get(i).getCmPhone());
                userDetail.setCmShopaddress(results.get(i).getCmShopeaddress());
                userDetail.setCmName(results.get(i).getCmName());
                userDetail.setCmContactname(results.get(i).getCmContactname());
                userDetail.setCmContactphone(results.get(i).getCmContactphone());
                userDetail.setCmTelephone(results.get(i).getCmTelephone());
                userDetail.setCmPax(results.get(i).getCmPax());
                userDetail.setCmShopname(results.get(i).getCmShopname());
                userDetail.setCmStorepath(results.get(i).getCmStorepath());
                userDetail.setCmCardno(results.get(i).getCmCardno());
                userDetail.setCmCardpath(results.get(i).getCmCardno());
                userDetail.setCmCardpath(results.get(i).getCmCardpath());
                userDetail.setCmIsexamine(results.get(i).getCmIsexamine());
                userDetail.setCmLevel(results.get(i).getCmLevel());
                userDetail.setCmLicensepath(results.get(i).getCmLicensepath());
                userDetail.setCmShoplat(results.get(i).getCmShoplat());
                userDetail.setCmShoplon(results.get(i).getCmShoplon());
                result.add(userDetail);
            }
        }
        return result;
    }

    /**
     * 查询厂家详情
     * @param sellerid 厂家ID
     * @return 厂家详情
     */
    //todo
    public List<SellerDetail> querySellerInfo(String sellerid) {
        List<SellerDetail> results = sellerDetailMapper.getSellerDetail(sellerid);
        return results;
    }
}
