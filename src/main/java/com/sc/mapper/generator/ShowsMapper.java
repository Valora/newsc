package com.sc.mapper.generator;

import com.sc.domain.generator.Shows;
import com.sc.domain.generator.ShowsExample;
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

public interface ShowsMapper {
    @SelectProvider(type=ShowsSqlProvider.class, method="countByExample")
    long countByExample(ShowsExample example);

    @DeleteProvider(type=ShowsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShowsExample example);

    @Insert({
        "insert into TB_SHOWS (CM_SHOWID, CM_PATH, ",
        "CM_GOODSID, CM_ISTOP, ",
        "CM_URL)",
        "values (#{CM_SHOWID,jdbcType=INTEGER}, #{CM_PATH,jdbcType=VARCHAR}, ",
        "#{CM_GOODSID,jdbcType=VARCHAR}, #{CM_ISTOP,jdbcType=INTEGER}, ",
        "#{CM_URL,jdbcType=VARCHAR})"
    })
    int insert(Shows record);

    @InsertProvider(type=ShowsSqlProvider.class, method="insertSelective")
    int insertSelective(Shows record);

    @SelectProvider(type=ShowsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_SHOWID", property="CM_SHOWID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_PATH", property="CM_PATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="CM_GOODSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ISTOP", property="CM_ISTOP", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_URL", property="CM_URL", jdbcType=JdbcType.VARCHAR)
    })
    List<Shows> selectByExample(ShowsExample example);

    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Shows record, @Param("example") ShowsExample example);

    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Shows record, @Param("example") ShowsExample example);
}