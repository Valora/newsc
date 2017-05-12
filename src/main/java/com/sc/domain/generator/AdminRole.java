package com.sc.domain.generator;

public class AdminRole {
    private Integer cmId;

    private String cmAdminid;

    private Integer cmRoleid;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public String getCmAdminid() {
        return cmAdminid;
    }

    public void setCmAdminid(String cmAdminid) {
        this.cmAdminid = cmAdminid == null ? null : cmAdminid.trim();
    }

    public Integer getCmRoleid() {
        return cmRoleid;
    }

    public void setCmRoleid(Integer cmRoleid) {
        this.cmRoleid = cmRoleid;
    }
}