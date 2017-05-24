package com.sc.mapper.seller;

import com.sc.domain.seller.OrderdetailsWithBLOBAndUsersAndLogisticss;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19.
 */
public interface QuerySaleOrderDetailsByOrderdetailsIdMapper {
    @SelectProvider(type = QuerySaleOrderDetailsByOrderdetailsIdSqlProvider.class, method = "QuerySaleOrderDetailMi")
    @Results({
            @Result(column = "CM_CREATETIME", property = "cmCreatetime", jdbcType = JdbcType.DATE),
            @Result(column = "CM_SPECNUMDETAILS", property = "cmSpecnumdetails", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_MONEY", property = "cmMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_NUMBER", property = "cmNumber", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SELLERSTATE", property = "cmSellerstate", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SERVICESTATE", property = "cmServicestate", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_LOGISTICSNUM", property = "cmLogisticsnum", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LOGISTICSID", property = "cmLogisticsid", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_LOGISTICSINFO", property = "cmLogisticsinfo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LOGISTICSNAME", property = "cmLogisticsname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "cmPhone", jdbcType = JdbcType.DECIMAL),
            @Result(column = "CM_SHOPEADDRESS", property = "cmShopeaddress", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPNAME", property = "cmNickname", jdbcType = JdbcType.VARCHAR)
    })
    List<OrderdetailsWithBLOBAndUsersAndLogisticss> QuerySaleOrderDetailM(String orderdetailsid);
}






