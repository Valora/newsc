package com.sc.domain.generator;

public class GoodsWithBLOBs extends Goods {
    private String CM_HTML;

    private String CM_CHTML;

    private String CM_FIGURESPATH;

    public String getCM_HTML() {
        return CM_HTML;
    }

    public void setCM_HTML(String CM_HTML) {
        this.CM_HTML = CM_HTML == null ? null : CM_HTML.trim();
    }

    public String getCM_CHTML() {
        return CM_CHTML;
    }

    public void setCM_CHTML(String CM_CHTML) {
        this.CM_CHTML = CM_CHTML == null ? null : CM_CHTML.trim();
    }

    public String getCM_FIGURESPATH() {
        return CM_FIGURESPATH;
    }

    public void setCM_FIGURESPATH(String CM_FIGURESPATH) {
        this.CM_FIGURESPATH = CM_FIGURESPATH == null ? null : CM_FIGURESPATH.trim();
    }
}