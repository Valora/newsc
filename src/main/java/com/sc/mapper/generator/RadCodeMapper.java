package com.sc.mapper.generator;

import com.sc.domain.generator.RadCode;
import com.sc.domain.generator.RadCodeExample;
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

public interface RadCodeMapper {
    @SelectProvider(type=RadCodeSqlProvider.class, method="countByExample")
    long countByExample(RadCodeExample example);

    @DeleteProvider(type=RadCodeSqlProvider.class, method="deleteByExample")
    int deleteByExample(RadCodeExample example);

    @Insert({
        "insert into TB_RADCODE (CM_USERID, CM_CODE)",
        "values (#{cmUserid,jdbcType=VARCHAR}, #{cmCode,jdbcType=INTEGER})"
    })
    int insert(RadCode record);

    @InsertProvider(type=RadCodeSqlProvider.class, method="insertSelective")
    int insertSelective(RadCode record);

    @SelectProvider(type=RadCodeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_USERID", property="cmUserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CODE", property="cmCode", jdbcType=JdbcType.INTEGER)
    })
    List<RadCode> selectByExample(RadCodeExample example);

    @UpdateProvider(type=RadCodeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RadCode record, @Param("example") RadCodeExample example);

    @UpdateProvider(type=RadCodeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RadCode record, @Param("example") RadCodeExample example);
}