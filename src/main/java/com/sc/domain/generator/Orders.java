package com.sc.domain.generator;

import java.util.Date;

public class Orders {
    private String cmOrderid;

    private String cmUserid;

    private Integer cmUsescore;

    private Integer cmNumbersun;

    private Double cmMoneysun;

    private Date cmCreatetime;

    private Integer cmState;

    private Double cmUserbalance;

    private Integer cmPaytype;

    private String cmPayresult;

    public String getCmOrderid() {
        return cmOrderid;
    }

    public void setCmOrderid(String cmOrderid) {
        this.cmOrderid = cmOrderid == null ? null : cmOrderid.trim();
    }

    public String getCmUserid() {
        return cmUserid;
    }

    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    public Integer getCmUsescore() {
        return cmUsescore;
    }

    public void setCmUsescore(Integer cmUsescore) {
        this.cmUsescore = cmUsescore;
    }

    public Integer getCmNumbersun() {
        return cmNumbersun;
    }

    public void setCmNumbersun(Integer cmNumbersun) {
        this.cmNumbersun = cmNumbersun;
    }

    public Double getCmMoneysun() {
        return cmMoneysun;
    }

    public void setCmMoneysun(Double cmMoneysun) {
        this.cmMoneysun = cmMoneysun;
    }

    public Date getCmCreatetime() {
        return cmCreatetime;
    }

    public void setCmCreatetime(Date cmCreatetime) {
        this.cmCreatetime = cmCreatetime;
    }

    public Integer getCmState() {
        return cmState;
    }

    public void setCmState(Integer cmState) {
        this.cmState = cmState;
    }

    public Double getCmUserbalance() {
        return cmUserbalance;
    }

    public void setCmUserbalance(Double cmUserbalance) {
        this.cmUserbalance = cmUserbalance;
    }

    public Integer getCmPaytype() {
        return cmPaytype;
    }

    public void setCmPaytype(Integer cmPaytype) {
        this.cmPaytype = cmPaytype;
    }

    public String getCmPayresult() {
        return cmPayresult;
    }

    public void setCmPayresult(String cmPayresult) {
        this.cmPayresult = cmPayresult == null ? null : cmPayresult.trim();
    }
}