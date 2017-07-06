package com.sc.domain.generator;

public class Logisticss {
    private Integer CM_LOGISTICSID;

    private String CM_LOGISTICSNAME;

    public Integer getCM_LOGISTICSID() {
        return CM_LOGISTICSID;
    }

    public void setCM_LOGISTICSID(Integer CM_LOGISTICSID) {
        this.CM_LOGISTICSID = CM_LOGISTICSID;
    }

    public String getCM_LOGISTICSNAME() {
        return CM_LOGISTICSNAME;
    }

    public void setCM_LOGISTICSNAME(String CM_LOGISTICSNAME) {
        this.CM_LOGISTICSNAME = CM_LOGISTICSNAME == null ? null : CM_LOGISTICSNAME.trim();
    }
}