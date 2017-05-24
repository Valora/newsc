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
            @Result(column = "CM_ORDERDETAILSID", property = "cmOrderdetailsid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_AFTERSERVICEID", property = "cmAfterserviceid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_STATE", property = "cmState", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_TYPE", property = "cmType", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_CREATETIME", property = "cmCreatetime", jdbcType = JdbcType.DATE),

            @Result(column = "CM_GOODSID", property = "cmGoodsid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_NUMBER", property = "cmNumber", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_MONEY", property = "cmMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_SELLERSTATE", property = "cmSellerstate", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SERVICESTATE", property = "cmServicestate", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_SPECNUMDETAILS", property = "cmSpecnumdetails", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SPECNUMDETAILS", property = "cmTitle", jdbcType = JdbcType.VARCHAR),

            @Result(column = "CM_MAINFIGUREPATH", property = "cmMainfigurepath", jdbcType = JdbcType.VARCHAR),

            @Result(column = "CM_NAME", property = "cmName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SHOPEADDRESS", property = "cmShopeaddress", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PHONE", property = "cmPhone", jdbcType = JdbcType.DECIMAL)
    })
    List<AfterserviceAndOdtAndGoodsAndusers> queryCustomerServiceM(String sellerId, Integer serverstate, String starttime, String endtime);
}
