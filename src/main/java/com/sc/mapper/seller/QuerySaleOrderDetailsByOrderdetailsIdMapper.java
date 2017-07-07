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
            @Result(column = "CM_CREATETIME", property = "CM_CREATETIME"),
            @Result(column = "CM_SPECNUMDETAILS", property = "CM_SPECNUMDETAILS", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_MONEY", property = "CM_MONEY", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_NUMBER", property = "CM_NUMBER", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SELLERSTATE", property = "CM_SELLERSTATE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SERVICESTATE", property = "CM_SERVICESTATE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_LOGISTICSNUM", property = "CM_LOGISTICSNUM", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LOGISTICSID", property = "CM_LOGISTICSID", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_LOGISTICSINFO", property = "CM_LOGISTICSINFO", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LOGISTICSNAME", property = "CM_LOGISTICSNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.DECIMAL),
            @Result(column = "CM_SHOPEADDRESS", property = "CM_SHOPEADDRESS", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPNAME", property = "CM_SHOPNAME", jdbcType = JdbcType.VARCHAR)
    })
    List<OrderdetailsWithBLOBAndUsersAndLogisticss> QuerySaleOrderDetailM(String orderdetailsid);
}






