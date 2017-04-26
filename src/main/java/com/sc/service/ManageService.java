package com.sc.service;

import com.sc.dao.ManageDao;
import com.sc.domain.manage.AdminsInfo;
import com.sc.domain.manage.UserInfo;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 后台管理服务
 * Created by valora on 2017/4/21.
 */
@Service
public class ManageService {
    @Autowired
    private JWT jwt;

    @Autowired
    private ManageDao manageDao;

    /**
     * 添加客服/销售
     *
     * @param name     名称
     * @param password 密码
     * @param phone    电话
     * @param type     类型（2：销售，3：客服）
     * @param adminId  管理员ID
     * @return Result
     */
    public Result addEmployee(String name, String password, Long phone, Integer type, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCmLevel() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            Long act = manageDao.getAct();
            String account = act.toString() + "1"; //account 自加1
            Admins admins = new Admins();
            admins.setCmAccount(account);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String date = dateFormat.format(new Date());
            String adminsId = date + GetRandomNumber.genRandomNum(3);
            admins.setCmAdminid(adminsId);
            admins.setCmLevel(type);
            admins.setCmName(name);
            admins.setCmPassword(password);
            admins.setCmPhone(phone);
            manageDao.insertAdmin(admins);
            return GetResult.toJson(0, null, jwt.createJWT(adminId), account, 0);

        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除客服／销售
     *
     * @param id      被删除ID
     * @param adminId 客服／销售ID
     * @return Result
     */
    public Result delEmployee(int id, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCmLevel() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            int i = manageDao.delEmployee(id);
            return i > 0 ? GetResult.toJson(0, null, jwt.createJWT(adminId), null, 0) : GetResult.toJson(54, null, jwt.createJWT(adminId), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询客服／销售列表
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminId
     * @return
     */
    public Result queryEmployees(Integer pagenum, Integer pagesize, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCmLevel() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<AdminsInfo> results = manageDao.queryEmplyees(pagenum, pagesize);
            int i = manageDao.getAdminCount().intValue();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, results, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询商家列表
     * @param pagenum 页码
     * @param pagesize 页面大小
     * @param adminId 用户ID
     * @return 商家列表
     */
    public Result queryUsers(Integer pagenum, Integer pagesize, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCmLevel() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<UserInfo> results = manageDao.queryUsers(pagenum, pagesize);
            int i = manageDao.getUsersCount();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, results, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询厂家列表
     * @param pagenum 页码
     * @param pagesize 页面大小
     * @param adminId 用户ID
     * @return 商家列表
     */
    public Result querySellers(Integer pagenum, Integer pagesize, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCmLevel() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<UserInfo> results = manageDao.queryUsers(pagenum, pagesize);
            int i = manageDao.getUsersCount();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, results, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
