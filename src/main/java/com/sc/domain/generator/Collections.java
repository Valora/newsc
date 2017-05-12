package com.sc.domain.generator;

import java.util.Date;

public class Collections {
    private Integer cmCollectionid;

    private String cmUserid;

    private String cmGoodsid;

    private Date cmJointime;

    public Integer getCmCollectionid() {
        return cmCollectionid;
    }

    public void setCmCollectionid(Integer cmCollectionid) {
        this.cmCollectionid = cmCollectionid;
    }

    public String getCmUserid() {
        return cmUserid;
    }

    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    public String getCmGoodsid() {
        return cmGoodsid;
    }

    public void setCmGoodsid(String cmGoodsid) {
        this.cmGoodsid = cmGoodsid == null ? null : cmGoodsid.trim();
    }

    public Date getCmJointime() {
        return cmJointime;
    }

    public void setCmJointime(Date cmJointime) {
        this.cmJointime = cmJointime;
    }
}