package com.sc.domain.generator;

public class Roles {
    private Integer CM_ROLEID;

    private String CM_ROLENAME;

    public Integer getCM_ROLEID() {
        return CM_ROLEID;
    }

    public void setCM_ROLEID(Integer CM_ROLEID) {
        this.CM_ROLEID = CM_ROLEID;
    }

    public String getCM_ROLENAME() {
        return CM_ROLENAME;
    }

    public void setCM_ROLENAME(String CM_ROLENAME) {
        this.CM_ROLENAME = CM_ROLENAME == null ? null : CM_ROLENAME.trim();
    }
}