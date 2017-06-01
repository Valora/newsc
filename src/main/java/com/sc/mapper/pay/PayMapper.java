package com.sc.mapper.pay;

import com.sc.domain.generator.OrdersWithBLOBs;

import java.util.List;

/**
 * Created by valora on 2017/5/27.
 */
public interface PayMapper {
    public List<OrdersWithBLOBs> getOrderByOrderIds(String[] ids);

    void updateTableOrder(String cmOrderid);

    void updateTableOrderAli(String cmOrderid);
}
