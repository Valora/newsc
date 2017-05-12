package com.sc.mapper.generator;

import com.sc.domain.generator.Orderdetails;
import com.sc.domain.generator.OrderdetailsExample;
import com.sc.domain.generator.OrderdetailsWithBLOBs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface OrderdetailsMapper {
    @SelectProvider(type=OrderdetailsSqlProvider.class, method="countByExample")
    long countByExample(OrderdetailsExample example);

    @DeleteProvider(type=OrderdetailsSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderdetailsExample example);

    @Insert({
        "insert into TB_ORDERDETAILS (CM_ORDERDETAILSID, CM_ORDERID, ",
        "CM_GOODSID, CM_USERID, ",
        "CM_NUMBER, CM_MONEY, ",
        "CM_SELLERID, CM_CREATETIME, ",
        "CM_SERVICESTATE, CM_SELLERSTATE, ",
        "CM_LOGISTICSNUM, CM_LOGISTICSID, ",
        "CM_SPECNUMDETAILS, CM_LOGISTICSINFO)",
        "values (#{cmOrderdetailsid,jdbcType=VARCHAR}, #{cmOrderid,jdbcType=VARCHAR}, ",
        "#{cmGoodsid,jdbcType=VARCHAR}, #{cmUserid,jdbcType=VARCHAR}, ",
        "#{cmNumber,jdbcType=INTEGER}, #{cmMoney,jdbcType=DOUBLE}, ",
        "#{cmSellerid,jdbcType=VARCHAR}, #{cmCreatetime,jdbcType=TIMESTAMP}, ",
        "#{cmServicestate,jdbcType=INTEGER}, #{cmSellerstate,jdbcType=INTEGER}, ",
        "#{cmLogisticsnum,jdbcType=VARCHAR}, #{cmLogisticsid,jdbcType=INTEGER}, ",
        "#{cmSpecnumdetails,jdbcType=LONGVARCHAR}, #{cmLogisticsinfo,jdbcType=LONGVARCHAR})"
    })
    int insert(OrderdetailsWithBLOBs record);

    @InsertProvider(type=OrderdetailsSqlProvider.class, method="insertSelective")
    int insertSelective(OrderdetailsWithBLOBs record);

    @SelectProvider(type=OrderdetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_ORDERDETAILSID", property="cmOrderdetailsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ORDERID", property="cmOrderid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_NUMBER", property="cmNumber", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_MONEY", property="cmMoney", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_SELLERID", property="cmSellerid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_SERVICESTATE", property="cmServicestate", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_SELLERSTATE", property="cmSellerstate", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="cmLogisticsnum", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="cmLogisticsid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_SPECNUMDETAILS", property="cmSpecnumdetails", jdbcType= JdbcType.LONGVARCHAR),
        @Result(column="CM_LOGISTICSINFO", property="cmLogisticsinfo", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<OrderdetailsWithBLOBs> selectByExampleWithBLOBs(OrderdetailsExample example);

    @SelectProvider(type=OrderdetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ORDERDETAILSID", property="cmOrderdetailsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ORDERID", property="cmOrderid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_NUMBER", property="cmNumber", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_MONEY", property="cmMoney", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_SELLERID", property="cmSellerid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_SERVICESTATE", property="cmServicestate", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_SELLERSTATE", property="cmSellerstate", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="cmLogisticsnum", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="cmLogisticsid", jdbcType= JdbcType.INTEGER)
    })
    List<Orderdetails> selectByExample(OrderdetailsExample example);

    @UpdateProvider(type=OrderdetailsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrderdetailsWithBLOBs record, @Param("example") OrderdetailsExample example);

    @UpdateProvider(type=OrderdetailsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") OrderdetailsWithBLOBs record, @Param("example") OrderdetailsExample example);

    @UpdateProvider(type=OrderdetailsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);
}