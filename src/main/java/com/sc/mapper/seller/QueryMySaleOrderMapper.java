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
            @Result(column = "CM_GOODSID", property = "cmGoodsid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_ORDERDETAILSID", property = "cmOrderdetailsid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_MAINFIGUREPATH", property = "cmMainfigurepath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_TITLE", property = "cmTitle", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CREATETIME", property = "cmOrdercreatetime", jdbcType = JdbcType.DATE),
            @Result(column = "CM_PRESENTPRICE", property = "cmPresentprice", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_ORIGINALPRICE", property = "cmOriginalprice", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_NUMBER", property = "cmNumber", jdbcType = JdbcType.INTEGER),
            @Result(column = "CM_MONEY", property = "cmMoney", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_SPECNUMDETAILS", property = "cmSpecnumdetails", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SELLERSTATE", property = "cmSellerstate", jdbcType = JdbcType.INTEGER)
    })
    List<OrderdetailsWithBLOBandGood> QueryMySaleOrderM(String sellerid, String starttime, String endtime, Integer orderState);
}
