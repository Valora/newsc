package com.sc.domain.generator;

public class OrderdetailsWithBLOBs extends Orderdetails {
    private String CM_SPECNUMDETAILS;

    private String CM_LOGISTICSINFO;

    public String getCM_SPECNUMDETAILS() {
        return CM_SPECNUMDETAILS;
    }

    public void setCM_SPECNUMDETAILS(String CM_SPECNUMDETAILS) {
        this.CM_SPECNUMDETAILS = CM_SPECNUMDETAILS == null ? null : CM_SPECNUMDETAILS.trim();
    }

    public String getCM_LOGISTICSINFO() {
        return CM_LOGISTICSINFO;
    }

    public void setCM_LOGISTICSINFO(String CM_LOGISTICSINFO) {
        this.CM_LOGISTICSINFO = CM_LOGISTICSINFO == null ? null : CM_LOGISTICSINFO.trim();
    }
}