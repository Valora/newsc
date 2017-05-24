package com.sc.mapper.userdomain;

import com.sc.domain.generator.OrderdetailsWithBLOBs;
import com.sc.domain.userdomain.MyOrders;
import com.sc.domain.userdomain.MyStateOrders;
import com.sc.domain.userdomain.Order;
import com.sc.domain.userdomain.OrderDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * UserDoMainMapper
 * Created by valora on 2017/5/17.
 */
@Mapper
public interface UserDoMainMapper {

    List<Order> getOrderState(String cmGoodsid, String cmUserid);
    
    List<MyOrders> getMyOrdersAll(String userId);

    List<MyStateOrders> getUnpaiedOrders(String userId);

    List<MyStateOrders> getSettlementOrders(String userId);

    List<OrderDetails> queryOrderDetails(String orderid);

    List<OrderdetailsWithBLOBs> getOrderDetails(Long orderdetailid);
}
