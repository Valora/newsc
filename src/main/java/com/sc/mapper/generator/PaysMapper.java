package com.sc.mapper.generator;

import com.sc.domain.generator.Pays;
import com.sc.domain.generator.PaysExample;
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

public interface PaysMapper {
    @SelectProvider(type=PaysSqlProvider.class, method="countByExample")
    long countByExample(PaysExample example);

    @DeleteProvider(type=PaysSqlProvider.class, method="deleteByExample")
    int deleteByExample(PaysExample example);

    @Insert({
        "insert into TB_PAYS (CM_PAYID, CM_ORDERID, ",
        "CM_PAYJSON, CM_TIME, ",
        "CM_PAYTYPE)",
        "values (#{CM_PAYID,jdbcType=INTEGER}, #{CM_ORDERID,jdbcType=VARCHAR}, ",
        "#{CM_PAYJSON,jdbcType=VARCHAR}, #{CM_TIME,jdbcType=TIMESTAMP}, ",
        "#{CM_PAYTYPE,jdbcType=INTEGER})"
    })
    int insert(Pays record);

    @InsertProvider(type=PaysSqlProvider.class, method="insertSelective")
    int insertSelective(Pays record);

    @SelectProvider(type=PaysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_PAYID", property="CM_PAYID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ORDERID", property="CM_ORDERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PAYJSON", property="CM_PAYJSON", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_TIME", property="CM_TIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_PAYTYPE", property="CM_PAYTYPE", jdbcType=JdbcType.INTEGER)
    })
    List<Pays> selectByExample(PaysExample example);

    @UpdateProvider(type=PaysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Pays record, @Param("example") PaysExample example);

    @UpdateProvider(type=PaysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Pays record, @Param("example") PaysExample example);
}