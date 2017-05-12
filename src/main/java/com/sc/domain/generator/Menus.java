package com.sc.domain.generator;

public class Menus {
    private Integer cmMenuid;

    private String cmMenuname;

    private String cmMenuurl;

    public Integer getCmMenuid() {
        return cmMenuid;
    }

    public void setCmMenuid(Integer cmMenuid) {
        this.cmMenuid = cmMenuid;
    }

    public String getCmMenuname() {
        return cmMenuname;
    }

    public void setCmMenuname(String cmMenuname) {
        this.cmMenuname = cmMenuname == null ? null : cmMenuname.trim();
    }

    public String getCmMenuurl() {
        return cmMenuurl;
    }

    public void setCmMenuurl(String cmMenuurl) {
        this.cmMenuurl = cmMenuurl == null ? null : cmMenuurl.trim();
    }
}