package com.sc.service;

import com.github.pagehelper.PageHelper;
import com.sc.dao.UserDoMainDao;
import com.sc.domain.generator.*;
import com.sc.domain.userdomain.*;
import com.sc.utils.*;
import com.sc.utils.goodobject.GOODS;
import com.sc.utils.goodobject.GOODSDETAILS;
import com.sc.utils.goodobject.GOODSJSON;
import com.sc.utils.goodobject.ORDER;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * Created by valora on 2017/5/13.
 */
@Service
public class UserDoMainService {

    private final UserDoMainDao userDoMainDao;

    private final JWT jwt;

    @Autowired
    public UserDoMainService(UserDoMainDao userDoMainDao, JWT jwt) {
        this.userDoMainDao = userDoMainDao;
        this.jwt = jwt;
    }

    /**
     * 提交订单
     *
     * @param userId    用户ID
     * @param goodslist 订单列表
     * @return Result
     */
    @Transactional
    public Result submitOrder(String userId, GOODSJSON goodslist) {
        String orderids = "";
        Double moneysum = 0.0;
        LocalDate time = LocalDate.now();
        String rad = GetRandomNumber.genRandomNum(4);
        int kn = goodslist.getORDERS().size();
        try {
            for (ORDER order : goodslist.getORDERS()) {
                String orderid = time.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + rad;
                orderids = orderid + "|";
                int ordercount = 0;
                Double ordermoney = 0.0;
                String sellerid = "";
                String orderdetailsids = "";
                String detailsid = "";
                for (GOODS goods : order.getGOODLIST()) {
                    int count = 0;
                    Goods gd = userDoMainDao.getGoodByGoodId(goods.getGOODSID());
                    List<GooddetailsWithBLOBs> cmOther = userDoMainDao.getGoodsDetails(gd.getCmGoodsid());
                    if (Objects.equals(sellerid, "")) {
                        sellerid = gd.getCmSellerid();
                    } else if (!Objects.equals(sellerid, gd.getCmSellerid())) {
                        return GetResult.toJson(12, null, jwt.createJWT(userId), null, 0);
                    }
                    User user = userDoMainDao.getUserByUserId(userId);
                    if (user != null) {
                        for (TBUSERS tbusers : user.getTbUsers()) {
                            List<Order> orders = userDoMainDao.getOrderState(gd.getCmGoodsid(), tbusers.getCmUserid());
                            for (Order order1 : orders) {
                                if (Integer.parseInt(order1.getCmState()) != 0 && Integer.parseInt(order1.getCmState()) != 1) {
                                    return GetResult.toJson(18, null, jwt.createJWT(userId), null, 0);
                                }
                            }
                        }

                        if (goodslist.getINTEGRAL() > 0) {
                            if (user.getCmIntegral() < goodslist.getINTEGRAL()) {
                                return GetResult.toJson(34, null, jwt.createJWT(userId), null, 0);
                            }
                        }
                        if (goodslist.getBALANCE() > 0) {
                            if (user.getCmBalance() < goodslist.getBALANCE()) {
                                return GetResult.toJson(57, null, jwt.createJWT(userId), null, 0);
                            }
                        }
                    }

                    StringBuilder specnumdetails = new StringBuilder();
                    for (GOODSDETAILS details : goods.getGOODDETAILS()) {
                        StringBuilder icc = new StringBuilder();
                        int k = 0;
                        List<GooddetailsWithBLOBs> dts = cmOther.parallelStream().
                                filter(t -> Objects.equals(t.getCmGoodsdetailsid(), details.getGOODSDETAILSID())).
                                collect(toList());
                        GooddetailsWithBLOBs dt = dts.isEmpty() ? null : dts.get(0);
                        if (dt == null) {
                            return GetResult.toJson(12, null, jwt.createJWT(userId), null, 0);
                        }
                        String[] arr1 = dt.getCmSpecStock().split("|"); //库存
                        String[] arr2 = details.getSPEC_NUMBER().split("|"); //购买
                        int n = arr1.length - 1;
                        int m = arr2.length - 1;
                        if (n != m) {
                            return GetResult.toJson(12, null, jwt.createJWT(userId), null, 0);
                        }
                        for (int i = 0; i < n; i++) {
                            String[] ls1 = arr1[i].split("_");//库存
                            String[] ls2 = arr2[i].split("_");//购买
                            if (!Objects.equals(ls1[0], ls2[0])) {
                                return GetResult.toJson(13, null, jwt.createJWT(userId), null, 0);
                            }
                            try {
                                k = Integer.parseInt(ls2[1]);
                            } catch (Exception ex) {
                                return GetResult.toJson(14, null, jwt.createJWT(userId), null, 0);
                            }
                            int ct = Integer.parseInt(ls1[1]) - k;
                            if (ct < 0) {
                                return GetResult.toJson(15, null, jwt.createJWT(userId), dt, 0);
                            }
                            icc.append(ls1[0]).append("_").append(ct).append("|");
                            count += k;
                        }
                        //更新库存
                        userDoMainDao.updateSpecStock(icc.toString(), dt.getCmGoodsdetailsid());
                        specnumdetails.append(details.getSPEC_NUMBER()).append("^").append(dt.getCmColor()).append("#");
                    }
                    detailsid = time.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + GetRandomNumber.genRandomNum(4);
                    OrderdetailsWithBLOBs orderdetails = new OrderdetailsWithBLOBs();
                    orderdetails.setCmOrderdetailsid(detailsid);
                    orderdetails.setCmOrderid(orderid);
                    orderdetails.setCmGoodsid(goods.getGOODSID());
                    orderdetails.setCmUserid(userId);
                    orderdetails.setCmSpecnumdetails(specnumdetails.toString());
                    orderdetails.setCmNumber(count);
                    orderdetails.setCmMoney(count * gd.getCmPresentprice());
                    orderdetails.setCmSellerstate(0);
                    orderdetails.setCmSellerid(gd.getCmSellerid());
                    orderdetails.setCmCreatetime(Date.from(time.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                    orderdetails.setCmSellerstate(0);
                    //更新订单详情表
                    userDoMainDao.updateOrderDetails(orderdetails);
                    ordercount += count;
                    ordermoney += count * gd.getCmPresentprice();
                    orderdetailsids += detailsid + "|";
                }
                //更新订单表
                OrdersWithBLOBs orders = new OrdersWithBLOBs();
                orders.setCmOrderid(orderid);
                orders.setCmOrderdetailsids(orderdetailsids);
                orders.setCmUserid(userId);
                orders.setCmNumbersun(ordercount);
                orders.setCmMoneysun(ordermoney);
                orders.setCmCreatetime(Date.from(time.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                orders.setCmState(0);
                orders.setCmUsescore(goodslist.getINTEGRAL() / kn);
                orders.setCmUserbalance(goodslist.getBALANCE() / kn);
                userDoMainDao.updateOrder(orders);
                moneysum += ordermoney;
            }
            BigDecimal icc = BigDecimal.valueOf(goodslist.getINTEGRAL() / 100);
            Double money = moneysum - icc.doubleValue() - goodslist.getBALANCE();
            return GetResult.toJson(0, null, jwt.createJWT(userId), "{orderid:" + orderids + ",balance:" + goodslist.getBALANCE() + ",integral:" + goodslist.getINTEGRAL() + ",integralmoney:" + icc + ",money:" + money + "}", 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询我的所有订单
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return Result
     */
    public Result queryMyOrdersAll(Integer pageNum, Integer pageSize, String userId) {
        try {
            List<MyOrders> myOrders = userDoMainDao.getMyOrdersAll(pageNum, pageSize, userId);
            int i = myOrders.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, myOrders, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询我的未付款订单
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return Result
     */
    public Result queryMyOrderArregrage(Integer pageNum, Integer pageSize, String userId) {
        try {
            List<MyStateOrders> myUnpaiedOrders = userDoMainDao.queryMyOrderArregrage(pageNum, pageSize, userId);
            int i = myUnpaiedOrders.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, myUnpaiedOrders, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询我的待收货订单
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return Result
     */
    public Result queryMyOrderSettlement(Integer pageNum, Integer pageSize, String userId) {
        try {
            List<MyStateOrders> mySettlementOrders = userDoMainDao.queryMyOrderSettlement(pageNum, pageSize, userId);
            int i = mySettlementOrders.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, mySettlementOrders, i);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询订单详情
     *
     * @param orderid 订单ID
     * @return Result
     */
    public Result queryOrderDetails(String orderid) {
        try {
            List<OrderDetails> orderDetails = userDoMainDao.queryOrderDetails(orderid);
            return GetResult.toJson(0, null, null, orderDetails, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除我的订单
     *
     * @param orderid 订单ID
     * @param userId  用户ID
     * @return Result
     */
    @Transactional
    public Result delMyOrder(String orderid, String userId) {
        try {
            Orders orders = userDoMainDao.getOrdersByOrderId(orderid);
            if (orders.getCmState() == 2 || orders.getCmState() == 3) {
                return GetResult.toJson(32, null, jwt.createJWT(userId), null, 0);
            }
            try {
                userDoMainDao.delMyOrder(orderid);
                return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
            } catch (Exception ex) {
                return GetResult.toJson(31, null, null, null, 0);
            }
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 确认收货（根据订单详情）
     *
     * @param orderdetailid 订单详情ID
     * @param userID        用户ID
     * @return Result
     */
    @Transactional
    public Result confirmOrderByDetailid(Long orderdetailid, String userID) {
        try {
            Orderdetails orderdetails = userDoMainDao.getOrderDetails(userID, orderdetailid);
            if (orderdetails.equals(null)) {
                return GetResult.toJson(50, null, jwt.createJWT(userID), null, 0);
            }
            boolean isssend = true;
            String orderid = "";
            List<OrderdetailsWithBLOBs> orderdetailsWithBLOBs = userDoMainDao.getOrderDetails(orderdetailid);
            for (OrderdetailsWithBLOBs order : orderdetailsWithBLOBs) {
                if (order.getCmOrderdetailsid().equals(orderdetailid.toString())) {
                    orderid = order.getCmOrderid();
                    userDoMainDao.updateOrderDetailByDetailid(orderdetailid.toString());
                    if (orderdetailsWithBLOBs.size() == 1) {
                        userDoMainDao.updateOrderByOrderid(orderid);
                    }
                } else {
                    if (order.getCmSellerstate() != 4) {
                        isssend = false;
                    }
                }
            }
            if (isssend) {
                userDoMainDao.updateOrderByOrderid(orderid);
            }
            return GetResult.toJson(0, null, jwt.createJWT(userID), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 确认收货（根据订单）
     *
     * @param orderid 订单ID
     * @param userId  用户ID
     * @return Result
     */
    @Transactional
    public Result confirmOrderByOrderid(String orderid, String userId) {
        try {
            List<OrdersWithBLOBs> orders = userDoMainDao.getOrdersByOrderIdAndUserId(orderid, userId);
            if (orders.isEmpty()) {
                return GetResult.toJson(50, null, jwt.createJWT(userId), null, 0);
            }
            userDoMainDao.updateOrderByOrderid(orderid);
            userDoMainDao.updateOrderDetailsByOrderid(orderid);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception ex) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询我的可售后服务的商品
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return Result
     */
    public Result queryMyCanAfterServiceS(Integer pageNum, Integer pageSize, String userId) {
        try {
            List<OdersAndOrderdetails> list = userDoMainDao.queryMyCanAfterServiceD(userId);
            PageHelper.startPage(pageNum, pageSize);
            int i = list.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, jwt.createJWT(userId), list, i);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询我的售后服务单(退/换/返修)
     *
     * @param pageNum  页码
     * @param pageSize 页码大小
     * @param userId   用户id
     * @return result
     */
    public Result queryMyAfterServiceS(Integer pageNum, Integer pageSize, String userId) {
        try {
            List<AfsAndOdtAndGoodsAndSellers> list = userDoMainDao.queryMyAfterServiceD(userId);
            PageHelper.startPage(pageNum, pageSize);
            int i = list.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, jwt.createJWT(userId), list, i);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 填写售后发货信息
     *
     * @param userId         用户id
     * @param afierserviceid 售后服务id
     * @param logisticsid    物流id
     * @param logisticsnum   物流单号
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result sendBackGoodsS(String userId, String afierserviceid, Integer logisticsid, String logisticsnum) {
        try {
            Afterservices afterservices = null;
            List<Afterservices> list = userDoMainDao.selectAfterserviceByAfterserviceid(afierserviceid);
            if (list != null && list.size() > 0) {
                afterservices = list.get(0);
            }
            if (afterservices == null) {
                return GetResult.toJson(51, null, jwt.createJWT(userId), null, 0);
            }
            Orderdetails orderdetails = null;
            List<OrderdetailsWithBLOBs> list1 = userDoMainDao.selectOrderdetailsByorderdetailsid(afterservices.getCmOrderdetailsid());
            if (list1 != null && list1.size() > 0) {
                orderdetails = list1.get(0);
            }
            if (orderdetails != null || orderdetails.getCmSellerstate() != 4 || afterservices.getCmState() != 2) {
                return GetResult.toJson(52, null, jwt.createJWT(userId), null, 0);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            afterservices.setCmState(3);
            afterservices.setCmSvid(str);
            ServicedetailsWithBLOBs servicedetails = new ServicedetailsWithBLOBs();
            servicedetails.setCmSvid(str);
            servicedetails.setCmAfterserviceid(afterservices.getCmAfterserviceid());
            servicedetails.setCmCreatetime(date);
            servicedetails.setCmType(3);
            servicedetails.setCmLogisticsid(logisticsid);
            servicedetails.setCmLogisticsnum(logisticsnum);
            userDoMainDao.insertServicedetails(servicedetails);
            userDoMainDao.updateAfterservice(afterservices);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 确认售后服务完成
     *
     * @param userId         用户id
     * @param afterserviceid 服务id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result confirmAfterServiceS(String userId, String afterserviceid) {
        try {
            Afterservices afterservices = null;
            List<Afterservices> list = userDoMainDao.selectAfterserviceByAfterserviceid(afterserviceid);
            if (list != null && list.size() > 0) {
                afterservices = list.get(0);
            }
            if (afterservices == null) {
                return GetResult.toJson(29, null, jwt.createJWT(userId), null, 0);
            }
            Orderdetails orderdetails = new Orderdetails();
            orderdetails.setCmServicestate(0);
            userDoMainDao.updateOrderdetails(afterservices.getCmOrderdetailsid(), orderdetails);

            afterservices.setCmState(9);
            userDoMainDao.updateAfterservice(afterservices);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            ServicedetailsWithBLOBs servicedetails = new ServicedetailsWithBLOBs();
            servicedetails.setCmSvid(str);
            servicedetails.setCmAfterserviceid(afterservices.getCmAfterserviceid());
            servicedetails.setCmCreatetime(date);
            servicedetails.setCmType(9);
            userDoMainDao.insertServicedetails(servicedetails);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 取消售后服务
     *
     * @param userId         用户id
     * @param afterserviceid 服务id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result cancelAfterServiceS(String userId, String afterserviceid) {
        try {
            Afterservices afterservices = null;
            List<Afterservices> list = userDoMainDao.selectAfterserviceByAfterserviceid(afterserviceid);
            if (list != null && list.size() > 0) {
                afterservices = list.get(0);
            }
            if (afterservices == null) {
                return GetResult.toJson(29, null, jwt.createJWT(userId), null, 0);
            }
            Orderdetails orderdetails = new Orderdetails();
            orderdetails.setCmServicestate(0);
            userDoMainDao.updateOrderdetails(afterservices.getCmOrderdetailsid(), orderdetails);

            afterservices.setCmState(0);
            userDoMainDao.updateAfterservice(afterservices);

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HHmmssSSSS");
            Date date = new Date();
            String str = simpleDateFormat.format(date);
            ServicedetailsWithBLOBs servicedetails = new ServicedetailsWithBLOBs();
            servicedetails.setCmSvid(str);
            servicedetails.setCmAfterserviceid(afterservices.getCmAfterserviceid());
            servicedetails.setCmCreatetime(date);
            servicedetails.setCmType(10);
            userDoMainDao.insertServicedetails(servicedetails);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询我的收藏
     *
     * @param userId   用户id
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @return result
     */
    public Result queryMyCollectionS(String userId, Integer pageNum, Integer pageSize) {
        try {
            List<CollectionAndGoods> list = userDoMainDao.queryMyCollectionD(userId);
            PageHelper.startPage(pageNum, pageSize);
            int i = list.size();
            i = (i / pageSize) + ((i % pageSize) > 0 ? 1 : 0);
            return GetResult.toJson(0, null, null, list, i);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 刪除我的收藏
     *
     * @param goodsid 商品id
     * @param userId  用户id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result delMyCollectionS(String goodsid, String userId) {
        try {
            int i = userDoMainDao.delMyCollectionD(goodsid, userId);
            if (i > 0) {
                return GetResult.toJson(0, null, null, null, 0);
            } else {
                return GetResult.toJson(30, null, null, null, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 加入收藏
     *
     * @param goodsid 商品id
     * @param userId  用户id
     * @return result
     */
    public Result joinMyCollectionS(String goodsid, String userId) {
        try {
            int i = userDoMainDao.selectMyCollectionByGoodsidAndUserid(goodsid, userId);
            if (i > 0) {
                return GetResult.toJson(35, null, null, null, 0);
            }
            Collections collections = new Collections();
            collections.setCmGoodsid(goodsid);
            collections.setCmUserid(userId);
            collections.setCmJointime(new Date());
            userDoMainDao.insertCollection(collections);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 增加收货地址
     *
     * @param address 收货地址
     * @param userId  用户id
     * @param name    收货人姓名
     * @param phone   联系人电话
     * @param isfirst 是否设为默认
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result addAddressS(String address, String userId, String name, Long phone, Integer isfirst) {
        try {
            Addresses addresses = null;
            List<Addresses> list = userDoMainDao.selectAddaddressbyuserid(userId);
            if (list != null && list.size() > 0) {
                addresses = list.get(0);
            }
            if (addresses != null) {
                addresses.setCmIsfirst(0);
            }
            Addresses addresses1 = new Addresses();
            addresses1.setCmAddress(address);
            addresses1.setCmName(name);
            addresses1.setCmUserid(userId);
            addresses1.setCmIsfirst(isfirst);
            addresses1.setCmPhone(phone);
            userDoMainDao.insertAddress(addresses1);
            userDoMainDao.updateAddress(addresses);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 删除收货地址
     *
     * @param addressid 地址id
     * @param userId    用户id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result delAdressS(Integer addressid, String userId) {
        try {
            int i = userDoMainDao.delAdressD(addressid);
            return i > 0 ? GetResult.toJson(0, null, jwt.createJWT(userId), null, 0) :
                    GetResult.toJson(200, null, null, null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 设置默认地址
     *
     * @param addressid 地址id
     * @param userId    用户id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result setUpFirstAddressS(Integer addressid, String userId) {
        try {
            int i = userDoMainDao.deleteAddressIsfirst();
            int ii = userDoMainDao.addAddressIsfirst(addressid);
            return GetResult.toJson(0, null, jwt.createJWT(userId), null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 根据用户id查询用户信息
     *
     * @param userId 用户id
     * @return result
     */
    public Result queryMyInformationS(String userId) {
        try {
            Users users = null;
            List<Users> list = userDoMainDao.selectUserByuserid(userId);
            if (list != null && list.size() > 0) {
                users = list.get(0);
            }
            return GetResult.toJson(0, null, jwt.createJWT(userId), users, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 用户修改密码（商家）
     *
     * @param oldpassword 旧密码
     * @param newpassword 新密码
     * @param userId      用户id
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result modifyPasswordS(String oldpassword, String newpassword, String userId) {
        try {
            Users users = userDoMainDao.selectUserByuserid(userId).get(0);
            if (!oldpassword.equals(users.getCmPassword())) {
                return GetResult.toJson(41, null, null, null, 0);
            }
            users.setCmPassword(newpassword);
            userDoMainDao.updateUsersPassword(users);
            return GetResult.toJson(0, null, jwt.createJWT(userId), users, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 发送验证码
     *
     * @param phone 手机号码
     * @param type  类型
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result sendRetrieveCodeS(Long phone, int type) {
        try {
            Register register = null;
            List<Register> list = userDoMainDao.selectRegisterByPhone(phone);
            if (list != null && list.size() > 0) {
                register = list.get(0);
            }
            int code = Integer.valueOf(GetRandomNumber.genRandomNum(4));
            Date date = new Date();
            if (SendCode.sendCode(phone.toString(), code, 4)) {
                if (register == null) {
                    register.setCmCode(code);
                    register.setCmPhone(phone);
                    register.setCmTime(date);
                    register.setCmCount(0);
                    userDoMainDao.insertRegister(register);
                } else {
                    register.setCmCount(0);
                    register.setCmTime(date);
                    register.setCmCount(code);
                    userDoMainDao.updateRegister(register);
                }
                return GetResult.toJson(0, null, null, null, 0);
            } else {
                return GetResult.toJson(2, null, null, null, 0);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 设置新密码（找回密码）（商家）
     *
     * @param phone       手机号码
     * @param code        验证码
     * @param newpassword 新密码
     * @return result
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public Result resettingPassword(Long phone, Integer code, String newpassword) {
        try {
            Register register = null;
            List<Register> list = userDoMainDao.selectRegisterByPhone(phone);
            if (list != null && list.size() > 0) {
                register = list.get(0);
            }
            if (register == null || register.getCmCode() != code) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            Users users = userDoMainDao.selectUserByPhone(phone);
            users.setCmPassword(newpassword);
            userDoMainDao.updateUsersPassword(users);
            return GetResult.toJson(0, null, null, null, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 找回账号
     *
     * @param phone 手机号码
     * @param code  验证码
     * @return result
     */
    public Result BackAccountS(Long phone, Integer code) {
        try {
            Register register = null;
            List<Register> list = userDoMainDao.selectRegisterByPhone(phone);
            if (list != null && list.size() > 0) {
                register = list.get(0);
            }
            if (register == null || register.getCmCode() != code) {
                return GetResult.toJson(8, null, null, null, 0);
            }
            Users users = userDoMainDao.selectUserByPhone(phone);
            return GetResult.toJson(0, null, null, users.getCmAccount(), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询物流信息
     *
     * @param orderdetailid 订单详情id
     * @return result
     */
    public Result queryLogisticsInfoOneS(String orderdetailid) {
        try {
            OrderdetailsWithBLOBs orderdetailsWithBLOBs = userDoMainDao.selectOrderdetailsByorderdetailsid(orderdetailid).get(0);
            String info = orderdetailsWithBLOBs.getCmLogisticsinfo();
            if (StringUtils.isNotEmpty(info)) {
                return GetResult.toJson(0, null, null, info, 0);
            } else {
                String number = orderdetailsWithBLOBs.getCmLogisticsnum();
                HttpResponse json = QueryLogistics.query(number);
                System.out.println(json);
                if (json != null) {
                    orderdetailsWithBLOBs.setCmLogisticsinfo(json.toString());
                    orderdetailsWithBLOBs.setCmSellerstate(4);
                    userDoMainDao.updateOrderDetails(orderdetailsWithBLOBs);
                }
                return GetResult.toJson(0, null, null, json, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询物流信息
     *
     * @param afterserviceid 售后服务id
     * @return
     */
    public Result queryLogisticsInfoTwoS(String afterserviceid) {
        try {
            Afterservices afterservices = userDoMainDao.selectAfterserviceByAfterserviceid(afterserviceid).get(0);
            if (afterservices == null || afterservices.getCmSvid() == null) {
                return GetResult.toJson(51, null, null, null, 0);
            }
            ServicedetailsWithBLOBs servicedetailsWithBLOBs = userDoMainDao.selectServicedetailsBySvid(afterservices.getCmSvid());
            String str = servicedetailsWithBLOBs.getCmLogisticsinfo();
            if (StringUtils.isNotEmpty(str)) {
                return GetResult.toJson(0, null, null, str, 0);
            } else {
                String number = servicedetailsWithBLOBs.getCmLogisticsnum();
                HttpResponse json = QueryLogistics.query(number);
                if (json != null) {
                    servicedetailsWithBLOBs.setCmLogisticsinfo(json.toString());
                }
                userDoMainDao.updateServicedetails(servicedetailsWithBLOBs);
                return GetResult.toJson(0, null, null, json, 0);
            }
        } catch (Exception e) {
            return GetResult.toJson(200, null, null, null, 0);
        }
    }

    /**
     * 查询物流信息
     *
     * @param servicedetailsid 服务详情id
     * @return
     */
    public Result queryLogisticsInfoThreeS(String servicedetailsid) {
        try {
            ServicedetailsWithBLOBs servicedetailsWithBLOBs = userDoMainDao.selectServicedetailsBySvid(servicedetailsid);
            if (servicedetailsWithBLOBs == null) {
                return GetResult.toJson(51, null, null, null, 0);
            }
            String str = servicedetailsWithBLOBs.getCmLogisticsinfo();
            if (StringUtils.isNotEmpty(str)) {
                return GetResult.toJson(0, null, null, str, 0);
            } else {
                String number = servicedetailsWithBLOBs.getCmLogisticsnum();
                HttpResponse json = QueryLogistics.query(number);
                if (json != null) {
                    servicedetailsWithBLOBs.setCmLogisticsinfo(json.toString());
                }
                userDoMainDao.updateServicedetails(servicedetailsWithBLOBs);
                return GetResult.toJson(0, null, null, json, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return GetResult.toJson(200, null, null, null, 0);
        }
    }
}
