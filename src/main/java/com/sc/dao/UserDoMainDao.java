package com.sc.dao;

import com.github.pagehelper.PageHelper;
import com.sc.domain.generator.*;
import com.sc.domain.userdomain.*;
import com.sc.mapper.generator.*;
import com.sc.mapper.userdomain.UserDoMainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        criteria.andCM_GOODSIDEqualTo(goodsid);
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        return goods.size() == 0 ? null : goods.get(0);
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
        criteria.andCM_GOODSIDEqualTo(cmGoodsid);
        List<GooddetailsWithBLOBs> gooddetailsWithBLOBs = gooddetailsMapper.selectByExampleWithBLOBs(gooddetailsExample);
        return gooddetailsWithBLOBs.size() == 0 ? null : gooddetailsWithBLOBs;
    }

    /**
     * 获得用户列表
     *
     * @param userId 用户ID
     * @return 用户列表
     */
    public User getUserByUserId(String userId) {
        return userDoMainMapper.getUserByUserId(userId);
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
        gooddetails.setCM_SPEC_STOCK(icc);
        GooddetailsExample gooddetailsExample = new GooddetailsExample();
        GooddetailsExample.Criteria criteria = gooddetailsExample.createCriteria();
        criteria.andCM_GOODSDETAILSIDEqualTo(cmGoodsdetailsid);
        gooddetailsMapper.updateByExampleSelective(gooddetails, gooddetailsExample);
    }

    /**
     * 更新订单详情表
     *
     * @param orderdetails 订单详情
     */
    public void updateOrderDetails(OrderdetailsWithBLOBs orderdetails) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCM_ORDERDETAILSIDEqualTo(orderdetails.getCM_ORDERDETAILSID());
        orderdetailsMapper.updateByExampleSelective(orderdetails, orderdetailsExample);
    }

    /**
     * 更新订单表
     *
     * @param orders 订单
     */
    public void addOrder(OrdersWithBLOBs orders) {
        ordersMapper.insert(orders);
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
        criteria.andCM_ORDERIDEqualTo(orderid);
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
        criteria.andCM_ORDERIDEqualTo(orderid);
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
        criteria.andCM_USERIDEqualTo(userID);
        criteria.andCM_ORDERDETAILSIDEqualTo(orderdetailid.toString());
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
        criteria.andCM_ORDERIDEqualTo(orderdetailid);
        OrderdetailsWithBLOBs orderdetails = new OrderdetailsWithBLOBs();
        orderdetails.setCM_SELLERSTATE(4);
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
        orders.setCM_STATE(4);
        criteria.andCM_ORDERIDEqualTo(orderid);
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
        criteria.andCM_ORDERIDEqualTo(orderid);
        criteria.andCM_USERIDEqualTo(userId);
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
        orderdetails.setCM_SELLERSTATE(4);
        criteria.andCM_ORDERDETAILSIDEqualTo(orderid);
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
        criteria.andCM_AFTERSERVICEIDEqualTo(afierserviceid);
        return afterservicesMapper.selectByExample(afterservicesExample);
    }

    /**
     * 根据Orderdetailsid查询Orderdetails集合
     *
     * @param cmOrderdetailsid Orderdetailsid
     * @return Orderdetails集合
     */
    public List<OrderdetailsWithBLOBs> selectOrderdetailsByorderdetailsid(String cmOrderdetailsid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCM_ORDERDETAILSIDEqualTo(cmOrderdetailsid);
        return orderdetailsMapper.selectByExampleWithBLOBs(orderdetailsExample);
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
        criteria.andCM_AFTERSERVICEIDEqualTo(afterservices.getCM_AFTERSERVICEID());
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
        criteria.andCM_ORDERIDEqualTo(cmOrderdetailsid);
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
        criteria.andCM_USERIDEqualTo(userId);
        criteria.andCM_GOODSIDEqualTo(goodsid);
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
        criteria.andCM_USERIDEqualTo(userId);
        criteria.andCM_GOODSIDEqualTo(goodsid);
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
        criteria.andCM_USERIDEqualTo(userId);
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
        criteria.andCM_ADDRESSIDEqualTo(addresses.getCM_ADDRESSID());
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
        criteria.andCM_ADDRESSIDEqualTo(addressid);
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
        criteria.andCM_USERIDEqualTo(userId);
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
        criteria.andCM_USERIDEqualTo(users.getCM_USERID());
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
        criteria.andCM_PHONEEqualTo(phone);
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
        criteria.andCM_PHONEEqualTo(register.getCM_PHONE());
        registerMapper.updateByExampleSelective(register, registerExample);
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
        criteria.andCM_PHONEEqualTo(phone);
        return usersMapper.selectByExample(usersExample).get(0);
    }

    /**
     * 根据svic查询servicedetails对象
     *
     * @param cmSvid svic
     * @return servicedetails对象
     */
    public ServicedetailsWithBLOBs selectServicedetailsBySvid(String cmSvid) {
        ServicedetailsExample servicedetailsExample = new ServicedetailsExample();
        ServicedetailsExample.Criteria criteria = servicedetailsExample.createCriteria();
        criteria.andCM_SVIDEqualTo(cmSvid);
        return servicedetailsMapper.selectByExampleWithBLOBs(servicedetailsExample).get(0);
    }

    /**
     * 更新servicedetails表
     *
     * @param servicedetailsWithBLOBs 需要更新的对象
     */
    public void updateServicedetails(ServicedetailsWithBLOBs servicedetailsWithBLOBs) {
        ServicedetailsExample servicedetailsExample = new ServicedetailsExample();
        ServicedetailsExample.Criteria criteria = servicedetailsExample.createCriteria();
        criteria.andCM_SVIDEqualTo(servicedetailsWithBLOBs.getCM_SVID());
        servicedetailsMapper.updateByExampleWithBLOBs(servicedetailsWithBLOBs, servicedetailsExample);
    }

    /**
     * 售后信息用
     *
     * @param orderdetailsid
     * @return
     */
    public OrderInfo getOrderInfo(String orderdetailsid) {
        return userDoMainMapper.getOrderInfo(orderdetailsid);
    }

    /**
     * 更新订单详情表
     *
     * @param orderdetailsid
     */
    public void updateAfterService(String orderdetailsid) {
        userDoMainMapper.updateAfterService(orderdetailsid);
    }

    /**
     * 增加售后信息
     *
     * @param afterservices
     */
    public void addAfterService(Afterservices afterservices) {
        afterservicesMapper.insert(afterservices);
    }

    /**
     * 增加售后详情
     *
     * @param servicedetails
     */
    public void addAfterServiceDetail(Servicedetails servicedetails) {
        servicedetailsMapper.insert((ServicedetailsWithBLOBs) servicedetails);
    }

    /**
     * 增加订单详情
     * @param orderdetails
     */
    public void addOrderDetails(OrderdetailsWithBLOBs orderdetails) {
        orderdetailsMapper.insert(orderdetails);
    }
}
