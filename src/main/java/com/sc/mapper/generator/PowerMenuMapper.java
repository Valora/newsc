package com.sc.mapper.generator;

import com.sc.domain.generator.PowerMenu;
import com.sc.domain.generator.PowerMenuExample;
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

public interface PowerMenuMapper {
    @SelectProvider(type=PowerMenuSqlProvider.class, method="countByExample")
    long countByExample(PowerMenuExample example);

    @DeleteProvider(type=PowerMenuSqlProvider.class, method="deleteByExample")
    int deleteByExample(PowerMenuExample example);

    @Insert({
        "insert into TB_POWER_MENU (CM_ID, CM_MENUID, ",
        "CM_POWERID)",
        "values (#{cmId,jdbcType=INTEGER}, #{cmMenuid,jdbcType=INTEGER}, ",
        "#{cmPowerid,jdbcType=INTEGER})"
    })
    int insert(PowerMenu record);

    @InsertProvider(type=PowerMenuSqlProvider.class, method="insertSelective")
    int insertSelective(PowerMenu record);

    @SelectProvider(type=PowerMenuSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ID", property="cmId", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_MENUID", property="cmMenuid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_POWERID", property="cmPowerid", jdbcType= JdbcType.INTEGER)
    })
    List<PowerMenu> selectByExample(PowerMenuExample example);

    @UpdateProvider(type=PowerMenuSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PowerMenu record, @Param("example") PowerMenuExample example);

    @UpdateProvider(type=PowerMenuSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PowerMenu record, @Param("example") PowerMenuExample example);
}