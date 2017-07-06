package com.sc.domain.generator;

public class OrdersWithBLOBs extends Orders {
    private String CM_ORDERDETAILSIDS;

    public String getCM_ORDERDETAILSIDS() {
        return CM_ORDERDETAILSIDS;
    }

    public void setCM_ORDERDETAILSIDS(String CM_ORDERDETAILSIDS) {
        this.CM_ORDERDETAILSIDS = CM_ORDERDETAILSIDS == null ? null : CM_ORDERDETAILSIDS.trim();
    }
}