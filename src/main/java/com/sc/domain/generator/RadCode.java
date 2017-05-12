package com.sc.domain.generator;

public class RadCode {
    private String cmUserid;

    private Integer cmCode;

    public String getCmUserid() {
        return cmUserid;
    }

    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    public Integer getCmCode() {
        return cmCode;
    }

    public void setCmCode(Integer cmCode) {
        this.cmCode = cmCode;
    }
}