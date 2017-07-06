package com.sc.mapper.generator;

import com.sc.domain.generator.Orders;
import com.sc.domain.generator.OrdersExample;
import com.sc.domain.generator.OrdersWithBLOBs;
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

public interface OrdersMapper {
    @SelectProvider(type=OrdersSqlProvider.class, method="countByExample")
    long countByExample(OrdersExample example);

    @DeleteProvider(type=OrdersSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrdersExample example);

    @Insert({
        "insert into TB_ORDERS (CM_ORDERID, CM_USERID, ",
        "CM_USESCORE, CM_NUMBERSUN, ",
        "CM_MONEYSUN, CM_CREATETIME, ",
        "CM_STATE, CM_USERBALANCE, ",
        "CM_PAYTYPE, CM_PAYRESULT, ",
        "CM_ORDERDETAILSIDS)",
        "values (#{CM_ORDERID,jdbcType=VARCHAR}, #{CM_USERID,jdbcType=VARCHAR}, ",
        "#{CM_USESCORE,jdbcType=INTEGER}, #{CM_NUMBERSUN,jdbcType=INTEGER}, ",
        "#{CM_MONEYSUN,jdbcType=DOUBLE}, #{CM_CREATETIME,jdbcType=TIMESTAMP}, ",
        "#{CM_STATE,jdbcType=INTEGER}, #{CM_USERBALANCE,jdbcType=DOUBLE}, ",
        "#{CM_PAYTYPE,jdbcType=INTEGER}, #{CM_PAYRESULT,jdbcType=VARCHAR}, ",
        "#{CM_ORDERDETAILSIDS,jdbcType=LONGVARCHAR})"
    })
    int insert(OrdersWithBLOBs record);

    @InsertProvider(type=OrdersSqlProvider.class, method="insertSelective")
    int insertSelective(OrdersWithBLOBs record);

    @SelectProvider(type=OrdersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_ORDERID", property="CM_ORDERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USESCORE", property="CM_USESCORE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_NUMBERSUN", property="CM_NUMBERSUN", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_MONEYSUN", property="CM_MONEYSUN", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_STATE", property="CM_STATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_USERBALANCE", property="CM_USERBALANCE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_PAYTYPE", property="CM_PAYTYPE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_PAYRESULT", property="CM_PAYRESULT", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ORDERDETAILSIDS", property="CM_ORDERDETAILSIDS", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<OrdersWithBLOBs> selectByExampleWithBLOBs(OrdersExample example);

    @SelectProvider(type=OrdersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ORDERID", property="CM_ORDERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USESCORE", property="CM_USESCORE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_NUMBERSUN", property="CM_NUMBERSUN", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_MONEYSUN", property="CM_MONEYSUN", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_STATE", property="CM_STATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_USERBALANCE", property="CM_USERBALANCE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_PAYTYPE", property="CM_PAYTYPE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_PAYRESULT", property="CM_PAYRESULT", jdbcType=JdbcType.VARCHAR)
    })
    List<Orders> selectByExample(OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);
}