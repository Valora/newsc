package com.sc.mapper.generator;

import com.sc.domain.generator.Register;
import com.sc.domain.generator.RegisterExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RegisterMapper {
    @SelectProvider(type=RegisterSqlProvider.class, method="countByExample")
    long countByExample(RegisterExample example);

    @DeleteProvider(type=RegisterSqlProvider.class, method="deleteByExample")
    int deleteByExample(RegisterExample example);

    @Insert({
        "insert into TB_REGISTER (CM_PHONE, CM_CODE, ",
        "CM_TIME, CM_COUNT)",
        "values (#{CM_PHONE,jdbcType=BIGINT}, #{CM_CODE,jdbcType=INTEGER}, ",
        "#{CM_TIME,jdbcType=TIMESTAMP}, #{CM_COUNT,jdbcType=INTEGER})"
    })
    int insert(Register record);

    @InsertProvider(type=RegisterSqlProvider.class, method="insertSelective")
    int insertSelective(Register record);

    @SelectProvider(type=RegisterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_PHONE", property="CM_PHONE", jdbcType=JdbcType.BIGINT),
        @Result(column="CM_CODE", property="CM_CODE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_TIME", property="CM_TIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_COUNT", property="CM_COUNT", jdbcType=JdbcType.INTEGER)
    })
    List<Register> selectByExample(RegisterExample example);

    @UpdateProvider(type=RegisterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    @UpdateProvider(type=RegisterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);
}