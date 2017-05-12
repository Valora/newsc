package com.sc.mapper.generator;

import com.sc.domain.generator.Goods;
import com.sc.domain.generator.GoodsExample;
import com.sc.domain.generator.GoodsWithBLOBs;
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

public interface GoodsMapper {
    @SelectProvider(type=GoodsSqlProvider.class, method="countByExample")
    long countByExample(GoodsExample example);

    @DeleteProvider(type=GoodsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GoodsExample example);

    @Insert({
        "insert into TB_GOODS (CM_GOODSID, CM_GOODSARTNUM, ",
        "CM_SELLERID, CM_CLASSIFYID, ",
        "CM_CLASSIFYTABS, CM_BRANDID, ",
        "CM_TITLE, CM_SALES, ",
        "CM_ORIGINALPRICE, CM_PRESENTPRICE, ",
        "CM_MAINFIGUREPATH, CM_HORIZONTALPATH, ",
        "CM_CREATETIME, CM_ISOFF, ",
        "CM_ISPROMOTION, CM_SPEC, ",
        "CM_HTML, CM_CHTML, ",
        "CM_FIGURESPATH)",
        "values (#{cmGoodsid,jdbcType=VARCHAR}, #{cmGoodsartnum,jdbcType=VARCHAR}, ",
        "#{cmSellerid,jdbcType=VARCHAR}, #{cmClassifyid,jdbcType=INTEGER}, ",
        "#{cmClassifytabs,jdbcType=VARCHAR}, #{cmBrandid,jdbcType=INTEGER}, ",
        "#{cmTitle,jdbcType=VARCHAR}, #{cmSales,jdbcType=INTEGER}, ",
        "#{cmOriginalprice,jdbcType=DOUBLE}, #{cmPresentprice,jdbcType=DOUBLE}, ",
        "#{cmMainfigurepath,jdbcType=VARCHAR}, #{cmHorizontalpath,jdbcType=VARCHAR}, ",
        "#{cmCreatetime,jdbcType=TIMESTAMP}, #{cmIsoff,jdbcType=INTEGER}, ",
        "#{cmIspromotion,jdbcType=INTEGER}, #{cmSpec,jdbcType=VARCHAR}, ",
        "#{cmHtml,jdbcType=LONGVARCHAR}, #{cmChtml,jdbcType=LONGVARCHAR}, ",
        "#{cmFigurespath,jdbcType=LONGVARCHAR})"
    })
    int insert(GoodsWithBLOBs record);

    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(GoodsWithBLOBs record);

    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_GOODSARTNUM", property="cmGoodsartnum", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SELLERID", property="cmSellerid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CLASSIFYID", property="cmClassifyid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_CLASSIFYTABS", property="cmClassifytabs", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_BRANDID", property="cmBrandid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_TITLE", property="cmTitle", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SALES", property="cmSales", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ORIGINALPRICE", property="cmOriginalprice", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_PRESENTPRICE", property="cmPresentprice", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_MAINFIGUREPATH", property="cmMainfigurepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_HORIZONTALPATH", property="cmHorizontalpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_ISOFF", property="cmIsoff", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ISPROMOTION", property="cmIspromotion", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_SPEC", property="cmSpec", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_HTML", property="cmHtml", jdbcType= JdbcType.LONGVARCHAR),
        @Result(column="CM_CHTML", property="cmChtml", jdbcType= JdbcType.LONGVARCHAR),
        @Result(column="CM_FIGURESPATH", property="cmFigurespath", jdbcType= JdbcType.LONGVARCHAR)
    })
    List<GoodsWithBLOBs> selectByExampleWithBLOBs(GoodsExample example);

    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_GOODSARTNUM", property="cmGoodsartnum", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SELLERID", property="cmSellerid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CLASSIFYID", property="cmClassifyid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_CLASSIFYTABS", property="cmClassifytabs", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_BRANDID", property="cmBrandid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_TITLE", property="cmTitle", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SALES", property="cmSales", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ORIGINALPRICE", property="cmOriginalprice", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_PRESENTPRICE", property="cmPresentprice", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_MAINFIGUREPATH", property="cmMainfigurepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_HORIZONTALPATH", property="cmHorizontalpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_ISOFF", property="cmIsoff", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ISPROMOTION", property="cmIspromotion", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_SPEC", property="cmSpec", jdbcType= JdbcType.VARCHAR)
    })
    List<Goods> selectByExample(GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);
}