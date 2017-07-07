package com.sc.service;

import com.sc.dao.SaleDao;
import com.sc.domain.generator.Admins;
import com.sc.domain.generator.Register;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.Users;
import com.sc.storage.StorageService;
import com.sc.utils.DateUtils;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.SendCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 业务人员用
 * Created by valora on 2017/5/9.
 */
@Service
public class SaleService {

    private final SaleDao saleDao;

    private final StorageService storageService;

    private final JWT jwt;

    @Value("${applicationspath}")
    private String root;

    @Autowired
    public SaleService(SaleDao saleDao, StorageService storageService, JWT jwt) {
        this.saleDao = saleDao;
        this.storageService = storageService;
        this.jwt = jwt;
    }

    /**
     * 发送短信验证
     *
     * @param phone 手机号码
     * @param type  参数
     * @return Result
     */
    public Result sendApplocationCodeS(Long phone, Integer type) {
        try {
            List<Register> list = saleDao.selectregisterbyphone(phone);
            Integer code = Integer.valueOf(GetRandomNumber.genRandomNum(4));
            LocalDate time = LocalDate.now();
            if (SendCode.sendCode(phone.toString(), code, type)) {
                Register register = new Register();
                register.setCM_CODE(code);
                Date date = Date.from(time.atStartOfDay(ZoneId.systemDefault()).toInstant());
                register.setCM_TIME(date);
                register.setCM_COUNT(0);
                //如果是新用户，则新增
                if (list.get(0) == null) {
                    register.setCM_PHONE(phone);
                    saleDao.addregister(register);
                } else {
                    //如果不是新用户，就update
                    saleDao.updateregister(register, phone);
                }
                return GetResult.toJson(0, null, null, null, 0);
            } else {
                return GetResult.toJson(2, null, null, null, 0);
            }
        } catch (NumberFormatException e) {
            return GetResult.toJson(200, null, null, null, 0);
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
        try {
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
            List<Users> list = saleDao.selectuserByMap(lon1, lon2, lat1, lat2);
            return GetResult.toJson(0, null, null, list, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
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
        try {
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
            List<Sellers> list = saleDao.selectSellersByMap(lon1, lon2, lat1, lat2);
            return GetResult.toJson(0, null, null, list, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
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
        try {
            List<Register> list = saleDao.selectregisterbyphone(phone);
            Register register = list.get(0);
            //业务人员不存在
            if (register == null || register.getCM_CODE() != code) {
                return GetResult.toJson(8, null, null, list, 0);
            }
            Admins admins = saleDao.selectadminbyphone(phone);
            admins.setCM_PASSWORD(newpassword);
            //update业务人员密码
            saleDao.updateAdminPassword(admins);
            return GetResult.toJson(0, null, null, list, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 找回业务人员账号
     *
     * @param phone 业务人员手机号码
     * @param code  验证码
     * @return result
     */
    public Result BackAccount(Long phone, Integer code) {
        try {
            Register register = new Register();
            List<Register> list = saleDao.selectregisterbyphone(phone);
            if (list != null && list.size() > 0) {
                register = list.get(0);
            }
            //业务人员不存在
            if (register == null || register.getCM_CODE() != code) {
                return GetResult.toJson(8, null, null, list, 0);
            }
            Admins admins = saleDao.selectadminbyphone_and_Level(phone, 1);
            return GetResult.toJson(0, null, null, admins == null ? admins.getCM_ACCOUNT() : null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 商家申请
     *
     * @param userId
     * @param phone
     * @param code
     * @param address
     * @param lon
     * @param lat
     * @param pwd
     * @param cardno
     * @param shopname
     * @param personname
     * @param contactname
     * @param contactphone
     * @param telephone
     * @param pax
     * @param files
     * @return
     */
    public Result UserApplication(String userId, Long phone, Integer code, String address, Double lon, Double lat, String pwd, String cardno, String shopname, String personname, String contactname, String contactphone, String telephone, String pax, List<MultipartFile> files) {
        try {
            Admins admins = saleDao.getAdminByAdminId(userId);
            if (admins == null || (admins.getCM_LEVEL() != 2 && admins.getCM_LEVEL() != 1)) {
                return GetResult.toJson(45, null, null, null, 0);
            }

            Register register = new Register();
            List<Register> list = saleDao.selectregisterbyphone(phone);
            if (list != null && list.size() > 0) {
                register = list.get(0);
            }
            if (register.getCM_CODE() == null) {
                return GetResult.toJson(7, null, null, null, 0);
            }
            if (!Objects.equals(register.getCM_CODE(), code)) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            //检查手机号是否被注册
            int n = saleDao.getUserCount(phone);
            if (n > 0) {
                return GetResult.toJson(60, null, null, null, 0);
            }
            String card = "";
            String store = "";
            String license = "";
            Date now = new Date();
            for (MultipartFile file : files) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, root + newfilename)) {
                    res = root + newfilename;
                }
                if (file.getName().equals("card")) {
                    card += res + "|";
                } else if (file.getName().equals("store")) {
                    store += res + "|";
                } else if (file.getName().equals("license")) {
                    license += res + "|";
                }
                i++;
            }

            Long act = saleDao.getUserMaxAccount();
            String account = String.valueOf(act + 1).replace("4", "5");
            Users users = new Users();
            users.setCM_USERID(DateUtils.todayYyyyMmDdHhMmSs());
            users.setCM_ACCOUNT(account);
            users.setCM_BALANCE((double) 0);
            users.setCM_CREATETIME(now);
            users.setCM_INTEGRAL(0);
            users.setCM_ISEXAMINE(0);
            users.setCM_LEVEL(0);
            users.setCM_CARDPATH(card);
            users.setCM_STOREPATH(store);
            users.setCM_LICENSEPATH(license);
            users.setCM_PHONE(phone);
            users.setCM_PASSWORD(pwd);
            users.setCM_SHOPEADDRESS(address);
            users.setCM_SHOPNAME(shopname);
            users.setCM_SHOPLAT(lat);
            users.setCM_SHOPLON(lon);
            users.setCM_CARDNO(cardno);
            users.setCM_NAME(personname);
            users.setCM_CONTACTNAME(contactname);
            users.setCM_CONTACTPHONE(contactphone);
            users.setCM_TELEPHONE(telephone);
            users.setCM_PAX(pax);

            saleDao.userApplication(users);
            return GetResult.toJson(0, null, jwt.createJWT(userId), account, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 厂家注册
     *
     * @param userId
     * @param phone
     * @param code
     * @param address
     * @param lon
     * @param lat
     * @param pwd
     * @param cardno
     * @param companyname
     * @param personname
     * @param contactname
     * @param contactphone
     * @param telephone
     * @param pax
     * @param files
     * @return
     */
    public Result SellerApplication(String userId, Long phone, Integer code, String address, Double lon, Double lat, String pwd, String cardno, String companyname, String personname, String contactname, String contactphone, String telephone, String pax, List<MultipartFile> files) {
        try {
            Admins admins = saleDao.getAdminByAdminId(userId);
            if (admins == null || (admins.getCM_LEVEL() != 2 && admins.getCM_LEVEL() != 1)) {
                return GetResult.toJson(45, null, null, null, 0);
            }
            Register register = new Register();
            List<Register> list = saleDao.selectregisterbyphone(phone);
            if (list != null && list.size() > 0) {
                register = list.get(0);
            }
            if (register.getCM_CODE() == null) {
                return GetResult.toJson(7, null, null, null, 0);
            }
            if (!Objects.equals(register.getCM_CODE(), code)) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            //检查手机号是否被注册
            int n = saleDao.getSellerCount(phone);
            if (n > 0) {
                return GetResult.toJson(60, null, null, null, 0);
            }
            String card = "";
            String store = "";
            String license = "";
            Date now = new Date();
            for (MultipartFile file : files) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, root + newfilename)) {
                    res = root + newfilename;
                }
                if (file.getName().equals("card")) {
                    card += res + "|";
                } else if (file.getName().equals("store")) {
                    store += res + "|";
                } else if (file.getName().equals("license")) {
                    license += res + "|";
                }
                i++;
            }

            Long act = saleDao.getSellerMaxAccount();
            String account = String.valueOf(act + 1).replace("4", "5");
            Sellers sellers = new Sellers();
            sellers.setCM_ACCOUNT(account);
            sellers.setCM_CREATETIME(now);
            sellers.setCM_ISEXAMINE(0);
            sellers.setCM_CARDPATH(card);
            sellers.setCM_STOREPATH(store);
            sellers.setCM_LICENSEPATH(license);
            sellers.setCM_PHONE(phone);
            sellers.setCM_PASSWORD(pwd);
            sellers.setCM_ADDRESS(address);
            sellers.setCM_SELLERID(DateUtils.todayYyyyMmDdHhMmSs());
            sellers.setCM_SELLERNAME(companyname);
            sellers.setCM_LAT(lat);
            sellers.setCM_LON(lon);
            sellers.setCM_CARDNO(cardno);
            sellers.setCM_NAME(personname);
            sellers.setCM_CONTACTNAME(contactname);
            sellers.setCM_CONTACTPHONE(contactphone);
            sellers.setCM_TELEPHONE(telephone);
            sellers.setCM_PAX(pax);
            saleDao.sellerApplication(sellers);
            return GetResult.toJson(0, null, jwt.createJWT(userId), account, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
