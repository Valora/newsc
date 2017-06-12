package com.sc.mapper.pay;

import com.sc.domain.generator.OrdersWithBLOBs;

import java.util.List;

/**
 * Created by valora on 2017/5/27.
 */
public interface PayMapper {
    List<OrdersWithBLOBs> getOrderByOrderIds(String[] ids);

    void updateTableOrder(String cmOrderid);

    void updateTableOrderDetail(String cmOrderid);

    OrdersWithBLOBs getOrderByOrderId(String id);
}
