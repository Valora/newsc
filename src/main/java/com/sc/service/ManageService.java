package com.sc.service;

import com.sc.dao.ManageDao;
import com.sc.domain.generator.Admins;
import com.sc.domain.generator.Brands;
import com.sc.domain.generator.Classifys;
import com.sc.domain.generator.Notices;
import com.sc.domain.generator.Users;
import com.sc.domain.manage.AdminsInfo;
import com.sc.domain.manage.SellerDetail;
import com.sc.domain.manage.SellerInfo;
import com.sc.domain.manage.UserDetail;
import com.sc.domain.manage.UserInfo;
import com.sc.storage.StorageService;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.toIntExact;

/**
 * 后台管理服务
 * Created by valora on 2017/4/21.
 */
@Service
public class ManageService {
    private final JWT jwt;

    private final ManageDao manageDao;

    private final StorageService storageService;

    @Value("${classifyfilespath}")
    private String root;

    @Autowired
    public ManageService(JWT jwt, ManageDao manageDao, StorageService storageService) {
        this.jwt = jwt;
        this.manageDao = manageDao;
        this.storageService = storageService;
    }

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
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            Long act = manageDao.getAct();
            String account = act.toString() + "1"; //account 自加1
            Admins admins = new Admins();
            admins.setCM_ACCOUNT(account);
            String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            String adminsId = date + GetRandomNumber.genRandomNum(3);
            admins.setCM_ADMINID(adminsId);
            admins.setCM_LEVEL(type);
            admins.setCM_NAME(name);
            admins.setCM_PASSWORD(password);
            admins.setCM_PHONE(phone);
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
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
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
     * @param adminId  管理员ID
     * @return Result
     */
    public Result queryEmployees(Integer pagenum, Integer pagesize, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<AdminsInfo> results = manageDao.queryEmployees(pagenum, pagesize);
            int i = manageDao.getAdminCount().intValue();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, results, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询商家列表
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminId  用户ID
     * @return 商家列表
     */
    public Result queryUsers(Integer pagenum, Integer pagesize, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
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
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminId  用户ID
     * @return 厂家列表
     */
    public Result querySellers(Integer pagenum, Integer pagesize, String adminId) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminId);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<SellerInfo> results = manageDao.querySellers(pagenum, pagesize);
            int i = manageDao.getSellersCount();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);

