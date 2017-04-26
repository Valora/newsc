package com.sc.mapper.generator;

import com.sc.domain.generator.Register;
import com.sc.domain.generator.RegisterExample;
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

public interface RegisterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @SelectProvider(type=RegisterSqlProvider.class, method="countByExample")
    long countByExample(RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @DeleteProvider(type=RegisterSqlProvider.class, method="deleteByExample")
    int deleteByExample(RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @Insert({
        "insert into TB_REGISTER (CM_PHONE, CM_CODE, ",
        "CM_TIME, CM_COUNT)",
        "values (#{cmPhone,jdbcType=BIGINT}, #{cmCode,jdbcType=INTEGER}, ",
        "#{cmTime,jdbcType=TIMESTAMP}, #{cmCount,jdbcType=INTEGER})"
    })
    int insert(Register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @InsertProvider(type=RegisterSqlProvider.class, method="insertSelective")
    int insertSelective(Register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @SelectProvider(type=RegisterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_PHONE", property="cmPhone", jdbcType=JdbcType.BIGINT),
        @Result(column="CM_CODE", property="cmCode", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_TIME", property="cmTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_COUNT", property="cmCount", jdbcType=JdbcType.INTEGER)
    })
    List<Register> selectByExample(RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @UpdateProvider(type=RegisterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    @UpdateProvider(type=RegisterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);
}