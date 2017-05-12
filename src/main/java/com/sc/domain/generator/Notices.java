package com.sc.domain.generator;

import java.util.Date;

public class Notices {
    private Integer cmNoticeiid;

    private String cmTitle;

    private String cmContent;

    private String cmOther;

    private String cmCreator;

    private Date cmDeadline;

    private String cmAdminid;

    private Date cmCreatetime;

    public Integer getCmNoticeiid() {
        return cmNoticeiid;
    }

    public void setCmNoticeiid(Integer cmNoticeiid) {
        this.cmNoticeiid = cmNoticeiid;
    }

    public String getCmTitle() {
        return cmTitle;
    }

    public void setCmTitle(String cmTitle) {
        this.cmTitle = cmTitle == null ? null : cmTitle.trim();
    }

    public String getCmContent() {
        return cmContent;
    }

    public void setCmContent(String cmContent) {
        this.cmContent = cmContent == null ? null : cmContent.trim();
    }

    public String getCmOther() {
        return cmOther;
    }

    public void setCmOther(String cmOther) {
        this.cmOther = cmOther == null ? null : cmOther.trim();
    }

    public String getCmCreator() {
        return cmCreator;
    }

    public void setCmCreator(String cmCreator) {
        this.cmCreator = cmCreator == null ? null : cmCreator.trim();
    }

    public Date getCmDeadline() {
        return cmDeadline;
    }

    public void setCmDeadline(Date cmDeadline) {
        this.cmDeadline = cmDeadline;
    }

    public String getCmAdminid() {
        return cmAdminid;
    }

    public void setCmAdminid(String cmAdminid) {
        this.cmAdminid = cmAdminid == null ? null : cmAdminid.trim();
    }

    public Date getCmCreatetime() {
        return cmCreatetime;
    }

    public void setCmCreatetime(Date cmCreatetime) {
        this.cmCreatetime = cmCreatetime;
    }
}