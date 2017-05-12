package com.sc.domain.generator;

public class Admins {
    private String cmAdminid;

    private String cmName;

    private String cmAccount;

    private String cmPassword;

    private Integer cmLevel;

    private Long cmPhone;

    public String getCmAdminid() {
        return cmAdminid;
    }

    public void setCmAdminid(String cmAdminid) {
        this.cmAdminid = cmAdminid == null ? null : cmAdminid.trim();
    }

    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName == null ? null : cmName.trim();
    }

    public String getCmAccount() {
        return cmAccount;
    }

    public void setCmAccount(String cmAccount) {
        this.cmAccount = cmAccount == null ? null : cmAccount.trim();
    }

    public String getCmPassword() {
        return cmPassword;
    }

    public void setCmPassword(String cmPassword) {
        this.cmPassword = cmPassword == null ? null : cmPassword.trim();
    }

    public Integer getCmLevel() {
        return cmLevel;
    }

    public void setCmLevel(Integer cmLevel) {
        this.cmLevel = cmLevel;
    }

    public Long getCmPhone() {
        return cmPhone;
    }

    public void setCmPhone(Long cmPhone) {
        this.cmPhone = cmPhone;
    }
}