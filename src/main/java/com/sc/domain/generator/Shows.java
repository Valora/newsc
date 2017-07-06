package com.sc.domain.generator;

public class Shows {
    private Integer CM_SHOWID;

    private String CM_PATH;

    private String CM_GOODSID;

    private Integer CM_ISTOP;

    private String CM_URL;

    public Integer getCM_SHOWID() {
        return CM_SHOWID;
    }

    public void setCM_SHOWID(Integer CM_SHOWID) {
        this.CM_SHOWID = CM_SHOWID;
    }

    public String getCM_PATH() {
        return CM_PATH;
    }

    public void setCM_PATH(String CM_PATH) {
        this.CM_PATH = CM_PATH == null ? null : CM_PATH.trim();
    }

    public String getCM_GOODSID() {
        return CM_GOODSID;
    }

    public void setCM_GOODSID(String CM_GOODSID) {
        this.CM_GOODSID = CM_GOODSID == null ? null : CM_GOODSID.trim();
    }

    public Integer getCM_ISTOP() {
        return CM_ISTOP;
    }

    public void setCM_ISTOP(Integer CM_ISTOP) {
        this.CM_ISTOP = CM_ISTOP;
    }

    public String getCM_URL() {
        return CM_URL;
    }

    public void setCM_URL(String CM_URL) {
        this.CM_URL = CM_URL == null ? null : CM_URL.trim();
    }
}