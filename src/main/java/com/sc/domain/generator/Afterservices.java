package com.sc.domain.generator;

import java.util.Date;

public class Afterservices {
    private String CM_AFTERSERVICEID;

    private String CM_SELLERID;

    private Date CM_CREATETIME;

    private String CM_USERID;

    private String CM_ORDERDETAILSID;

    private String CM_REASON;

    private Integer CM_TYPE;

    private Integer CM_STATE;

    private String CM_IMGPATHS;

    private String CM_SVID;

    public String getCM_AFTERSERVICEID() {
        return CM_AFTERSERVICEID;
    }

    public void setCM_AFTERSERVICEID(String CM_AFTERSERVICEID) {
        this.CM_AFTERSERVICEID = CM_AFTERSERVICEID == null ? null : CM_AFTERSERVICEID.trim();
    }

    public String getCM_SELLERID() {
        return CM_SELLERID;
    }

    public void setCM_SELLERID(String CM_SELLERID) {
        this.CM_SELLERID = CM_SELLERID == null ? null : CM_SELLERID.trim();
    }

    public Date getCM_CREATETIME() {
        return CM_CREATETIME;
    }

    public void setCM_CREATETIME(Date CM_CREATETIME) {
        this.CM_CREATETIME = CM_CREATETIME;
    }

    public String getCM_USERID() {
        return CM_USERID;
    }

    public void setCM_USERID(String CM_USERID) {
        this.CM_USERID = CM_USERID == null ? null : CM_USERID.trim();
    }

    public String getCM_ORDERDETAILSID() {
        return CM_ORDERDETAILSID;
    }

    public void setCM_ORDERDETAILSID(String CM_ORDERDETAILSID) {
        this.CM_ORDERDETAILSID = CM_ORDERDETAILSID == null ? null : CM_ORDERDETAILSID.trim();
    }

    public String getCM_REASON() {
        return CM_REASON;
    }

    public void setCM_REASON(String CM_REASON) {
        this.CM_REASON = CM_REASON == null ? null : CM_REASON.trim();
    }

    public Integer getCM_TYPE() {
        return CM_TYPE;
    }

    public void setCM_TYPE(Integer CM_TYPE) {
        this.CM_TYPE = CM_TYPE;
    }

    public Integer getCM_STATE() {
        return CM_STATE;
    }

    public void setCM_STATE(Integer CM_STATE) {
        this.CM_STATE = CM_STATE;
    }

    public String getCM_IMGPATHS() {
        return CM_IMGPATHS;
    }

    public void setCM_IMGPATHS(String CM_IMGPATHS) {
        this.CM_IMGPATHS = CM_IMGPATHS == null ? null : CM_IMGPATHS.trim();
    }

    public String getCM_SVID() {
        return CM_SVID;
    }

    public void setCM_SVID(String CM_SVID) {
        this.CM_SVID = CM_SVID == null ? null : CM_SVID.trim();
    }
}