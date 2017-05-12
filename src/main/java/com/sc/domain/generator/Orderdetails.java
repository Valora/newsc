package com.sc.domain.generator;

import java.util.Date;

public class Orderdetails {
    private String cmOrderdetailsid;

    private String cmOrderid;

    private String cmGoodsid;

    private String cmUserid;

    private Integer cmNumber;

    private Double cmMoney;

    private String cmSellerid;

    private Date cmCreatetime;

    private Integer cmServicestate;

    private Integer cmSellerstate;

    private String cmLogisticsnum;

    private Integer cmLogisticsid;

    public String getCmOrderdetailsid() {
        return cmOrderdetailsid;
    }

    public void setCmOrderdetailsid(String cmOrderdetailsid) {
        this.cmOrderdetailsid = cmOrderdetailsid == null ? null : cmOrderdetailsid.trim();
    }

    public String getCmOrderid() {
        return cmOrderid;
    }

    public void setCmOrderid(String cmOrderid) {
        this.cmOrderid = cmOrderid == null ? null : cmOrderid.trim();
    }

    public String getCmGoodsid() {
        return cmGoodsid;
    }

    public void setCmGoodsid(String cmGoodsid) {
        this.cmGoodsid = cmGoodsid == null ? null : cmGoodsid.trim();
    }

    public String getCmUserid() {
        return cmUserid;
    }

    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    public Integer getCmNumber() {
        return cmNumber;
    }

    public void setCmNumber(Integer cmNumber) {
        this.cmNumber = cmNumber;
    }

    public Double getCmMoney() {
        return cmMoney;
    }

    public void setCmMoney(Double cmMoney) {
        this.cmMoney = cmMoney;
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

    public Integer getCmServicestate() {
        return cmServicestate;
    }

    public void setCmServicestate(Integer cmServicestate) {
        this.cmServicestate = cmServicestate;
    }

    public Integer getCmSellerstate() {
        return cmSellerstate;
    }

    public void setCmSellerstate(Integer cmSellerstate) {
        this.cmSellerstate = cmSellerstate;
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