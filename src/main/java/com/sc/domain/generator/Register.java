package com.sc.domain.generator;

import java.util.Date;

public class Register {
    private Long cmPhone;

    private Integer cmCode;

    private Date cmTime;

    private Integer cmCount;

    public Long getCmPhone() {
        return cmPhone;
    }

    public void setCmPhone(Long cmPhone) {
        this.cmPhone = cmPhone;
    }

    public Integer getCmCode() {
        return cmCode;
    }

    public void setCmCode(Integer cmCode) {
        this.cmCode = cmCode;
    }

    public Date getCmTime() {
        return cmTime;
    }

    public void setCmTime(Date cmTime) {
        this.cmTime = cmTime;
    }

    public Integer getCmCount() {
        return cmCount;
    }

    public void setCmCount(Integer cmCount) {
        this.cmCount = cmCount;
    }
}