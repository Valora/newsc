package com.sc.domain;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_USERID
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_NICKNAME
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmNickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_PHONE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Long cmPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_ACCOUNT
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_PASSWORD
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_INTEGRAL
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Integer cmIntegral;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_BALANCE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Double cmBalance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_CARDFACEPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmCardfacepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_CARDBACKPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmCardbackpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_PERSONALPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmPersonalpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_LICENSEPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmLicensepath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_SHOPEADDRESS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmShopeaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_SHOPLON
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Double cmShoplon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_SHOPLAT
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Double cmShoplat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_LEVEL
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Integer cmLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_CREATETIME
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Date cmCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_ISEXAMINE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private Integer cmIsexamine;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_REASON
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_USERS.CM_CARDNO
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    private String cmCardno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_USERID
     *
     * @return the value of TB_USERS.CM_USERID
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmUserid() {
        return cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_USERID
     *
     * @param cmUserid the value for TB_USERS.CM_USERID
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_NICKNAME
     *
     * @return the value of TB_USERS.CM_NICKNAME
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmNickname() {
        return cmNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_NICKNAME
     *
     * @param cmNickname the value for TB_USERS.CM_NICKNAME
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmNickname(String cmNickname) {
        this.cmNickname = cmNickname == null ? null : cmNickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_PHONE
     *
     * @return the value of TB_USERS.CM_PHONE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Long getCmPhone() {
        return cmPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_PHONE
     *
     * @param cmPhone the value for TB_USERS.CM_PHONE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmPhone(Long cmPhone) {
        this.cmPhone = cmPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_ACCOUNT
     *
     * @return the value of TB_USERS.CM_ACCOUNT
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmAccount() {
        return cmAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_ACCOUNT
     *
     * @param cmAccount the value for TB_USERS.CM_ACCOUNT
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmAccount(String cmAccount) {
        this.cmAccount = cmAccount == null ? null : cmAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_PASSWORD
     *
     * @return the value of TB_USERS.CM_PASSWORD
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmPassword() {
        return cmPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_PASSWORD
     *
     * @param cmPassword the value for TB_USERS.CM_PASSWORD
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmPassword(String cmPassword) {
        this.cmPassword = cmPassword == null ? null : cmPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_INTEGRAL
     *
     * @return the value of TB_USERS.CM_INTEGRAL
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Integer getCmIntegral() {
        return cmIntegral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_INTEGRAL
     *
     * @param cmIntegral the value for TB_USERS.CM_INTEGRAL
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmIntegral(Integer cmIntegral) {
        this.cmIntegral = cmIntegral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_BALANCE
     *
     * @return the value of TB_USERS.CM_BALANCE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Double getCmBalance() {
        return cmBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_BALANCE
     *
     * @param cmBalance the value for TB_USERS.CM_BALANCE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmBalance(Double cmBalance) {
        this.cmBalance = cmBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_CARDFACEPATH
     *
     * @return the value of TB_USERS.CM_CARDFACEPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmCardfacepath() {
        return cmCardfacepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_CARDFACEPATH
     *
     * @param cmCardfacepath the value for TB_USERS.CM_CARDFACEPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmCardfacepath(String cmCardfacepath) {
        this.cmCardfacepath = cmCardfacepath == null ? null : cmCardfacepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_CARDBACKPATH
     *
     * @return the value of TB_USERS.CM_CARDBACKPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmCardbackpath() {
        return cmCardbackpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_CARDBACKPATH
     *
     * @param cmCardbackpath the value for TB_USERS.CM_CARDBACKPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmCardbackpath(String cmCardbackpath) {
        this.cmCardbackpath = cmCardbackpath == null ? null : cmCardbackpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_PERSONALPATH
     *
     * @return the value of TB_USERS.CM_PERSONALPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmPersonalpath() {
        return cmPersonalpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_PERSONALPATH
     *
     * @param cmPersonalpath the value for TB_USERS.CM_PERSONALPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmPersonalpath(String cmPersonalpath) {
        this.cmPersonalpath = cmPersonalpath == null ? null : cmPersonalpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_LICENSEPATH
     *
     * @return the value of TB_USERS.CM_LICENSEPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmLicensepath() {
        return cmLicensepath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_LICENSEPATH
     *
     * @param cmLicensepath the value for TB_USERS.CM_LICENSEPATH
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmLicensepath(String cmLicensepath) {
        this.cmLicensepath = cmLicensepath == null ? null : cmLicensepath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_SHOPEADDRESS
     *
     * @return the value of TB_USERS.CM_SHOPEADDRESS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmShopeaddress() {
        return cmShopeaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_SHOPEADDRESS
     *
     * @param cmShopeaddress the value for TB_USERS.CM_SHOPEADDRESS
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmShopeaddress(String cmShopeaddress) {
        this.cmShopeaddress = cmShopeaddress == null ? null : cmShopeaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_SHOPLON
     *
     * @return the value of TB_USERS.CM_SHOPLON
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Double getCmShoplon() {
        return cmShoplon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_SHOPLON
     *
     * @param cmShoplon the value for TB_USERS.CM_SHOPLON
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmShoplon(Double cmShoplon) {
        this.cmShoplon = cmShoplon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_SHOPLAT
     *
     * @return the value of TB_USERS.CM_SHOPLAT
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Double getCmShoplat() {
        return cmShoplat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_SHOPLAT
     *
     * @param cmShoplat the value for TB_USERS.CM_SHOPLAT
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmShoplat(Double cmShoplat) {
        this.cmShoplat = cmShoplat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_LEVEL
     *
     * @return the value of TB_USERS.CM_LEVEL
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Integer getCmLevel() {
        return cmLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_LEVEL
     *
     * @param cmLevel the value for TB_USERS.CM_LEVEL
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmLevel(Integer cmLevel) {
        this.cmLevel = cmLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_CREATETIME
     *
     * @return the value of TB_USERS.CM_CREATETIME
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Date getCmCreatetime() {
        return cmCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_CREATETIME
     *
     * @param cmCreatetime the value for TB_USERS.CM_CREATETIME
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmCreatetime(Date cmCreatetime) {
        this.cmCreatetime = cmCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_ISEXAMINE
     *
     * @return the value of TB_USERS.CM_ISEXAMINE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public Integer getCmIsexamine() {
        return cmIsexamine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_ISEXAMINE
     *
     * @param cmIsexamine the value for TB_USERS.CM_ISEXAMINE
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmIsexamine(Integer cmIsexamine) {
        this.cmIsexamine = cmIsexamine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_REASON
     *
     * @return the value of TB_USERS.CM_REASON
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmReason() {
        return cmReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_REASON
     *
     * @param cmReason the value for TB_USERS.CM_REASON
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmReason(String cmReason) {
        this.cmReason = cmReason == null ? null : cmReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_USERS.CM_CARDNO
     *
     * @return the value of TB_USERS.CM_CARDNO
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public String getCmCardno() {
        return cmCardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_USERS.CM_CARDNO
     *
     * @param cmCardno the value for TB_USERS.CM_CARDNO
     *
     * @mbg.generated Thu Apr 06 15:57:05 CST 2017
     */
    public void setCmCardno(String cmCardno) {
        this.cmCardno = cmCardno == null ? null : cmCardno.trim();
    }
}