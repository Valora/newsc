package com.sc.domain.generator;

public class ServicedetailsWithBLOBs extends Servicedetails {
    private String cmLogisticsinfo;

    public String getCmLogisticsinfo() {
        return cmLogisticsinfo;
    }

    public void setCmLogisticsinfo(String cmLogisticsinfo) {
        this.cmLogisticsinfo = cmLogisticsinfo == null ? null : cmLogisticsinfo.trim();
    }
}