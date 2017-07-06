package com.sc.domain.generator;

public class Classifys {
    private Integer CM_CLASSIFYID;

    private String CM_CLASSIFYNAME;

    private Integer CM_PARENTID;

    private String CM_IMGPATH;

    private Integer CM_SORT;

    public Integer getCM_CLASSIFYID() {
        return CM_CLASSIFYID;
    }

    public void setCM_CLASSIFYID(Integer CM_CLASSIFYID) {
        this.CM_CLASSIFYID = CM_CLASSIFYID;
    }

    public String getCM_CLASSIFYNAME() {
        return CM_CLASSIFYNAME;
    }

    public void setCM_CLASSIFYNAME(String CM_CLASSIFYNAME) {
        this.CM_CLASSIFYNAME = CM_CLASSIFYNAME == null ? null : CM_CLASSIFYNAME.trim();
    }

    public Integer getCM_PARENTID() {
        return CM_PARENTID;
    }

    public void setCM_PARENTID(Integer CM_PARENTID) {
        this.CM_PARENTID = CM_PARENTID;
    }

    public String getCM_IMGPATH() {
        return CM_IMGPATH;
    }

    public void setCM_IMGPATH(String CM_IMGPATH) {
        this.CM_IMGPATH = CM_IMGPATH == null ? null : CM_IMGPATH.trim();
    }

    public Integer getCM_SORT() {
        return CM_SORT;
    }

    public void setCM_SORT(Integer CM_SORT) {
        this.CM_SORT = CM_SORT;
    }
}