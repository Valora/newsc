package com.sc.mapper.generator;

import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample;
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

public interface SellersMapper {
    @SelectProvider(type=SellersSqlProvider.class, method="countByExample")
    long countByExample(SellersExample example);

    @DeleteProvider(type=SellersSqlProvider.class, method="deleteByExample")
    int deleteByExample(SellersExample example);

    @Insert({
        "insert into TB_SELLERS (CM_SELLERID, CM_SELLERNAME, ",
        "CM_PHONE, CM_ACCOUNT, ",
        "CM_PASSWORD, CM_BRANDID, ",
        "CM_CARDPATH, CM_STOREPATH, ",
        "CM_LICENSEPATH, CM_ADDRESS, ",
        "CM_LON, CM_LAT, CM_CREATETIME, ",
        "CM_ISEXAMINE, CM_REASON, ",
        "CM_CARDNO, CM_NAME, ",
        "CM_CONTACTNAME, CM_CONTACTPHONE, ",
        "CM_TELEPHONE, CM_PAX)",
        "values (#{CM_SELLERID,jdbcType=VARCHAR}, #{CM_SELLERNAME,jdbcType=VARCHAR}, ",
        "#{CM_PHONE,jdbcType=BIGINT}, #{CM_ACCOUNT,jdbcType=VARCHAR}, ",
        "#{CM_PASSWORD,jdbcType=VARCHAR}, #{CM_BRANDID,jdbcType=INTEGER}, ",
        "#{CM_CARDPATH,jdbcType=VARCHAR}, #{CM_STOREPATH,jdbcType=VARCHAR}, ",
        "#{CM_LICENSEPATH,jdbcType=VARCHAR}, #{CM_ADDRESS,jdbcType=VARCHAR}, ",
        "#{CM_LON,jdbcType=DOUBLE}, #{CM_LAT,jdbcType=DOUBLE}, #{CM_CREATETIME,jdbcType=TIMESTAMP}, ",
        "#{CM_ISEXAMINE,jdbcType=INTEGER}, #{CM_REASON,jdbcType=VARCHAR}, ",
        "#{CM_CARDNO,jdbcType=VARCHAR}, #{CM_NAME,jdbcType=VARCHAR}, ",
        "#{CM_CONTACTNAME,jdbcType=VARCHAR}, #{CM_CONTACTPHONE,jdbcType=VARCHAR}, ",
        "#{CM_TELEPHONE,jdbcType=VARCHAR}, #{CM_PAX,jdbcType=VARCHAR})"
    })
    int insert(Sellers record);

    @InsertProvider(type=SellersSqlProvider.class, method="insertSelective")
    int insertSelective(Sellers record);

    @SelectProvider(type=SellersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_SELLERID", property="CM_SELLERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SELLERNAME", property="CM_SELLERNAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="CM_PHONE", jdbcType=JdbcType.BIGINT),
        @Result(column="CM_ACCOUNT", property="CM_ACCOUNT", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PASSWORD", property="CM_PASSWORD", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_BRANDID", property="CM_BRANDID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_CARDPATH", property="CM_CARDPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_STOREPATH", property="CM_STOREPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="CM_LICENSEPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ADDRESS", property="CM_ADDRESS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LON", property="CM_LON", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_LAT", property="CM_LAT", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_ISEXAMINE", property="CM_ISEXAMINE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_REASON", property="CM_REASON", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CARDNO", property="CM_CARDNO", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_NAME", property="CM_NAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CONTACTNAME", property="CM_CONTACTNAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CONTACTPHONE", property="CM_CONTACTPHONE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_TELEPHONE", property="CM_TELEPHONE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PAX", property="CM_PAX", jdbcType=JdbcType.VARCHAR)
    })
    List<Sellers> selectByExample(SellersExample example);

    @UpdateProvider(type=SellersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sellers record, @Param("example") SellersExample example);

    @UpdateProvider(type=SellersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sellers record, @Param("example") SellersExample example);
}