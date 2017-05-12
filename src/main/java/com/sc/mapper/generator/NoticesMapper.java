package com.sc.mapper.generator;

import com.sc.domain.generator.Notices;
import com.sc.domain.generator.NoticesExample;
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

public interface NoticesMapper {
    @SelectProvider(type=NoticesSqlProvider.class, method="countByExample")
    long countByExample(NoticesExample example);

    @DeleteProvider(type=NoticesSqlProvider.class, method="deleteByExample")
    int deleteByExample(NoticesExample example);

    @Insert({
        "insert into TB_NOTICES (CM_NOTICEIID, CM_TITLE, ",
        "CM_CONTENT, CM_OTHER, ",
        "CM_CREATOR, CM_DEADLINE, ",
        "CM_ADMINID, CM_CREATETIME)",
        "values (#{cmNoticeiid,jdbcType=INTEGER}, #{cmTitle,jdbcType=VARCHAR}, ",
        "#{cmContent,jdbcType=VARCHAR}, #{cmOther,jdbcType=VARCHAR}, ",
        "#{cmCreator,jdbcType=VARCHAR}, #{cmDeadline,jdbcType=TIMESTAMP}, ",
        "#{cmAdminid,jdbcType=VARCHAR}, #{cmCreatetime,jdbcType=TIMESTAMP})"
    })
    int insert(Notices record);

    @InsertProvider(type=NoticesSqlProvider.class, method="insertSelective")
    int insertSelective(Notices record);

    @SelectProvider(type=NoticesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_NOTICEIID", property="cmNoticeiid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_TITLE", property="cmTitle", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CONTENT", property="cmContent", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_OTHER", property="cmOther", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATOR", property="cmCreator", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_DEADLINE", property="cmDeadline", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_ADMINID", property="cmAdminid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP)
    })
    List<Notices> selectByExample(NoticesExample example);

    @UpdateProvider(type=NoticesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Notices record, @Param("example") NoticesExample example);

    @UpdateProvider(type=NoticesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Notices record, @Param("example") NoticesExample example);
}