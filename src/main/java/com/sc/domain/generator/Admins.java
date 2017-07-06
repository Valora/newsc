package com.sc.domain.generator;

public class Admins {
    private String CM_ADMINID;

    private String CM_NAME;

    private String CM_ACCOUNT;

    private String CM_PASSWORD;

    private Integer CM_LEVEL;

    private Long CM_PHONE;

    public String getCM_ADMINID() {
        return CM_ADMINID;
    }

    public void setCM_ADMINID(String CM_ADMINID) {
        this.CM_ADMINID = CM_ADMINID == null ? null : CM_ADMINID.trim();
    }

    public String getCM_NAME() {
        return CM_NAME;
    }

    public void setCM_NAME(String CM_NAME) {
        this.CM_NAME = CM_NAME == null ? null : CM_NAME.trim();
    }

    public String getCM_ACCOUNT() {
        return CM_ACCOUNT;
    }

    public void setCM_ACCOUNT(String CM_ACCOUNT) {
        this.CM_ACCOUNT = CM_ACCOUNT == null ? null : CM_ACCOUNT.trim();
    }

    public String getCM_PASSWORD() {
        return CM_PASSWORD;
    }

    public void setCM_PASSWORD(String CM_PASSWORD) {
        this.CM_PASSWORD = CM_PASSWORD == null ? null : CM_PASSWORD.trim();
    }

    public Integer getCM_LEVEL() {
        return CM_LEVEL;
    }

    public void setCM_LEVEL(Integer CM_LEVEL) {
        this.CM_LEVEL = CM_LEVEL;
    }

    public Long getCM_PHONE() {
        return CM_PHONE;
    }

    public void setCM_PHONE(Long CM_PHONE) {
        this.CM_PHONE = CM_PHONE;
    }
}