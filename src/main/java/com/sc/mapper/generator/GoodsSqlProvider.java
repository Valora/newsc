package com.sc.mapper.generator;

import com.sc.domain.generator.GoodsExample;
import com.sc.domain.generator.GoodsExample.Criteria;
import com.sc.domain.generator.GoodsExample.Criterion;
import com.sc.domain.generator.GoodsWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class GoodsSqlProvider {

    public String countByExample(GoodsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_GOODS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GoodsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_GOODS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(GoodsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_GOODS");
        
        if (record.getCmGoodsid() != null) {
            sql.VALUES("CM_GOODSID", "#{cmGoodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmGoodsartnum() != null) {
            sql.VALUES("CM_GOODSARTNUM", "#{cmGoodsartnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSellerid() != null) {
            sql.VALUES("CM_SELLERID", "#{cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmClassifyid() != null) {
            sql.VALUES("CM_CLASSIFYID", "#{cmClassifyid,jdbcType=INTEGER}");
        }
        
        if (record.getCmClassifytabs() != null) {
            sql.VALUES("CM_CLASSIFYTABS", "#{cmClassifytabs,jdbcType=VARCHAR}");
        }
        
        if (record.getCmBrandid() != null) {
            sql.VALUES("CM_BRANDID", "#{cmBrandid,jdbcType=INTEGER}");
        }
        
        if (record.getCmTitle() != null) {
            sql.VALUES("CM_TITLE", "#{cmTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSales() != null) {
            sql.VALUES("CM_SALES", "#{cmSales,jdbcType=INTEGER}");
        }
        
        if (record.getCmOriginalprice() != null) {
            sql.VALUES("CM_ORIGINALPRICE", "#{cmOriginalprice,jdbcType=DOUBLE}");
        }
        
        if (record.getCmPresentprice() != null) {
            sql.VALUES("CM_PRESENTPRICE", "#{cmPresentprice,jdbcType=DOUBLE}");
        }
        
        if (record.getCmMainfigurepath() != null) {
            sql.VALUES("CM_MAINFIGUREPATH", "#{cmMainfigurepath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmHorizontalpath() != null) {
            sql.VALUES("CM_HORIZONTALPATH", "#{cmHorizontalpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmIsoff() != null) {
            sql.VALUES("CM_ISOFF", "#{cmIsoff,jdbcType=INTEGER}");
        }
        
        if (record.getCmIspromotion() != null) {
            sql.VALUES("CM_ISPROMOTION", "#{cmIspromotion,jdbcType=INTEGER}");
        }
        
        if (record.getCmSpec() != null) {
            sql.VALUES("CM_SPEC", "#{cmSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getCmHtml() != null) {
            sql.VALUES("CM_HTML", "#{cmHtml,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCmChtml() != null) {
            sql.VALUES("CM_CHTML", "#{cmChtml,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCmFigurespath() != null) {
            sql.VALUES("CM_FIGURESPATH", "#{cmFigurespath,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(GoodsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_GOODSID");
        } else {
            sql.SELECT("CM_GOODSID");
        }
        sql.SELECT("CM_GOODSARTNUM");
        sql.SELECT("CM_SELLERID");
        sql.SELECT("CM_CLASSIFYID");
        sql.SELECT("CM_CLASSIFYTABS");
        sql.SELECT("CM_BRANDID");
        sql.SELECT("CM_TITLE");
        sql.SELECT("CM_SALES");
        sql.SELECT("CM_ORIGINALPRICE");
        sql.SELECT("CM_PRESENTPRICE");
        sql.SELECT("CM_MAINFIGUREPATH");
        sql.SELECT("CM_HORIZONTALPATH");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_ISOFF");
        sql.SELECT("CM_ISPROMOTION");
        sql.SELECT("CM_SPEC");
        sql.SELECT("CM_HTML");
        sql.SELECT("CM_CHTML");
        sql.SELECT("CM_FIGURESPATH");
        sql.FROM("TB_GOODS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(GoodsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_GOODSID");
        } else {
            sql.SELECT("CM_GOODSID");
        }
        sql.SELECT("CM_GOODSARTNUM");
        sql.SELECT("CM_SELLERID");
        sql.SELECT("CM_CLASSIFYID");
        sql.SELECT("CM_CLASSIFYTABS");
        sql.SELECT("CM_BRANDID");
        sql.SELECT("CM_TITLE");
        sql.SELECT("CM_SALES");
        sql.SELECT("CM_ORIGINALPRICE");
        sql.SELECT("CM_PRESENTPRICE");
        sql.SELECT("CM_MAINFIGUREPATH");
        sql.SELECT("CM_HORIZONTALPATH");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_ISOFF");
        sql.SELECT("CM_ISPROMOTION");
        sql.SELECT("CM_SPEC");
        sql.FROM("TB_GOODS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GoodsWithBLOBs record = (GoodsWithBLOBs) parameter.get("record");
        GoodsExample example = (GoodsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_GOODS");
        
        if (record.getCmGoodsid() != null) {
            sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmGoodsartnum() != null) {
            sql.SET("CM_GOODSARTNUM = #{record.cmGoodsartnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSellerid() != null) {
            sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmClassifyid() != null) {
            sql.SET("CM_CLASSIFYID = #{record.cmClassifyid,jdbcType=INTEGER}");
        }
        
        if (record.getCmClassifytabs() != null) {
            sql.SET("CM_CLASSIFYTABS = #{record.cmClassifytabs,jdbcType=VARCHAR}");
        }
        
        if (record.getCmBrandid() != null) {
            sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
        }
        
        if (record.getCmTitle() != null) {
            sql.SET("CM_TITLE = #{record.cmTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSales() != null) {
            sql.SET("CM_SALES = #{record.cmSales,jdbcType=INTEGER}");
        }
        
        if (record.getCmOriginalprice() != null) {
            sql.SET("CM_ORIGINALPRICE = #{record.cmOriginalprice,jdbcType=DOUBLE}");
        }
        
        if (record.getCmPresentprice() != null) {
            sql.SET("CM_PRESENTPRICE = #{record.cmPresentprice,jdbcType=DOUBLE}");
        }
        
        if (record.getCmMainfigurepath() != null) {
            sql.SET("CM_MAINFIGUREPATH = #{record.cmMainfigurepath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmHorizontalpath() != null) {
            sql.SET("CM_HORIZONTALPATH = #{record.cmHorizontalpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmIsoff() != null) {
            sql.SET("CM_ISOFF = #{record.cmIsoff,jdbcType=INTEGER}");
        }
        
        if (record.getCmIspromotion() != null) {
            sql.SET("CM_ISPROMOTION = #{record.cmIspromotion,jdbcType=INTEGER}");
        }
        
        if (record.getCmSpec() != null) {
            sql.SET("CM_SPEC = #{record.cmSpec,jdbcType=VARCHAR}");
        }
        
        if (record.getCmHtml() != null) {
            sql.SET("CM_HTML = #{record.cmHtml,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCmChtml() != null) {
            sql.SET("CM_CHTML = #{record.cmChtml,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCmFigurespath() != null) {
            sql.SET("CM_FIGURESPATH = #{record.cmFigurespath,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_GOODS");
        
        sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSARTNUM = #{record.cmGoodsartnum,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        sql.SET("CM_CLASSIFYID = #{record.cmClassifyid,jdbcType=INTEGER}");
        sql.SET("CM_CLASSIFYTABS = #{record.cmClassifytabs,jdbcType=VARCHAR}");
        sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
        sql.SET("CM_TITLE = #{record.cmTitle,jdbcType=VARCHAR}");
        sql.SET("CM_SALES = #{record.cmSales,jdbcType=INTEGER}");
        sql.SET("CM_ORIGINALPRICE = #{record.cmOriginalprice,jdbcType=DOUBLE}");
        sql.SET("CM_PRESENTPRICE = #{record.cmPresentprice,jdbcType=DOUBLE}");
        sql.SET("CM_MAINFIGUREPATH = #{record.cmMainfigurepath,jdbcType=VARCHAR}");
        sql.SET("CM_HORIZONTALPATH = #{record.cmHorizontalpath,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISOFF = #{record.cmIsoff,jdbcType=INTEGER}");
        sql.SET("CM_ISPROMOTION = #{record.cmIspromotion,jdbcType=INTEGER}");
        sql.SET("CM_SPEC = #{record.cmSpec,jdbcType=VARCHAR}");
        sql.SET("CM_HTML = #{record.cmHtml,jdbcType=LONGVARCHAR}");
        sql.SET("CM_CHTML = #{record.cmChtml,jdbcType=LONGVARCHAR}");
        sql.SET("CM_FIGURESPATH = #{record.cmFigurespath,jdbcType=LONGVARCHAR}");
        
        GoodsExample example = (GoodsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_GOODS");
        
        sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSARTNUM = #{record.cmGoodsartnum,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        sql.SET("CM_CLASSIFYID = #{record.cmClassifyid,jdbcType=INTEGER}");
        sql.SET("CM_CLASSIFYTABS = #{record.cmClassifytabs,jdbcType=VARCHAR}");
        sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
        sql.SET("CM_TITLE = #{record.cmTitle,jdbcType=VARCHAR}");
        sql.SET("CM_SALES = #{record.cmSales,jdbcType=INTEGER}");
        sql.SET("CM_ORIGINALPRICE = #{record.cmOriginalprice,jdbcType=DOUBLE}");
        sql.SET("CM_PRESENTPRICE = #{record.cmPresentprice,jdbcType=DOUBLE}");
        sql.SET("CM_MAINFIGUREPATH = #{record.cmMainfigurepath,jdbcType=VARCHAR}");
        sql.SET("CM_HORIZONTALPATH = #{record.cmHorizontalpath,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISOFF = #{record.cmIsoff,jdbcType=INTEGER}");
        sql.SET("CM_ISPROMOTION = #{record.cmIspromotion,jdbcType=INTEGER}");
        sql.SET("CM_SPEC = #{record.cmSpec,jdbcType=VARCHAR}");
        
        GoodsExample example = (GoodsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GoodsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}