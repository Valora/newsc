package com.sc.mapper.generator;

import com.sc.domain.generator.Goods;
import com.sc.domain.generator.GoodsExample;
import com.sc.domain.generator.GoodsWithBLOBs;
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
        "values (#{CM_GOODSID,jdbcType=VARCHAR}, #{CM_GOODSARTNUM,jdbcType=VARCHAR}, ",
        "#{CM_SELLERID,jdbcType=VARCHAR}, #{CM_CLASSIFYID,jdbcType=INTEGER}, ",
        "#{CM_CLASSIFYTABS,jdbcType=VARCHAR}, #{CM_BRANDID,jdbcType=INTEGER}, ",
        "#{CM_TITLE,jdbcType=VARCHAR}, #{CM_SALES,jdbcType=INTEGER}, ",
        "#{CM_ORIGINALPRICE,jdbcType=DOUBLE}, #{CM_PRESENTPRICE,jdbcType=DOUBLE}, ",
        "#{CM_MAINFIGUREPATH,jdbcType=VARCHAR}, #{CM_HORIZONTALPATH,jdbcType=VARCHAR}, ",
        "#{CM_CREATETIME,jdbcType=TIMESTAMP}, #{CM_ISOFF,jdbcType=INTEGER}, ",
        "#{CM_ISPROMOTION,jdbcType=INTEGER}, #{CM_SPEC,jdbcType=VARCHAR}, ",
        "#{CM_HTML,jdbcType=LONGVARCHAR}, #{CM_CHTML,jdbcType=LONGVARCHAR}, ",
        "#{CM_FIGURESPATH,jdbcType=LONGVARCHAR})"
    })
    int insert(GoodsWithBLOBs record);

    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(GoodsWithBLOBs record);

    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CM_GOODSID", property="CM_GOODSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_GOODSARTNUM", property="CM_GOODSARTNUM", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SELLERID", property="CM_SELLERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CLASSIFYID", property="CM_CLASSIFYID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_CLASSIFYTABS", property="CM_CLASSIFYTABS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_BRANDID", property="CM_BRANDID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_TITLE", property="CM_TITLE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SALES", property="CM_SALES", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ORIGINALPRICE", property="CM_ORIGINALPRICE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_PRESENTPRICE", property="CM_PRESENTPRICE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_MAINFIGUREPATH", property="CM_MAINFIGUREPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_HORIZONTALPATH", property="CM_HORIZONTALPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_ISOFF", property="CM_ISOFF", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ISPROMOTION", property="CM_ISPROMOTION", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_SPEC", property="CM_SPEC", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_HTML", property="CM_HTML", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="CM_CHTML", property="CM_CHTML", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="CM_FIGURESPATH", property="CM_FIGURESPATH", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<GoodsWithBLOBs> selectByExampleWithBLOBs(GoodsExample example);

    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_GOODSID", property="CM_GOODSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_GOODSARTNUM", property="CM_GOODSARTNUM", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SELLERID", property="CM_SELLERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CLASSIFYID", property="CM_CLASSIFYID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_CLASSIFYTABS", property="CM_CLASSIFYTABS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_BRANDID", property="CM_BRANDID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_TITLE", property="CM_TITLE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SALES", property="CM_SALES", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ORIGINALPRICE", property="CM_ORIGINALPRICE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_PRESENTPRICE", property="CM_PRESENTPRICE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_MAINFIGUREPATH", property="CM_MAINFIGUREPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_HORIZONTALPATH", property="CM_HORIZONTALPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_ISOFF", property="CM_ISOFF", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ISPROMOTION", property="CM_ISPROMOTION", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_SPEC", property="CM_SPEC", jdbcType=JdbcType.VARCHAR)
    })
    List<Goods> selectByExample(GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);
}