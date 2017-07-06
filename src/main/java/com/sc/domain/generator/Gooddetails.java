package com.sc.domain.generator;

public class Gooddetails {
    private Integer CM_GOODSDETAILSID;

    private String CM_GOODSID;

    private String CM_COLOR;

    private String CM_IMAGEPATH;

    public Integer getCM_GOODSDETAILSID() {
        return CM_GOODSDETAILSID;
    }

    public void setCM_GOODSDETAILSID(Integer CM_GOODSDETAILSID) {
        this.CM_GOODSDETAILSID = CM_GOODSDETAILSID;
    }

    public String getCM_GOODSID() {
        return CM_GOODSID;
    }

    public void setCM_GOODSID(String CM_GOODSID) {
        this.CM_GOODSID = CM_GOODSID == null ? null : CM_GOODSID.trim();
    }

    public String getCM_COLOR() {
        return CM_COLOR;
    }

    public void setCM_COLOR(String CM_COLOR) {
        this.CM_COLOR = CM_COLOR == null ? null : CM_COLOR.trim();
    }

    public String getCM_IMAGEPATH() {
        return CM_IMAGEPATH;
    }

    public void setCM_IMAGEPATH(String CM_IMAGEPATH) {
        this.CM_IMAGEPATH = CM_IMAGEPATH == null ? null : CM_IMAGEPATH.trim();
    }
}