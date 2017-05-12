package com.sc.domain.generator;

import java.util.Date;

public class Pays {
    private Integer cmPayid;

    private String cmOrderid;

    private String cmPayjson;

    private Date cmTime;

    private Integer cmPaytype;

    public Integer getCmPayid() {
        return cmPayid;
    }

    public void setCmPayid(Integer cmPayid) {
        this.cmPayid = cmPayid;
    }

    public String getCmOrderid() {
        return cmOrderid;
    }

    public void setCmOrderid(String cmOrderid) {
        this.cmOrderid = cmOrderid == null ? null : cmOrderid.trim();
    }

    public String getCmPayjson() {
        return cmPayjson;
    }

    public void setCmPayjson(String cmPayjson) {
        this.cmPayjson = cmPayjson == null ? null : cmPayjson.trim();
    }

    public Date getCmTime() {
        return cmTime;
    }

    public void setCmTime(Date cmTime) {
        this.cmTime = cmTime;
    }

    public Integer getCmPaytype() {
        return cmPaytype;
    }

    public void setCmPaytype(Integer cmPaytype) {
        this.cmPaytype = cmPaytype;
    }
}