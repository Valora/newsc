package com.sc.mapper.generator;

import com.sc.domain.generator.Servicedetails;
import com.sc.domain.generator.ServicedetailsExample;
import com.sc.domain.generator.ServicedetailsWithBLOBs;
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

public interface ServicedetailsMapper {
    @SelectProvider(type=ServicedetailsSqlProvider.class, method="countByExample")
    long countByExample(ServicedetailsExample example);

    @DeleteProvider(type=ServicedetailsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ServicedetailsExample example);

    @Insert({
        "insert into TB_SERVICEDETAILS (CM_SVID, CM_AFTERSERVICEID, ",
        "CM_CREATETIME, CM_TYPE, ",
        "CM_LOGISTICSNUM, CM_LOGISTICSID, ",
        "CM_LOGISTICSINFO)",
        "values (#{CM_SVID,jdbcType=VARCHAR}, #{CM_AFTERSERVICEID,jdbcType=VARCHAR}, ",
        "#{CM_CREATETIME,jdbcType=TIMESTAMP}, #{CM_TYPE,jdbcType=INTEGER}, ",
        "#{CM_LOGISTICSNUM,jdbcType=VARCHAR}, #{CM_LOGISTICSID,jdbcType=INTEGER}, ",
        "#{CM_LOGISTICSINFO,jdbcType=LONGVARCHAR})"
    })
    int insert(ServicedetailsWithBLOBs record);

    @InsertProvider(type=ServicedetailsSqlProvider.class, method="insertSelective")
    int insertSelective(ServicedetailsWithBLOBs record);

    @SelectProvider(type=ServicedetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_SVID", property="CM_SVID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_AFTERSERVICEID", property="CM_AFTERSERVICEID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_TYPE", property="CM_TYPE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="CM_LOGISTICSNUM", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="CM_LOGISTICSID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSINFO", property="CM_LOGISTICSINFO", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ServicedetailsWithBLOBs> selectByExampleWithBLOBs(ServicedetailsExample example);

    @SelectProvider(type=ServicedetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_SVID", property="CM_SVID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_AFTERSERVICEID", property="CM_AFTERSERVICEID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_TYPE", property="CM_TYPE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="CM_LOGISTICSNUM", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="CM_LOGISTICSID", jdbcType=JdbcType.INTEGER)
    })
    List<Servicedetails> selectByExample(ServicedetailsExample example);

    @UpdateProvider(type=ServicedetailsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ServicedetailsWithBLOBs record, @Param("example") ServicedetailsExample example);

    @UpdateProvider(type=ServicedetailsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") ServicedetailsWithBLOBs record, @Param("example") ServicedetailsExample example);

    @UpdateProvider(type=ServicedetailsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Servicedetails record, @Param("example") ServicedetailsExample example);
}