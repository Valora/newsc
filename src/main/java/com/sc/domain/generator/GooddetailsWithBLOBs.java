package com.sc.domain.generator;

public class GooddetailsWithBLOBs extends Gooddetails {
    private String CM_SPEC_STOCK;

    public String getCM_SPEC_STOCK() {
        return CM_SPEC_STOCK;
    }

    public void setCM_SPEC_STOCK(String CM_SPEC_STOCK) {
        this.CM_SPEC_STOCK = CM_SPEC_STOCK == null ? null : CM_SPEC_STOCK.trim();
    }
}