package com.sc.domain.generator;

import java.util.Date;

public class Pays {
    private Integer CM_PAYID;

    private String CM_ORDERID;

    private String CM_PAYJSON;

    private Date CM_TIME;

    private Integer CM_PAYTYPE;

    public Integer getCM_PAYID() {
        return CM_PAYID;
    }

    public void setCM_PAYID(Integer CM_PAYID) {
        this.CM_PAYID = CM_PAYID;
    }

    public String getCM_ORDERID() {
        return CM_ORDERID;
    }

    public void setCM_ORDERID(String CM_ORDERID) {
        this.CM_ORDERID = CM_ORDERID == null ? null : CM_ORDERID.trim();
    }

    public String getCM_PAYJSON() {
        return CM_PAYJSON;
    }

    public void setCM_PAYJSON(String CM_PAYJSON) {
        this.CM_PAYJSON = CM_PAYJSON == null ? null : CM_PAYJSON.trim();
    }

    public Date getCM_TIME() {
        return CM_TIME;
    }

    public void setCM_TIME(Date CM_TIME) {
        this.CM_TIME = CM_TIME;
    }

    public Integer getCM_PAYTYPE() {
        return CM_PAYTYPE;
    }

    public void setCM_PAYTYPE(Integer CM_PAYTYPE) {
        this.CM_PAYTYPE = CM_PAYTYPE;
    }
}