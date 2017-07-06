package com.sc.mapper.generator;

import com.sc.domain.generator.Notices;
import com.sc.domain.generator.NoticesExample.Criteria;
import com.sc.domain.generator.NoticesExample.Criterion;
import com.sc.domain.generator.NoticesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class NoticesSqlProvider {

    public String countByExample(NoticesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_NOTICES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(NoticesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_NOTICES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Notices record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_NOTICES");
        
        if (record.getCM_NOTICEIID() != null) {
            sql.VALUES("CM_NOTICEIID", "#{CM_NOTICEIID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_TITLE() != null) {
            sql.VALUES("CM_TITLE", "#{CM_TITLE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CONTENT() != null) {
            sql.VALUES("CM_CONTENT", "#{CM_CONTENT,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_OTHER() != null) {
            sql.VALUES("CM_OTHER", "#{CM_OTHER,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATOR() != null) {
            sql.VALUES("CM_CREATOR", "#{CM_CREATOR,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_DEADLINE() != null) {
            sql.VALUES("CM_DEADLINE", "#{CM_DEADLINE,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_ADMINID() != null) {
            sql.VALUES("CM_ADMINID", "#{CM_ADMINID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.VALUES("CM_CREATETIME", "#{CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(NoticesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_NOTICEIID");
        } else {
            sql.SELECT("CM_NOTICEIID");
        }
        sql.SELECT("CM_TITLE");
        sql.SELECT("CM_CONTENT");
        sql.SELECT("CM_OTHER");
        sql.SELECT("CM_CREATOR");
        sql.SELECT("CM_DEADLINE");
        sql.SELECT("CM_ADMINID");
        sql.SELECT("CM_CREATETIME");
        sql.FROM("TB_NOTICES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Notices record = (Notices) parameter.get("record");
        NoticesExample example = (NoticesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_NOTICES");
        
        if (record.getCM_NOTICEIID() != null) {
            sql.SET("CM_NOTICEIID = #{record.CM_NOTICEIID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_TITLE() != null) {
            sql.SET("CM_TITLE = #{record.CM_TITLE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CONTENT() != null) {
            sql.SET("CM_CONTENT = #{record.CM_CONTENT,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_OTHER() != null) {
            sql.SET("CM_OTHER = #{record.CM_OTHER,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATOR() != null) {
            sql.SET("CM_CREATOR = #{record.CM_CREATOR,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_DEADLINE() != null) {
            sql.SET("CM_DEADLINE = #{record.CM_DEADLINE,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_ADMINID() != null) {
            sql.SET("CM_ADMINID = #{record.CM_ADMINID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_NOTICES");
        
        sql.SET("CM_NOTICEIID = #{record.CM_NOTICEIID,jdbcType=INTEGER}");
        sql.SET("CM_TITLE = #{record.CM_TITLE,jdbcType=VARCHAR}");
        sql.SET("CM_CONTENT = #{record.CM_CONTENT,jdbcType=VARCHAR}");
        sql.SET("CM_OTHER = #{record.CM_OTHER,jdbcType=VARCHAR}");
        sql.SET("CM_CREATOR = #{record.CM_CREATOR,jdbcType=VARCHAR}");
        sql.SET("CM_DEADLINE = #{record.CM_DEADLINE,jdbcType=TIMESTAMP}");
        sql.SET("CM_ADMINID = #{record.CM_ADMINID,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        
        NoticesExample example = (NoticesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, NoticesExample example, boolean includeExamplePhrase) {
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