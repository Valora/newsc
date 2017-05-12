package com.sc.domain.generator;

public class GooddetailsWithBLOBs extends Gooddetails {
    private String cmSpecStock;

    public String getCmSpecStock() {
        return cmSpecStock;
    }

    public void setCmSpecStock(String cmSpecStock) {
        this.cmSpecStock = cmSpecStock == null ? null : cmSpecStock.trim();
    }
}