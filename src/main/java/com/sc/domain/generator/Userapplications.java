package com.sc.domain.generator;

public class Userapplications {
    private Integer CM_ID;

    private String CM_NAME;

    private Long CM_PHONE;

    private String CM_CARDFACEPATH;

    private String CM_CARDBACKPATH;

    private String CM_PERSONALPATH;

    private String CM_LICENSEPATH;

    private String CM_SHOPEADDRESS;

    private Double CM_SHOPLON;

    private Double CM_SHOPLAT;

    private Integer CM_STATE;

    private String CM_REASON;

    private Integer CM_TYPE;

    public Integer getCM_ID() {
        return CM_ID;
    }

    public void setCM_ID(Integer CM_ID) {
        this.CM_ID = CM_ID;
    }

    public String getCM_NAME() {
        return CM_NAME;
    }

    public void setCM_NAME(String CM_NAME) {
        this.CM_NAME = CM_NAME == null ? null : CM_NAME.trim();
    }

    public Long getCM_PHONE() {
        return CM_PHONE;
    }

    public void setCM_PHONE(Long CM_PHONE) {
        this.CM_PHONE = CM_PHONE;
    }

    public String getCM_CARDFACEPATH() {
        return CM_CARDFACEPATH;
    }

    public void setCM_CARDFACEPATH(String CM_CARDFACEPATH) {
        this.CM_CARDFACEPATH = CM_CARDFACEPATH == null ? null : CM_CARDFACEPATH.trim();
    }

    public String getCM_CARDBACKPATH() {
        return CM_CARDBACKPATH;
    }

    public void setCM_CARDBACKPATH(String CM_CARDBACKPATH) {
        this.CM_CARDBACKPATH = CM_CARDBACKPATH == null ? null : CM_CARDBACKPATH.trim();
    }

    public String getCM_PERSONALPATH() {
        return CM_PERSONALPATH;
    }

    public void setCM_PERSONALPATH(String CM_PERSONALPATH) {
        this.CM_PERSONALPATH = CM_PERSONALPATH == null ? null : CM_PERSONALPATH.trim();
    }

    public String getCM_LICENSEPATH() {
        return CM_LICENSEPATH;
    }

    public void setCM_LICENSEPATH(String CM_LICENSEPATH) {
        this.CM_LICENSEPATH = CM_LICENSEPATH == null ? null : CM_LICENSEPATH.trim();
    }

    public String getCM_SHOPEADDRESS() {
        return CM_SHOPEADDRESS;
    }

    public void setCM_SHOPEADDRESS(String CM_SHOPEADDRESS) {
        this.CM_SHOPEADDRESS = CM_SHOPEADDRESS == null ? null : CM_SHOPEADDRESS.trim();
    }

    public Double getCM_SHOPLON() {
        return CM_SHOPLON;
    }

    public void setCM_SHOPLON(Double CM_SHOPLON) {
        this.CM_SHOPLON = CM_SHOPLON;
    }

    public Double getCM_SHOPLAT() {
        return CM_SHOPLAT;
    }

    public void setCM_SHOPLAT(Double CM_SHOPLAT) {
        this.CM_SHOPLAT = CM_SHOPLAT;
    }

    public Integer getCM_STATE() {
        return CM_STATE;
    }

    public void setCM_STATE(Integer CM_STATE) {
        this.CM_STATE = CM_STATE;
    }

    public String getCM_REASON() {
        return CM_REASON;
    }

    public void setCM_REASON(String CM_REASON) {
        this.CM_REASON = CM_REASON == null ? null : CM_REASON.trim();
    }

    public Integer getCM_TYPE() {
        return CM_TYPE;
    }

    public void setCM_TYPE(Integer CM_TYPE) {
        this.CM_TYPE = CM_TYPE;
    }
}