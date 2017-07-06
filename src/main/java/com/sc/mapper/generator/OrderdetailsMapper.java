package com.sc.mapper.generator;

import com.sc.domain.generator.Orderdetails;
import com.sc.domain.generator.OrderdetailsExample;
import com.sc.domain.generator.OrderdetailsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

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
        "values (#{CM_ORDERDETAILSID,jdbcType=VARCHAR}, #{CM_ORDERID,jdbcType=VARCHAR}, ",
        "#{CM_GOODSID,jdbcType=VARCHAR}, #{CM_USERID,jdbcType=VARCHAR}, ",
        "#{CM_NUMBER,jdbcType=INTEGER}, #{CM_MONEY,jdbcType=DOUBLE}, ",
        "#{CM_SELLERID,jdbcType=VARCHAR}, #{CM_CREATETIME,jdbcType=TIMESTAMP}, ",
        "#{CM_SERVICESTATE,jdbcType=INTEGER}, #{CM_SELLERSTATE,jdbcType=INTEGER}, ",
        "#{CM_LOGISTICSNUM,jdbcType=VARCHAR}, #{CM_LOGISTICSID,jdbcType=INTEGER}, ",
        "#{CM_SPECNUMDETAILS,jdbcType=LONGVARCHAR}, #{CM_LOGISTICSINFO,jdbcType=LONGVARCHAR})"
    })
    int insert(OrderdetailsWithBLOBs record);

    @InsertProvider(type=OrderdetailsSqlProvider.class, method="insertSelective")
    int insertSelective(OrderdetailsWithBLOBs record);

    @SelectProvider(type=OrderdetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_ORDERDETAILSID", property="CM_ORDERDETAILSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ORDERID", property="CM_ORDERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="CM_GOODSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_NUMBER", property="CM_NUMBER", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_MONEY", property="CM_MONEY", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_SELLERID", property="CM_SELLERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_SERVICESTATE", property="CM_SERVICESTATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_SELLERSTATE", property="CM_SELLERSTATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="CM_LOGISTICSNUM", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="CM_LOGISTICSID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_SPECNUMDETAILS", property="CM_SPECNUMDETAILS", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="CM_LOGISTICSINFO", property="CM_LOGISTICSINFO", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<OrderdetailsWithBLOBs> selectByExampleWithBLOBs(OrderdetailsExample example);

    @SelectProvider(type=OrderdetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ORDERDETAILSID", property="CM_ORDERDETAILSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ORDERID", property="CM_ORDERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="CM_GOODSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_NUMBER", property="CM_NUMBER", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_MONEY", property="CM_MONEY", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_SELLERID", property="CM_SELLERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_SERVICESTATE", property="CM_SERVICESTATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_SELLERSTATE", property="CM_SELLERSTATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="CM_LOGISTICSNUM", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="CM_LOGISTICSID", jdbcType=JdbcType.INTEGER)
    })
    List<Orderdetails> selectByExample(OrderdetailsExample example);

    @UpdateProvider(type=OrderdetailsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrderdetailsWithBLOBs record, @Param("example") OrderdetailsExample example);

    @UpdateProvider(type=OrderdetailsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") OrderdetailsWithBLOBs record, @Param("example") OrderdetailsExample example);

    @UpdateProvider(type=OrderdetailsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Orderdetails record, @Param("example") OrderdetailsExample example);
}