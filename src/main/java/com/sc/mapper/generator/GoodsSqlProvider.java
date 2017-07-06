package com.sc.mapper.generator;

import com.sc.domain.generator.GoodsExample.Criteria;
import com.sc.domain.generator.GoodsExample.Criterion;
import com.sc.domain.generator.GoodsExample;
import com.sc.domain.generator.GoodsWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

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
        
        if (record.getCM_GOODSID() != null) {
            sql.VALUES("CM_GOODSID", "#{CM_GOODSID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_GOODSARTNUM() != null) {
            sql.VALUES("CM_GOODSARTNUM", "#{CM_GOODSARTNUM,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SELLERID() != null) {
            sql.VALUES("CM_SELLERID", "#{CM_SELLERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CLASSIFYID() != null) {
            sql.VALUES("CM_CLASSIFYID", "#{CM_CLASSIFYID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_CLASSIFYTABS() != null) {
            sql.VALUES("CM_CLASSIFYTABS", "#{CM_CLASSIFYTABS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_BRANDID() != null) {
            sql.VALUES("CM_BRANDID", "#{CM_BRANDID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_TITLE() != null) {
            sql.VALUES("CM_TITLE", "#{CM_TITLE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SALES() != null) {
            sql.VALUES("CM_SALES", "#{CM_SALES,jdbcType=INTEGER}");
        }
        
        if (record.getCM_ORIGINALPRICE() != null) {
            sql.VALUES("CM_ORIGINALPRICE", "#{CM_ORIGINALPRICE,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_PRESENTPRICE() != null) {
            sql.VALUES("CM_PRESENTPRICE", "#{CM_PRESENTPRICE,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_MAINFIGUREPATH() != null) {
            sql.VALUES("CM_MAINFIGUREPATH", "#{CM_MAINFIGUREPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_HORIZONTALPATH() != null) {
            sql.VALUES("CM_HORIZONTALPATH", "#{CM_HORIZONTALPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.VALUES("CM_CREATETIME", "#{CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_ISOFF() != null) {
            sql.VALUES("CM_ISOFF", "#{CM_ISOFF,jdbcType=INTEGER}");
        }
        
        if (record.getCM_ISPROMOTION() != null) {
            sql.VALUES("CM_ISPROMOTION", "#{CM_ISPROMOTION,jdbcType=INTEGER}");
        }
        
        if (record.getCM_SPEC() != null) {
            sql.VALUES("CM_SPEC", "#{CM_SPEC,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_HTML() != null) {
            sql.VALUES("CM_HTML", "#{CM_HTML,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCM_CHTML() != null) {
            sql.VALUES("CM_CHTML", "#{CM_CHTML,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCM_FIGURESPATH() != null) {
            sql.VALUES("CM_FIGURESPATH", "#{CM_FIGURESPATH,jdbcType=LONGVARCHAR}");
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
        
        if (record.getCM_GOODSID() != null) {
            sql.SET("CM_GOODSID = #{record.CM_GOODSID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_GOODSARTNUM() != null) {
            sql.SET("CM_GOODSARTNUM = #{record.CM_GOODSARTNUM,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SELLERID() != null) {
            sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CLASSIFYID() != null) {
            sql.SET("CM_CLASSIFYID = #{record.CM_CLASSIFYID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_CLASSIFYTABS() != null) {
            sql.SET("CM_CLASSIFYTABS = #{record.CM_CLASSIFYTABS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_BRANDID() != null) {
            sql.SET("CM_BRANDID = #{record.CM_BRANDID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_TITLE() != null) {
            sql.SET("CM_TITLE = #{record.CM_TITLE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SALES() != null) {
            sql.SET("CM_SALES = #{record.CM_SALES,jdbcType=INTEGER}");
        }
        
        if (record.getCM_ORIGINALPRICE() != null) {
            sql.SET("CM_ORIGINALPRICE = #{record.CM_ORIGINALPRICE,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_PRESENTPRICE() != null) {
            sql.SET("CM_PRESENTPRICE = #{record.CM_PRESENTPRICE,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_MAINFIGUREPATH() != null) {
            sql.SET("CM_MAINFIGUREPATH = #{record.CM_MAINFIGUREPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_HORIZONTALPATH() != null) {
            sql.SET("CM_HORIZONTALPATH = #{record.CM_HORIZONTALPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_ISOFF() != null) {
            sql.SET("CM_ISOFF = #{record.CM_ISOFF,jdbcType=INTEGER}");
        }
        
        if (record.getCM_ISPROMOTION() != null) {
            sql.SET("CM_ISPROMOTION = #{record.CM_ISPROMOTION,jdbcType=INTEGER}");
        }
        
        if (record.getCM_SPEC() != null) {
            sql.SET("CM_SPEC = #{record.CM_SPEC,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_HTML() != null) {
            sql.SET("CM_HTML = #{record.CM_HTML,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCM_CHTML() != null) {
            sql.SET("CM_CHTML = #{record.CM_CHTML,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCM_FIGURESPATH() != null) {
            sql.SET("CM_FIGURESPATH = #{record.CM_FIGURESPATH,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_GOODS");
        
        sql.SET("CM_GOODSID = #{record.CM_GOODSID,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSARTNUM = #{record.CM_GOODSARTNUM,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        sql.SET("CM_CLASSIFYID = #{record.CM_CLASSIFYID,jdbcType=INTEGER}");
        sql.SET("CM_CLASSIFYTABS = #{record.CM_CLASSIFYTABS,jdbcType=VARCHAR}");
        sql.SET("CM_BRANDID = #{record.CM_BRANDID,jdbcType=INTEGER}");
        sql.SET("CM_TITLE = #{record.CM_TITLE,jdbcType=VARCHAR}");
        sql.SET("CM_SALES = #{record.CM_SALES,jdbcType=INTEGER}");
        sql.SET("CM_ORIGINALPRICE = #{record.CM_ORIGINALPRICE,jdbcType=DOUBLE}");
        sql.SET("CM_PRESENTPRICE = #{record.CM_PRESENTPRICE,jdbcType=DOUBLE}");
        sql.SET("CM_MAINFIGUREPATH = #{record.CM_MAINFIGUREPATH,jdbcType=VARCHAR}");
        sql.SET("CM_HORIZONTALPATH = #{record.CM_HORIZONTALPATH,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISOFF = #{record.CM_ISOFF,jdbcType=INTEGER}");
        sql.SET("CM_ISPROMOTION = #{record.CM_ISPROMOTION,jdbcType=INTEGER}");
        sql.SET("CM_SPEC = #{record.CM_SPEC,jdbcType=VARCHAR}");
        sql.SET("CM_HTML = #{record.CM_HTML,jdbcType=LONGVARCHAR}");
        sql.SET("CM_CHTML = #{record.CM_CHTML,jdbcType=LONGVARCHAR}");
        sql.SET("CM_FIGURESPATH = #{record.CM_FIGURESPATH,jdbcType=LONGVARCHAR}");
        
        GoodsExample example = (GoodsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_GOODS");
        
        sql.SET("CM_GOODSID = #{record.CM_GOODSID,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSARTNUM = #{record.CM_GOODSARTNUM,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        sql.SET("CM_CLASSIFYID = #{record.CM_CLASSIFYID,jdbcType=INTEGER}");
        sql.SET("CM_CLASSIFYTABS = #{record.CM_CLASSIFYTABS,jdbcType=VARCHAR}");
        sql.SET("CM_BRANDID = #{record.CM_BRANDID,jdbcType=INTEGER}");
        sql.SET("CM_TITLE = #{record.CM_TITLE,jdbcType=VARCHAR}");
        sql.SET("CM_SALES = #{record.CM_SALES,jdbcType=INTEGER}");
        sql.SET("CM_ORIGINALPRICE = #{record.CM_ORIGINALPRICE,jdbcType=DOUBLE}");
        sql.SET("CM_PRESENTPRICE = #{record.CM_PRESENTPRICE,jdbcType=DOUBLE}");
        sql.SET("CM_MAINFIGUREPATH = #{record.CM_MAINFIGUREPATH,jdbcType=VARCHAR}");
        sql.SET("CM_HORIZONTALPATH = #{record.CM_HORIZONTALPATH,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISOFF = #{record.CM_ISOFF,jdbcType=INTEGER}");
        sql.SET("CM_ISPROMOTION = #{record.CM_ISPROMOTION,jdbcType=INTEGER}");
        sql.SET("CM_SPEC = #{record.CM_SPEC,jdbcType=VARCHAR}");
        
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