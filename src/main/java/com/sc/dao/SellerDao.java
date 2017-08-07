package com.sc.dao;

import com.sc.domain.generator.*;
import com.sc.domain.seller.AfterserviceAndOdtAndGoodsAndusers;
import com.sc.domain.seller.OrderdetailsWithBLOBAndUsersAndLogisticss;
import com.sc.domain.seller.OrderdetailsWithBLOBandGood;
import com.sc.mapper.generator.AfterservicesMapper;
import com.sc.mapper.generator.GoodsMapper;
import com.sc.mapper.generator.OrderdetailsMapper;
import com.sc.mapper.generator.OrdersMapper;
import com.sc.mapper.generator.RegisterMapper;
import com.sc.mapper.generator.SellersMapper;
import com.sc.mapper.generator.ServicedetailsMapper;
import com.sc.mapper.generator.UsersMapper;
import com.sc.mapper.seller.QueryCustomerServiceMapper;
import com.sc.mapper.seller.QueryMySaleOrderMapper;
import com.sc.mapper.seller.QuerySaleOrderDetailsByOrderdetailsIdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * SellerDao
 * Created by valora on 2017/5/9.
 */
@Component
public class SellerDao {

    private final QueryMySaleOrderMapper queryMySaleOrder;
    private final QuerySaleOrderDetailsByOrderdetailsIdMapper querySaleOrderDetailsByOrderdetailsId;
    private final AfterservicesMapper afterservicesMapper;
    private final OrderdetailsMapper orderdetailsMapper;
    private final ServicedetailsMapper servicedetailsMapper;
    private final OrdersMapper ordersMapper;
    private final UsersMapper usersMapper;
    private final GoodsMapper goodsMapper;
    private final SellersMapper sellersMapper;
    private final RegisterMapper registerMapper;
    private final QueryCustomerServiceMapper queryCustomerServiceM;

    @Autowired
    public SellerDao(QueryMySaleOrderMapper queryMySaleOrder, QuerySaleOrderDetailsByOrderdetailsIdMapper querySaleOrderDetailsByOrderdetailsId, AfterservicesMapper afterservicesMapper, OrderdetailsMapper orderdetailsMapper, ServicedetailsMapper servicedetailsMapper, OrdersMapper ordersMapper, UsersMapper usersMapper, GoodsMapper goodsMapper, SellersMapper sellersMapper, RegisterMapper registerMapper, QueryCustomerServiceMapper queryCustomerServiceM) {
        this.queryMySaleOrder = queryMySaleOrder;
        this.querySaleOrderDetailsByOrderdetailsId = querySaleOrderDetailsByOrderdetailsId;
        this.afterservicesMapper = afterservicesMapper;
        this.orderdetailsMapper = orderdetailsMapper;
        this.servicedetailsMapper = servicedetailsMapper;
        this.ordersMapper = ordersMapper;
        this.usersMapper = usersMapper;
        this.goodsMapper = goodsMapper;
        this.sellersMapper = sellersMapper;
        this.registerMapper = registerMapper;
        this.queryCustomerServiceM = queryCustomerServiceM;
    }

    /**
     * 查询我的销售订单,并进行分页
     *
     * @param sellerid  厂家id
     * @param starttime 开始时间
     * @param endtime   截止时间
     * @return 订单集合
     */
    public List<OrderdetailsWithBLOBandGood> QueryMySaleOrderD1(String sellerid, String starttime, String endtime, Integer orderState) {
        List<OrderdetailsWithBLOBandGood> list = queryMySaleOrder.QueryMySaleOrderM(sellerid, starttime, endtime, orderState);
        return list;
    }

    /**
     * 根据订单id查询订单详情
     *
     * @param orderdetailsid 订单id
     * @return 订单集合
     */
    public OrderdetailsWithBLOBAndUsersAndLogisticss QuerySaleOrderDetailD(String orderdetailsid) {
        List<OrderdetailsWithBLOBAndUsersAndLogisticss> list = querySaleOrderDetailsByOrderdetailsId.QuerySaleOrderDetailM(orderdetailsid);
        return list.size() < 0 ? null : list.get(0);
    }

