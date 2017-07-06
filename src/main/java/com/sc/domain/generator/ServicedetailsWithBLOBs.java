package com.sc.domain.generator;

public class ServicedetailsWithBLOBs extends Servicedetails {
    private String CM_LOGISTICSINFO;

    public String getCM_LOGISTICSINFO() {
        return CM_LOGISTICSINFO;
    }

    public void setCM_LOGISTICSINFO(String CM_LOGISTICSINFO) {
        this.CM_LOGISTICSINFO = CM_LOGISTICSINFO == null ? null : CM_LOGISTICSINFO.trim();
    }
}