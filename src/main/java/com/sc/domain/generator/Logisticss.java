package com.sc.domain.generator;

public class Logisticss {
    private Integer cmLogisticsid;

    private String cmLogisticsname;

    public Integer getCmLogisticsid() {
        return cmLogisticsid;
    }

    public void setCmLogisticsid(Integer cmLogisticsid) {
        this.cmLogisticsid = cmLogisticsid;
    }

    public String getCmLogisticsname() {
        return cmLogisticsname;
    }

    public void setCmLogisticsname(String cmLogisticsname) {
        this.cmLogisticsname = cmLogisticsname == null ? null : cmLogisticsname.trim();
    }
}