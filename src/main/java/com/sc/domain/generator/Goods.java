package com.sc.domain.generator;

import java.util.Date;

public class Goods {
    private String cmGoodsid;

    private String cmGoodsartnum;

    private String cmSellerid;

    private Integer cmClassifyid;

    private String cmClassifytabs;

    private Integer cmBrandid;

    private String cmTitle;

    private Integer cmSales;

    private Double cmOriginalprice;

    private Double cmPresentprice;

    private String cmMainfigurepath;

    private String cmHorizontalpath;

    private Date cmCreatetime;

    private Integer cmIsoff;

    private Integer cmIspromotion;

    private String cmSpec;

    public String getCmGoodsid() {
        return cmGoodsid;
    }

    public void setCmGoodsid(String cmGoodsid) {
        this.cmGoodsid = cmGoodsid == null ? null : cmGoodsid.trim();
    }

    public String getCmGoodsartnum() {
        return cmGoodsartnum;
    }

    public void setCmGoodsartnum(String cmGoodsartnum) {
        this.cmGoodsartnum = cmGoodsartnum == null ? null : cmGoodsartnum.trim();
    }

    public String getCmSellerid() {
        return cmSellerid;
    }

    public void setCmSellerid(String cmSellerid) {
        this.cmSellerid = cmSellerid == null ? null : cmSellerid.trim();
    }

    public Integer getCmClassifyid() {
        return cmClassifyid;
    }

    public void setCmClassifyid(Integer cmClassifyid) {
        this.cmClassifyid = cmClassifyid;
    }

    public String getCmClassifytabs() {
        return cmClassifytabs;
    }

    public void setCmClassifytabs(String cmClassifytabs) {
        this.cmClassifytabs = cmClassifytabs == null ? null : cmClassifytabs.trim();
    }

    public Integer getCmBrandid() {
        return cmBrandid;
    }

    public void setCmBrandid(Integer cmBrandid) {
        this.cmBrandid = cmBrandid;
    }

    public String getCmTitle() {
        return cmTitle;
    }

    public void setCmTitle(String cmTitle) {
        this.cmTitle = cmTitle == null ? null : cmTitle.trim();
    }

    public Integer getCmSales() {
        return cmSales;
    }

    public void setCmSales(Integer cmSales) {
        this.cmSales = cmSales;
    }

    public Double getCmOriginalprice() {
        return cmOriginalprice;
    }

    public void setCmOriginalprice(Double cmOriginalprice) {
        this.cmOriginalprice = cmOriginalprice;
    }

    public Double getCmPresentprice() {
        return cmPresentprice;
    }

    public void setCmPresentprice(Double cmPresentprice) {
        this.cmPresentprice = cmPresentprice;
    }

    public String getCmMainfigurepath() {
        return cmMainfigurepath;
    }

    public void setCmMainfigurepath(String cmMainfigurepath) {
        this.cmMainfigurepath = cmMainfigurepath == null ? null : cmMainfigurepath.trim();
    }

    public String getCmHorizontalpath() {
        return cmHorizontalpath;
    }

    public void setCmHorizontalpath(String cmHorizontalpath) {
        this.cmHorizontalpath = cmHorizontalpath == null ? null : cmHorizontalpath.trim();
    }

    public Date getCmCreatetime() {
        return cmCreatetime;
    }

    public void setCmCreatetime(Date cmCreatetime) {
        this.cmCreatetime = cmCreatetime;
    }

    public Integer getCmIsoff() {
        return cmIsoff;
    }

    public void setCmIsoff(Integer cmIsoff) {
        this.cmIsoff = cmIsoff;
    }

    public Integer getCmIspromotion() {
        return cmIspromotion;
    }

    public void setCmIspromotion(Integer cmIspromotion) {
        this.cmIspromotion = cmIspromotion;
    }

    public String getCmSpec() {
        return cmSpec;
    }

    public void setCmSpec(String cmSpec) {
        this.cmSpec = cmSpec == null ? null : cmSpec.trim();
    }
}