            return GetResult.toJson(0, null, null, results, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询商家详细信息
     *
     * @param userid  商家ID
     * @param adminid 管理员ID
     * @return 商家详情
     */
    public Result queryUserInfo(String userid, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }

            List<UserDetail> results = manageDao.queryUserInfo(userid);

            return GetResult.toJson(0, null, null, results, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询厂家详细信息
     *
     * @param sellerid 厂家ID
     * @param adminid  管理员ID
     * @return 厂家详细信息
     */
    public Result querySellerInfo(String sellerid, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }

            SellerDetail sellerDetail = manageDao.querySellerInfo(sellerid);

            return GetResult.toJson(0, null, null, sellerDetail, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 根据信息查询客服/销售(名称，账号)
     * 暂时不用
     *
     * @param Content  信息内容
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminid  管理员ID
     * @return Result
     */
    public Result queryEmployeesByUserInfo(String Content, Integer pagenum, Integer pagesize, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            AdminsInfo adminsInfo = manageDao.queryEmployeeByUserInfo(Content, pagenum, pagesize);
            return GetResult.toJson(0, null, null, adminsInfo, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 根据信息模糊查询商家(用户姓名，账号，店铺名称，店铺地址)
     *
     * @param Content  信息
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminid  管理员ID
     * @return 商家信息
     */
    public Result queryUserByUserInfo(String Content, Integer pagenum, Integer pagesize, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            UserDetail userDetail = manageDao.queryUserByUserInfo(Content, pagenum, pagesize);
            return GetResult.toJson(0, null, null, userDetail, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 根据厂家信息（模糊）查询厂家详情
     *
     * @param Content  信息
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminid  管理员ID
     * @return 厂家详情
     */
    public Result querySellersBySellerInfo(String Content, Integer pagenum, Integer pagesize, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            SellerDetail sellerDetail = manageDao.querySellersBySellerInfo(Content, pagenum, pagesize);
            return GetResult.toJson(0, null, null, sellerDetail, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 添加商品分类和子分类
     *
     * @param classifyname 分类名称
     * @param type         分类类型（0：大类，1：子类）
     * @param parentid     上级分类（如果是大类，则输入0）
     * @param adminid      管理员ID
     * @param file         图片
     * @return Result
     */
    public Result addClassify(String classifyname, String type, String parentid, String adminid, MultipartFile file) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss")) + GetRandomNumber.genRandomNum(4);

            try {
                storageService.store(file, root + filename);
            } catch (Exception ex) {
                return GetResult.toJson(47, null, null, null, 0);
            }

            manageDao.addClassify(classifyname, type, parentid, "C://" + root + filename);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 修改商品分类和子分类
     *
     * @param classifyid   分类ID
     * @param classifyname 分类名称
     * @param type         分类类型（0：大类，1：子类）
     * @param parentid     上级分类（如果是大类，则输入0）
     * @param adminid      管理员ID
     * @param files        图片
     * @return Result
     */
    public Result reviceClassify(String classifyid, String classifyname, String type, String parentid, String adminid, List<MultipartFile> files) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            int id = Integer.parseInt(classifyid);
            List<Classifys> classifys = manageDao.selectClassifysByClassifyid(id);
            if (classifys.isEmpty()) {
                return GetResult.toJson(53, null, jwt.createJWT(adminid), null, 0);
            }
            String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss")) + GetRandomNumber.genRandomNum(4);
            String imgpath = "";
            for (MultipartFile file : files) {
                try {
                    storageService.store(file, root + filename);
                } catch (Exception ex) {
                    return GetResult.toJson(47, null, null, null, 0);
                }
                imgpath = root + filename;
            }
            manageDao.reviceClassify(classifyname, type, parentid, "C://" + imgpath);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询分类/二级分类列表（删除或排序时使用）
     *
     * @param type     查询类型（1：大类,2：子类）
     * @param pagenum  页码
     * @param pagesize 页码大小
     * @return Result
     */
    public Result queryClassifies(Integer type, Integer pagenum, Integer pagesize) {
        List<Classifys> classifys = new ArrayList<>();
        int i = 0;
        try {
            if (type == 1) {
                classifys = manageDao.queryClassifies(pagenum, pagesize, 0);
                i = toIntExact(manageDao.getClassifyCount(type));
            }
            if (type == 2) {
                classifys = manageDao.queryClassifies(pagenum, pagesize, 1);
                i = toIntExact(manageDao.getClassifyCount(type));
            }
            return GetResult.toJson(0, null, null, classifys, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 分类排序
     *
     * @param classifyid 分类ID
     * @param sort       序号(从小到大排序，大类和小类分开排序)
     * @param adminid    管理员ID
     * @return Result
     */
    public Result classifySort(Integer classifyid, Integer sort, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            Integer i = manageDao.classifySort(sort, classifyid);
            return i > 0 ? GetResult.toJson(0, null, null, null, 0) : GetResult.toJson(200, null, null, null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除商品分类和子分类
     *
     * @param classifyid 分类ID
     * @param adminid    管理员ID
     * @return Result
     */
    public Result delClassify(Integer classifyid, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            int i = manageDao.delClassify(classifyid);
            return i > 0 ? GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0) : GetResult.toJson(54, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询品牌列表
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return Result
     */
    public Result queryBrands(Integer pagenum, Integer pagesize) {
        try {
            List<Brands> result = manageDao.queryBrands(pagenum, pagesize);
            int i = toIntExact(manageDao.getBrandCount());
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);

            return GetResult.toJson(0, null, null, result, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 添加品牌
     *
     * @param adminid   管理员ID
     * @param brand     品牌
     * @param introduce 介绍
     * @return Result
     */
    public Result addBrand(String adminid, String brand, String introduce) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            manageDao.addBrands(brand, introduce);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除品牌
     *
     * @param adminid 管理员ID
     * @param brandid 品牌ID
     * @return Result
     */
    public Result delBrands(String adminid, Integer brandid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            int i = manageDao.delBrands(brandid);
            return i > 0 ? GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0) : GetResult.toJson(54, null, jwt.createJWT(adminid), null, 0);

        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询店铺注册申请
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminid  管理员ID
     * @return Result
     */
    public Result queryApplications(Integer pagenum, Integer pagesize, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<Users> users = manageDao.queryApplications(pagenum, pagesize);

            return GetResult.toJson(0, null, null, users, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询店铺注册申请详情
     *
     * @param userid  商家ID
     * @param adminid 管理员ID
     * @return Result
     */
    public Result queryApplicationDetail(String userid, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<Users> results = manageDao.queryApplicationDetails(userid);

            return GetResult.toJson(0, null, null, results, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 通过审核
     *
     * @param adminid 管理员ID
     * @param userid  用户ID
     * @return Result
     */
    public Result throughAudit(String adminid, String userid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            Users users = manageDao.throughAudit(userid);
            if (users == null) {
                return GetResult.toJson(56, null, null, null, 0);
            }
            manageDao.updateAudit(userid);

            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 审核失败
     *
     * @param adminid 管理员ID
     * @param userid  用户ID
     * @param reason  失败理由
     * @return Result
     */
    public Result auditFailure(String adminid, String userid, String reason) {
        try {
            List<Users> result = manageDao.selectUsersByUserId(userid);
            if (result.isEmpty()) {
                return GetResult.toJson(53, null, null, null, 0);
            }

            manageDao.auditFailure(reason, userid);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询公告列表（对厂家）
     *
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @param adminid  管理员ID
     * @return Resutl
     */
    public Result queryNotices(Integer pagenum, Integer pagesize, String adminid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            List<Notices> results = manageDao.queryNotices(pagenum, pagesize);
            int i = results.size();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, results, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 添加公告
     *
     * @param adminid  管理员ID
     * @param title    标题
     * @param content  内容
     * @param creator  公告者
     * @param other    其他
     * @param deadLine 过期时间
     * @return Result
     */
    public Result addNotices(String adminid, String title, String content, String creator, String other, LocalDate deadLine) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            //LocalDate转成Date
            Date time = Date.from(deadLine.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
            Notices notices = new Notices();
            notices.setCM_TITLE(title);
            notices.setCM_CONTENT(content);
            notices.setCM_CREATOR(creator);
            notices.setCM_OTHER(other);
            notices.setCM_DEADLINE(time);
            manageDao.addNotices(notices);
            return GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除公告
     *
     * @param adminid  管理员ID
     * @param noticeid 公告Id
     * @return Result
     */
    public Result delNotices(String adminid, Integer noticeid) {
        try {
            List<Admins> result = manageDao.selectAdminsByAdminId(adminid);
            if (result.isEmpty() || result.get(0).getCM_LEVEL() != 1) {
                return GetResult.toJson(37, null, null, null, 0);
            }
            Integer i = manageDao.delNotices(noticeid);
            return i > 0 ? GetResult.toJson(0, null, jwt.createJWT(adminid), null, 0) : GetResult.toJson(54, null, jwt.createJWT(adminid), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
