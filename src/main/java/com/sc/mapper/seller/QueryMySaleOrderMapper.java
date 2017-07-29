package com.sc.mapper.seller;

import com.sc.domain.seller.OrderdetailsWithBLOBandGood;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by Administrator on 2017/5/18.
 */
public interface QueryMySaleOrderMapper {
    @SelectProvider(type = QueryMySaleOrderSqlProvider.class, method = "QueryMySaleOrderMi")
    @Results({
            @Result(column = "CM_GOODSID", property = "CM_GOODSID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_ORDERDETAILSID", property = "CM_ORDERDETAILSID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_MAINFIGUREPATH", property = "CM_MAINFIGUREPATH", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_TITLE", property = "CM_TITLE", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CREATETIME", property = "CM_ORDERCREATETIME"),
            @Result(column = "CM_PRESENTPRICE", property = "CM_PRESENTPRICE", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_ORIGINALPRICE", property = "CM_ORIGINALPRICE", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_NUMBER", property = "CM_NUMBER", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_MONEY", property = "CM_MONEY", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_SPECNUMDETAILS", property = "CM_SPECNUMDETAILS", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SELLERSTATE", property = "CM_SELLERSTATE", jdbcType = JdbcType.INTEGER)
    })
    List<OrderdetailsWithBLOBandGood> QueryMySaleOrderM(String sellerid, String starttime, String endtime, Integer orderState);
}
