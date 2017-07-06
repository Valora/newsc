package com.sc.domain.generator;

import java.util.Date;

public class Servicedetails {
    private String CM_SVID;

    private String CM_AFTERSERVICEID;

    private Date CM_CREATETIME;

    private Integer CM_TYPE;

    private String CM_LOGISTICSNUM;

    private Integer CM_LOGISTICSID;

    public String getCM_SVID() {
        return CM_SVID;
    }

    public void setCM_SVID(String CM_SVID) {
        this.CM_SVID = CM_SVID == null ? null : CM_SVID.trim();
    }

    public String getCM_AFTERSERVICEID() {
        return CM_AFTERSERVICEID;
    }

    public void setCM_AFTERSERVICEID(String CM_AFTERSERVICEID) {
        this.CM_AFTERSERVICEID = CM_AFTERSERVICEID == null ? null : CM_AFTERSERVICEID.trim();
    }

    public Date getCM_CREATETIME() {
        return CM_CREATETIME;
    }

    public void setCM_CREATETIME(Date CM_CREATETIME) {
        this.CM_CREATETIME = CM_CREATETIME;
    }

    public Integer getCM_TYPE() {
        return CM_TYPE;
    }

    public void setCM_TYPE(Integer CM_TYPE) {
        this.CM_TYPE = CM_TYPE;
    }

    public String getCM_LOGISTICSNUM() {
        return CM_LOGISTICSNUM;
    }

    public void setCM_LOGISTICSNUM(String CM_LOGISTICSNUM) {
        this.CM_LOGISTICSNUM = CM_LOGISTICSNUM == null ? null : CM_LOGISTICSNUM.trim();
    }

    public Integer getCM_LOGISTICSID() {
        return CM_LOGISTICSID;
    }

    public void setCM_LOGISTICSID(Integer CM_LOGISTICSID) {
        this.CM_LOGISTICSID = CM_LOGISTICSID;
    }
}