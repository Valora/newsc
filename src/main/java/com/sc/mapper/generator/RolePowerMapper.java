package com.sc.mapper.generator;

import com.sc.domain.generator.RolePower;
import com.sc.domain.generator.RolePowerExample;
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

public interface RolePowerMapper {
    @SelectProvider(type=RolePowerSqlProvider.class, method="countByExample")
    long countByExample(RolePowerExample example);

    @DeleteProvider(type=RolePowerSqlProvider.class, method="deleteByExample")
    int deleteByExample(RolePowerExample example);

    @Insert({
        "insert into TB_ROLE_POWER (CM_ID, CM_ROLEID, ",
        "CM_POWERID)",
        "values (#{cmId,jdbcType=INTEGER}, #{cmRoleid,jdbcType=INTEGER}, ",
        "#{cmPowerid,jdbcType=INTEGER})"
    })
    int insert(RolePower record);

    @InsertProvider(type=RolePowerSqlProvider.class, method="insertSelective")
    int insertSelective(RolePower record);

    @SelectProvider(type=RolePowerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ID", property="cmId", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ROLEID", property="cmRoleid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_POWERID", property="cmPowerid", jdbcType= JdbcType.INTEGER)
    })
    List<RolePower> selectByExample(RolePowerExample example);

    @UpdateProvider(type=RolePowerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RolePower record, @Param("example") RolePowerExample example);

    @UpdateProvider(type=RolePowerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RolePower record, @Param("example") RolePowerExample example);
}