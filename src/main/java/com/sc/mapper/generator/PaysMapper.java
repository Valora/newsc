package com.sc.mapper.generator;

import com.sc.domain.generator.Pays;
import com.sc.domain.generator.PaysExample;
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

public interface PaysMapper {
    @SelectProvider(type=PaysSqlProvider.class, method="countByExample")
    long countByExample(PaysExample example);

    @DeleteProvider(type=PaysSqlProvider.class, method="deleteByExample")
    int deleteByExample(PaysExample example);

    @Insert({
        "insert into TB_PAYS (CM_PAYID, CM_ORDERID, ",
        "CM_PAYJSON, CM_TIME, ",
        "CM_PAYTYPE)",
        "values (#{cmPayid,jdbcType=INTEGER}, #{cmOrderid,jdbcType=VARCHAR}, ",
        "#{cmPayjson,jdbcType=VARCHAR}, #{cmTime,jdbcType=TIMESTAMP}, ",
        "#{cmPaytype,jdbcType=INTEGER})"
    })
    int insert(Pays record);

    @InsertProvider(type=PaysSqlProvider.class, method="insertSelective")
    int insertSelective(Pays record);

    @SelectProvider(type=PaysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_PAYID", property="cmPayid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ORDERID", property="cmOrderid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PAYJSON", property="cmPayjson", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_TIME", property="cmTime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_PAYTYPE", property="cmPaytype", jdbcType= JdbcType.INTEGER)
    })
    List<Pays> selectByExample(PaysExample example);

    @UpdateProvider(type=PaysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Pays record, @Param("example") PaysExample example);

    @UpdateProvider(type=PaysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Pays record, @Param("example") PaysExample example);
}