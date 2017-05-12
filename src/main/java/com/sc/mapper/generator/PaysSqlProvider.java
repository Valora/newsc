package com.sc.mapper.generator;

import com.sc.domain.generator.Pays;
import com.sc.domain.generator.PaysExample;
import com.sc.domain.generator.PaysExample.Criteria;
import com.sc.domain.generator.PaysExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class PaysSqlProvider {

    public String countByExample(PaysExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_PAYS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PaysExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_PAYS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Pays record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_PAYS");
        
        if (record.getCmPayid() != null) {
            sql.VALUES("CM_PAYID", "#{cmPayid,jdbcType=INTEGER}");
        }
        
        if (record.getCmOrderid() != null) {
            sql.VALUES("CM_ORDERID", "#{cmOrderid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPayjson() != null) {
            sql.VALUES("CM_PAYJSON", "#{cmPayjson,jdbcType=VARCHAR}");
        }
        
        if (record.getCmTime() != null) {
            sql.VALUES("CM_TIME", "#{cmTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmPaytype() != null) {
            sql.VALUES("CM_PAYTYPE", "#{cmPaytype,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PaysExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_PAYID");
        } else {
            sql.SELECT("CM_PAYID");
        }
        sql.SELECT("CM_ORDERID");
        sql.SELECT("CM_PAYJSON");
        sql.SELECT("CM_TIME");
        sql.SELECT("CM_PAYTYPE");
        sql.FROM("TB_PAYS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Pays record = (Pays) parameter.get("record");
        PaysExample example = (PaysExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_PAYS");
        
        if (record.getCmPayid() != null) {
            sql.SET("CM_PAYID = #{record.cmPayid,jdbcType=INTEGER}");
        }
        
        if (record.getCmOrderid() != null) {
            sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPayjson() != null) {
            sql.SET("CM_PAYJSON = #{record.cmPayjson,jdbcType=VARCHAR}");
        }
        
        if (record.getCmTime() != null) {
            sql.SET("CM_TIME = #{record.cmTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmPaytype() != null) {
            sql.SET("CM_PAYTYPE = #{record.cmPaytype,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_PAYS");
        
        sql.SET("CM_PAYID = #{record.cmPayid,jdbcType=INTEGER}");
        sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        sql.SET("CM_PAYJSON = #{record.cmPayjson,jdbcType=VARCHAR}");
        sql.SET("CM_TIME = #{record.cmTime,jdbcType=TIMESTAMP}");
        sql.SET("CM_PAYTYPE = #{record.cmPaytype,jdbcType=INTEGER}");
        
        PaysExample example = (PaysExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PaysExample example, boolean includeExamplePhrase) {
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