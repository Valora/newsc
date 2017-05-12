package com.sc.mapper.generator;

import com.sc.domain.generator.Roles;
import com.sc.domain.generator.RolesExample;
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

public interface RolesMapper {
    @SelectProvider(type=RolesSqlProvider.class, method="countByExample")
    long countByExample(RolesExample example);

    @DeleteProvider(type=RolesSqlProvider.class, method="deleteByExample")
    int deleteByExample(RolesExample example);

    @Insert({
        "insert into TB_ROLES (CM_ROLEID, CM_ROLENAME)",
        "values (#{cmRoleid,jdbcType=INTEGER}, #{cmRolename,jdbcType=VARCHAR})"
    })
    int insert(Roles record);

    @InsertProvider(type=RolesSqlProvider.class, method="insertSelective")
    int insertSelective(Roles record);

    @SelectProvider(type=RolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ROLEID", property="cmRoleid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ROLENAME", property="cmRolename", jdbcType= JdbcType.VARCHAR)
    })
    List<Roles> selectByExample(RolesExample example);

    @UpdateProvider(type=RolesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    @UpdateProvider(type=RolesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);
}