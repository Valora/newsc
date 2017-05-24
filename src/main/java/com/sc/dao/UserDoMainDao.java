package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.*;
import com.sc.domain.userdomain.MyOrders;
import com.sc.domain.userdomain.MyStateOrders;
import com.sc.domain.userdomain.Order;
import com.sc.domain.userdomain.OrderDetails;
import com.sc.domain.userdomain.TBUSERS;
import com.sc.domain.userdomain.User;
import com.sc.mapper.generator.GooddetailsMapper;
import com.sc.mapper.generator.GoodsMapper;
import com.sc.mapper.generator.OrderdetailsMapper;
import com.sc.mapper.generator.OrdersMapper;
import com.sc.mapper.generator.UsersMapper;
import com.sc.mapper.userdomain.UserDoMainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 店家操作类
 * Created by valora on 2017/5/13.
 */
@Component
public class UserDoMainDao {

    private final GoodsMapper goodsMapper;

    private final GooddetailsMapper gooddetailsMapper;

    private final UsersMapper usersMapper;

    private final UserDoMainMapper userDoMainMapper;

    private final OrderdetailsMapper orderdetailsMapper;

    private final OrdersMapper ordersMapper;

    @Autowired
    public UserDoMainDao(GoodsMapper goodsMapper, GooddetailsMapper gooddetailsMapper, UsersMapper usersMapper, UserDoMainMapper userDoMainMapper, OrderdetailsMapper orderdetailsMapper, OrdersMapper ordersMapper) {
        this.goodsMapper = goodsMapper;
        this.gooddetailsMapper = gooddetailsMapper;
        this.usersMapper = usersMapper;
        this.userDoMainMapper = userDoMainMapper;
        this.orderdetailsMapper = orderdetailsMapper;
        this.ordersMapper = ordersMapper;
    }

