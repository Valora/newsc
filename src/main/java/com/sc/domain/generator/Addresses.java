package com.sc.domain.generator;

public class Addresses {
    private Integer CM_ADDRESSID;

    private String CM_ADDRESS;

    private String CM_USERID;

    private Integer CM_ISFIRST;

    private String CM_NAME;

    private Long CM_PHONE;

    public Integer getCM_ADDRESSID() {
        return CM_ADDRESSID;
    }

    public void setCM_ADDRESSID(Integer CM_ADDRESSID) {
        this.CM_ADDRESSID = CM_ADDRESSID;
    }

    public String getCM_ADDRESS() {
        return CM_ADDRESS;
    }

    public void setCM_ADDRESS(String CM_ADDRESS) {
        this.CM_ADDRESS = CM_ADDRESS == null ? null : CM_ADDRESS.trim();
    }

    public String getCM_USERID() {
        return CM_USERID;
    }

    public void setCM_USERID(String CM_USERID) {
        this.CM_USERID = CM_USERID == null ? null : CM_USERID.trim();
    }

    public Integer getCM_ISFIRST() {
        return CM_ISFIRST;
    }

    public void setCM_ISFIRST(Integer CM_ISFIRST) {
        this.CM_ISFIRST = CM_ISFIRST;
    }

    public String getCM_NAME() {
        return CM_NAME;
    }

    public void setCM_NAME(String CM_NAME) {
        this.CM_NAME = CM_NAME == null ? null : CM_NAME.trim();
    }

    public Long getCM_PHONE() {
        return CM_PHONE;
    }

    public void setCM_PHONE(Long CM_PHONE) {
        this.CM_PHONE = CM_PHONE;
    }
}