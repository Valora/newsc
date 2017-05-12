package com.sc.mapper.generator;

import com.sc.domain.generator.Menus;
import com.sc.domain.generator.MenusExample;
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

public interface MenusMapper {
    @SelectProvider(type=MenusSqlProvider.class, method="countByExample")
    long countByExample(MenusExample example);

    @DeleteProvider(type=MenusSqlProvider.class, method="deleteByExample")
    int deleteByExample(MenusExample example);

    @Insert({
        "insert into TB_MENUS (CM_MENUID, CM_MENUNAME, ",
        "CM_MENUURL)",
        "values (#{cmMenuid,jdbcType=INTEGER}, #{cmMenuname,jdbcType=VARCHAR}, ",
        "#{cmMenuurl,jdbcType=VARCHAR})"
    })
    int insert(Menus record);

    @InsertProvider(type=MenusSqlProvider.class, method="insertSelective")
    int insertSelective(Menus record);

    @SelectProvider(type=MenusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_MENUID", property="cmMenuid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_MENUNAME", property="cmMenuname", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_MENUURL", property="cmMenuurl", jdbcType= JdbcType.VARCHAR)
    })
    List<Menus> selectByExample(MenusExample example);

    @UpdateProvider(type=MenusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Menus record, @Param("example") MenusExample example);

    @UpdateProvider(type=MenusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Menus record, @Param("example") MenusExample example);
}