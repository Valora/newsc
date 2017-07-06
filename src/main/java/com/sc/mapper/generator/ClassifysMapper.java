package com.sc.mapper.generator;

import com.sc.domain.generator.Classifys;
import com.sc.domain.generator.ClassifysExample;
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

public interface ClassifysMapper {
    @SelectProvider(type=ClassifysSqlProvider.class, method="countByExample")
    long countByExample(ClassifysExample example);

    @DeleteProvider(type=ClassifysSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClassifysExample example);

    @Insert({
        "insert into TB_CLASSIFYS (CM_CLASSIFYID, CM_CLASSIFYNAME, ",
        "CM_PARENTID, CM_IMGPATH, ",
        "CM_SORT)",
        "values (#{CM_CLASSIFYID,jdbcType=INTEGER}, #{CM_CLASSIFYNAME,jdbcType=VARCHAR}, ",
        "#{CM_PARENTID,jdbcType=INTEGER}, #{CM_IMGPATH,jdbcType=VARCHAR}, ",
        "#{CM_SORT,jdbcType=INTEGER})"
    })
    int insert(Classifys record);

    @InsertProvider(type=ClassifysSqlProvider.class, method="insertSelective")
    int insertSelective(Classifys record);

    @SelectProvider(type=ClassifysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_CLASSIFYID", property="CM_CLASSIFYID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_CLASSIFYNAME", property="CM_CLASSIFYNAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PARENTID", property="CM_PARENTID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_IMGPATH", property="CM_IMGPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SORT", property="CM_SORT", jdbcType=JdbcType.INTEGER)
    })
    List<Classifys> selectByExample(ClassifysExample example);

    @UpdateProvider(type=ClassifysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Classifys record, @Param("example") ClassifysExample example);

    @UpdateProvider(type=ClassifysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Classifys record, @Param("example") ClassifysExample example);
}