    /**
     * 查询售后服务
     *
     * @param afierserviceid 售后服务id
     * @return 售后服务对象
     */
    public Afterservices selectafterserviceD(String afierserviceid) {
        AfterservicesExample afterservicesExample = new AfterservicesExample();
        AfterservicesExample.Criteria criteria = afterservicesExample.createCriteria();
        criteria.andCM_AFTERSERVICEIDEqualTo(afierserviceid);
        Afterservices afterservices = new Afterservices();
        List<Afterservices> list = afterservicesMapper.selectByExample(afterservicesExample);
        if (list != null && list.size() > 0) {
            afterservices = list.get(0);
            return afterservices;
        }
        return null;
    }

    /**
     * 根据订单详情id查询订单详情
     *
     * @param cmOrderdetailsid 详情id
     * @return 订单详情对象
     */
    public OrderdetailsWithBLOBs selectordertails(String cmOrderdetailsid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCM_ORDERDETAILSIDEqualTo(cmOrderdetailsid);
        List<OrderdetailsWithBLOBs> list = orderdetailsMapper.selectByExampleWithBLOBs(orderdetailsExample);
        return list.size() < 0 ? null : list.get(0);
    }

    /**
     * 更新售后服务表
     *
     * @param afterservices  需要更新的售后服务表
     * @param afierserviceid 售后服务id
     */
    public void updateAfterservice(Afterservices afterservices, String afierserviceid) {
        AfterservicesExample afterservicesExample = new AfterservicesExample();
        AfterservicesExample.Criteria criteria = afterservicesExample.createCriteria();
        criteria.andCM_AFTERSERVICEIDEqualTo(afierserviceid);
        afterservicesMapper.updateByExampleSelective(afterservices, afterservicesExample);
    }

    /**
     * 更新订单详情表
     *
     * @param orderdetails     需要更新的订单详情表
     * @param cmOrderdetailsid 订单详情的id
     */
    public void updateOrderdetails(OrderdetailsWithBLOBs orderdetails, String cmOrderdetailsid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCM_ORDERDETAILSIDEqualTo(cmOrderdetailsid);
        orderdetailsMapper.updateByExampleSelective(orderdetails, orderdetailsExample);
    }

    /**
     * 新增服务详情
     *
     * @param servicedetailsWithBLOBs 需要增加的服务详情的对象
     */
    public void insertservicedetails(ServicedetailsWithBLOBs servicedetailsWithBLOBs) {
        servicedetailsMapper.insert(servicedetailsWithBLOBs);
    }

