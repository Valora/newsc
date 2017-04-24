package com.sc.service;

import com.sc.dao.ManageDao;
import com.sc.domain.generator.Admins;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
     * @param name 名称
     * @param password 密码
     * @param phone 电话
     * @param type 类型（2：销售，3：客服）
     * @param adminId 管理员ID
     * @return Result
     */
    public Result addEmployee(String name, String password, Long phone, Integer type, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminid(adminId);
            if (result.isEmpty() || result.get(0).getCmLevel() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
        return null;
    }
}
