package com.sc.mapper.generator;

import com.sc.domain.generator.Collections;
import com.sc.domain.generator.CollectionsExample;
import com.sc.domain.generator.CollectionsExample.Criteria;
import com.sc.domain.generator.CollectionsExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class CollectionsSqlProvider {

    public String countByExample(CollectionsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_COLLECTIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CollectionsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_COLLECTIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Collections record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_COLLECTIONS");
        
        if (record.getCmCollectionid() != null) {
            sql.VALUES("CM_COLLECTIONID", "#{cmCollectionid,jdbcType=INTEGER}");
        }
        
        if (record.getCmUserid() != null) {
            sql.VALUES("CM_USERID", "#{cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmGoodsid() != null) {
            sql.VALUES("CM_GOODSID", "#{cmGoodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmJointime() != null) {
            sql.VALUES("CM_JOINTIME", "#{cmJointime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CollectionsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_COLLECTIONID");
        } else {
            sql.SELECT("CM_COLLECTIONID");
        }
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_GOODSID");
        sql.SELECT("CM_JOINTIME");
        sql.FROM("TB_COLLECTIONS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Collections record = (Collections) parameter.get("record");
        CollectionsExample example = (CollectionsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_COLLECTIONS");
        
        if (record.getCmCollectionid() != null) {
            sql.SET("CM_COLLECTIONID = #{record.cmCollectionid,jdbcType=INTEGER}");
        }
        
        if (record.getCmUserid() != null) {
            sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmGoodsid() != null) {
            sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmJointime() != null) {
            sql.SET("CM_JOINTIME = #{record.cmJointime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_COLLECTIONS");
        
        sql.SET("CM_COLLECTIONID = #{record.cmCollectionid,jdbcType=INTEGER}");
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        sql.SET("CM_JOINTIME = #{record.cmJointime,jdbcType=TIMESTAMP}");
        
        CollectionsExample example = (CollectionsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CollectionsExample example, boolean includeExamplePhrase) {
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