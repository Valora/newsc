package com.sc.domain.generator;

import java.util.Date;

public class Servicedetails {
    private String cmSvid;

    private String cmAfterserviceid;

    private Date cmCreatetime;

    private Integer cmType;

    private String cmLogisticsnum;

    private Integer cmLogisticsid;

    public String getCmSvid() {
        return cmSvid;
    }

    public void setCmSvid(String cmSvid) {
        this.cmSvid = cmSvid == null ? null : cmSvid.trim();
    }

    public String getCmAfterserviceid() {
        return cmAfterserviceid;
    }

    public void setCmAfterserviceid(String cmAfterserviceid) {
        this.cmAfterserviceid = cmAfterserviceid == null ? null : cmAfterserviceid.trim();
    }

    public Date getCmCreatetime() {
        return cmCreatetime;
    }

    public void setCmCreatetime(Date cmCreatetime) {
        this.cmCreatetime = cmCreatetime;
    }

    public Integer getCmType() {
        return cmType;
    }

    public void setCmType(Integer cmType) {
        this.cmType = cmType;
    }

    public String getCmLogisticsnum() {
        return cmLogisticsnum;
    }

    public void setCmLogisticsnum(String cmLogisticsnum) {
        this.cmLogisticsnum = cmLogisticsnum == null ? null : cmLogisticsnum.trim();
    }

    public Integer getCmLogisticsid() {
        return cmLogisticsid;
    }

    public void setCmLogisticsid(Integer cmLogisticsid) {
        this.cmLogisticsid = cmLogisticsid;
    }
}