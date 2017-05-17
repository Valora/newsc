package com.sc.service;

import com.sc.dao.SaleDao;
import com.sc.domain.generator.Admins;
import com.sc.domain.generator.Register;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.Users;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.Result;
import com.sc.utils.SendCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * 业务人员用
 * Created by valora on 2017/5/9.
 */
@Service
public class SaleService {

    private final SaleDao SaleDao;

    @Autowired
    public SaleService(SaleDao SaleDao) {
        this.SaleDao = SaleDao;
    }

    /**
     * 发送短信验证
     *
     * @param phone 手机号码
     * @param type  参数
     * @return Result
     */
    public Result sendApplocationCodeS(Long phone, Integer type) {
        List<Register> list = SaleDao.selectregisterbyphone(phone);
        Integer code = Integer.valueOf(GetRandomNumber.genRandomNum(4));
        LocalDate time = LocalDate.now();
        if (SendCode.sendCode(phone.toString(), code, type)) {
            Register register = new Register();
            register.setCmCode(code);
            Date date = Date.from(time.atStartOfDay(ZoneId.systemDefault()).toInstant());
            register.setCmTime(date);
            register.setCmCount(0);
            //如果是新用户，则新增
            if (list.get(0) == null) {
                register.setCmPhone(phone);
                SaleDao.addregister(register);
            } else {
                //如果不是新用户，就update
                SaleDao.updateregister(register, phone);
            }
            return GetResult.toJson(0, null, null, null, 0);
        } else {
            return GetResult.toJson(2, null, null, null, 0);
        }
    }

    /**
     * 根据经纬度获取商家列表
     *
     * @param userId   商家id
     * @param lon      经度
     * @param lat      纬度
     * @param distance 距离
     * @return result
     */
    public Result QueryUsersByMap(String userId, Double lon, Double lat, Double distance) {
        double lon1 = 0, lon2 = 0, lat1 = 0, lat2 = 0;
        if (distance == 0) {
            lon1 = lon - 0.02;
            lon2 = lon + 0.02;
            lat1 = lat - 0.02;
            lat2 = lat + 0.02;
        } else {
            lon1 = lon - distance;
            lon2 = lon + distance;
            lat1 = lat - distance;
            lat2 = lat + distance;
        }
        List<Users> list = SaleDao.selectuserByMap(lon1, lon2, lat1, lat2);
        return GetResult.toJson(0, null, null, list, 0);
    }

    /**
     * 根据经纬度获取厂家列表
     *
     * @param userId   厂家id
     * @param lon      经度
     * @param lat      纬度
     * @param distance 距离
     * @return result
     */
    public Result QuerySellerByMap(String userId, Double lon, Double lat, Double distance) {
        double lon1 = 0, lon2 = 0, lat1 = 0, lat2 = 0;
        if (distance == 0) {
            lon1 = lon - 0.02;
            lon2 = lon + 0.02;
            lat1 = lat - 0.02;
            lat2 = lat + 0.02;
        } else {
            lon1 = lon - distance;
            lon2 = lon + distance;
            lat1 = lat - distance;
            lat2 = lat + distance;
        }
        List<Sellers> list = SaleDao.selectSellersByMap(lon1, lon2, lat1, lat2);
        return GetResult.toJson(0, null, null, list, 0);
    }

    /**
     * 业务人员找回密码新密码
     *
     * @param phone       手机号码
     * @param code        验证码
     * @param newpassword 新密码
     * @return
     */
    public Result ResettingPassword(Long phone, Integer code, String newpassword) {
        List<Register> list = SaleDao.selectregisterbyphone(phone);
        Register register = list.get(0);
        //业务人员不存在
        if (register == null || register.getCmCode() != code) {
            return GetResult.toJson(8, null, null, list, 0);
        }
        Admins admins = SaleDao.selectadminbyphone(phone);
        admins.setCmPassword(newpassword);
        //update业务人员密码
        SaleDao.updateAdminPassword(admins);
        return GetResult.toJson(0, null, null, list, 0);
    }

    /**
     * 找回业务人员账号
     * @param phone 业务人员手机号码
     * @param code 验证码
     * @return result
     */
    public Result BackAccount(Long phone, Integer code) {
        List<Register> list = SaleDao.selectregisterbyphone(phone);
        Register register = list.get(0);
        //业务人员不存在
        if (register == null || register.getCmCode() != code) {
            return GetResult.toJson(8, null, null, list, 0);
        }
        Admins admins = SaleDao.selectadminbyphone_and_Level(phone, 1);
        return GetResult.toJson(0, null, null, admins == null ? admins.getCmAccount() : null, 0);
    }
}
