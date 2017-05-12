package com.sc.domain.generator;

public class OrderdetailsWithBLOBs extends Orderdetails {
    private String cmSpecnumdetails;

    private String cmLogisticsinfo;

    public String getCmSpecnumdetails() {
        return cmSpecnumdetails;
    }

    public void setCmSpecnumdetails(String cmSpecnumdetails) {
        this.cmSpecnumdetails = cmSpecnumdetails == null ? null : cmSpecnumdetails.trim();
    }

    public String getCmLogisticsinfo() {
        return cmLogisticsinfo;
    }

    public void setCmLogisticsinfo(String cmLogisticsinfo) {
        this.cmLogisticsinfo = cmLogisticsinfo == null ? null : cmLogisticsinfo.trim();
    }
}