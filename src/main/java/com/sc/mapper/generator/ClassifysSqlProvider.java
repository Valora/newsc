package com.sc.mapper.generator;

import com.sc.domain.generator.Classifys;
import com.sc.domain.generator.ClassifysExample.Criteria;
import com.sc.domain.generator.ClassifysExample.Criterion;
import com.sc.domain.generator.ClassifysExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ClassifysSqlProvider {

    public String countByExample(ClassifysExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_CLASSIFYS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ClassifysExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_CLASSIFYS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Classifys record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_CLASSIFYS");
        
        if (record.getCM_CLASSIFYID() != null) {
            sql.VALUES("CM_CLASSIFYID", "#{CM_CLASSIFYID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_CLASSIFYNAME() != null) {
            sql.VALUES("CM_CLASSIFYNAME", "#{CM_CLASSIFYNAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PARENTID() != null) {
            sql.VALUES("CM_PARENTID", "#{CM_PARENTID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_IMGPATH() != null) {
            sql.VALUES("CM_IMGPATH", "#{CM_IMGPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SORT() != null) {
            sql.VALUES("CM_SORT", "#{CM_SORT,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ClassifysExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_CLASSIFYID");
        } else {
            sql.SELECT("CM_CLASSIFYID");
        }
        sql.SELECT("CM_CLASSIFYNAME");
        sql.SELECT("CM_PARENTID");
        sql.SELECT("CM_IMGPATH");
        sql.SELECT("CM_SORT");
        sql.FROM("TB_CLASSIFYS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Classifys record = (Classifys) parameter.get("record");
        ClassifysExample example = (ClassifysExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_CLASSIFYS");
        
        if (record.getCM_CLASSIFYID() != null) {
            sql.SET("CM_CLASSIFYID = #{record.CM_CLASSIFYID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_CLASSIFYNAME() != null) {
            sql.SET("CM_CLASSIFYNAME = #{record.CM_CLASSIFYNAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PARENTID() != null) {
            sql.SET("CM_PARENTID = #{record.CM_PARENTID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_IMGPATH() != null) {
            sql.SET("CM_IMGPATH = #{record.CM_IMGPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SORT() != null) {
            sql.SET("CM_SORT = #{record.CM_SORT,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_CLASSIFYS");
        
        sql.SET("CM_CLASSIFYID = #{record.CM_CLASSIFYID,jdbcType=INTEGER}");
        sql.SET("CM_CLASSIFYNAME = #{record.CM_CLASSIFYNAME,jdbcType=VARCHAR}");
        sql.SET("CM_PARENTID = #{record.CM_PARENTID,jdbcType=INTEGER}");
        sql.SET("CM_IMGPATH = #{record.CM_IMGPATH,jdbcType=VARCHAR}");
        sql.SET("CM_SORT = #{record.CM_SORT,jdbcType=INTEGER}");
        
        ClassifysExample example = (ClassifysExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ClassifysExample example, boolean includeExamplePhrase) {
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