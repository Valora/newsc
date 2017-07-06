package com.sc.domain.generator;

import java.util.Date;

public class Orderdetails {
    private String CM_ORDERDETAILSID;

    private String CM_ORDERID;

    private String CM_GOODSID;

    private String CM_USERID;

    private Integer CM_NUMBER;

    private Double CM_MONEY;

    private String CM_SELLERID;

    private Date CM_CREATETIME;

    private Integer CM_SERVICESTATE;

    private Integer CM_SELLERSTATE;

    private String CM_LOGISTICSNUM;

    private Integer CM_LOGISTICSID;

    public String getCM_ORDERDETAILSID() {
        return CM_ORDERDETAILSID;
    }

    public void setCM_ORDERDETAILSID(String CM_ORDERDETAILSID) {
        this.CM_ORDERDETAILSID = CM_ORDERDETAILSID == null ? null : CM_ORDERDETAILSID.trim();
    }

    public String getCM_ORDERID() {
        return CM_ORDERID;
    }

    public void setCM_ORDERID(String CM_ORDERID) {
        this.CM_ORDERID = CM_ORDERID == null ? null : CM_ORDERID.trim();
    }

    public String getCM_GOODSID() {
        return CM_GOODSID;
    }

    public void setCM_GOODSID(String CM_GOODSID) {
        this.CM_GOODSID = CM_GOODSID == null ? null : CM_GOODSID.trim();
    }

    public String getCM_USERID() {
        return CM_USERID;
    }

    public void setCM_USERID(String CM_USERID) {
        this.CM_USERID = CM_USERID == null ? null : CM_USERID.trim();
    }

    public Integer getCM_NUMBER() {
        return CM_NUMBER;
    }

    public void setCM_NUMBER(Integer CM_NUMBER) {
        this.CM_NUMBER = CM_NUMBER;
    }

    public Double getCM_MONEY() {
        return CM_MONEY;
    }

    public void setCM_MONEY(Double CM_MONEY) {
        this.CM_MONEY = CM_MONEY;
    }

    public String getCM_SELLERID() {
        return CM_SELLERID;
    }

    public void setCM_SELLERID(String CM_SELLERID) {
        this.CM_SELLERID = CM_SELLERID == null ? null : CM_SELLERID.trim();
    }

    public Date getCM_CREATETIME() {
        return CM_CREATETIME;
    }

    public void setCM_CREATETIME(Date CM_CREATETIME) {
        this.CM_CREATETIME = CM_CREATETIME;
    }

    public Integer getCM_SERVICESTATE() {
        return CM_SERVICESTATE;
    }

    public void setCM_SERVICESTATE(Integer CM_SERVICESTATE) {
        this.CM_SERVICESTATE = CM_SERVICESTATE;
    }

    public Integer getCM_SELLERSTATE() {
        return CM_SELLERSTATE;
    }

    public void setCM_SELLERSTATE(Integer CM_SELLERSTATE) {
        this.CM_SELLERSTATE = CM_SELLERSTATE;
    }

    public String getCM_LOGISTICSNUM() {
        return CM_LOGISTICSNUM;
    }

    public void setCM_LOGISTICSNUM(String CM_LOGISTICSNUM) {
        this.CM_LOGISTICSNUM = CM_LOGISTICSNUM == null ? null : CM_LOGISTICSNUM.trim();
    }

    public Integer getCM_LOGISTICSID() {
        return CM_LOGISTICSID;
    }

    public void setCM_LOGISTICSID(Integer CM_LOGISTICSID) {
        this.CM_LOGISTICSID = CM_LOGISTICSID;
    }
}