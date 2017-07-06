package com.sc.domain.generator;

import java.util.Date;

public class Notices {
    private Integer CM_NOTICEIID;

    private String CM_TITLE;

    private String CM_CONTENT;

    private String CM_OTHER;

    private String CM_CREATOR;

    private Date CM_DEADLINE;

    private String CM_ADMINID;

    private Date CM_CREATETIME;

    public Integer getCM_NOTICEIID() {
        return CM_NOTICEIID;
    }

    public void setCM_NOTICEIID(Integer CM_NOTICEIID) {
        this.CM_NOTICEIID = CM_NOTICEIID;
    }

    public String getCM_TITLE() {
        return CM_TITLE;
    }

    public void setCM_TITLE(String CM_TITLE) {
        this.CM_TITLE = CM_TITLE == null ? null : CM_TITLE.trim();
    }

    public String getCM_CONTENT() {
        return CM_CONTENT;
    }

    public void setCM_CONTENT(String CM_CONTENT) {
        this.CM_CONTENT = CM_CONTENT == null ? null : CM_CONTENT.trim();
    }

    public String getCM_OTHER() {
        return CM_OTHER;
    }

    public void setCM_OTHER(String CM_OTHER) {
        this.CM_OTHER = CM_OTHER == null ? null : CM_OTHER.trim();
    }

    public String getCM_CREATOR() {
        return CM_CREATOR;
    }

    public void setCM_CREATOR(String CM_CREATOR) {
        this.CM_CREATOR = CM_CREATOR == null ? null : CM_CREATOR.trim();
    }

    public Date getCM_DEADLINE() {
        return CM_DEADLINE;
    }

    public void setCM_DEADLINE(Date CM_DEADLINE) {
        this.CM_DEADLINE = CM_DEADLINE;
    }

    public String getCM_ADMINID() {
        return CM_ADMINID;
    }

    public void setCM_ADMINID(String CM_ADMINID) {
        this.CM_ADMINID = CM_ADMINID == null ? null : CM_ADMINID.trim();
    }

    public Date getCM_CREATETIME() {
        return CM_CREATETIME;
    }

    public void setCM_CREATETIME(Date CM_CREATETIME) {
        this.CM_CREATETIME = CM_CREATETIME;
    }
}