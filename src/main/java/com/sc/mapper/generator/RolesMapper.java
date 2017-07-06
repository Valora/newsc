package com.sc.mapper.generator;

import com.sc.domain.generator.Roles;
import com.sc.domain.generator.RolesExample;
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

public interface RolesMapper {
    @SelectProvider(type=RolesSqlProvider.class, method="countByExample")
    long countByExample(RolesExample example);

    @DeleteProvider(type=RolesSqlProvider.class, method="deleteByExample")
    int deleteByExample(RolesExample example);

    @Insert({
        "insert into TB_ROLES (CM_ROLEID, CM_ROLENAME)",
        "values (#{CM_ROLEID,jdbcType=INTEGER}, #{CM_ROLENAME,jdbcType=VARCHAR})"
    })
    int insert(Roles record);

    @InsertProvider(type=RolesSqlProvider.class, method="insertSelective")
    int insertSelective(Roles record);

    @SelectProvider(type=RolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ROLEID", property="CM_ROLEID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ROLENAME", property="CM_ROLENAME", jdbcType=JdbcType.VARCHAR)
    })
    List<Roles> selectByExample(RolesExample example);

    @UpdateProvider(type=RolesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    @UpdateProvider(type=RolesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);
}