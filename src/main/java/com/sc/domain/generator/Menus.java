package com.sc.domain.generator;

public class Menus {
    private Integer CM_MENUID;

    private String CM_MENUNAME;

    private String CM_MENUURL;

    public Integer getCM_MENUID() {
        return CM_MENUID;
    }

    public void setCM_MENUID(Integer CM_MENUID) {
        this.CM_MENUID = CM_MENUID;
    }

    public String getCM_MENUNAME() {
        return CM_MENUNAME;
    }

    public void setCM_MENUNAME(String CM_MENUNAME) {
        this.CM_MENUNAME = CM_MENUNAME == null ? null : CM_MENUNAME.trim();
    }

    public String getCM_MENUURL() {
        return CM_MENUURL;
    }

    public void setCM_MENUURL(String CM_MENUURL) {
        this.CM_MENUURL = CM_MENUURL == null ? null : CM_MENUURL.trim();
    }
}