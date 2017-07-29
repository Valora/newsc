package com.sc.service;

import com.github.pagehelper.PageHelper;
import com.sc.dao.SellerDao;
import com.sc.domain.generator.Afterservices;
import com.sc.domain.generator.Goods;
import com.sc.domain.generator.Orderdetails;
import com.sc.domain.generator.Orders;
import com.sc.domain.generator.Register;
import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.ServicedetailsWithBLOBs;
import com.sc.domain.generator.Users;
import com.sc.domain.seller.AfterserviceAndOdtAndGoodsAndusers;
import com.sc.domain.seller.OrderdetailsWithBLOBAndUsersAndLogisticss;
import com.sc.domain.seller.OrderdetailsWithBLOBandGood;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.SendCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by valora on 2017/5/9.
 */
@Service
public class SellerService {
    private final SellerDao sellerDao;
    private final JWT jwt;

    @Autowired
    public SellerService(SellerDao sellerDao, JWT jwt) {
        this.sellerDao = sellerDao;
        this.jwt = jwt;
    }

    /**
     * 查询我的销售订单（时间必须传）
     *
     * @param sellerid
     * @param orderState 订单状态
     * @param starttime  起始时间
     * @param endtime    结束时间
     * @param pagenum    页码
     * @param pagesize   页面大小
     * @return result
     */
    public Result QueryMySalesOrderS(String sellerid, Integer orderState, String starttime, String endtime, Integer pagenum, Integer pagesize) {
        try {
            List<OrderdetailsWithBLOBandGood> list = sellerDao.QueryMySaleOrderD1(sellerid, starttime, endtime, orderState);
            PageHelper.startPage(pagenum, pagesize);
            int i = list.size();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, list, i);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }

    }

    /**
     * 通过订单id查询订单详情
     *
     * @param orderdetailsid 订单id
     * @return result
     */
    public Result QuerySaleOrderDetails(String orderdetailsid) {
        try {
            OrderdetailsWithBLOBAndUsersAndLogisticss orderdetailsWithBLOBAndUsersAndLogisticss = null;
            List<OrderdetailsWithBLOBAndUsersAndLogisticss> list = sellerDao.QuerySaleOrderDetailD(orderdetailsid);
            if (list != null && list.size() > 0) {
                orderdetailsWithBLOBAndUsersAndLogisticss = list.get(0);
            }
            return GetResult.toJson(0, null, null, orderdetailsWithBLOBAndUsersAndLogisticss, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 同意用户申请售后服务
     *
     * @param sellerId       厂家id
     * @param afierserviceid 售后服务id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result AgreeUserService(String sellerId, String afierserviceid) {
        try {
            Afterservices afterservices = sellerDao.selectafterserviceD(afierserviceid);
            if (afterservices.getCM_SVID() == null) {
                return GetResult.toJson(51, null, jwt.createJWT(sellerId), null, 0);
            }
            if (afterservices.getCM_STATE() != 1) {
                return GetResult.toJson(52, null, jwt.createJWT(sellerId), null, 0);
            }
            Orderdetails orderdetails = sellerDao.selectordertails(afterservices.getCM_ORDERDETAILSID());
            if (orderdetails == null || orderdetails.getCM_SELLERSTATE() != 4 || orderdetails.getCM_SERVICESTATE() != 1) {
                return GetResult.toJson(52, null, jwt.createJWT(sellerId), null, 0);
            }
            afterservices.setCM_STATE(2);
            orderdetails.setCM_SERVICESTATE(2);
            ServicedetailsWithBLOBs servicedetailsWithBLOBs = new ServicedetailsWithBLOBs();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            servicedetailsWithBLOBs.setCM_SVID(str);
            servicedetailsWithBLOBs.setCM_AFTERSERVICEID(afterservices.getCM_AFTERSERVICEID());
            servicedetailsWithBLOBs.setCM_CREATETIME(date);
            servicedetailsWithBLOBs.setCM_TYPE(2);
            sellerDao.insertservicedetails(servicedetailsWithBLOBs);
            sellerDao.updateAfterservice(afterservices, afierserviceid);
            sellerDao.updateOrderdetails(orderdetails, afterservices.getCM_ORDERDETAILSID());
            return GetResult.toJson(0, null, jwt.createJWT(sellerId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 订单发货
     *
     * @param sellerId      厂家id
     * @param orderdetailid 订单详情id
     * @param logisticsid   物流id
     * @param logisticsnum  物流单号
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result sendOutGoodsNewS(String sellerId, String orderdetailid, String logisticsid, String logisticsnum) {
        try {
            Orderdetails orderdetails = sellerDao.selectordertails(orderdetailid);
            if (orderdetails == null) {
                return GetResult.toJson(50, null, jwt.createJWT(sellerId), null, 0);
            }
            Orders orders = sellerDao.selectOrderbyOrderid(orderdetails.getCM_ORDERID());
            if (orders != null || orders.getCM_STATE().intValue() != 2 || orderdetails.getCM_SELLERSTATE().intValue() != 2) {
                return GetResult.toJson(49, null, jwt.createJWT(sellerId), null, 0);
            }
            orderdetails.setCM_SELLERSTATE(3);
            orderdetails.setCM_LOGISTICSID(Integer.valueOf(logisticsid));
            orderdetails.setCM_LOGISTICSNUM(logisticsnum);
            boolean issend = true;
            List<Orderdetails> list = sellerDao.selectOrdertailsByOrderid(orders.getCM_ORDERID());
            for (Orderdetails o : list) {
                if (!Objects.equals(o.getCM_ORDERDETAILSID(), orderdetails.getCM_ORDERDETAILSID()) && o.getCM_SELLERSTATE().intValue() == 2) {
                    issend = false;
                }
            }
            if (issend) {
                orders.setCM_STATE(3);
            }
            sellerDao.updateOrderdetails(orderdetails, orderdetails.getCM_ORDERDETAILSID());
            sellerDao.updateOrder(orders, orders.getCM_ORDERID());
            return GetResult.toJson(0, null, jwt.createJWT(sellerId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询售后（时间必须传）
     *
     * @param sellerId    厂家id
     * @param serverstate 状态
     * @param starttime   开始时间
     * @param endtime     结束时间
     * @param pagenum     页码
     * @param pagesize    页码大小
     * @return result
     */
    public Result queryCustomerServiceS(String sellerId, Integer serverstate, String starttime, String endtime, Integer pagenum, Integer pagesize) {
        try {
            List<AfterserviceAndOdtAndGoodsAndusers> list = sellerDao.queryCustomerServiceD(sellerId, serverstate, starttime, endtime);
            PageHelper.startPage(pagenum, pagenum);
            int i = list.size();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, list, i);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 确定收到退/换的商品
     *
     * @param sellerId       厂家id
     * @param afierserviceid 售后服务id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result confirmReturnGoodsS(String sellerId, String afierserviceid) {
        try {
            Afterservices afterservices = sellerDao.selectafterserviceD(afierserviceid);
            if (afterservices == null) {
                return GetResult.toJson(51, null, jwt.createJWT(sellerId), null, 0);
            }
            if (afterservices.getCM_TYPE() == 1) {
                return GetResult.toJson(62, null, jwt.createJWT(sellerId), null, 0);
            }
            if (afterservices.getCM_STATE() == 3) {
                return GetResult.toJson(52, null, jwt.createJWT(sellerId), null, 0);
            }
            Orderdetails orderdetails = sellerDao.selectordertails(afterservices.getCM_ORDERDETAILSID());
            if (orderdetails == null || orderdetails.getCM_SELLERSTATE() != 4 || orderdetails.getCM_SERVICESTATE() != 3) {
                return GetResult.toJson(52, null, jwt.createJWT(sellerId), null, 0);
            }
            afterservices.setCM_STATE(4);
            orderdetails.setCM_SERVICESTATE(4);
            ServicedetailsWithBLOBs servicedetailsWithBLOBs = new ServicedetailsWithBLOBs();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            servicedetailsWithBLOBs.setCM_SVID(str);
            servicedetailsWithBLOBs.setCM_AFTERSERVICEID(afterservices.getCM_AFTERSERVICEID());
            servicedetailsWithBLOBs.setCM_CREATETIME(date);
            servicedetailsWithBLOBs.setCM_TYPE(4);
            sellerDao.insertservicedetails(servicedetailsWithBLOBs);
            sellerDao.updateAfterservice(afterservices, afterservices.getCM_ORDERDETAILSID());
            sellerDao.updateOrderdetails(orderdetails, orderdetails.getCM_ORDERDETAILSID());
            return GetResult.toJson(0, null, jwt.createJWT(sellerId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 售后发货（换货）
     *
     * @param sellerId       厂家id
     * @param afierserviceid 售后服务id
     * @param logisticsid    物流id
     * @param logisticsnum   物流单号
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result sendOutGoodsServiceS(String sellerId, String afierserviceid, Integer logisticsid, String logisticsnum) {
        try {
            Afterservices afterservices = sellerDao.selectafterserviceD(afierserviceid);
            if (afterservices == null) {
                return GetResult.toJson(51, null, jwt.createJWT(sellerId), null, 0);
            }
            if (afterservices.getCM_TYPE() == 1 || afterservices.getCM_STATE() != 4) {
                return GetResult.toJson(49, null, jwt.createJWT(sellerId), null, 0);
            }
            Orderdetails orderdetails = sellerDao.selectordertails(afterservices.getCM_ORDERDETAILSID());
            if (orderdetails == null || orderdetails.getCM_SELLERSTATE() != 4 || orderdetails.getCM_SERVICESTATE() != 4) {
                return GetResult.toJson(52, null, jwt.createJWT(sellerId), null, 0);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            afterservices.setCM_STATE(5);
            afterservices.setCM_SVID(str);
            orderdetails.setCM_SERVICESTATE(5);
            ServicedetailsWithBLOBs servicedetailsWithBLOBs = new ServicedetailsWithBLOBs();
            servicedetailsWithBLOBs.setCM_SVID(str);
            servicedetailsWithBLOBs.setCM_AFTERSERVICEID(afterservices.getCM_AFTERSERVICEID());
            servicedetailsWithBLOBs.setCM_CREATETIME(date);
            servicedetailsWithBLOBs.setCM_TYPE(5);
            servicedetailsWithBLOBs.setCM_LOGISTICSID(logisticsid);
            servicedetailsWithBLOBs.setCM_LOGISTICSNUM(logisticsnum);
            sellerDao.insertservicedetails(servicedetailsWithBLOBs);
            sellerDao.updateAfterservice(afterservices, afterservices.getCM_ORDERDETAILSID());
            sellerDao.updateOrderdetails(orderdetails, orderdetails.getCM_ORDERDETAILSID());
            return GetResult.toJson(0, null, jwt.createJWT(sellerId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 退款(退款暂时退到账户余额，可能以后原路退回)
     *
     * @param sellerId       厂家id
     * @param afierserviceid 售后服务id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result refundS(String sellerId, String afierserviceid) {
        try {
            Afterservices afterservices = sellerDao.selectafterserviceD(afierserviceid);
            if (afterservices == null || afterservices.getCM_TYPE() != 1) {
                return GetResult.toJson(51, null, jwt.createJWT(sellerId), null, 0);
            }
            Orderdetails orderdetails = sellerDao.selectordertails(afterservices.getCM_ORDERDETAILSID());
            if (orderdetails == null || (orderdetails.getCM_SELLERSTATE() != 4 && orderdetails.getCM_SERVICESTATE() != 3)) {
                return GetResult.toJson(52, null, jwt.createJWT(sellerId), null, 0);
            }
            Users users = sellerDao.selectUsersByOrderdetailsid(orderdetails.getCM_USERID());
            users.setCM_BALANCE(users.getCM_BALANCE() == null ? orderdetails.getCM_MONEY() : (users.getCM_BALANCE() + orderdetails.getCM_MONEY()));
            afterservices.setCM_STATE(9);
            orderdetails.setCM_SERVICESTATE(0);
            ServicedetailsWithBLOBs servicedetailsWithBLOBs = new ServicedetailsWithBLOBs();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            servicedetailsWithBLOBs.setCM_SVID(str);
            servicedetailsWithBLOBs.setCM_AFTERSERVICEID(afterservices.getCM_AFTERSERVICEID());
            servicedetailsWithBLOBs.setCM_CREATETIME(date);
            servicedetailsWithBLOBs.setCM_TYPE(9);
            sellerDao.insertservicedetails(servicedetailsWithBLOBs);
            sellerDao.updateAfterservice(afterservices, afterservices.getCM_ORDERDETAILSID());
            sellerDao.updateOrderdetails(orderdetails, orderdetails.getCM_ORDERDETAILSID());
            return GetResult.toJson(0, null, jwt.createJWT(sellerId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 根据厂家id查询查询厂家的销售产品
     *
     * @param sellerId 厂家的id
     * @param pagenum  页码
     * @param pagesize 页面大小
     * @return
     */
    public Result queryMySaleGoodsS(String sellerId, Integer pagenum, Integer pagesize) {
        try {
            List<Goods> list = sellerDao.sellerGoodsBySellerid(sellerId);
            PageHelper.startPage(pagenum, pagesize);
            int i = list.size();
            i = (i / pagesize) + ((i % pagesize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, list, i);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 厂家修改密码
     *
     * @param sellerId    厂家id
     * @param oldpassword 旧密码
     * @param newpassword 新密码
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result modifyPasswordS(String sellerId, String oldpassword, String newpassword) {
        try {
            Sellers sellers = sellerDao.selectSellerBysellerid(sellerId);
            if (!sellers.getCM_PASSWORD().equals(oldpassword)) {
                return GetResult.toJson(41, null, null, null, 0);
            }
            sellers.setCM_PASSWORD(newpassword);
            //修改密码
            sellerDao.updateseller(sellers);
            return GetResult.toJson(0, null, jwt.createJWT(sellerId), sellers, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 发送找回密码验证码（厂家）
     *
     * @param phone 厂家手机号码
     * @param type  类型
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result sendRetrieveCodeS(Long phone, int type) {
        try {
            Register register = sellerDao.selectRegisterByPhone(phone);
            String code = GetRandomNumber.genRandomNum(4);
            LocalDate time = LocalDate.now();
            Date date = Date.from(time.atStartOfDay(ZoneId.systemDefault()).toInstant());
            if (SendCode.sendCode(phone.toString(), Integer.valueOf(code), type)) {
                //如果是新用户，则新增
                if (register == null) {
                    register.setCM_PHONE(phone);
                    register.setCM_CODE(Integer.valueOf(code));
                    register.setCM_TIME(date);
                    register.setCM_COUNT(0);
                    sellerDao.addregister(register);
                } else {
                    //如果不是新用户，就update
                    register.setCM_CODE(Integer.valueOf(code));
                    register.setCM_TIME(date);
                    sellerDao.updateregister(register, phone);
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
     * 设置密码
     *
     * @param newpassword 需要设置的密码
     * @param code        验证码
     * @param phone       手机号码
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result resettingPassword(String newpassword, Integer code, Long phone) {
        try {
            Register register = sellerDao.selectRegisterByPhone(phone);
            if (register == null || register.getCM_CODE() != code) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            Sellers sellers = sellerDao.selectSellerBysellerPhone(phone);
            sellers.setCM_PASSWORD(newpassword);
            sellerDao.updateseller(sellers);
            return GetResult.toJson(0, null, null, null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 厂家找回账号
     *
     * @param phone 厂家的手机号码
     * @param code  验证码
     * @return result
     */
    public Result BackAccountS(Long phone, Integer code) {
        try {
            Register register = sellerDao.selectRegisterByPhone(phone);
            if (register == null && register.getCM_CODE() != code) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            Sellers sellers = sellerDao.selectSellerBysellerPhone(phone);
            return GetResult.toJson(0, null, null, sellers.getCM_ACCOUNT(), 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}