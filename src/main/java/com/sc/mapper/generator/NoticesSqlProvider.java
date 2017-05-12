package com.sc.mapper.generator;

import com.sc.domain.generator.Notices;
import com.sc.domain.generator.NoticesExample;
import com.sc.domain.generator.NoticesExample.Criteria;
import com.sc.domain.generator.NoticesExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

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
        
        if (record.getCmNoticeiid() != null) {
            sql.VALUES("CM_NOTICEIID", "#{cmNoticeiid,jdbcType=INTEGER}");
        }
        
        if (record.getCmTitle() != null) {
            sql.VALUES("CM_TITLE", "#{cmTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getCmContent() != null) {
            sql.VALUES("CM_CONTENT", "#{cmContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOther() != null) {
            sql.VALUES("CM_OTHER", "#{cmOther,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreator() != null) {
            sql.VALUES("CM_CREATOR", "#{cmCreator,jdbcType=VARCHAR}");
        }
        
        if (record.getCmDeadline() != null) {
            sql.VALUES("CM_DEADLINE", "#{cmDeadline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmAdminid() != null) {
            sql.VALUES("CM_ADMINID", "#{cmAdminid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
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
        
        if (record.getCmNoticeiid() != null) {
            sql.SET("CM_NOTICEIID = #{record.cmNoticeiid,jdbcType=INTEGER}");
        }
        
        if (record.getCmTitle() != null) {
            sql.SET("CM_TITLE = #{record.cmTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getCmContent() != null) {
            sql.SET("CM_CONTENT = #{record.cmContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOther() != null) {
            sql.SET("CM_OTHER = #{record.cmOther,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreator() != null) {
            sql.SET("CM_CREATOR = #{record.cmCreator,jdbcType=VARCHAR}");
        }
        
        if (record.getCmDeadline() != null) {
            sql.SET("CM_DEADLINE = #{record.cmDeadline,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmAdminid() != null) {
            sql.SET("CM_ADMINID = #{record.cmAdminid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_NOTICES");
        
        sql.SET("CM_NOTICEIID = #{record.cmNoticeiid,jdbcType=INTEGER}");
        sql.SET("CM_TITLE = #{record.cmTitle,jdbcType=VARCHAR}");
        sql.SET("CM_CONTENT = #{record.cmContent,jdbcType=VARCHAR}");
        sql.SET("CM_OTHER = #{record.cmOther,jdbcType=VARCHAR}");
        sql.SET("CM_CREATOR = #{record.cmCreator,jdbcType=VARCHAR}");
        sql.SET("CM_DEADLINE = #{record.cmDeadline,jdbcType=TIMESTAMP}");
        sql.SET("CM_ADMINID = #{record.cmAdminid,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        
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