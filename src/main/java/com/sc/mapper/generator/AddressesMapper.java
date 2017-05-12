package com.sc.mapper.generator;

import com.sc.domain.generator.Addresses;
import com.sc.domain.generator.AddressesExample;
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

public interface AddressesMapper {
    @SelectProvider(type=AddressesSqlProvider.class, method="countByExample")
    long countByExample(AddressesExample example);

    @DeleteProvider(type=AddressesSqlProvider.class, method="deleteByExample")
    int deleteByExample(AddressesExample example);

    @Insert({
        "insert into TB_ADDRESSES (CM_ADDRESSID, CM_ADDRESS, ",
        "CM_USERID, CM_ISFIRST, ",
        "CM_NAME, CM_PHONE)",
        "values (#{cmAddressid,jdbcType=INTEGER}, #{cmAddress,jdbcType=VARCHAR}, ",
        "#{cmUserid,jdbcType=VARCHAR}, #{cmIsfirst,jdbcType=INTEGER}, ",
        "#{cmName,jdbcType=VARCHAR}, #{cmPhone,jdbcType=BIGINT})"
    })
    int insert(Addresses record);

    @InsertProvider(type=AddressesSqlProvider.class, method="insertSelective")
    int insertSelective(Addresses record);

    @SelectProvider(type=AddressesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_ADDRESSID", property="cmAddressid", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_ADDRESS", property="cmAddress", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_ISFIRST", property="cmIsfirst", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_NAME", property="cmName", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="cmPhone", jdbcType= JdbcType.BIGINT)
    })
    List<Addresses> selectByExample(AddressesExample example);

    @UpdateProvider(type=AddressesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Addresses record, @Param("example") AddressesExample example);

    @UpdateProvider(type=AddressesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Addresses record, @Param("example") AddressesExample example);
}