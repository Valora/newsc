package com.sc.mapper.manage;

import com.sc.domain.manage.SellerDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Created by valora on 2017/4/26.
 */
@Mapper
public interface SellerDetailMapper {
    @SelectProvider(type = SellerDetailsSqlProvider.class, method = "getSellerDetail")
    @Results({
            @Result(column = "CM_CREATETIME", property = "cmCreatetime", jdbcType = JdbcType.DATE),
            @Result(column = "CM_PHONE", property = "cmPhone", jdbcType = JdbcType.DECIMAL),
            @Result(column = "CM_NAME", property = "cmName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CONTACTNAME", property = "cmContactname", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CONTACTPHONE", property = "cmContactphone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_TELEPHONE", property = "cmTelephone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PAX", property = "cmPax", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_STOREPATH", property = "cmStorepath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CARDNO", property = "cmCardno", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CARDPATH", property = "cmCardpath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_ISEXAMINE", property = "cmIsexamine", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LICENSEPATH", property = "cmLicensepath", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_REASON", property = "cmReason", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SELLERID", property = "cmSellerid", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_ADDRESS", property = "cmAddress", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SELLERNAME", property = "cmSellername", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LAT", property = "cmLat", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_LON", property = "cmLon", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_BRAND", property = "cmBrand", jdbcType = JdbcType.VARCHAR)
    })
    List<SellerDetail> getSellerDetail(String sellerid);
}
