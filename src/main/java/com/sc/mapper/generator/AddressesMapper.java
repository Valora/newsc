package com.sc.mapper.generator;

import com.sc.domain.generator.Addresses;
import com.sc.domain.generator.AddressesExample;
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

public interface AddressesMapper {
    @SelectProvider(type=AddressesSqlProvider.class, method="countByExample")
    long countByExample(AddressesExample example);

    @DeleteProvider(type=AddressesSqlProvider.class, method="deleteByExample")
    int deleteByExample(AddressesExample example);

    @Insert({
        "insert into TB_ADDRESSES (CM_ADDRESSID, CM_ADDRESS, ",
        "CM_USERID, CM_ISFIRST, ",
        "CM_NAME, CM_PHONE)",
        "values (#{CM_ADDRESSID,jdbcType=INTEGER}, #{CM_ADDRESS,jdbcType=VARCHAR}, ",
        "#{CM_USERID,jdbcType=VARCHAR}, #{CM_ISFIRST,jdbcType=INTEGER}, ",
        "#{CM_NAME,jdbcType=VARCHAR}, #{CM_PHONE,jdbcType=BIGINT})"
    })
    int insert(Addresses record);

    @InsertProvider(type=AddressesSqlProvider.class, method="insertSelective")
    int insertSelective(Addresses record);

    @SelectProvider(type=AddressesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ADDRESSID", property="CM_ADDRESSID", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_ADDRESS", property="CM_ADDRESS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_ISFIRST", property="CM_ISFIRST", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_NAME", property="CM_NAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="CM_PHONE", jdbcType=JdbcType.BIGINT)
    })
    List<Addresses> selectByExample(AddressesExample example);

    @UpdateProvider(type=AddressesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Addresses record, @Param("example") AddressesExample example);

    @UpdateProvider(type=AddressesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Addresses record, @Param("example") AddressesExample example);
}