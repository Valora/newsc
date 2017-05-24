package com.sc.dao;

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
     * @param account 账号
     * @param password 密码
     * @return 厂家
     */
    public List<Users> getUserByAccountAndPassword(String account, String password) {
        UsersExample userExample = new UsersExample();
        UsersExample.Criteria criteria = userExample.createCriteria();
        criteria.andCmAccountEqualTo(account);
        criteria.andCmPasswordEqualTo(password);
        return usersMapper.selectByExample(userExample);
    }

    /**
     * 厂家登录信息
     * @param account 账号
     * @param password 密码
     * @return Result
     */
    public UserLogin getUserLoginInfo(String account, String password) {
        //登录信息类
        UserLogin userLoginInfo = new UserLogin();

        List<UserLogin> result = userLoginMapper.selectLoginInfo(account, password);
        userLoginInfo.setCmUserid(result.get(0).getCmUserid());
        userLoginInfo.setCmBalance(result.get(0).getCmBalance());
        userLoginInfo.setCmNickname(result.get(0).getCmNickname());
        userLoginInfo.setCmLevel(result.get(0).getCmLevel());
        userLoginInfo.setCmIntegral(result.get(0).getCmIntegral());
        userLoginInfo.setCmCode(result.get(0).getCmCode());
        userLoginInfo.setCmPhone(result.get(0).getCmPhone());
        return userLoginInfo;
    }

    /**
     * 管理员登录信息
     * @param account 账号
     * @param password 密码
     * @return 管理员信息
     */
    public AdminLogin getAdminLoginInfo(String account, String password) {
        return loginMapper.getAdminLoginInfo(account, password);
    }

    /**
     * 删除存在的验证码
     * @param phone 手机号
     */
    public void deleteCode(Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCmPhoneEqualTo(phone);
        registerMapper.deleteByExample(registerExample);
    }

    /**
     * 厂家登录信息
     * @param account 账号
     * @param password 密码
     * @return 厂家登录信息
     */
    public SellerLogin getSellerLoginInfo(String account, String password) {
        //厂家信息
        SellerLogin sellerLoginInfo = new SellerLogin();
        List<SellerLogin> result = sellerLoginMapper.selectLoginInfo(account, password);
        sellerLoginInfo.setCmCode(result.get(0).getCmCode());
        sellerLoginInfo.setCmPhone(result.get(0).getCmPhone());
        sellerLoginInfo.setCmSellerid(result.get(0).getCmSellerid());
        sellerLoginInfo.setCmSellerName(result.get(0).getCmSellerName());
        return sellerLoginInfo;
    }
}