    /**
     * 获得商品
     * @param goodsid 商品ID
     * @return 商品
     */
    public Goods getGoodByGoodId(String goodsid) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCmGoodsidEqualTo(goodsid);
        return goodsMapper.selectByExample(goodsExample).get(0);
    }

    /**
     * 获得商品详情
     * @param cmGoodsid 商品ID
     * @return 商品详情
     */
    public List<GooddetailsWithBLOBs> getGoodsDetails(String cmGoodsid) {
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCmGoodsidEqualTo(cmGoodsid);
        return gooddetailsMapper.selectByExampleWithBLOBs(gooddetailsExample);
    }

    /**
     * 获得用户列表
     * @param userId 用户ID
     * @return 用户列表
     */
    public User getUserByUserId(String userId) {
        User user = new User();
        //User
        UsersExample usersExample1 = new UsersExample();
        UsersExample.Criteria criteria1 = usersExample1.createCriteria();
        criteria1.andCmUseridEqualTo(userId);
        List<Users> users1 = usersMapper.selectByExample(usersExample1);
        Users user1 = users1 == null ? null : users1.get(0);

        //TBUSERS
        UsersExample usersExample2 = new UsersExample();
        UsersExample.Criteria criteria2 = usersExample2.createCriteria();
        criteria2.andCmUseridNotEqualTo(userId);
        criteria2.andCmShoplonGreaterThan(user.getCmShoplon() - 0.01);
        criteria2.andCmShoplonLessThan(user.getCmShoplon() + 0.01);
        criteria2.andCmShoplatGreaterThan(user.getCmShoplat() - 0.01);
        criteria2.andCmShoplonLessThan(user.getCmShoplat() + 0.01);
        List<Users> users2 = usersMapper.selectByExample(usersExample2);
        List<TBUSERS> tbusers = new ArrayList<>();
        for (Users users : users2) {
            TBUSERS tb_users = new TBUSERS();
            tb_users.setCmUserid(users.getCmUserid());
            tbusers.add(tb_users);
        }
        
        //change to user
        user.setCmUserid(user1.getCmUserid());
        user.setCmShoplon(user1.getCmShoplon());
        user.setCmShoplat(user1.getCmShoplat());
        user.setCmBalance(user1.getCmBalance());
        user.setCmIntegral(user1.getCmIntegral());
        user.setTbUsers(tbusers);

        return user;
    }

    /**
     * 查询商品状态用
     * @param cmGoodsid 商品ID
     * @param cmUserid 商家ID
     * @return Order
     */
    public List<Order> getOrderState(String cmGoodsid, String cmUserid) {
        return userDoMainMapper.getOrderState(cmGoodsid, cmUserid);
    }

    /**
     * 更新库存
     * @param icc 库存信息
     * @param cmGoodsdetailsid 商品详细ID
     */
    public void updateSpecStock(String icc, Integer cmGoodsdetailsid) {
        GooddetailsWithBLOBs gooddetails = new GooddetailsWithBLOBs();
        gooddetails.setCmSpecStock(icc);
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCmGoodsdetailsidEqualTo(cmGoodsdetailsid);
        gooddetailsMapper.updateByExampleWithBLOBs(gooddetails, gooddetailsExample);
    }

    /**
     * 更新订单详情表
     * @param orderdetails 订单详情
     */
    public void updateOrderDetails(OrderdetailsWithBLOBs orderdetails) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        orderdetailsMapper.updateByExample(orderdetails, orderdetailsExample);
    }

    /**
     * 更新订单表
     * @param orders 订单
     */
    public void updateOrder(OrdersWithBLOBs orders) {
        OrdersExample ordersExample = new OrdersExample();
        ordersMapper.updateByExampleWithBLOBs(orders, ordersExample);
    }

    /**
     * 查询订单详情
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @param userId 用户ID
     * @return 订单列表
     */
    public List<MyOrders> getMyOrdersAll(Integer pageNum, Integer pageSize, String userId) {
        PageHelper.startPage(pageNum, pageSize);
        return userDoMainMapper.getMyOrdersAll(userId);
    }

    /**
     * 查询我的未付款订单
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @param userId 用户ID
     * @return 未付款订单
     */
    public List<MyStateOrders> queryMyOrderArregrage(Integer pageNum, Integer pageSize, String userId) {
        PageHelper.startPage(pageNum, pageSize);
        return userDoMainMapper.getUnpaiedOrders(userId);
    }

    /**
     * 查询我的待收货订单
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @param userId 用户ID
     * @return 待收货订单
     */
    public List<MyStateOrders> queryMyOrderSettlement(Integer pageNum, Integer pageSize, String userId) {
        PageHelper.startPage(pageNum, pageSize);
        return userDoMainMapper.getSettlementOrders(userId);
    }

    /**
     * 查询订单详情
     * @param orderid 订单ID
     * @return 订单详情
     */
    public List<OrderDetails> queryOrderDetails(String orderid) {
        return userDoMainMapper.queryOrderDetails(orderid);
    }

    /**
     * 获取订单
     * @param orderid
     * @return
     */
    public Orders getOrdersByOrderId(String orderid) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andCmOrderidEqualTo(orderid);
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        return orders.size() > 0 ? orders.get(0) : null;
    }

    /**
     * 删除订单
     * @param orderid 订单ID
     */
    public void delMyOrder(String orderid) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andCmOrderidEqualTo(orderid);
        ordersMapper.deleteByExample(ordersExample);
    }

    /**
     * 获取订单详情
     * @param userID 用户ID
     * @param orderdetailid 订单详情ID
     * @return 订单详情
     */
    public Orderdetails getOrderDetails(String userID, Long orderdetailid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCmUseridEqualTo(userID);
        criteria.andCmOrderdetailsidEqualTo(orderdetailid.toString());
        List<Orderdetails> orderdetails = orderdetailsMapper.selectByExample(orderdetailsExample);
        return orderdetails.size() > 0 ? orderdetails.get(0) : null;
    }

    /**
     * 获取订单详情
     * @param orderdetailid
     * @return 
     */
    public List<OrderdetailsWithBLOBs> getOrderDetails(Long orderdetailid) {
        List<OrderdetailsWithBLOBs> orderdetails = userDoMainMapper.getOrderDetails(orderdetailid);
        return orderdetails;
    }

    /**
     * 确认收货
     * @param orderdetailid 订单详情ID
     */
    public void updateOrderDetailByDetailid(String orderdetailid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCmOrderidEqualTo(orderdetailid);
        OrderdetailsWithBLOBs orderdetails = new OrderdetailsWithBLOBs();
        orderdetails.setCmSellerstate(4);
        orderdetailsMapper.updateByExampleWithBLOBs(orderdetails, orderdetailsExample);
    }

    /**
     * 确认收货
     * @param orderid 订单ID
     */
    public void updateOrderByOrderid(String orderid) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        Orders orders = new Orders();
        orders.setCmState(4);
        criteria.andCmOrderidEqualTo(orderid);
        ordersMapper.updateByExample(orders, ordersExample);
    }

    /**
     * 根据订单ID获得订单
     * @param orderid 订单ID
     * @param userId 用户ID
     * @return 订单
     */
    public List<OrdersWithBLOBs> getOrdersByOrderIdAndUserId(String orderid, String userId) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andCmOrderidEqualTo(orderid);
        criteria.andCmUseridEqualTo(userId);
        return ordersMapper.selectByExampleWithBLOBs(ordersExample);
    }

    /**
     * 确认收货
     * @param orderid 订单ID
     */
    public void updateOrderDetailsByOrderid(String orderid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        Orderdetails orderdetails = new Orderdetails();
        orderdetails.setCmSellerstate(4);
        criteria.andCmOrderdetailsidEqualTo(orderid);
        orderdetailsMapper.updateByExample(orderdetails, orderdetailsExample);
    }
}
