package com.sc.domain.generator;

public class OrdersWithBLOBs extends Orders {
    private String cmOrderdetailsids;

    public String getCmOrderdetailsids() {
        return cmOrderdetailsids;
    }

    public void setCmOrderdetailsids(String cmOrderdetailsids) {
        this.cmOrderdetailsids = cmOrderdetailsids == null ? null : cmOrderdetailsids.trim();
    }
}