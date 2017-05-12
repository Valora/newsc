package com.sc.domain.generator;

public class Brands {
    private Integer cmBrandid;

    private String cmBrand;

    private String cmOther;

    public Integer getCmBrandid() {
        return cmBrandid;
    }

    public void setCmBrandid(Integer cmBrandid) {
        this.cmBrandid = cmBrandid;
    }

    public String getCmBrand() {
        return cmBrand;
    }

    public void setCmBrand(String cmBrand) {
        this.cmBrand = cmBrand == null ? null : cmBrand.trim();
    }

    public String getCmOther() {
        return cmOther;
    }

    public void setCmOther(String cmOther) {
        this.cmOther = cmOther == null ? null : cmOther.trim();
    }
}