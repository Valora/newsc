package com.sc.mapper.userdomain;

import com.sc.domain.generator.OrderdetailsWithBLOBs;
import com.sc.domain.userdomain.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * UserDoMainMapper
 * Created by valora on 2017/5/17.
 */
@Mapper
public interface UserDoMainMapper {

    List<Order> getOrderState(@Param("cmGoodsid") String cmGoodsid, @Param("cmUserid") String cmUserid);

    List<MyOrders> getMyOrdersAll(String userId);

    List<MyStateOrders> getUnpaiedOrders(String userId);

    List<MyStateOrders> getSettlementOrders(String userId);

    List<OrderDetails> queryOrderDetails(String orderid);

    List<OrderdetailsWithBLOBs> getOrderDetails(Long orderdetailid);

    List<OdersAndOrderdetails> queryMyCanAfterServiceM(String userId);

    List<AfsAndOdtAndGoodsAndSellers> queryMyAfterServiceM(String userId);

    List<CollectionAndGoods> queryMyCollectionM(String userId);

    int deleteAddressIsfirstM();

    int addAddressIsfirstM(Integer addressid);

    OrderInfo getOrderInfo(@Param("orderdetailsid") String orderdetailsid);

    void updateAfterService(@Param("orderdetailsid") String orderdetailsid);

    User getUserByUserId(@Param("userId") String userId);
}
