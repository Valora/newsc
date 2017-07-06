package com.sc.domain.generator;

public class Brands {
    private Integer CM_BRANDID;

    private String CM_BRAND;

    private String CM_OTHER;

    public Integer getCM_BRANDID() {
        return CM_BRANDID;
    }

    public void setCM_BRANDID(Integer CM_BRANDID) {
        this.CM_BRANDID = CM_BRANDID;
    }

    public String getCM_BRAND() {
        return CM_BRAND;
    }

    public void setCM_BRAND(String CM_BRAND) {
        this.CM_BRAND = CM_BRAND == null ? null : CM_BRAND.trim();
    }

    public String getCM_OTHER() {
        return CM_OTHER;
    }

    public void setCM_OTHER(String CM_OTHER) {
        this.CM_OTHER = CM_OTHER == null ? null : CM_OTHER.trim();
    }
}