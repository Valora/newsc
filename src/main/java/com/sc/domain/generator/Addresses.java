package com.sc.domain.generator;

public class Addresses {
    private Integer cmAddressid;

    private String cmAddress;

    private String cmUserid;

    private Integer cmIsfirst;

    private String cmName;

    private Long cmPhone;

    public Integer getCmAddressid() {
        return cmAddressid;
    }

    public void setCmAddressid(Integer cmAddressid) {
        this.cmAddressid = cmAddressid;
    }

    public String getCmAddress() {
        return cmAddress;
    }

    public void setCmAddress(String cmAddress) {
        this.cmAddress = cmAddress == null ? null : cmAddress.trim();
    }

    public String getCmUserid() {
        return cmUserid;
    }

    public void setCmUserid(String cmUserid) {
        this.cmUserid = cmUserid == null ? null : cmUserid.trim();
    }

    public Integer getCmIsfirst() {
        return cmIsfirst;
    }

    public void setCmIsfirst(Integer cmIsfirst) {
        this.cmIsfirst = cmIsfirst;
    }

    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName == null ? null : cmName.trim();
    }

    public Long getCmPhone() {
        return cmPhone;
    }

    public void setCmPhone(Long cmPhone) {
        this.cmPhone = cmPhone;
    }
}