    /**
     * 根据orderid查询order
     *
     * @param cmOrderid orderid
     * @return order对象
     */
    public OrdersWithBLOBs selectOrderbyOrderid(String cmOrderid) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andCM_ORDERIDEqualTo(cmOrderid);
        List<OrdersWithBLOBs> list = ordersMapper.selectByExampleWithBLOBs(ordersExample);
        return list.size() < 0 ? null : list.get(0);
    }

    /**
     * 通过orderid查询订单详情集合
     *
     * @param cmOrderid orderid
     * @return 订单详情集合
     */
    public List<Orderdetails> selectOrdertailsByOrderid(String cmOrderid) {
        OrderdetailsExample orderdetailsExample = new OrderdetailsExample();
        OrderdetailsExample.Criteria criteria = orderdetailsExample.createCriteria();
        criteria.andCM_ORDERIDEqualTo(cmOrderid);
        List<Orderdetails> list = orderdetailsMapper.selectByExample(orderdetailsExample);
        return list;
    }

    /**
     * 更新orders表
     *
     * @param orders    需要更新的orders对象
     * @param cmOrderid ordersid
     */
    public void updateOrder(OrdersWithBLOBs orders, String cmOrderid) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andCM_ORDERIDEqualTo(cmOrderid);
        ordersMapper.updateByExampleSelective(orders, ordersExample);
    }

    /**
     * 根据ordcerdetailsid查询users对象
     *
     * @param ordcerdetailsid ordcerdetailsid
     * @return users对象
     */
    public Users selectUsersByOrderdetailsid(String ordcerdetailsid) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andCM_USERIDEqualTo(ordcerdetailsid);
        List<Users> list = usersMapper.selectByExample(usersExample);
        Users users = new Users();
        if (list != null && list.size() > 0) {
            users = list.get(0);
            return users;
        }
        return null;
    }

    /**
     * 根据厂家id查询厂家销售商品
     *
     * @param sellerId 厂家id
     * @return 销售商品集合
     */
    public List<Goods> sellerGoodsBySellerid(String sellerId) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andCM_SELLERIDEqualTo(sellerId);
        goodsExample.setOrderByClause("CM_CREATETIME desc");
        return goodsMapper.selectByExample(goodsExample);
    }

    /**
     * 根据sellerid查询seller对象
     *
     * @param sellerId sellerid
     * @return seller对象
     */
    public Sellers selectSellerBysellerid(String sellerId) {
        SellersExample sellersExample = new SellersExample();
        SellersExample.Criteria criteria = sellersExample.createCriteria();
        criteria.andCM_SELLERIDEqualTo(sellerId);
        List<Sellers> list = sellersMapper.selectByExample(sellersExample);
        Sellers sellers = new Sellers();
        if (list != null && list.size() > 0) {
            sellers = list.get(0);
        }
        return sellers;
    }

    /**
     * 修改密码
     *
     * @param sellers 厂家
     */
    public void updateseller(Sellers sellers) {
        SellersExample sellersExample = new SellersExample();
        SellersExample.Criteria criteria = sellersExample.createCriteria();
        criteria.andCM_SELLERIDEqualTo(sellers.getCM_SELLERID());
        sellersMapper.updateByExampleSelective(sellers, sellersExample);
    }

    /**
     * 根据电话号码查询注册表
     *
     * @param phone 手机号码
     * @return 注册对象
     */
    public Register selectRegisterByPhone(Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        List<Register> list = registerMapper.selectByExample(registerExample);
        Register register = null;
        if (list != null && list.size() > 0) {
            register = list.get(0);
        }
        return register;
    }

    /**
     * 新增
     *
     * @param register 新增注册表
     */
    public void addregister(Register register) {
        registerMapper.insert(register);
    }

    /**
     * 修改注册表
     *
     * @param register 需要修改的注册对象
     * @param phone    需要修改的注册对象的电话号码
     */
    public void updateregister(Register register, Long phone) {
        RegisterExample registerExample = new RegisterExample();
        RegisterExample.Criteria criteria = registerExample.createCriteria();
        criteria.andCM_PHONEEqualTo(phone);
        registerMapper.updateByExampleSelective(register, registerExample);
    }

    /**
     * 根据厂家的手机号码查询厂家对象
     *
     * @param phone 厂家的手机号码
     * @return 厂家对象
     */
    public Sellers selectSellerBysellerPhone(Long phone) {
        SellersExample sellersExample = new SellersExample();
        SellersExample.Criteria criteria = sellersExample.createCriteria();
        criteria.andCM_PASSWORDEqualTo(phone.toString());
        List<Sellers> list = sellersMapper.selectByExample(sellersExample);
        Sellers sellers = new Sellers();
        if (list != null && list.size() > 0) {
            sellers = list.get(0);
        }
        return sellers;
    }

    /**
     * 查询售后（时间必须传）
     *
     * @param sellerId    厂家id
     * @param serverstate 状态
     * @param starttime   开始时间
     * @param endtime     结束时间
     * @return AfterserviceAndOdtAndGoodsAndusers的结果集合
     */
    public List<AfterserviceAndOdtAndGoodsAndusers> queryCustomerServiceD(String sellerId, Integer serverstate, String starttime, String endtime) {
        return queryCustomerServiceM.queryCustomerServiceM(sellerId, serverstate, starttime, endtime);
    }
}
