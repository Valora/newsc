package com.sc.mapper;

import com.sc.domain.User;
import com.sc.domain.UserExample;
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

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @Insert({
        "insert into TB_USERS (CM_USERID, CM_NICKNAME, ",
        "CM_PHONE, CM_ACCOUNT, ",
        "CM_PASSWORD, CM_INTEGRAL, ",
        "CM_BALANCE, CM_CARDFACEPATH, ",
        "CM_CARDBACKPATH, CM_PERSONALPATH, ",
        "CM_LICENSEPATH, CM_SHOPEADDRESS, ",
        "CM_SHOPLON, CM_SHOPLAT, ",
        "CM_LEVEL, CM_CREATETIME, ",
        "CM_ISEXAMINE, CM_REASON, ",
        "CM_CARDNO)",
        "values (#{cmUserid,jdbcType=VARCHAR}, #{cmNickname,jdbcType=VARCHAR}, ",
        "#{cmPhone,jdbcType=BIGINT}, #{cmAccount,jdbcType=VARCHAR}, ",
        "#{cmPassword,jdbcType=VARCHAR}, #{cmIntegral,jdbcType=INTEGER}, ",
        "#{cmBalance,jdbcType=DOUBLE}, #{cmCardfacepath,jdbcType=VARCHAR}, ",
        "#{cmCardbackpath,jdbcType=VARCHAR}, #{cmPersonalpath,jdbcType=VARCHAR}, ",
        "#{cmLicensepath,jdbcType=VARCHAR}, #{cmShopeaddress,jdbcType=VARCHAR}, ",
        "#{cmShoplon,jdbcType=DOUBLE}, #{cmShoplat,jdbcType=DOUBLE}, ",
        "#{cmLevel,jdbcType=INTEGER}, #{cmCreatetime,jdbcType=TIMESTAMP}, ",
        "#{cmIsexamine,jdbcType=INTEGER}, #{cmReason,jdbcType=VARCHAR}, ",
        "#{cmCardno,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CM_USERID", property="cmUserid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_NICKNAME", property="cmNickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PHONE", property="cmPhone", jdbcType=JdbcType.BIGINT),
        @Result(column="CM_ACCOUNT", property="cmAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PASSWORD", property="cmPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_INTEGRAL", property="cmIntegral", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_BALANCE", property="cmBalance", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_CARDFACEPATH", property="cmCardfacepath", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CARDBACKPATH", property="cmCardbackpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_PERSONALPATH", property="cmPersonalpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_LICENSEPATH", property="cmLicensepath", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPEADDRESS", property="cmShopeaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_SHOPLON", property="cmShoplon", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_SHOPLAT", property="cmShoplat", jdbcType=JdbcType.DOUBLE),
        @Result(column="CM_LEVEL", property="cmLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_CREATETIME", property="cmCreatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CM_ISEXAMINE", property="cmIsexamine", jdbcType=JdbcType.INTEGER),
        @Result(column="CM_REASON", property="cmReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="CM_CARDNO", property="cmCardno", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_USERS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}