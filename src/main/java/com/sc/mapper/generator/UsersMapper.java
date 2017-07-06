package com.sc.mapper.generator;

import com.sc.domain.generator.Users;
import com.sc.domain.generator.UsersExample;
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

public interface UsersMapper {
    @SelectProvider(type=UsersSqlProvider.class, method="countByExample")
    long countByExample(UsersExample example);

    @DeleteProvider(type=UsersSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsersExample example);

    @Insert({
        "insert into TB_USERS (CM_USERID, CM_SHOPNAME, ",
        "CM_PHONE, CM_ACCOUNT, ",
        "CM_PASSWORD, CM_INTEGRAL, ",
        "CM_BALANCE, CM_CARDPATH, ",
        "CM_STOREPATH, CM_LICENSEPATH, ",
        "CM_SHOPEADDRESS, CM_SHOPLON, ",
        "CM_SHOPLAT, CM_LEVEL, ",
        "CM_CREATETIME, CM_ISEXAMINE, ",
        "CM_REASON, CM_CARDNO, ",
        "CM_NAME, CM_CONTACTNAME, ",
        "CM_CONTACTPHONE, CM_TELEPHONE, ",
        "CM_PAX)",
        "values (#{CM_USERID,jdbcType=VARCHAR}, #{CM_SHOPNAME,jdbcType=VARCHAR}, ",
        "#{CM_PHONE,jdbcType=BIGINT}, #{CM_ACCOUNT,jdbcType=VARCHAR}, ",
        "#{CM_PASSWORD,jdbcType=VARCHAR}, #{CM_INTEGRAL,jdbcType=INTEGER}, ",
        "#{CM_BALANCE,jdbcType=DOUBLE}, #{CM_CARDPATH,jdbcType=VARCHAR}, ",
        "#{CM_STOREPATH,jdbcType=VARCHAR}, #{CM_LICENSEPATH,jdbcType=VARCHAR}, ",
        "#{CM_SHOPEADDRESS,jdbcType=VARCHAR}, #{CM_SHOPLON,jdbcType=DOUBLE}, ",
        "#{CM_SHOPLAT,jdbcType=DOUBLE}, #{CM_LEVEL,jdbcType=INTEGER}, ",
        "#{CM_CREATETIME,jdbcType=TIMESTAMP}, #{CM_ISEXAMINE,jdbcType=INTEGER}, ",
        "#{CM_REASON,jdbcType=VARCHAR}, #{CM_CARDNO,jdbcType=VARCHAR}, ",
        "#{CM_NAME,jdbcType=VARCHAR}, #{CM_CONTACTNAME,jdbcType=VARCHAR}, ",
        "#{CM_CONTACTPHONE,jdbcType=VARCHAR}, #{CM_TELEPHONE,jdbcType=VARCHAR}, ",
        "#{CM_PAX,jdbcType=VARCHAR})"
    })
    int insert(Users record);

    @InsertProvider(type=UsersSqlProvider.class, method="insertSelective")
    int insertSelective(Users record);

    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_USERID", property="CM_USERID", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPNAME", property="CM_SHOPNAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="CM_PHONE", jdbcType=JdbcType.BIGINT),
        @Result(column="CM_ACCOUNT", property="CM_ACCOUNT", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PASSWORD", property="CM_PASSWORD", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_INTEGRAL", property="CM_INTEGRAL", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_BALANCE", property="CM_BALANCE", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_CARDPATH", property="CM_CARDPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_STOREPATH", property="CM_STOREPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="CM_LICENSEPATH", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPEADDRESS", property="CM_SHOPEADDRESS", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPLON", property="CM_SHOPLON", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_SHOPLAT", property="CM_SHOPLAT", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_LEVEL", property="CM_LEVEL", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_CREATETIME", property="CM_CREATETIME", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_ISEXAMINE", property="CM_ISEXAMINE", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_REASON", property="CM_REASON", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CARDNO", property="CM_CARDNO", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_NAME", property="CM_NAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CONTACTNAME", property="CM_CONTACTNAME", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CONTACTPHONE", property="CM_CONTACTPHONE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_TELEPHONE", property="CM_TELEPHONE", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PAX", property="CM_PAX", jdbcType=JdbcType.VARCHAR)
    })
    List<Users> selectByExample(UsersExample example);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}