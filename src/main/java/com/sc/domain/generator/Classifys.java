package com.sc.domain.generator;

public class Classifys {
    private Integer cmClassifyid;

    private String cmClassifyname;

    private Integer cmParentid;

    private String cmImgpath;

    private Integer cmSort;

    public Integer getCmClassifyid() {
        return cmClassifyid;
    }

    public void setCmClassifyid(Integer cmClassifyid) {
        this.cmClassifyid = cmClassifyid;
    }

    public String getCmClassifyname() {
        return cmClassifyname;
    }

    public void setCmClassifyname(String cmClassifyname) {
        this.cmClassifyname = cmClassifyname == null ? null : cmClassifyname.trim();
    }

    public Integer getCmParentid() {
        return cmParentid;
    }

    public void setCmParentid(Integer cmParentid) {
        this.cmParentid = cmParentid;
    }

    public String getCmImgpath() {
        return cmImgpath;
    }

    public void setCmImgpath(String cmImgpath) {
        this.cmImgpath = cmImgpath == null ? null : cmImgpath.trim();
    }

    public Integer getCmSort() {
        return cmSort;
    }

    public void setCmSort(Integer cmSort) {
        this.cmSort = cmSort;
    }
}