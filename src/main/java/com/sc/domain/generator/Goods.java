package com.sc.domain.generator;

import java.util.Date;

public class Goods {
    private String CM_GOODSID;

    private String CM_GOODSARTNUM;

    private String CM_SELLERID;

    private Integer CM_CLASSIFYID;

    private String CM_CLASSIFYTABS;

    private Integer CM_BRANDID;

    private String CM_TITLE;

    private Integer CM_SALES;

    private Double CM_ORIGINALPRICE;

    private Double CM_PRESENTPRICE;

    private String CM_MAINFIGUREPATH;

    private String CM_HORIZONTALPATH;

    private Date CM_CREATETIME;

    private Integer CM_ISOFF;

    private Integer CM_ISPROMOTION;

    private String CM_SPEC;

    public String getCM_GOODSID() {
        return CM_GOODSID;
    }

    public void setCM_GOODSID(String CM_GOODSID) {
        this.CM_GOODSID = CM_GOODSID == null ? null : CM_GOODSID.trim();
    }

    public String getCM_GOODSARTNUM() {
        return CM_GOODSARTNUM;
    }

    public void setCM_GOODSARTNUM(String CM_GOODSARTNUM) {
        this.CM_GOODSARTNUM = CM_GOODSARTNUM == null ? null : CM_GOODSARTNUM.trim();
    }

    public String getCM_SELLERID() {
        return CM_SELLERID;
    }

    public void setCM_SELLERID(String CM_SELLERID) {
        this.CM_SELLERID = CM_SELLERID == null ? null : CM_SELLERID.trim();
    }

    public Integer getCM_CLASSIFYID() {
        return CM_CLASSIFYID;
    }

    public void setCM_CLASSIFYID(Integer CM_CLASSIFYID) {
        this.CM_CLASSIFYID = CM_CLASSIFYID;
    }

    public String getCM_CLASSIFYTABS() {
        return CM_CLASSIFYTABS;
    }

    public void setCM_CLASSIFYTABS(String CM_CLASSIFYTABS) {
        this.CM_CLASSIFYTABS = CM_CLASSIFYTABS == null ? null : CM_CLASSIFYTABS.trim();
    }

    public Integer getCM_BRANDID() {
        return CM_BRANDID;
    }

    public void setCM_BRANDID(Integer CM_BRANDID) {
        this.CM_BRANDID = CM_BRANDID;
    }

    public String getCM_TITLE() {
        return CM_TITLE;
    }

    public void setCM_TITLE(String CM_TITLE) {
        this.CM_TITLE = CM_TITLE == null ? null : CM_TITLE.trim();
    }

    public Integer getCM_SALES() {
        return CM_SALES;
    }

    public void setCM_SALES(Integer CM_SALES) {
        this.CM_SALES = CM_SALES;
    }

    public Double getCM_ORIGINALPRICE() {
        return CM_ORIGINALPRICE;
    }

    public void setCM_ORIGINALPRICE(Double CM_ORIGINALPRICE) {
        this.CM_ORIGINALPRICE = CM_ORIGINALPRICE;
    }

    public Double getCM_PRESENTPRICE() {
        return CM_PRESENTPRICE;
    }

    public void setCM_PRESENTPRICE(Double CM_PRESENTPRICE) {
        this.CM_PRESENTPRICE = CM_PRESENTPRICE;
    }

    public String getCM_MAINFIGUREPATH() {
        return CM_MAINFIGUREPATH;
    }

    public void setCM_MAINFIGUREPATH(String CM_MAINFIGUREPATH) {
        this.CM_MAINFIGUREPATH = CM_MAINFIGUREPATH == null ? null : CM_MAINFIGUREPATH.trim();
    }

    public String getCM_HORIZONTALPATH() {
        return CM_HORIZONTALPATH;
    }

    public void setCM_HORIZONTALPATH(String CM_HORIZONTALPATH) {
        this.CM_HORIZONTALPATH = CM_HORIZONTALPATH == null ? null : CM_HORIZONTALPATH.trim();
    }

    public Date getCM_CREATETIME() {
        return CM_CREATETIME;
    }

    public void setCM_CREATETIME(Date CM_CREATETIME) {
        this.CM_CREATETIME = CM_CREATETIME;
    }

    public Integer getCM_ISOFF() {
        return CM_ISOFF;
    }

    public void setCM_ISOFF(Integer CM_ISOFF) {
        this.CM_ISOFF = CM_ISOFF;
    }

    public Integer getCM_ISPROMOTION() {
        return CM_ISPROMOTION;
    }

    public void setCM_ISPROMOTION(Integer CM_ISPROMOTION) {
        this.CM_ISPROMOTION = CM_ISPROMOTION;
    }

    public String getCM_SPEC() {
        return CM_SPEC;
    }

    public void setCM_SPEC(String CM_SPEC) {
        this.CM_SPEC = CM_SPEC == null ? null : CM_SPEC.trim();
    }
}