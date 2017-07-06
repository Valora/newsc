package com.sc.domain.generator;

public class RadCode {
    private String CM_USERID;

    private Integer CM_CODE;

    public String getCM_USERID() {
        return CM_USERID;
    }

    public void setCM_USERID(String CM_USERID) {
        this.CM_USERID = CM_USERID == null ? null : CM_USERID.trim();
    }

    public Integer getCM_CODE() {
        return CM_CODE;
    }

    public void setCM_CODE(Integer CM_CODE) {
        this.CM_CODE = CM_CODE;
    }
}