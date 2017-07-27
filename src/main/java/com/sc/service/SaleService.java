package com.sc.service;

import com.sc.dao.SaleDao;
import com.sc.domain.generator.Admins;
import com.sc.domain.generator.Register;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.Users;
import com.sc.domain.sale.SellersInfo;
import com.sc.domain.sale.UsersInfo;
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
            if (SendCode.sendCode(phone.toString(), code, type)) {
                Register register = new Register();
                register.setCM_CODE(code);
                register.setCM_TIME(new Date());
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
            //wrong code
            if (register == null || register.getCM_CODE().intValue() != code.intValue()) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            //update password
            saleDao.updateAdminPassword(phone, newpassword);
            return GetResult.toJson(0, null, null, null, 0);
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
            if (register == null || register.getCM_CODE().intValue() != code.intValue()) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            Admins admins = saleDao.selectadminbyphone_and_Level(phone, 1);
            return GetResult.toJson(0, null, null, admins == null ? null : admins.getCM_ACCOUNT(), 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 商家申请
     *
     * @param userId
     * @param phone
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
     * @param cardFiles
     * @param storeFiles
     * @param licenseFiles
     * @return
     */
    public Result UserApplication(String userId, Long phone, String address, Double lon, Double lat, String pwd, String cardno, String shopname, String personname, String contactname, String contactphone, String telephone, String pax, MultipartFile[] cardFiles, MultipartFile[] storeFiles, MultipartFile[] licenseFiles) {
        try {
            Admins admins = saleDao.getAdminByAdminId(userId);
            if (admins == null || (admins.getCM_LEVEL() != 2 && admins.getCM_LEVEL() != 1)) {
                return GetResult.toJson(45, null, null, null, 0);
            }

            //检查手机号是否被注册
            int n = saleDao.getUserCount(phone);
            if (n > 0) {
                return GetResult.toJson(60, null, null, null, 0);
            }

            //check user cardno
            int m = saleDao.getUserCount(cardno);
            if (m > 0) {
                return GetResult.toJson(64, null, null, null, 0);
            }
            String card = "";
            String store = "";
            String license = "";
            String Date = DateUtils.todayYyyyMmDdHhMmSs();
            for (MultipartFile file : cardFiles) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = root + "users\\" + Date + "\\" +"card"+ i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, newfilename)) {
                    res =   "C://Applications/users/" + Date + "/card/" + i + "." + storageService.getFileType(fileName);
                }
                card += res + "|";
                i++;
            }
            for (MultipartFile file : storeFiles) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = root + "users\\" + Date + "\\" +"store"+ i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, newfilename)){
                    res = "C://Applications/users/" + Date + "/store/" + i + "." + storageService.getFileType(fileName);
                }
                store += res + "|";
                i++;
            }
            for (MultipartFile file : licenseFiles) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = root + "users\\" +  Date + "\\" +"license" + i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, newfilename)){
                    res =  "C://Applications/users/" + Date + "/store/" + i + "." + storageService.getFileType(fileName);
                }
                license += res + "|";
                i++;
            }
            Long act = saleDao.getUserMaxAccount();
            String account = String.valueOf(act + 1).replace("4", "5");
            Users users = new Users();
            users.setCM_USERID(DateUtils.todayYyyyMmDdHhMmSs());
            users.setCM_ACCOUNT(account);
            users.setCM_BALANCE((double) 0);
            users.setCM_CREATETIME(new Date());
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
            users.setCM_REASON(userId);

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
     * @param cardFiles
     * @param storeFiles
     * @param licenseFiles
     * @return
     */
    public Result SellerApplication(String userId, Long phone, String address, Double lon, Double lat, String pwd, String cardno, String companyname, String personname, String contactname, String contactphone, String telephone, String pax, MultipartFile[] cardFiles, MultipartFile[] storeFiles, MultipartFile[] licenseFiles) {
        try {
            Admins admins = saleDao.getAdminByAdminId(userId);
            if (admins == null || (admins.getCM_LEVEL() != 2 && admins.getCM_LEVEL() != 1)) {
                return GetResult.toJson(45, null, null, null, 0);
            }
            //检查手机号是否被注册
            int n = saleDao.getSellerCount(phone);
            if (n > 0) {
                return GetResult.toJson(60, null, null, null, 0);
            }
            //check seller cardno
            int m = saleDao.getSellerCount(cardno);
            if (m > 0) {
                return GetResult.toJson(64, null, null, null, 0);
            }
            String card = "";
            String store = "";
            String license = "";
            String Date = DateUtils.todayYyyyMmDdHhMmSs();
            for (MultipartFile file : cardFiles) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = root + "sellers\\" + Date + "\\" +"card"+ i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, newfilename)) {
                    res =   "C://Applications/sellers/" + Date + "/card/" + i + "." + storageService.getFileType(fileName);
                }
                card += res + "|";
                i++;
            }
            for (MultipartFile file : storeFiles) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = root + "sellers\\" + Date + "\\" +"store"+ i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, newfilename)){
                    res = "C://Applications/sellers/" + Date + "/store/" + i + "." + storageService.getFileType(fileName);
                }
                store += res + "|";
                i++;
            }
            for (MultipartFile file : licenseFiles) {
                int i = 0;
                String fileName = file.getOriginalFilename();
                if (!storageService.isImage(fileName)) {
                    return GetResult.toJson(28, null, null, null, 0);
                }
                String res = "";
                String newfilename = root + "sellers\\" +  Date + "\\" +"license" + i + "." + storageService.getFileType(fileName);
                if (storageService.store(file, newfilename)){
                    res =  "C://Applications/sellers/" + Date + "/license/" + i + "." + storageService.getFileType(fileName);
                }
                license += res + "|";
                i++;
            }

            Long act = saleDao.getSellerMaxAccount();
            String account = String.valueOf(act + 1).replace("4", "5");
            Sellers sellers = new Sellers();
            sellers.setCM_ACCOUNT(account);
            sellers.setCM_CREATETIME(new Date());
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
            sellers.setCM_REASON(userId);
            saleDao.sellerApplication(sellers);
            return GetResult.toJson(0, null, jwt.createJWT(userId), account, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询注册人员注册商家
     *
     * @param userId   注册人员ID
     * @param pageNum  页码
     * @param pageSize 页码大小
     * @return
     */
    public Result queryUsersByAdminId(String userId, Integer pageNum, Integer pageSize) {
        try {
            List<UsersInfo> usersInfos = saleDao.getUserInfoByAdminId(userId, pageNum, pageSize);
            int i = usersInfos.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, usersInfos, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询注册人员注册家
     *
     * @param userId   注册人员ID
     * @param pageNum  页码
     * @param pageSize 页码大小
     * @return
     */
    public Result querySellersByAdminId(String userId, Integer pageNum, Integer pageSize) {
        try {
            List<SellersInfo> sellersInfos = saleDao.getSellersInfoByAdminId(userId, pageNum, pageSize);
            int i = sellersInfos.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, sellersInfos, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
