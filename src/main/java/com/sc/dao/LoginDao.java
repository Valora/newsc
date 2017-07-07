package com.sc.dao;

import com.sc.domain.generator.Register;
import com.sc.domain.generator.RegisterExample;
import com.sc.domain.generator.Users;
import com.sc.domain.generator.UsersExample;
import com.sc.domain.login.AdminLogin;
import com.sc.domain.login.SellerLogin;
import com.sc.domain.login.UserLogin;
import com.sc.mapper.generator.RegisterMapper;
import com.sc.mapper.generator.UsersMapper;
import com.sc.mapper.login.AdminLoginMapper;
import com.sc.mapper.login.LoginMapper;
import com.sc.mapper.login.SellerLoginMapper;
import com.sc.mapper.login.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 登录用Dao
 * Created by valora on 2017/4/21.
 */
@Component
public class LoginDao {
    private final AdminLoginMapper adminLoginMapper;

    private final RegisterMapper registerMapper;

    private final SellerLoginMapper sellerLoginMapper;

    private final UsersMapper usersMapper;

    private final UserLoginMapper userLoginMapper;

    private final LoginMapper loginMapper;

    @Autowired
    public LoginDao(AdminLoginMapper adminLoginMapper, RegisterMapper registerMapper, SellerLoginMapper sellerLoginMapper, UsersMapper usersMapper, UserLoginMapper userLoginMapper, LoginMapper loginMapper) {
        this.adminLoginMapper = adminLoginMapper;
        this.registerMapper = registerMapper;
        this.sellerLoginMapper = sellerLoginMapper;
        this.usersMapper = usersMapper;
        this.userLoginMapper = userLoginMapper;
        this.loginMapper = loginMapper;
    }

    /**
     * 厂家信息
     *
     * @param account  账号
     * @param password 密码
     * @return 厂家
     */
    public List<Users> getUserByAccountAndPassword(String account, String password) {
        UsersExample userExample = new UsersExample();
        UsersExample.Criteria criteria = userExample.createCriteria();
        criteria.andCM_ACCOUNTEqualTo(account);
        criteria.andCM_PASSWORDEqualTo(password);
        return usersMapper.selectByExample(userExample);
    }

    /**
     * 商家登录信息
     *
     * @param account  账号
     * @param password 密码
     * @return Result
     */
    public UserLogin getUserLoginInfo(String account, String password) {
        //登录信息类
        UserLogin userLoginInfo = new UserLogin();
        List<UserLogin> result = userLoginMapper.selectLoginInfo(account, password);
        if (result != null && result.size() > 0) {
            userLoginInfo.setCM_USERID(result.get(0).getCM_USERID());
            userLoginInfo.setCM_BALANCE(result.get(0).getCM_BALANCE());
            userLoginInfo.setCM_SHOPNAME(result.get(0).getCM_SHOPNAME());
            userLoginInfo.setCM_LEVEL(result.get(0).getCM_LEVEL());
            userLoginInfo.setCM_INTEGRAL(result.get(0).getCM_INTEGRAL());
            userLoginInfo.setCM_CODE(result.get(0).getCM_CODE());
            userLoginInfo.setCM_PHONE(result.get(0).getCM_PHONE());
        }
        return userLoginInfo;
    }

    /**
     * 商家根据电话号码和验证码登入
     *
     * @param phone 电话号码
     * @param code  验证码
     * @return
     */
    public UserLogin getUserLoginInfoByPhoneAndCode(String phone, String code) {
        UserLogin userLoginInfo = new UserLogin();
        List<UserLogin> result = userLoginMapper.selectLoginInfoByPhoneAndCode(phone, code);
        if (result != null && result.size() > 0) {
            userLoginInfo.setCM_USERID(result.get(0).getCM_USERID());
            userLoginInfo.setCM_BALANCE(result.get(0).getCM_BALANCE());
            userLoginInfo.setCM_SHOPNAME(result.get(0).getCM_SHOPNAME());
            userLoginInfo.setCM_LEVEL(result.get(0).getCM_LEVEL());
            userLoginInfo.setCM_INTEGRAL(result.get(0).getCM_INTEGRAL());
            userLoginInfo.setCM_CODE(result.get(0).getCM_CODE());
            userLoginInfo.setCM_PHONE(result.get(0).getCM_PHONE());
        }
        return userLoginInfo;
    }

    /**
     * 根据手机号查询商家（用户）信息
     *
     * @param phone
     * @return
     */
    public Users getUserLoginInfoByPhone(String phone) {
        Users users = new Users();
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_PHONEEqualTo(Long.valueOf(phone));
        List<Users> list = usersMapper.selectByExample(usersExample);
        if (list != null && list.size() > 0) {
            users = list.get(0);
        }
        return users;
    }

    /**
     * 管理员登录信息
     *
     * @param account  账号
     * @param password 密码
     * @return 管理员信息
     */
    public AdminLogin getAdminLoginInfo(String account, String password) {
        return loginMapper.getAdminLoginInfo(account, password);
    }

    /**
     * 删除存在的验证码
     *
     * @param phone 手机号
     */
    public void deleteCode(Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        registerMapper.deleteByExample(registerExample);
    }

    /**
     * 厂家登录信息
     *
     * @param account  账号
     * @param password 密码
     * @return 厂家登录信息
     */
    public SellerLogin getSellerLoginInfo(String account, String password) {
        //厂家信息
        SellerLogin sellerLoginInfo = new SellerLogin();
        List<SellerLogin> result = sellerLoginMapper.selectLoginInfo(account, password);
        sellerLoginInfo.setCM_CODE(result.get(0).getCM_CODE());
        sellerLoginInfo.setCM_PHONE(result.get(0).getCM_PHONE());
        sellerLoginInfo.setCM_SELLERID(result.get(0).getCM_SELLERID());
        sellerLoginInfo.setCM_SELLERNAME(result.get(0).getCM_SELLERNAME());
        return sellerLoginInfo;
    }

    /**
     * 获得注册信息
     *
     * @param phone 手机号码
     * @return
     */
    public Register getRegisterInfo(String phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(Long.valueOf(phone));
        List<Register> result = registerMapper.selectByExample(registerExample);
        return result.size() == 0 ? null : result.get(0);
    }

    /**
     * 新建注册信息
     *
     * @param phone 手机号
     * @param code  验证码
     * @param time  时间
     */
    public void insertReg(String phone, String code, Date time) {
        Register register = new Register();
        register.setCM_PHONE(Long.valueOf(phone));
        register.setCM_CODE(Integer.valueOf(code));
        register.setCM_TIME(time);
        register.setCM_COUNT(0);
        registerMapper.insert(register);
    }

    /**
     * 更新注册信息
     *
     * @param phone 手机号
     * @param code  验证码
     * @param time  时间
     */
    public void updateReg(String phone, String code, Date time) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(Long.valueOf(phone));
        Register register = new Register();
        register.setCM_CODE(Integer.valueOf(code));
        register.setCM_COUNT(0);
        register.setCM_TIME(time);
        registerMapper.updateByExampleSelective(register, registerExample);
    }


}
