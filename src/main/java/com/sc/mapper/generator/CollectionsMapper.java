package com.sc.mapper.generator;

import com.sc.domain.generator.Collections;
import com.sc.domain.generator.CollectionsExample;
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

public interface CollectionsMapper {
    @SelectProvider(type=CollectionsSqlProvider.class, method="countByExample")
    long countByExample(CollectionsExample example);

    @DeleteProvider(type=CollectionsSqlProvider.class, method="deleteByExample")
    int deleteByExample(CollectionsExample example);

    @Insert({
        "insert into TB_COLLECTIONS (CM_COLLECTIONID, CM_USERID, ",
        "CM_GOODSID, CM_JOINTIME)",
        "values (#{CM_COLLECTIONID,jdbcType=INTEGER}, #{CM_USERID,jdbcType=VARCHAR}, ",
        "#{CM_GOODSID,jdbcType=VARCHAR}, #{CM_JOINTIME,jdbcType=TIMESTAMP})"
    })
    int insert(Collections record);

    @InsertProvider(type=CollectionsSqlProvider.class, method="insertSelective")
    int insertSelective(Collections record);

    @SelectProvider(type=CollectionsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_COLLECTIONID", property="CM_COLLECTIONID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_GOODSID", property="CM_GOODSID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_JOINTIME", property="CM_JOINTIME", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Collections> selectByExample(CollectionsExample example);

    @UpdateProvider(type=CollectionsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Collections record, @Param("example") CollectionsExample example);

    @UpdateProvider(type=CollectionsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Collections record, @Param("example") CollectionsExample example);
}