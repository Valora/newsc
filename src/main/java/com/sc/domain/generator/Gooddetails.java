package com.sc.domain.generator;

public class Gooddetails {
    private Integer cmGoodsdetailsid;

    private String cmGoodsid;

    private String cmColor;

    private String cmImagepath;

    public Integer getCmGoodsdetailsid() {
        return cmGoodsdetailsid;
    }

    public void setCmGoodsdetailsid(Integer cmGoodsdetailsid) {
        this.cmGoodsdetailsid = cmGoodsdetailsid;
    }

    public String getCmGoodsid() {
        return cmGoodsid;
    }

    public void setCmGoodsid(String cmGoodsid) {
        this.cmGoodsid = cmGoodsid == null ? null : cmGoodsid.trim();
    }

    public String getCmColor() {
        return cmColor;
    }

    public void setCmColor(String cmColor) {
        this.cmColor = cmColor == null ? null : cmColor.trim();
    }

    public String getCmImagepath() {
        return cmImagepath;
    }

    public void setCmImagepath(String cmImagepath) {
        this.cmImagepath = cmImagepath == null ? null : cmImagepath.trim();
    }
}