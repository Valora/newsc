package com.sc.mapper.generator;

import com.sc.domain.generator.Addresses;
import com.sc.domain.generator.AddressesExample.Criteria;
import com.sc.domain.generator.AddressesExample.Criterion;
import com.sc.domain.generator.AddressesExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AddressesSqlProvider {

    public String countByExample(AddressesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_ADDRESSES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AddressesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_ADDRESSES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Addresses record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_ADDRESSES");
        
        if (record.getCM_ADDRESSID() != null) {
            sql.VALUES("CM_ADDRESSID", "#{CM_ADDRESSID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_ADDRESS() != null) {
            sql.VALUES("CM_ADDRESS", "#{CM_ADDRESS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_USERID() != null) {
            sql.VALUES("CM_USERID", "#{CM_USERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_ISFIRST() != null) {
            sql.VALUES("CM_ISFIRST", "#{CM_ISFIRST,jdbcType=INTEGER}");
        }
        
        if (record.getCM_NAME() != null) {
            sql.VALUES("CM_NAME", "#{CM_NAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PHONE() != null) {
            sql.VALUES("CM_PHONE", "#{CM_PHONE,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AddressesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_ADDRESSID");
        } else {
            sql.SELECT("CM_ADDRESSID");
        }
        sql.SELECT("CM_ADDRESS");
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_ISFIRST");
        sql.SELECT("CM_NAME");
        sql.SELECT("CM_PHONE");
        sql.FROM("TB_ADDRESSES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Addresses record = (Addresses) parameter.get("record");
        AddressesExample example = (AddressesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_ADDRESSES");
        
        if (record.getCM_ADDRESSID() != null) {
            sql.SET("CM_ADDRESSID = #{record.CM_ADDRESSID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_ADDRESS() != null) {
            sql.SET("CM_ADDRESS = #{record.CM_ADDRESS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_USERID() != null) {
            sql.SET("CM_USERID = #{record.CM_USERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_ISFIRST() != null) {
            sql.SET("CM_ISFIRST = #{record.CM_ISFIRST,jdbcType=INTEGER}");
        }
        
        if (record.getCM_NAME() != null) {
            sql.SET("CM_NAME = #{record.CM_NAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PHONE() != null) {
            sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ADDRESSES");
        
        sql.SET("CM_ADDRESSID = #{record.CM_ADDRESSID,jdbcType=INTEGER}");
        sql.SET("CM_ADDRESS = #{record.CM_ADDRESS,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.CM_USERID,jdbcType=VARCHAR}");
        sql.SET("CM_ISFIRST = #{record.CM_ISFIRST,jdbcType=INTEGER}");
        sql.SET("CM_NAME = #{record.CM_NAME,jdbcType=VARCHAR}");
        sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        
        AddressesExample example = (AddressesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AddressesExample example, boolean includeExamplePhrase) {
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