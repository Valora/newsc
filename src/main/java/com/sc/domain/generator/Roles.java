package com.sc.domain.generator;

public class Roles {
    private Integer cmRoleid;

    private String cmRolename;

    public Integer getCmRoleid() {
        return cmRoleid;
    }

    public void setCmRoleid(Integer cmRoleid) {
        this.cmRoleid = cmRoleid;
    }

    public String getCmRolename() {
        return cmRolename;
    }

    public void setCmRolename(String cmRolename) {
        this.cmRolename = cmRolename == null ? null : cmRolename.trim();
    }
}