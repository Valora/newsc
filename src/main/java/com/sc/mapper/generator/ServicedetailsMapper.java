package com.sc.mapper.generator;

import com.sc.domain.generator.Servicedetails;
import com.sc.domain.generator.ServicedetailsExample;
import com.sc.domain.generator.ServicedetailsWithBLOBs;
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
        "values (#{cmSvid,jdbcType=VARCHAR}, #{cmAfterserviceid,jdbcType=VARCHAR}, ",
        "#{cmCreatetime,jdbcType=TIMESTAMP}, #{cmType,jdbcType=INTEGER}, ",
        "#{cmLogisticsnum,jdbcType=VARCHAR}, #{cmLogisticsid,jdbcType=INTEGER}, ",
        "#{cmLogisticsinfo,jdbcType=LONGVARCHAR})"
    })
    int insert(ServicedetailsWithBLOBs record);

    @InsertProvider(type=ServicedetailsSqlProvider.class, method="insertSelective")
    int insertSelective(ServicedetailsWithBLOBs record);

    @SelectProvider(type=ServicedetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_SVID", property="cmSvid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_AFTERSERVICEID", property="cmAfterserviceid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_TYPE", property="cmType", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="cmLogisticsnum", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="cmLogisticsid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSINFO", property="cmLogisticsinfo", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<ServicedetailsWithBLOBs> selectByExampleWithBLOBs(ServicedetailsExample example);

    @SelectProvider(type=ServicedetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_SVID", property="cmSvid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_AFTERSERVICEID", property="cmAfterserviceid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_TYPE", property="cmType", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNUM", property="cmLogisticsnum", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LOGISTICSID", property="cmLogisticsid", jdbcType= JdbcType.INTEGER)
    })
    List<Servicedetails> selectByExample(ServicedetailsExample example);

    @UpdateProvider(type=ServicedetailsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ServicedetailsWithBLOBs record, @Param("example") ServicedetailsExample example);

    @UpdateProvider(type=ServicedetailsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") ServicedetailsWithBLOBs record, @Param("example") ServicedetailsExample example);

    @UpdateProvider(type=ServicedetailsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Servicedetails record, @Param("example") ServicedetailsExample example);
}