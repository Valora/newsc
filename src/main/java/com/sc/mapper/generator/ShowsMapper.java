package com.sc.mapper.generator;

import com.sc.domain.generator.Shows;
import com.sc.domain.generator.ShowsExample;
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

public interface ShowsMapper {
    @SelectProvider(type=ShowsSqlProvider.class, method="countByExample")
    long countByExample(ShowsExample example);

    @DeleteProvider(type=ShowsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShowsExample example);

    @Insert({
        "insert into TB_SHOWS (CM_SHOWID, CM_PATH, ",
        "CM_GOODSID, CM_ISTOP, ",
        "CM_URL)",
        "values (#{cmShowid,jdbcType=INTEGER}, #{cmPath,jdbcType=VARCHAR}, ",
        "#{cmGoodsid,jdbcType=VARCHAR}, #{cmIstop,jdbcType=INTEGER}, ",
        "#{cmUrl,jdbcType=VARCHAR})"
    })
    int insert(Shows record);

    @InsertProvider(type=ShowsSqlProvider.class, method="insertSelective")
    int insertSelective(Shows record);

    @SelectProvider(type=ShowsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_SHOWID", property="cmShowid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_PATH", property="cmPath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="cmGoodsid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ISTOP", property="cmIstop", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_URL", property="cmUrl", jdbcType= JdbcType.VARCHAR)
    })
    List<Shows> selectByExample(ShowsExample example);

    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Shows record, @Param("example") ShowsExample example);

    @UpdateProvider(type=ShowsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Shows record, @Param("example") ShowsExample example);
}