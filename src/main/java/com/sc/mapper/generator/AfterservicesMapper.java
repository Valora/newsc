package com.sc.mapper.generator;

import com.sc.domain.generator.Afterservices;
import com.sc.domain.generator.AfterservicesExample;
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
        "values (#{cmAfterserviceid,jdbcType=VARCHAR}, #{cmSellerid,jdbcType=VARCHAR}, ",
        "#{cmCreatetime,jdbcType=TIMESTAMP}, #{cmUserid,jdbcType=VARCHAR}, ",
        "#{cmOrderdetailsid,jdbcType=VARCHAR}, #{cmReason,jdbcType=VARCHAR}, ",
        "#{cmType,jdbcType=INTEGER}, #{cmState,jdbcType=INTEGER}, ",
        "#{cmImgpaths,jdbcType=VARCHAR}, #{cmSvid,jdbcType=VARCHAR})"
    })
    int insert(Afterservices record);

    @InsertProvider(type=AfterservicesSqlProvider.class, method="insertSelective")
    int insertSelective(Afterservices record);

    @SelectProvider(type=AfterservicesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_AFTERSERVICEID", property="cmAfterserviceid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SELLERID", property="cmSellerid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ORDERDETAILSID", property="cmOrderdetailsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_REASON", property="cmReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_TYPE", property="cmType", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_STATE", property="cmState", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_IMGPATHS", property="cmImgpaths", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SVID", property="cmSvid", jdbcType= JdbcType.VARCHAR)
    })
    List<Afterservices> selectByExample(AfterservicesExample example);

    @UpdateProvider(type=AfterservicesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Afterservices record, @Param("example") AfterservicesExample example);

    @UpdateProvider(type=AfterservicesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Afterservices record, @Param("example") AfterservicesExample example);
}