package com.sc.mapper.generator;

import com.sc.domain.generator.Register;
import com.sc.domain.generator.RegisterExample;
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

public interface RegisterMapper {
    @SelectProvider(type=RegisterSqlProvider.class, method="countByExample")
    long countByExample(RegisterExample example);

    @DeleteProvider(type=RegisterSqlProvider.class, method="deleteByExample")
    int deleteByExample(RegisterExample example);

    @Insert({
            "insert into TB_REGISTER (CM_PHONE, CM_CODE, ",
            "CM_TIME, CM_COUNT)",
            "values (#{cmPhone,jdbcType=BIGINT}, #{cmCode,jdbcType=INTEGER}, ",
            "#{cmTime,jdbcType=TIMESTAMP}, #{cmCount,jdbcType=INTEGER})"
    })
    int insert(Register record);

    @InsertProvider(type=RegisterSqlProvider.class, method="insertSelective")
    int insertSelective(Register record);

    @SelectProvider(type=RegisterSqlProvider.class, method="selectByExample")
    @Results({
            @Result(column="CM_PHONE", property="cmPhone", jdbcType= JdbcType.BIGINT),
            @Result(column="CM_CODE", property="cmCode", jdbcType= JdbcType.INTEGER),
            @Result(column="CM_TIME", property="cmTime", jdbcType= JdbcType.TIMESTAMP),
            @Result(column="CM_COUNT", property="cmCount", jdbcType= JdbcType.INTEGER)
    })
    List<Register> selectByExample(RegisterExample example);

    @UpdateProvider(type=RegisterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    @UpdateProvider(type=RegisterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);
}