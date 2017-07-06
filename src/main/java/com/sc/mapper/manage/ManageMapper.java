package com.sc.mapper.manage;

import com.sc.domain.manage.SellerDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Manage用Mapper
 * Created by valora on 2017/4/26.
 */
@Mapper
public interface ManageMapper {
    @SelectProvider(type = ManageSqlProvider.class, method = "getSellerDetail")
    @Results({
            @Result(column = "CM_CREATETIME", property = "CM_CREATETIME", jdbcType = JdbcType.DATE),
            @Result(column = "CM_PHONE", property = "CM_PHONE", jdbcType = JdbcType.DECIMAL),
            @Result(column = "CM_NAME", property = "CM_NAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CONTACTNAME", property = "CM_CONTACTNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CONTACTPHONE", property = "CM_CONTACTPHONE", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_TELEPHONE", property = "CM_TELEPHONE", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_PAX", property = "CM_PAX", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_STOREPATH", property = "CM_STOREPATH", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CARDNO", property = "CM_CARDNO", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_CARDPATH", property = "CM_CARDPATH", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_ISEXAMINE", property = "CM_ISEXAMINE", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LICENSEPATH", property = "CM_LICENSEPATH", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_REASON", property = "CM_REASON", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SELLERID", property = "CM_SELLERID", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_ADDRESS", property = "CM_ADDRESS", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_SELLERNAME", property = "CM_SELLERNAME", jdbcType = JdbcType.VARCHAR),
            @Result(column = "CM_LAT", property = "CM_LAT", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_LON", property = "CM_LON", jdbcType = JdbcType.DOUBLE),
            @Result(column = "CM_BRAND", property = "CM_BRAND", jdbcType = JdbcType.VARCHAR)
    })
    List<SellerDetail> getSellerDetail(String sellerid);
}
