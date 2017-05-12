package com.sc.mapper.generator;

import com.sc.domain.generator.Orders;
import com.sc.domain.generator.OrdersExample;
import com.sc.domain.generator.OrdersWithBLOBs;
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
        "values (#{cmOrderid,jdbcType=VARCHAR}, #{cmUserid,jdbcType=VARCHAR}, ",
        "#{cmUsescore,jdbcType=INTEGER}, #{cmNumbersun,jdbcType=INTEGER}, ",
        "#{cmMoneysun,jdbcType=DOUBLE}, #{cmCreatetime,jdbcType=TIMESTAMP}, ",
        "#{cmState,jdbcType=INTEGER}, #{cmUserbalance,jdbcType=DOUBLE}, ",
        "#{cmPaytype,jdbcType=INTEGER}, #{cmPayresult,jdbcType=VARCHAR}, ",
        "#{cmOrderdetailsids,jdbcType=LONGVARCHAR})"
    })
    int insert(OrdersWithBLOBs record);

    @InsertProvider(type=OrdersSqlProvider.class, method="insertSelective")
    int insertSelective(OrdersWithBLOBs record);

    @SelectProvider(type=OrdersSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_ORDERID", property="cmOrderid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USESCORE", property="cmUsescore", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_NUMBERSUN", property="cmNumbersun", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_MONEYSUN", property="cmMoneysun", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_STATE", property="cmState", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_USERBALANCE", property="cmUserbalance", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_PAYTYPE", property="cmPaytype", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_PAYRESULT", property="cmPayresult", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ORDERDETAILSIDS", property="cmOrderdetailsids", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<OrdersWithBLOBs> selectByExampleWithBLOBs(OrdersExample example);

    @SelectProvider(type=OrdersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ORDERID", property="cmOrderid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USESCORE", property="cmUsescore", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_NUMBERSUN", property="cmNumbersun", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_MONEYSUN", property="cmMoneysun", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_STATE", property="cmState", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_USERBALANCE", property="cmUserbalance", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_PAYTYPE", property="cmPaytype", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_PAYRESULT", property="cmPayresult", jdbcType= JdbcType.VARCHAR)
    })
    List<Orders> selectByExample(OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    @UpdateProvider(type=OrdersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);
}