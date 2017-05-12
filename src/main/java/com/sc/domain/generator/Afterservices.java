package com.sc.domain.generator;

import java.util.Date;

public class Afterservices {
    private String cmAfterserviceid;

    private String cmSellerid;

    private Date cmCreatetime;

    private String cmUserid;

    private String cmOrderdetailsid;

    private String cmReason;

    private Integer cmType;

    private Integer cmState;

    private String cmImgpaths;

    private String cmSvid;

    public String getCmAfterserviceid() {
        return cmAfterserviceid;
    }

    public void setCmAfterserviceid(String cmAfterserviceid) {
        this.cmAfterserviceid = cmAfterserviceid == null ? null : cmAfterserviceid.trim();
    }

    public String getCmSellerid() {
        return cmSellerid;
    }

    public void setCmSellerid(String cmSellerid) {
        this.cmSellerid = cmSellerid == null ? null : cmSellerid.trim();
    }

    public Date getCmCreatetime() {
        return cmCreatetime;
    }

    public void setCmCreatetime(Date cmCreatetime) {
        this.cmCreatetime = cmCreatetime;
    }

    public String getCmUserid() {
        return cmUserid;
    }

    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    public String getCmOrderdetailsid() {
        return cmOrderdetailsid;
    }

    public void setCmOrderdetailsid(String cmOrderdetailsid) {
        this.cmOrderdetailsid = cmOrderdetailsid == null ? null : cmOrderdetailsid.trim();
    }

    public String getCmReason() {
        return cmReason;
    }

    public void setCmReason(String cmReason) {
        this.cmReason = cmReason == null ? null : cmReason.trim();
    }

    public Integer getCmType() {
        return cmType;
    }

    public void setCmType(Integer cmType) {
        this.cmType = cmType;
    }

    public Integer getCmState() {
        return cmState;
    }

    public void setCmState(Integer cmState) {
        this.cmState = cmState;
    }

    public String getCmImgpaths() {
        return cmImgpaths;
    }

    public void setCmImgpaths(String cmImgpaths) {
        this.cmImgpaths = cmImgpaths == null ? null : cmImgpaths.trim();
    }

    public String getCmSvid() {
        return cmSvid;
    }

    public void setCmSvid(String cmSvid) {
        this.cmSvid = cmSvid == null ? null : cmSvid.trim();
    }
}