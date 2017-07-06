package com.sc.domain.generator;

import java.util.Date;

public class Orders {
    private String CM_ORDERID;

    private String CM_USERID;

    private Integer CM_USESCORE;

    private Integer CM_NUMBERSUN;

    private Double CM_MONEYSUN;

    private Date CM_CREATETIME;

    private Integer CM_STATE;

    private Double CM_USERBALANCE;

    private Integer CM_PAYTYPE;

    private String CM_PAYRESULT;

    public String getCM_ORDERID() {
        return CM_ORDERID;
    }

    public void setCM_ORDERID(String CM_ORDERID) {
        this.CM_ORDERID = CM_ORDERID == null ? null : CM_ORDERID.trim();
    }

    public String getCM_USERID() {
        return CM_USERID;
    }

    public void setCM_USERID(String CM_USERID) {
        this.CM_USERID = CM_USERID == null ? null : CM_USERID.trim();
    }

    public Integer getCM_USESCORE() {
        return CM_USESCORE;
    }

    public void setCM_USESCORE(Integer CM_USESCORE) {
        this.CM_USESCORE = CM_USESCORE;
    }

    public Integer getCM_NUMBERSUN() {
        return CM_NUMBERSUN;
    }

    public void setCM_NUMBERSUN(Integer CM_NUMBERSUN) {
        this.CM_NUMBERSUN = CM_NUMBERSUN;
    }

    public Double getCM_MONEYSUN() {
        return CM_MONEYSUN;
    }

    public void setCM_MONEYSUN(Double CM_MONEYSUN) {
        this.CM_MONEYSUN = CM_MONEYSUN;
    }

    public Date getCM_CREATETIME() {
        return CM_CREATETIME;
    }

    public void setCM_CREATETIME(Date CM_CREATETIME) {
        this.CM_CREATETIME = CM_CREATETIME;
    }

    public Integer getCM_STATE() {
        return CM_STATE;
    }

    public void setCM_STATE(Integer CM_STATE) {
        this.CM_STATE = CM_STATE;
    }

    public Double getCM_USERBALANCE() {
        return CM_USERBALANCE;
    }

    public void setCM_USERBALANCE(Double CM_USERBALANCE) {
        this.CM_USERBALANCE = CM_USERBALANCE;
    }

    public Integer getCM_PAYTYPE() {
        return CM_PAYTYPE;
    }

    public void setCM_PAYTYPE(Integer CM_PAYTYPE) {
        this.CM_PAYTYPE = CM_PAYTYPE;
    }

    public String getCM_PAYRESULT() {
        return CM_PAYRESULT;
    }

    public void setCM_PAYRESULT(String CM_PAYRESULT) {
        this.CM_PAYRESULT = CM_PAYRESULT == null ? null : CM_PAYRESULT.trim();
    }
}