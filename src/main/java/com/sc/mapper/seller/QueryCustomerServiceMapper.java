package com.sc.mapper.seller;

import com.sc.domain.seller.AfterserviceAndOdtAndGoodsAndusers;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by Administrator on 2017/5/22.
 */
public interface QueryCustomerServiceMapper {
    @SelectProvider(type = QueryCustomerServiceSqlProvider.class, method = "queryCustomerServiceMi")
    @Results({
            @Result(column = "CM_ORDERDETAILSID", property = "CM_ORDERDETAILSID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_AFTERSERVICEID", property = "CM_AFTERSERVICEID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_STATE", property = "CM_STATE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_TYPE", property = "CM_TYPE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_CREATETIME", property = "CM_CREATETIME", jdbcType = JdbcType.DATE),

            @Result(column = "CM_GOODSID", property = "CM_GOODSID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_NUMBER", property = "CM_NUMBER", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_MONEY", property = "CM_MONEY", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_SELLERSTATE", property = "CM_SELLERSTATE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SERVICESTATE", property = "CM_SERVICESTATE", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SPECNUMDETAILS", property = "CM_SPECNUMDETAILS", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SPECNUMDETAILS", property = "CM_SPECNUMDETAILS", jdbcType = JdbcType.VARCHAR),

            @Result(column = "CM_MAINFIGUREPATH", property = "CM_MAINFIGUREPATH", jdbcType = JdbcType.VARCHAR),

            @Result(column = "CM_NAME", property = "CM_NAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPEADDRESS", property = "CM_SHOPEADDRESS", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.DECIMAL)
    })
    List<AfterserviceAndOdtAndGoodsAndusers> queryCustomerServiceM(String sellerId, Integer serverstate, String starttime, String endtime);
}
