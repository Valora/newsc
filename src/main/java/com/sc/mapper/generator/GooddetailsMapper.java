package com.sc.mapper.generator;

import com.sc.domain.generator.Gooddetails;
import com.sc.domain.generator.GooddetailsExample;
import com.sc.domain.generator.GooddetailsWithBLOBs;
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

public interface GooddetailsMapper {
    @SelectProvider(type=GooddetailsSqlProvider.class, method="countByExample")
    long countByExample(GooddetailsExample example);

    @DeleteProvider(type=GooddetailsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GooddetailsExample example);

    @Insert({
        "insert into TB_GOODSDETAILS (CM_GOODSDETAILSID, CM_GOODSID, ",
        "CM_COLOR, CM_IMAGEPATH, ",
        "CM_SPEC_STOCK)",
        "values (#{cmGoodsdetailsid,jdbcType=INTEGER}, #{cmGoodsid,jdbcType=VARCHAR}, ",
        "#{cmColor,jdbcType=VARCHAR}, #{cmImagepath,jdbcType=VARCHAR}, ",
        "#{cmSpecStock,jdbcType=LONGVARCHAR})"
    })
    int insert(GooddetailsWithBLOBs record);

    @InsertProvider(type=GooddetailsSqlProvider.class, method="insertSelective")
    int insertSelective(GooddetailsWithBLOBs record);

    @SelectProvider(type=GooddetailsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_GOODSDETAILSID", property="cmGoodsdetailsid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_COLOR", property="cmColor", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_IMAGEPATH", property="cmImagepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SPEC_STOCK", property="cmSpecStock", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<GooddetailsWithBLOBs> selectByExampleWithBLOBs(GooddetailsExample example);

    @SelectProvider(type=GooddetailsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_GOODSDETAILSID", property="cmGoodsdetailsid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_COLOR", property="cmColor", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_IMAGEPATH", property="cmImagepath", jdbcType= JdbcType.VARCHAR)
    })
    List<Gooddetails> selectByExample(GooddetailsExample example);

    @UpdateProvider(type=GooddetailsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GooddetailsWithBLOBs record, @Param("example") GooddetailsExample example);

    @UpdateProvider(type=GooddetailsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") GooddetailsWithBLOBs record, @Param("example") GooddetailsExample example);

    @UpdateProvider(type=GooddetailsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Gooddetails record, @Param("example") GooddetailsExample example);
}