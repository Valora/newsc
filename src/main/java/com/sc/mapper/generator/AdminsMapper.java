package com.sc.mapper.generator;

import com.sc.domain.generator.Admins;
import com.sc.domain.generator.AdminsExample;
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

public interface AdminsMapper {
    @SelectProvider(type=AdminsSqlProvider.class, method="countByExample")
    long countByExample(AdminsExample example);

    @DeleteProvider(type=AdminsSqlProvider.class, method="deleteByExample")
    int deleteByExample(AdminsExample example);

    @Insert({
        "insert into TB_ADMINS (CM_ADMINID, CM_NAME, ",
        "CM_ACCOUNT, CM_PASSWORD, ",
        "CM_LEVEL, CM_PHONE)",
        "values (#{cmAdminid,jdbcType=VARCHAR}, #{cmName,jdbcType=VARCHAR}, ",
        "#{cmAccount,jdbcType=VARCHAR}, #{cmPassword,jdbcType=VARCHAR}, ",
        "#{cmLevel,jdbcType=INTEGER}, #{cmPhone,jdbcType=BIGINT})"
    })
    int insert(Admins record);

    @InsertProvider(type=AdminsSqlProvider.class, method="insertSelective")
    int insertSelective(Admins record);

    @SelectProvider(type=AdminsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ADMINID", property="cmAdminid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_NAME", property="cmName", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ACCOUNT", property="cmAccount", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PASSWORD", property="cmPassword", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LEVEL", property="cmLevel", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_PHONE", property="cmPhone", jdbcType= JdbcType.BIGINT)
    })
    List<Admins> selectByExample(AdminsExample example);

    @UpdateProvider(type=AdminsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Admins record, @Param("example") AdminsExample example);

    @UpdateProvider(type=AdminsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Admins record, @Param("example") AdminsExample example);
}