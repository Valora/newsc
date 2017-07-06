package com.sc.mapper.generator;

import com.sc.domain.generator.Brands;
import com.sc.domain.generator.BrandsExample;
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

public interface BrandsMapper {
    @SelectProvider(type=BrandsSqlProvider.class, method="countByExample")
    long countByExample(BrandsExample example);

    @DeleteProvider(type=BrandsSqlProvider.class, method="deleteByExample")
    int deleteByExample(BrandsExample example);

    @Insert({
        "insert into TB_BRANDS (CM_BRANDID, CM_BRAND, ",
        "CM_OTHER)",
        "values (#{CM_BRANDID,jdbcType=INTEGER}, #{CM_BRAND,jdbcType=VARCHAR}, ",
        "#{CM_OTHER,jdbcType=VARCHAR})"
    })
    int insert(Brands record);

    @InsertProvider(type=BrandsSqlProvider.class, method="insertSelective")
    int insertSelective(Brands record);

    @SelectProvider(type=BrandsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_BRANDID", property="CM_BRANDID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_BRAND", property="CM_BRAND", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_OTHER", property="CM_OTHER", jdbcType=JdbcType.VARCHAR)
    })
    List<Brands> selectByExample(BrandsExample example);

    @UpdateProvider(type=BrandsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Brands record, @Param("example") BrandsExample example);

    @UpdateProvider(type=BrandsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Brands record, @Param("example") BrandsExample example);
}