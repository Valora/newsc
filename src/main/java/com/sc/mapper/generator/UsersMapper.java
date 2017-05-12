package com.sc.mapper.generator;

import com.sc.domain.generator.Users;
import com.sc.domain.generator.UsersExample;
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
        "values (#{cmUserid,jdbcType=VARCHAR}, #{cmShopname,jdbcType=VARCHAR}, ",
        "#{cmPhone,jdbcType=BIGINT}, #{cmAccount,jdbcType=VARCHAR}, ",
        "#{cmPassword,jdbcType=VARCHAR}, #{cmIntegral,jdbcType=INTEGER}, ",
        "#{cmBalance,jdbcType=DOUBLE}, #{cmCardpath,jdbcType=VARCHAR}, ",
        "#{cmStorepath,jdbcType=VARCHAR}, #{cmLicensepath,jdbcType=VARCHAR}, ",
        "#{cmShopeaddress,jdbcType=VARCHAR}, #{cmShoplon,jdbcType=DOUBLE}, ",
        "#{cmShoplat,jdbcType=DOUBLE}, #{cmLevel,jdbcType=INTEGER}, ",
        "#{cmCreatetime,jdbcType=TIMESTAMP}, #{cmIsexamine,jdbcType=INTEGER}, ",
        "#{cmReason,jdbcType=VARCHAR}, #{cmCardno,jdbcType=VARCHAR}, ",
        "#{cmName,jdbcType=VARCHAR}, #{cmContactname,jdbcType=VARCHAR}, ",
        "#{cmContactphone,jdbcType=VARCHAR}, #{cmTelephone,jdbcType=VARCHAR}, ",
        "#{cmPax,jdbcType=VARCHAR})"
    })
    int insert(Users record);

    @InsertProvider(type=UsersSqlProvider.class, method="insertSelective")
    int insertSelective(Users record);

    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_USERID", property="cmUserid", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SHOPNAME", property="cmShopname", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="cmPhone", jdbcType= JdbcType.BIGINT),
        @Result(column="CM_ACCOUNT", property="cmAccount", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PASSWORD", property="cmPassword", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_INTEGRAL", property="cmIntegral", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_BALANCE", property="cmBalance", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_CARDPATH", property="cmCardpath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_STOREPATH", property="cmStorepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="cmLicensepath", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SHOPEADDRESS", property="cmShopeaddress", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_SHOPLON", property="cmShoplon", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_SHOPLAT", property="cmShoplat", jdbcType= JdbcType.DOUBLE),
        @Result(column="CM_LEVEL", property="cmLevel", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType= JdbcType.TIMESTAMP),
        @Result(column="CM_ISEXAMINE", property="cmIsexamine", jdbcType= JdbcType.INTEGER),
        @Result(column="CM_REASON", property="cmReason", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CARDNO", property="cmCardno", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_NAME", property="cmName", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CONTACTNAME", property="cmContactname", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_CONTACTPHONE", property="cmContactphone", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_TELEPHONE", property="cmTelephone", jdbcType= JdbcType.VARCHAR),
        @Result(column="CM_PAX", property="cmPax", jdbcType= JdbcType.VARCHAR)
    })
    List<Users> selectByExample(UsersExample example);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);
}