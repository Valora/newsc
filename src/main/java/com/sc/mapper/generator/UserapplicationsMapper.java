package com.sc.mapper.generator;

import com.sc.domain.generator.Userapplications;
import com.sc.domain.generator.UserapplicationsExample;
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

public interface UserapplicationsMapper {
    @SelectProvider(type=UserapplicationsSqlProvider.class, method="countByExample")
    long countByExample(UserapplicationsExample example);

    @DeleteProvider(type=UserapplicationsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserapplicationsExample example);

    @Insert({
        "insert into TB_USERAPPLICATIONS (CM_ID, CM_NAME, ",
        "CM_PHONE, CM_CARDFACEPATH, ",
        "CM_CARDBACKPATH, CM_PERSONALPATH, ",
        "CM_LICENSEPATH, CM_SHOPEADDRESS, ",
        "CM_SHOPLON, CM_SHOPLAT, ",
        "CM_STATE, CM_REASON, ",
        "CM_TYPE)",
        "values (#{CM_ID,jdbcType=INTEGER}, #{CM_NAME,jdbcType=VARCHAR}, ",
        "#{CM_PHONE,jdbcType=BIGINT}, #{CM_CARDFACEPATH,jdbcType=VARCHAR}, ",
        "#{CM_CARDBACKPATH,jdbcType=VARCHAR}, #{CM_PERSONALPATH,jdbcType=VARCHAR}, ",
        "#{CM_LICENSEPATH,jdbcType=VARCHAR}, #{CM_SHOPEADDRESS,jdbcType=VARCHAR}, ",
        "#{CM_SHOPLON,jdbcType=DOUBLE}, #{CM_SHOPLAT,jdbcType=DOUBLE}, ",
        "#{CM_STATE,jdbcType=INTEGER}, #{CM_REASON,jdbcType=VARCHAR}, ",
        "#{CM_TYPE,jdbcType=INTEGER})"
    })
    int insert(Userapplications record);

    @InsertProvider(type=UserapplicationsSqlProvider.class, method="insertSelective")
    int insertSelective(Userapplications record);

    @SelectProvider(type=UserapplicationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ID", property="CM_ID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_NAME", property="CM_NAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="CM_PHONE", jdbcType=JdbcType.BIGINT),
        @Result(column="CM_CARDFACEPATH", property="CM_CARDFACEPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CARDBACKPATH", property="CM_CARDBACKPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PERSONALPATH", property="CM_PERSONALPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="CM_LICENSEPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPEADDRESS", property="CM_SHOPEADDRESS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPLON", property="CM_SHOPLON", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_SHOPLAT", property="CM_SHOPLAT", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_STATE", property="CM_STATE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_REASON", property="CM_REASON", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_TYPE", property="CM_TYPE", jdbcType=JdbcType.INTEGER)
    })
    List<Userapplications> selectByExample(UserapplicationsExample example);

    @UpdateProvider(type=UserapplicationsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Userapplications record, @Param("example") UserapplicationsExample example);

    @UpdateProvider(type=UserapplicationsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Userapplications record, @Param("example") UserapplicationsExample example);
}