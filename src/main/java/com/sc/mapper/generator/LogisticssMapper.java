package com.sc.mapper.generator;

import com.sc.domain.generator.Logisticss;
import com.sc.domain.generator.LogisticssExample;
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

public interface LogisticssMapper {
    @SelectProvider(type=LogisticssSqlProvider.class, method="countByExample")
    long countByExample(LogisticssExample example);

    @DeleteProvider(type=LogisticssSqlProvider.class, method="deleteByExample")
    int deleteByExample(LogisticssExample example);

    @Insert({
        "insert into TB_LOGISTICSS (CM_LOGISTICSID, CM_LOGISTICSNAME)",
        "values (#{cmLogisticsid,jdbcType=INTEGER}, #{cmLogisticsname,jdbcType=VARCHAR})"
    })
    int insert(Logisticss record);

    @InsertProvider(type=LogisticssSqlProvider.class, method="insertSelective")
    int insertSelective(Logisticss record);

    @SelectProvider(type=LogisticssSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_LOGISTICSID", property="cmLogisticsid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_LOGISTICSNAME", property="cmLogisticsname", jdbcType= JdbcType.VARCHAR)
    })
    List<Logisticss> selectByExample(LogisticssExample example);

    @UpdateProvider(type=LogisticssSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Logisticss record, @Param("example") LogisticssExample example);

    @UpdateProvider(type=LogisticssSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Logisticss record, @Param("example") LogisticssExample example);
}