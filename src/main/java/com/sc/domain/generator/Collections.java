package com.sc.domain.generator;

import java.util.Date;

public class Collections {
    private Integer CM_COLLECTIONID;

    private String CM_USERID;

    private String CM_GOODSID;

    private Date CM_JOINTIME;

    public Integer getCM_COLLECTIONID() {
        return CM_COLLECTIONID;
    }

    public void setCM_COLLECTIONID(Integer CM_COLLECTIONID) {
        this.CM_COLLECTIONID = CM_COLLECTIONID;
    }

    public String getCM_USERID() {
        return CM_USERID;
    }

    public void setCM_USERID(String CM_USERID) {
        this.CM_USERID = CM_USERID == null ? null : CM_USERID.trim();
    }

    public String getCM_GOODSID() {
        return CM_GOODSID;
    }

    public void setCM_GOODSID(String CM_GOODSID) {
        this.CM_GOODSID = CM_GOODSID == null ? null : CM_GOODSID.trim();
    }

    public Date getCM_JOINTIME() {
        return CM_JOINTIME;
    }

    public void setCM_JOINTIME(Date CM_JOINTIME) {
        this.CM_JOINTIME = CM_JOINTIME;
    }
}