package com.sc.mapper.generator;

import com.sc.domain.generator.AdminRole;
import com.sc.domain.generator.AdminRoleExample;
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

public interface AdminRoleMapper {
    @SelectProvider(type=AdminRoleSqlProvider.class, method="countByExample")
    long countByExample(AdminRoleExample example);

    @DeleteProvider(type=AdminRoleSqlProvider.class, method="deleteByExample")
    int deleteByExample(AdminRoleExample example);

    @Insert({
        "insert into TB_ADMIN_ROLE (CM_ID, CM_ADMINID, ",
        "CM_ROLEID)",
        "values (#{cmId,jdbcType=INTEGER}, #{cmAdminid,jdbcType=VARCHAR}, ",
        "#{cmRoleid,jdbcType=INTEGER})"
    })
    int insert(AdminRole record);

    @InsertProvider(type=AdminRoleSqlProvider.class, method="insertSelective")
    int insertSelective(AdminRole record);

    @SelectProvider(type=AdminRoleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ID", property="cmId", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ADMINID", property="cmAdminid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ROLEID", property="cmRoleid", jdbcType= JdbcType.INTEGER)
    })
    List<AdminRole> selectByExample(AdminRoleExample example);

    @UpdateProvider(type=AdminRoleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    @UpdateProvider(type=AdminRoleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);
}