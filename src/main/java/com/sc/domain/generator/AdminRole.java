package com.sc.domain.generator;

public class AdminRole {
    private Integer CM_ID;

    private String CM_ADMINID;

    private Integer CM_ROLEID;

    public Integer getCM_ID() {
        return CM_ID;
    }

    public void setCM_ID(Integer CM_ID) {
        this.CM_ID = CM_ID;
    }

    public String getCM_ADMINID() {
        return CM_ADMINID;
    }

    public void setCM_ADMINID(String CM_ADMINID) {
        this.CM_ADMINID = CM_ADMINID == null ? null : CM_ADMINID.trim();
    }

    public Integer getCM_ROLEID() {
        return CM_ROLEID;
    }

    public void setCM_ROLEID(Integer CM_ROLEID) {
        this.CM_ROLEID = CM_ROLEID;
    }
}