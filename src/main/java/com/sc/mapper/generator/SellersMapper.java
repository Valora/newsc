package com.sc.mapper.generator;

import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample;
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
        "values (#{cmSellerid,jdbcType=VARCHAR}, #{cmSellername,jdbcType=VARCHAR}, ",
        "#{cmPhone,jdbcType=BIGINT}, #{cmAccount,jdbcType=VARCHAR}, ",
        "#{cmPassword,jdbcType=VARCHAR}, #{cmBrandid,jdbcType=INTEGER}, ",
        "#{cmCardpath,jdbcType=VARCHAR}, #{cmStorepath,jdbcType=VARCHAR}, ",
        "#{cmLicensepath,jdbcType=VARCHAR}, #{cmAddress,jdbcType=VARCHAR}, ",
        "#{cmLon,jdbcType=DOUBLE}, #{cmLat,jdbcType=DOUBLE}, #{cmCreatetime,jdbcType=TIMESTAMP}, ",
        "#{cmIsexamine,jdbcType=INTEGER}, #{cmReason,jdbcType=VARCHAR}, ",
        "#{cmCardno,jdbcType=VARCHAR}, #{cmName,jdbcType=VARCHAR}, ",
        "#{cmContactname,jdbcType=VARCHAR}, #{cmContactphone,jdbcType=VARCHAR}, ",
        "#{cmTelephone,jdbcType=VARCHAR}, #{cmPax,jdbcType=VARCHAR})"
    })
    int insert(Sellers record);

    @InsertProvider(type=SellersSqlProvider.class, method="insertSelective")
    int insertSelective(Sellers record);

    @SelectProvider(type=SellersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_SELLERID", property="cmSellerid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SELLERNAME", property="cmSellername", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="cmPhone", jdbcType= JdbcType.BIGINT),
        @Result(column="CM_ACCOUNT", property="cmAccount", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PASSWORD", property="cmPassword", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_BRANDID", property="cmBrandid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_CARDPATH", property="cmCardpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_STOREPATH", property="cmStorepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="cmLicensepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ADDRESS", property="cmAddress", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LON", property="cmLon", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_LAT", property="cmLat", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_ISEXAMINE", property="cmIsexamine", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_REASON", property="cmReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CARDNO", property="cmCardno", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_NAME", property="cmName", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CONTACTNAME", property="cmContactname", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CONTACTPHONE", property="cmContactphone", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_TELEPHONE", property="cmTelephone", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PAX", property="cmPax", jdbcType= JdbcType.VARCHAR)
    })
    List<Sellers> selectByExample(SellersExample example);

    @UpdateProvider(type=SellersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Sellers record, @Param("example") SellersExample example);

    @UpdateProvider(type=SellersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Sellers record, @Param("example") SellersExample example);
}