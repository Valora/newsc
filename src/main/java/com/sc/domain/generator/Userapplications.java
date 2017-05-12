package com.sc.domain.generator;

public class Userapplications {
    private Integer cmId;

    private String cmName;

    private Long cmPhone;

    private String cmCardfacepath;

    private String cmCardbackpath;

    private String cmPersonalpath;

    private String cmLicensepath;

    private String cmShopeaddress;

    private Double cmShoplon;

    private Double cmShoplat;

    private Integer cmState;

    private String cmReason;

    private Integer cmType;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
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

    public String getCmCardfacepath() {
        return cmCardfacepath;
    }

    public void setCmCardfacepath(String cmCardfacepath) {
        this.cmCardfacepath = cmCardfacepath == null ? null : cmCardfacepath.trim();
    }

    public String getCmCardbackpath() {
        return cmCardbackpath;
    }

    public void setCmCardbackpath(String cmCardbackpath) {
        this.cmCardbackpath = cmCardbackpath == null ? null : cmCardbackpath.trim();
    }

    public String getCmPersonalpath() {
        return cmPersonalpath;
    }

    public void setCmPersonalpath(String cmPersonalpath) {
        this.cmPersonalpath = cmPersonalpath == null ? null : cmPersonalpath.trim();
    }

    public String getCmLicensepath() {
        return cmLicensepath;
    }

    public void setCmLicensepath(String cmLicensepath) {
        this.cmLicensepath = cmLicensepath == null ? null : cmLicensepath.trim();
    }

    public String getCmShopeaddress() {
        return cmShopeaddress;
    }

    public void setCmShopeaddress(String cmShopeaddress) {
        this.cmShopeaddress = cmShopeaddress == null ? null : cmShopeaddress.trim();
    }

    public Double getCmShoplon() {
        return cmShoplon;
    }

    public void setCmShoplon(Double cmShoplon) {
        this.cmShoplon = cmShoplon;
    }

    public Double getCmShoplat() {
        return cmShoplat;
    }

    public void setCmShoplat(Double cmShoplat) {
        this.cmShoplat = cmShoplat;
    }

    public Integer getCmState() {
        return cmState;
    }

    public void setCmState(Integer cmState) {
        this.cmState = cmState;
    }

    public String getCmReason() {
        return cmReason;
    }

    public void setCmReason(String cmReason) {
        this.cmReason = cmReason == null ? null : cmReason.trim();
    }

    public Integer getCmType() {
        return cmType;
    }

    public void setCmType(Integer cmType) {
        this.cmType = cmType;
    }
}