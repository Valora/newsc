package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.*;
import com.sc.domain.manage.AdminsInfo;
import com.sc.domain.manage.SellerDetail;
import com.sc.domain.manage.SellerInfo;
import com.sc.domain.manage.UserDetail;
import com.sc.domain.manage.UserInfo;
import com.sc.mapper.generator.AdminsMapper;
import com.sc.mapper.generator.BrandsMapper;
import com.sc.mapper.generator.ClassifysMapper;
import com.sc.mapper.generator.NoticesMapper;
import com.sc.mapper.generator.SellersMapper;
import com.sc.mapper.generator.UsersMapper;
import com.sc.mapper.manage.ManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 管理类
 * Created by valora on 2017/4/21.
 */
@Component
public class ManageDao {
    private final AdminsMapper adminsMapper;

    private final UsersMapper usersMapper;

    private final SellersMapper sellersMapper;

    private final ManageMapper manageMapper;

    private final ClassifysMapper classifysMapper;

    private final BrandsMapper brandsMapper;

    private final NoticesMapper noticesMapper;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ManageDao(AdminsMapper adminsMapper, UsersMapper usersMapper, SellersMapper sellersMapper, ManageMapper manageMapper, ClassifysMapper classifysMapper, BrandsMapper brandsMapper, NoticesMapper noticesMapper, JdbcTemplate jdbcTemplate) {
        this.adminsMapper = adminsMapper;
        this.usersMapper = usersMapper;
        this.sellersMapper = sellersMapper;
        this.manageMapper = manageMapper;
        this.classifysMapper = classifysMapper;
        this.brandsMapper = brandsMapper;
        this.noticesMapper = noticesMapper;
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 获得管理员信息
     *
     * @param adminId 管理员ID
     * @return 管理员信息列表
     */
    public List<Admins> selectAdminsByAdminId(String adminId) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_ADMINIDEqualTo(adminId);
        return adminsMapper.selectByExample(adminsExample);
    }

