package com.sc.service;

import com.sc.dao.UserDoMainDao;
import com.sc.domain.generator.GooddetailsWithBLOBs;
import com.sc.domain.generator.Goods;
import com.sc.domain.generator.Orderdetails;
import com.sc.domain.generator.OrderdetailsWithBLOBs;
import com.sc.domain.generator.Orders;
import com.sc.domain.generator.OrdersWithBLOBs;
import com.sc.domain.userdomain.MyOrders;
import com.sc.domain.userdomain.MyStateOrders;
import com.sc.domain.userdomain.Order;
import com.sc.domain.userdomain.OrderDetails;
import com.sc.domain.userdomain.TBUSERS;
import com.sc.domain.userdomain.User;
import com.sc.utils.GetRandomNumber;
import com.sc.utils.GetResult;
import com.sc.utils.JWT;
import com.sc.utils.Result;
import com.sc.utils.goodobject.GOODS;
import com.sc.utils.goodobject.GOODSDETAILS;
import com.sc.utils.goodobject.GOODSJSON;
import com.sc.utils.goodobject.ORDER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @param userId 用户ID
     * @return Result
     */
    public Result queryMyCanAfterService(Integer pageNum, Integer pageSize, String userId) {
        return null;
    }
}
