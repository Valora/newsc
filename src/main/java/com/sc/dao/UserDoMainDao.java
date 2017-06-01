package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.*;
import com.sc.domain.userdomain.*;
import com.sc.mapper.generator.*;
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
    private final AfterservicesMapper afterservicesMapper;
    private final ServicedetailsMapper servicedetailsMapper;
    private final CollectionsMapper collectionsMapper;
    private final AddressesMapper addressesMapper;
    private final RegisterMapper registerMapper;

    @Autowired
    public UserDoMainDao(GoodsMapper goodsMapper, GooddetailsMapper gooddetailsMapper, UsersMapper usersMapper, UserDoMainMapper userDoMainMapper, OrderdetailsMapper orderdetailsMapper, OrdersMapper ordersMapper, AfterservicesMapper afterservicesMapper, ServicedetailsMapper servicedetailsMapper, CollectionsMapper collectionsMapper, AddressesMapper addressesMapper, RegisterMapper registerMapper) {
        this.goodsMapper = goodsMapper;
        this.gooddetailsMapper = gooddetailsMapper;
        this.usersMapper = usersMapper;
        this.userDoMainMapper = userDoMainMapper;
        this.orderdetailsMapper = orderdetailsMapper;
        this.ordersMapper = ordersMapper;
        this.afterservicesMapper = afterservicesMapper;
        this.servicedetailsMapper = servicedetailsMapper;
        this.collectionsMapper = collectionsMapper;
        this.addressesMapper = addressesMapper;
        this.registerMapper = registerMapper;
    }

    /**
     * 获得商品
     *
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
     *
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
     *
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
     *
     * @param cmGoodsid 商品ID
     * @param cmUserid  商家ID
     * @return Order
     */
    public List<Order> getOrderState(String cmGoodsid, String cmUserid) {
        return userDoMainMapper.getOrderState(cmGoodsid, cmUserid);
    }

    /**
     * 更新库存
     *
     * @param icc              库存信息
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
     *
     * @param orderdetails 订单详情
     */
    public void updateOrderDetails(OrderdetailsWithBLOBs orderdetails) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        orderdetailsMapper.updateByExample(orderdetails, orderdetailsExample);
    }

    /**
     * 更新订单表
     *
     * @param orders 订单
     */
    public void updateOrder(OrdersWithBLOBs orders) {
        OrdersExample ordersExample = new OrdersExample();
        ordersMapper.updateByExampleWithBLOBs(orders, ordersExample);
    }

    /**
     * 查询订单详情
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return 订单列表
     */
    public List<MyOrders> getMyOrdersAll(Integer pageNum, Integer pageSize, String userId) {
        PageHelper.startPage(pageNum, pageSize);
        return userDoMainMapper.getMyOrdersAll(userId);
    }

    /**
     * 查询我的未付款订单
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return 未付款订单
     */
    public List<MyStateOrders> queryMyOrderArregrage(Integer pageNum, Integer pageSize, String userId) {
        PageHelper.startPage(pageNum, pageSize);
        return userDoMainMapper.getUnpaiedOrders(userId);
    }

    /**
     * 查询我的待收货订单
     *
     * @param pageNum  页码
     * @param pageSize 页面大小
     * @param userId   用户ID
     * @return 待收货订单
     */
    public List<MyStateOrders> queryMyOrderSettlement(Integer pageNum, Integer pageSize, String userId) {
        PageHelper.startPage(pageNum, pageSize);
        return userDoMainMapper.getSettlementOrders(userId);
    }

    /**
     * 查询订单详情
     *
     * @param orderid 订单ID
     * @return 订单详情
     */
    public List<OrderDetails> queryOrderDetails(String orderid) {
        return userDoMainMapper.queryOrderDetails(orderid);
    }

    /**
     * 获取订单
     *
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
     *
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
     *
     * @param userID        用户ID
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
     *
     * @param orderdetailid
     * @return
     */
    public List<OrderdetailsWithBLOBs> getOrderDetails(Long orderdetailid) {
        List<OrderdetailsWithBLOBs> orderdetails = userDoMainMapper.getOrderDetails(orderdetailid);
        return orderdetails;
    }

    /**
     * 确认收货
     *
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
     *
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
     *
     * @param orderid 订单ID
     * @param userId  用户ID
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
     *
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

    /**
     * 查询我的可售后服务的商品
     *
     * @param userId 用户id
     * @return OdersAndOrderdetails集合
     */
    public List<OdersAndOrderdetails> queryMyCanAfterServiceD(String userId) {
        return userDoMainMapper.queryMyCanAfterServiceM(userId);
    }

    /**
     * 查询我的售后服务单(退/换/返修)
     *
     * @param userId 用户id
     * @return result
     */
    public List<AfsAndOdtAndGoodsAndSellers> queryMyAfterServiceD(String userId) {
        return userDoMainMapper.queryMyAfterServiceM(userId);
    }

    /**
     * 根据afterserviceid查询afterservice集合
     *
     * @param afierserviceid Afterservicesid
     * @return Afterservices集合
     */
    public List<Afterservices> selectAfterserviceByAfterserviceid(String afierserviceid) {
        AfterservicesExample afterservicesExample = new AfterservicesExample();
        AfterservicesExample.Criteria criteria = afterservicesExample.createCriteria();
        criteria.andCmAfterserviceidEqualTo(afierserviceid);
        return afterservicesMapper.selectByExample(afterservicesExample);
    }

    /**
     * 根据Orderdetailsid查询Orderdetails集合
     *
     * @param cmOrderdetailsid Orderdetailsid
     * @return Orderdetails集合
     */
    public List<Orderdetails> selectOrderdetailsByorderdetailsid(String cmOrderdetailsid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCmOrderdetailsidEqualTo(cmOrderdetailsid);
        return orderdetailsMapper.selectByExample(orderdetailsExample);
    }

    /**
     * 增加服务详情
     *
     * @param servicedetails 需要增加的服务详情
     */
    public void insertServicedetails(ServicedetailsWithBLOBs servicedetails) {
        servicedetailsMapper.insert(servicedetails);
    }

    /**
     * 更新售后服务
     *
     * @param afterservices 需要更新的售后服务对象
     */
    public void updateAfterservice(Afterservices afterservices) {
        AfterservicesExample afterservicesExample = new AfterservicesExample();
        AfterservicesExample.Criteria criteria = afterservicesExample.createCriteria();
        criteria.andCmAfterserviceidEqualTo(afterservices.getCmAfterserviceid());
        afterservicesMapper.updateByExample(afterservices, afterservicesExample);
    }

    /**
     * 更新orderdetails表
     *
     * @param cmOrderdetailsid orderdetailsid
     */
    public void updateOrderdetails(String cmOrderdetailsid, Orderdetails orderdetails) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCmOrderidEqualTo(cmOrderdetailsid);
        orderdetailsMapper.updateByExample(orderdetails, orderdetailsExample);
    }

    /**
     * 根据用户的id查询用户的收藏
     *
     * @param userId 用户的id
     * @return 用户的收藏集合
     */
    public List<CollectionAndGoods> queryMyCollectionD(String userId) {
        return userDoMainMapper.queryMyCollectionM(userId);
    }

    /**
     * 根据商品id和用户的id删除收藏
     *
     * @param goodsid 商品id
     * @param userId  用户的id
     * @return 删除结果
     */
    public int delMyCollectionD(String goodsid, String userId) {
        CollectionsExample collectionsExample = new CollectionsExample();
        CollectionsExample.Criteria criteria = collectionsExample.createCriteria();
        criteria.andCmUseridEqualTo(userId);
        criteria.andCmGoodsidEqualTo(goodsid);
        return collectionsMapper.deleteByExample(collectionsExample);
    }

    /**
     * 查询用户是否已经有了该收藏
     *
     * @param goodsid 商品的id
     * @param userId  用户的id
     * @return 查询结果
     */
    public int selectMyCollectionByGoodsidAndUserid(String goodsid, String userId) {
        CollectionsExample collectionsExample = new CollectionsExample();
        CollectionsExample.Criteria criteria = collectionsExample.createCriteria();
        criteria.andCmUseridEqualTo(userId);
        criteria.andCmGoodsidEqualTo(goodsid);
        List<Collections> list = collectionsMapper.selectByExample(collectionsExample);
        return list.size();
    }

    /**
     * 增加收藏
     *
     * @param collections 需要收藏的对象
     */
    public void insertCollection(Collections collections) {
        collectionsMapper.insert(collections);
    }

    /**
     * 根据用户di查询新增地址
     *
     * @param userId 用户id
     * @return 新增地址集合
     */
    public List<Addresses> selectAddaddressbyuserid(String userId) {
        AddressesExample addressesExample = new AddressesExample();
        AddressesExample.Criteria criteria = addressesExample.createCriteria();
        criteria.andCmUseridEqualTo(userId);
        return addressesMapper.selectByExample(addressesExample);
    }

    /**
     * 新增Addresses
     *
     * @param addresses1 需要新增的对象
     */
    public void insertAddress(Addresses addresses1) {
        addressesMapper.insert(addresses1);
    }

    /**
     * 修改Address对象
     *
     * @param addresses 需要修改的对象
     */
    public void updateAddress(Addresses addresses) {
        AddressesExample addressesExample = new AddressesExample();
        AddressesExample.Criteria criteria = addressesExample.createCriteria();
        criteria.andCmAddressidEqualTo(addresses.getCmAddressid());
        addressesMapper.updateByExample(addresses, addressesExample);
    }

    /**
     * 删除收货地址
     *
     * @param addressid 地址id
     * @return 是否删除成功
     */
    public int delAdressD(Integer addressid) {
        AddressesExample addressesExample = new AddressesExample();
        AddressesExample.Criteria criteria = addressesExample.createCriteria();
        criteria.andCmAddressidEqualTo(addressid);
        return addressesMapper.deleteByExample(addressesExample);
    }

    /**
     * 将原来默认地址变成不是默认地址
     *
     * @return
     */
    public int deleteAddressIsfirst() {
        return userDoMainMapper.deleteAddressIsfirstM();
    }

    /**
     * 设置为默认地址
     *
     * @param addressid 地址id
     * @return 是否设置成功
     */
    public int addAddressIsfirst(Integer addressid) {
        return userDoMainMapper.addAddressIsfirstM(addressid);
    }

    /**
     * 根据用户id查询用户
     *
     * @param userId 用户id
     * @return 用户的集合
     */
    public List<Users> selectUserByuserid(String userId) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCmUseridEqualTo(userId);
        return usersMapper.selectByExample(usersExample);
    }

    /**
     * 修改用户密码
     *
     * @param users 用户对象
     */
    public void updateUsersPassword(Users users) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCmUseridEqualTo(users.getCmUserid());
        usersMapper.updateByExample(users, usersExample);
    }

    /**
     * 根据手机号码查询注册表
     *
     * @param phone 手机号码
     * @return 注册对象集合
     */
    public List<Register> selectRegisterByPhone(Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCmPhoneEqualTo(phone);
        return registerMapper.selectByExample(registerExample);
    }

    /**
     * 新增注册表
     *
     * @param register 需要新增的注册对象
     */
    public void insertRegister(Register register) {
        registerMapper.insert(register);
    }

    /**
     * 更新注册表
     *
     * @param register 需要更新的对象
     */
    public void updateRegister(Register register) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCmPhoneEqualTo(register.getCmPhone());
        registerMapper.updateByExample(register, registerExample);
    }

    /**
     * 根据手机号码查询用户
     *
     * @param phone 手机号码
     * @return users对象
     */
    public Users selectUserByPhone(Long phone) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCmPhoneEqualTo(phone);
        return usersMapper.selectByExample(usersExample).get(0);
    }
}
