package com.sc.mapper.generator;

import com.sc.domain.generator.Notices;
import com.sc.domain.generator.NoticesExample;
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
        "values (#{CM_NOTICEIID,jdbcType=INTEGER}, #{CM_TITLE,jdbcType=VARCHAR}, ",
        "#{CM_CONTENT,jdbcType=VARCHAR}, #{CM_OTHER,jdbcType=VARCHAR}, ",
        "#{CM_CREATOR,jdbcType=VARCHAR}, #{CM_DEADLINE,jdbcType=TIMESTAMP}, ",
        "#{CM_ADMINID,jdbcType=VARCHAR}, #{CM_CREATETIME,jdbcType=TIMESTAMP})"
    })
    int insert(Notices record);

    @InsertProvider(type=NoticesSqlProvider.class, method="insertSelective")
    int insertSelective(Notices record);

    @SelectProvider(type=NoticesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_NOTICEIID", property="CM_NOTICEIID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_TITLE", property="CM_TITLE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CONTENT", property="CM_CONTENT", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_OTHER", property="CM_OTHER", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATOR", property="CM_CREATOR", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_DEADLINE", property="CM_DEADLINE", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_ADMINID", property="CM_ADMINID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Notices> selectByExample(NoticesExample example);

    @UpdateProvider(type=NoticesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Notices record, @Param("example") NoticesExample example);

    @UpdateProvider(type=NoticesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Notices record, @Param("example") NoticesExample example);
}