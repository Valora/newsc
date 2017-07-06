package com.sc.domain.generator;

import java.util.Date;

public class Register {
    private Long CM_PHONE;

    private Integer CM_CODE;

    private Date CM_TIME;

    private Integer CM_COUNT;

    public Long getCM_PHONE() {
        return CM_PHONE;
    }

    public void setCM_PHONE(Long CM_PHONE) {
        this.CM_PHONE = CM_PHONE;
    }

    public Integer getCM_CODE() {
        return CM_CODE;
    }

    public void setCM_CODE(Integer CM_CODE) {
        this.CM_CODE = CM_CODE;
    }

    public Date getCM_TIME() {
        return CM_TIME;
    }

    public void setCM_TIME(Date CM_TIME) {
        this.CM_TIME = CM_TIME;
    }

    public Integer getCM_COUNT() {
        return CM_COUNT;
    }

    public void setCM_COUNT(Integer CM_COUNT) {
        this.CM_COUNT = CM_COUNT;
    }
}