package com.sc.domain.generator;

public class Shows {
    private Integer cmShowid;

    private String cmPath;

    private String cmGoodsid;

    private Integer cmIstop;

    private String cmUrl;

    public Integer getCmShowid() {
        return cmShowid;
    }

    public void setCmShowid(Integer cmShowid) {
        this.cmShowid = cmShowid;
    }

    public String getCmPath() {
        return cmPath;
    }

    public void setCmPath(String cmPath) {
        this.cmPath = cmPath == null ? null : cmPath.trim();
    }

    public String getCmGoodsid() {
        return cmGoodsid;
    }

    public void setCmGoodsid(String cmGoodsid) {
        this.cmGoodsid = cmGoodsid == null ? null : cmGoodsid.trim();
    }

    public Integer getCmIstop() {
        return cmIstop;
    }

    public void setCmIstop(Integer cmIstop) {
        this.cmIstop = cmIstop;
    }

    public String getCmUrl() {
        return cmUrl;
    }

    public void setCmUrl(String cmUrl) {
        this.cmUrl = cmUrl == null ? null : cmUrl.trim();
    }
}