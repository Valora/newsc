package com.sc.domain.generator;

public class GoodsWithBLOBs extends Goods {
    private String cmHtml;

    private String cmChtml;

    private String cmFigurespath;

    public String getCmHtml() {
        return cmHtml;
    }

    public void setCmHtml(String cmHtml) {
        this.cmHtml = cmHtml == null ? null : cmHtml.trim();
    }

    public String getCmChtml() {
        return cmChtml;
    }

    public void setCmChtml(String cmChtml) {
        this.cmChtml = cmChtml == null ? null : cmChtml.trim();
    }

    public String getCmFigurespath() {
        return cmFigurespath;
    }

    public void setCmFigurespath(String cmFigurespath) {
        this.cmFigurespath = cmFigurespath == null ? null : cmFigurespath.trim();
    }
}