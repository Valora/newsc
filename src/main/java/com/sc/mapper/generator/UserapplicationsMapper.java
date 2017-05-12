package com.sc.mapper.generator;

import com.sc.domain.generator.Userapplications;
import com.sc.domain.generator.UserapplicationsExample;
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
        "values (#{cmId,jdbcType=INTEGER}, #{cmName,jdbcType=VARCHAR}, ",
        "#{cmPhone,jdbcType=BIGINT}, #{cmCardfacepath,jdbcType=VARCHAR}, ",
        "#{cmCardbackpath,jdbcType=VARCHAR}, #{cmPersonalpath,jdbcType=VARCHAR}, ",
        "#{cmLicensepath,jdbcType=VARCHAR}, #{cmShopeaddress,jdbcType=VARCHAR}, ",
        "#{cmShoplon,jdbcType=DOUBLE}, #{cmShoplat,jdbcType=DOUBLE}, ",
        "#{cmState,jdbcType=INTEGER}, #{cmReason,jdbcType=VARCHAR}, ",
        "#{cmType,jdbcType=INTEGER})"
    })
    int insert(Userapplications record);

    @InsertProvider(type=UserapplicationsSqlProvider.class, method="insertSelective")
    int insertSelective(Userapplications record);

    @SelectProvider(type=UserapplicationsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ID", property="cmId", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_NAME", property="cmName", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="cmPhone", jdbcType= JdbcType.BIGINT),
        @Result(column="CM_CARDFACEPATH", property="cmCardfacepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CARDBACKPATH", property="cmCardbackpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PERSONALPATH", property="cmPersonalpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="cmLicensepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SHOPEADDRESS", property="cmShopeaddress", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SHOPLON", property="cmShoplon", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_SHOPLAT", property="cmShoplat", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_STATE", property="cmState", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_REASON", property="cmReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_TYPE", property="cmType", jdbcType= JdbcType.INTEGER)
    })
    List<Userapplications> selectByExample(UserapplicationsExample example);

    @UpdateProvider(type=UserapplicationsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Userapplications record, @Param("example") UserapplicationsExample example);

    @UpdateProvider(type=UserapplicationsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Userapplications record, @Param("example") UserapplicationsExample example);
}