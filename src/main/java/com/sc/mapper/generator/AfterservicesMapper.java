package com.sc.mapper.generator;

import com.sc.domain.generator.Afterservices;
import com.sc.domain.generator.AfterservicesExample;
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

public interface AfterservicesMapper {
    @SelectProvider(type=AfterservicesSqlProvider.class, method="countByExample")
    long countByExample(AfterservicesExample example);

    @DeleteProvider(type=AfterservicesSqlProvider.class, method="deleteByExample")
    int deleteByExample(AfterservicesExample example);

    @Insert({
        "insert into TB_AFTERSERVICES (CM_AFTERSERVICEID, CM_SELLERID, ",
        "CM_CREATETIME, CM_USERID, ",
        "CM_ORDERDETAILSID, CM_REASON, ",
        "CM_TYPE, CM_STATE, ",
        "CM_IMGPATHS, CM_SVID)",
        "values (#{CM_AFTERSERVICEID,jdbcType=VARCHAR}, #{CM_SELLERID,jdbcType=VARCHAR}, ",
        "#{CM_CREATETIME,jdbcType=TIMESTAMP}, #{CM_USERID,jdbcType=VARCHAR}, ",
        "#{CM_ORDERDETAILSID,jdbcType=VARCHAR}, #{CM_REASON,jdbcType=VARCHAR}, ",
        "#{CM_TYPE,jdbcType=INTEGER}, #{CM_STATE,jdbcType=INTEGER}, ",
        "#{CM_IMGPATHS,jdbcType=VARCHAR}, #{CM_SVID,jdbcType=VARCHAR})"
    })
    int insert(Afterservices record);

    @InsertProvider(type=AfterservicesSqlProvider.class, method="insertSelective")
    int insertSelective(Afterservices record);

    @SelectProvider(type=AfterservicesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_AFTERSERVICEID", property="CM_AFTERSERVICEID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SELLERID", property="CM_SELLERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ORDERDETAILSID", property="CM_ORDERDETAILSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_REASON", property="CM_REASON", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_TYPE", property="CM_TYPE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_STATE", property="CM_STATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_IMGPATHS", property="CM_IMGPATHS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SVID", property="CM_SVID", jdbcType=JdbcType.VARCHAR)
    })
    List<Afterservices> selectByExample(AfterservicesExample example);

    @UpdateProvider(type=AfterservicesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Afterservices record, @Param("example") AfterservicesExample example);

    @UpdateProvider(type=AfterservicesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Afterservices record, @Param("example") AfterservicesExample example);
}