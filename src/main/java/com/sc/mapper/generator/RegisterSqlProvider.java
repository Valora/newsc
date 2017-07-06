package com.sc.mapper.generator;

import com.sc.domain.generator.Register;
import com.sc.domain.generator.RegisterExample;
import com.sc.domain.generator.RegisterExample.Criteria;
import com.sc.domain.generator.RegisterExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class RegisterSqlProvider {

    public String countByExample(RegisterExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_REGISTER");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RegisterExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_REGISTER");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Register record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_REGISTER");
        
        if (record.getCM_PHONE() != null) {
            sql.VALUES("CM_PHONE", "#{CM_PHONE,jdbcType=BIGINT}");
        }
        
        if (record.getCM_CODE() != null) {
            sql.VALUES("CM_CODE", "#{CM_CODE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_TIME() != null) {
            sql.VALUES("CM_TIME", "#{CM_TIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_COUNT() != null) {
            sql.VALUES("CM_COUNT", "#{CM_COUNT,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RegisterExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_PHONE");
        } else {
            sql.SELECT("CM_PHONE");
        }
        sql.SELECT("CM_CODE");
        sql.SELECT("CM_TIME");
        sql.SELECT("CM_COUNT");
        sql.FROM("TB_REGISTER");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Register record = (Register) parameter.get("record");
        RegisterExample example = (RegisterExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_REGISTER");
        
        if (record.getCM_PHONE() != null) {
            sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        }
        
        if (record.getCM_CODE() != null) {
            sql.SET("CM_CODE = #{record.CM_CODE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_TIME() != null) {
            sql.SET("CM_TIME = #{record.CM_TIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_COUNT() != null) {
            sql.SET("CM_COUNT = #{record.CM_COUNT,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_REGISTER");
        
        sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        sql.SET("CM_CODE = #{record.CM_CODE,jdbcType=INTEGER}");
        sql.SET("CM_TIME = #{record.CM_TIME,jdbcType=TIMESTAMP}");
        sql.SET("CM_COUNT = #{record.CM_COUNT,jdbcType=INTEGER}");
        
        RegisterExample example = (RegisterExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RegisterExample example, boolean includeExamplePhrase) {
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