    /**
     * 获得用户信息
     *
     * @param userid 用户ID
     * @return 用户信息列表
     */
    public List<Users> selectUsersByUserId(String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userid);
        return usersMapper.selectByExample(usersExample);
    }

    /**
     * 获得账号
     *
     * @return 账号
     * @throws DataAccessException 数据获取错误
     */
    public Long getAct() throws DataAccessException {
        String sql = "SELECT MAX(cast(CM_ACCOUNT AS UNSIGNED INTEGER))FROM TB_ADMINS";
        return jdbcTemplate.queryForObject(sql, Long.class);
    }

    /**
     * 添加客服／销售
     *
     * @param admins 客服／销售
     */
    public void insertAdmin(Admins admins) {
        adminsMapper.insert(admins);
    }

    /**
     * 删除客服／销售
     *
     * @param id ID
     * @return 结果
     */
    public int delEmployee(int id) {
        AdminsExample adminsExample = new AdminsExample();
        AdminsExample.Criteria criteria = adminsExample.createCriteria();
        criteria.andCM_ADMINIDEqualTo(Integer.toString(id));
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
        criteria.andCM_LEVELNotEqualTo(1);
        PageHelper.startPage(pagenum, pagesize);
        List<Admins> results = adminsMapper.selectByExample(adminsExample);
        List<AdminsInfo> result = new ArrayList<>();
        if (!results.isEmpty()) {
            for (Admins result1 : results) {
                AdminsInfo adminsInfo = new AdminsInfo();
                adminsInfo.setCM_LEVEL(result1.getCM_LEVEL());
                adminsInfo.setCM_ADMINID(result1.getCM_ADMINID());
                adminsInfo.setCM_NAME(result1.getCM_NAME());
                adminsInfo.setCM_PHONE(result1.getCM_PHONE());
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
        criteria.andCM_LEVELNotEqualTo(1);
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
            for (Users result1 : results) {
                UserInfo userInfo = new UserInfo();
                userInfo.setCM_SHOPNAME(result1.getCM_SHOPNAME());
                userInfo.setCM_PAX(result1.getCM_PAX());
                userInfo.setCM_TELEPHONE(result1.getCM_TELEPHONE());
                userInfo.setCM_CONTACTPHONE(result1.getCM_CONTACTPHONE());
                userInfo.setCM_CONTACTNAME(result1.getCM_CONTACTNAME());
                userInfo.setCM_NAME(result1.getCM_NAME());
                userInfo.setCM_USERID(result1.getCM_USERID());
                userInfo.setCM_SHOPADDRESS(result1.getCM_SHOPEADDRESS());
                userInfo.setCM_PHONE(result1.getCM_PHONE());
                userInfo.setCM_CREATETIME(result1.getCM_CREATETIME());
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
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 厂家信息
     */
    public List<SellerInfo> querySellers(int pagenum, int pagesize) {
        SellersExample sellersExample = new SellersExample();
        List<Sellers> results = sellersMapper.selectByExample(sellersExample);
        PageHelper.startPage(pagenum, pagesize);
        List<SellerInfo> result = new ArrayList<>();
        if (!results.isEmpty()) {
            SellerInfo sellerInfo = new SellerInfo();
            for (Sellers result1 : results) {
                sellerInfo.setCM_SELLERNAME(result1.getCM_SELLERNAME());
                sellerInfo.setCM_PAX(result1.getCM_PAX());
                sellerInfo.setCM_TELEPHONE(result1.getCM_TELEPHONE());
                sellerInfo.setCM_CONTACTNAME(result1.getCM_SELLERNAME());
                sellerInfo.setCM_CONTACTPHONE(result1.getCM_CONTACTPHONE());
                sellerInfo.setCM_NAME(result1.getCM_NAME());
                sellerInfo.setCM_SELLERID(result1.getCM_SELLERID());
                sellerInfo.setCM_ADDRESS(result1.getCM_ADDRESS());
                sellerInfo.setCM_PHONE(result1.getCM_PHONE());
                sellerInfo.setCM_CREATETIME(result1.getCM_CREATETIME());
                sellerInfo.setCM_ACCOUNT(result1.getCM_ACCOUNT().substring(3, 7));
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
     *
     * @param userid 商家ID
     */
    public List<UserDetail> queryUserInfo(String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userid);
        List<Users> results = usersMapper.selectByExample(usersExample);
        List<UserDetail> result = new ArrayList<>();
        if (!results.isEmpty()) {
            for (Users result1 : results) {
                UserDetail userDetail = new UserDetail();
                userDetail.setCM_USERID(result1.getCM_USERID());
                userDetail.setCM_CREATETIME(result1.getCM_CREATETIME());
                userDetail.setCM_PHONE(result1.getCM_PHONE());
                userDetail.setCM_SHOPADDRESS(result1.getCM_SHOPEADDRESS());
                userDetail.setCM_NAME(result1.getCM_NAME());
                userDetail.setCM_CONTACTNAME(result1.getCM_CONTACTNAME());
                userDetail.setCM_CONTACTPHONE(result1.getCM_CONTACTPHONE());
                userDetail.setCM_TELEPHONE(result1.getCM_TELEPHONE());
                userDetail.setCM_PAX(result1.getCM_PAX());
                userDetail.setCM_SHOPNAME(result1.getCM_SHOPNAME());
                userDetail.setCM_STOREPATH(result1.getCM_STOREPATH());
                userDetail.setCM_CARDNO(result1.getCM_CARDNO());
                userDetail.setCM_CARDPATH(result1.getCM_CARDPATH());
                userDetail.setCM_ISEXAMINE(result1.getCM_ISEXAMINE());
                userDetail.setCM_LEVEL(result1.getCM_LEVEL());
                userDetail.setCMLICENSEPATH(result1.getCM_LICENSEPATH());
                userDetail.setCM_SHOPLAT(result1.getCM_SHOPLAT());
                userDetail.setCM_SHOPLON(result1.getCM_SHOPLON());
                result.add(userDetail);
            }
        }
        return result;
    }

    /**
     * 查询厂家详情
     *
     * @param sellerid 厂家ID
     * @return 厂家详情
     */
    public SellerDetail querySellerInfo(String sellerid) {
        List<SellerDetail> results = manageMapper.getSellerDetail(sellerid);
        if (!results.isEmpty()) {
            return results.get(0);
        } else {
            return null;
        }
    }

    /**
     * 根据信息查询客服/销售(名称，账号)
     *
     * @param Content  信息
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 客服信息
     */
    public AdminsInfo queryEmployeeByUserInfo(String Content, Integer pagenum, Integer pagesize) {
        //todo
        //该接口暂时不用
        return null;
    }

    /**
     * 根据信息模糊查询商家(用户姓名，账号，店铺名称，店铺地址)
     *
     * @param Content  信息
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 商家详情
     */
    public UserDetail queryUserByUserInfo(String Content, Integer pagenum, Integer pagesize) {
        //todo
        //该接口暂时不用
        return null;
    }

    /**
     * 根据信息模糊查询厂家(用户姓名，账号，店铺名称，店铺地址)
     *
     * @param Content  信息
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 厂家详情
     */
    public SellerDetail querySellersBySellerInfo(String Content, Integer pagenum, Integer pagesize) {
        //todo
        //该接口暂时不用
        return null;
    }

    /**
     * 添加商品分类和子分类
     *
     * @param classifyname 分类名称
     * @param type         分类类型（0：大类，1：子类）
     * @param parentid     上级分类（如果是大类，则输入0）
     * @param imagepath    图片路径
     */
    public void addClassify(String classifyname, String type, String parentid, String imagepath) {
        Classifys classifys = new Classifys();
        classifys.setCM_CLASSIFYNAME(classifyname);
        classifys.setCM_PARENTID(Objects.equals(type, "0") ? 0 : Integer.parseInt(parentid));
        classifys.setCM_IMGPATH(imagepath);
        classifysMapper.insert(classifys);
    }

    /**
     * 根据ID查询分类
     *
     * @param classifyid 分类Id
     * @return 分类列表
     */
    public List<Classifys> selectClassifysByClassifyid(Integer classifyid) {
        ClassifysExample classifysExample = new ClassifysExample();
        ClassifysExample.Criteria criteria = classifysExample.createCriteria();
        criteria.andCM_CLASSIFYIDEqualTo(classifyid);
        return classifysMapper.selectByExample(classifysExample);
    }

    /**
     * 修改商品分类和子分类
     *
     * @param classifyname 分类名称
     * @param type         分类类型（0：大类，1：子类）
     * @param parentid     上级分类（如果是大类，则输入0）
     * @param imgpath      图片路径
     */
    public void reviceClassify(String classifyname, String type, String parentid, String imgpath) {
        Classifys classifys = new Classifys();
        classifys.setCM_IMGPATH(imgpath);
        classifys.setCM_CLASSIFYNAME(classifyname);
        classifys.setCM_PARENTID(Objects.equals(type, "0") ? 0 : Integer.parseInt(parentid));
        classifysMapper.updateByExample(classifys, new ClassifysExample());
    }

    /**
     * 查询分类/二级分类列表（删除或排序时使用）
     *
     * @param pagenum  页码
     * @param pagesize 页码大小
     * @return 分类/二级分类列表
     */
    public List<Classifys> queryClassifies(Integer pagenum, Integer pagesize, Integer parentid) {
        ClassifysExample classifysExample = new ClassifysExample();
        ClassifysExample.Criteria criteria = classifysExample.createCriteria();
        criteria.andCM_PARENTIDEqualTo(parentid);
        PageHelper.startPage(pagenum, pagesize);
        return classifysMapper.selectByExample(classifysExample);
    }

    /**
     * 分类数量
     *
     * @return 数量
     */
    public Long getClassifyCount(Integer type) {
        ClassifysExample classifysExample = new ClassifysExample();
        ClassifysExample.Criteria criteria = classifysExample.createCriteria();
        if (type == 1) {
            criteria.andCM_PARENTIDEqualTo(0);
        }
        if (type == 2) {
            criteria.andCM_PARENTIDNotEqualTo(0);
        }
        return classifysMapper.countByExample(classifysExample);
    }

    /**
     * 分类排序
     *
     * @param sort       序号
     * @param classifyid 分类ID
     * @return 标志位
     */
    public Integer classifySort(Integer sort, Integer classifyid) {
        Classifys classifys = new Classifys();
        classifys.setCM_SORT(sort);
        ClassifysExample classifysExample = new ClassifysExample();
        ClassifysExample.Criteria criteria = classifysExample.createCriteria();
        criteria.andCM_CLASSIFYIDEqualTo(classifyid);
        return classifysMapper.updateByExampleSelective(classifys, classifysExample);
    }

    /**
     * 删除商品分类和子分类
     *
     * @param classifyid 分类ID
     * @return 标志位
     */
    public int delClassify(Integer classifyid) {
        ClassifysExample classifysExample = new ClassifysExample();
        ClassifysExample.Criteria criteria = classifysExample.createCriteria();
        criteria.andCM_CLASSIFYIDEqualTo(classifyid);
        return classifysMapper.deleteByExample(classifysExample);
    }

    /**
     * 查询品牌数量
     *
     * @return 数量
     */
    public Long getBrandCount() {
        ClassifysExample classifysExample = new ClassifysExample();
        return classifysMapper.countByExample(classifysExample);
    }

    /**
     * 查询品牌
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 结果
     */
    public List<Brands> queryBrands(Integer pagenum, Integer pagesize) {
        BrandsExample brandsExample = new BrandsExample();
        brandsExample.setOrderByClause("CM_BRAND DESC");
        PageHelper.startPage(pagenum, pagesize);
        return brandsMapper.selectByExample(brandsExample);
    }

    /**
     * 添加品牌
     *
     * @param brand     品牌
     * @param introduce 品牌介绍
     */
    public void addBrands(String brand, String introduce) {
        Brands brands = new Brands();
        brands.setCM_BRAND(brand);
        brands.setCM_OTHER(introduce);
        brandsMapper.insert(brands);
    }

    /**
     * 删除品牌
     *
     * @param brandid 品牌ID
     * @return 标志位
     */
    public int delBrands(Integer brandid) {
        BrandsExample brandsExample = new BrandsExample();
        BrandsExample.Criteria criteria = brandsExample.createCriteria();
        criteria.andCM_BRANDIDEqualTo(brandid);
        return brandsMapper.deleteByExample(brandsExample);
    }

    /**
     * 查询店铺注册申请
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 申请列表
     */
    public List<Users> queryApplications(Integer pagenum, Integer pagesize) {
        UsersExample usersExample = new UsersExample();
        usersExample.setOrderByClause("CM_CREATETIME");
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_ISEXAMINENotEqualTo(2);
        PageHelper.startPage(pagenum, pagesize);
        return usersMapper.selectByExample(usersExample);
    }

    /**
     * 查询店铺注册申请详情
     *
     * @param userid 店铺ID
     * @return Result
     */
    public List<Users> queryApplicationDetails(String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userid);
        return usersMapper.selectByExample(usersExample);
    }

    /**
     * 通过申请
     *
     * @param userid 申请ID
     * @return 商家
     */
    public Users throughAudit(String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userid);
        List<Users> result = usersMapper.selectByExample(usersExample);
        if (result.isEmpty()) {
            return null;
        } else {
            return result.get(0);
        }
    }

    /**
     * 更新申请信息
     *
     * @param userid 用户ID
     */
    public void updateAudit(String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userid);
        Users users = new Users();
        users.setCM_ISEXAMINE(2);
        usersMapper.updateByExample(users, usersExample);
    }

    /**
     * 审核失败
     *
     * @param reason 理由
     * @param userid 商家ID
     */
    public void auditFailure(String reason, String userid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(userid);
        Users users = new Users();
        users.setCM_ISEXAMINE(1);
        users.setCM_REASON(reason);
        usersMapper.updateByExample(users, usersExample);
    }

    /**
     * 查询公告列表
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return 公告列表
     */
    public List<Notices> queryNotices(Integer pagenum, Integer pagesize) {
        NoticesExample noticesExample = new NoticesExample();
        noticesExample.setOrderByClause("CM_CREATETIME DESC");
        PageHelper.startPage(pagenum, pagesize);
        return noticesMapper.selectByExample(noticesExample);
    }

    /**
     * 添加公告
     *
     * @param notices 公告
     */
    public void addNotices(Notices notices) {
        noticesMapper.insert(notices);
    }

    /**
     * 删除公告
     *
     * @param noticeid 公告ID
     * @return 标志位
     */
    public Integer delNotices(Integer noticeid) {
        NoticesExample noticesExample = new NoticesExample();
        NoticesExample.Criteria criteria = noticesExample.createCriteria();
        criteria.andCM_NOTICEIIDEqualTo(noticeid);
        return noticesMapper.deleteByExample(noticesExample);
    }
}
