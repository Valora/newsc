package com.sc.mapper.generator;

import com.sc.domain.generator.Classifys;
import com.sc.domain.generator.ClassifysExample;
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

public interface ClassifysMapper {
    @SelectProvider(type=ClassifysSqlProvider.class, method="countByExample")
    long countByExample(ClassifysExample example);

    @DeleteProvider(type=ClassifysSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClassifysExample example);

    @Insert({
        "insert into TB_CLASSIFYS (CM_CLASSIFYID, CM_CLASSIFYNAME, ",
        "CM_PARENTID, CM_IMGPATH, ",
        "CM_SORT)",
        "values (#{cmClassifyid,jdbcType=INTEGER}, #{cmClassifyname,jdbcType=VARCHAR}, ",
        "#{cmParentid,jdbcType=INTEGER}, #{cmImgpath,jdbcType=VARCHAR}, ",
        "#{cmSort,jdbcType=INTEGER})"
    })
    int insert(Classifys record);

    @InsertProvider(type=ClassifysSqlProvider.class, method="insertSelective")
    int insertSelective(Classifys record);

    @SelectProvider(type=ClassifysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_CLASSIFYID", property="cmClassifyid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_CLASSIFYNAME", property="cmClassifyname", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PARENTID", property="cmParentid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_IMGPATH", property="cmImgpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SORT", property="cmSort", jdbcType= JdbcType.INTEGER)
    })
    List<Classifys> selectByExample(ClassifysExample example);

    @UpdateProvider(type=ClassifysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Classifys record, @Param("example") ClassifysExample example);

    @UpdateProvider(type=ClassifysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Classifys record, @Param("example") ClassifysExample example);
}