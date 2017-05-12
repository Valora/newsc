package com.sc.mapper.generator;

import com.sc.domain.generator.OrdersExample;
import com.sc.domain.generator.OrdersExample.Criteria;
import com.sc.domain.generator.OrdersExample.Criterion;
import com.sc.domain.generator.OrdersWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class OrdersSqlProvider {

    public String countByExample(OrdersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_ORDERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrdersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_ORDERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrdersWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_ORDERS");
        
        if (record.getCmOrderid() != null) {
            sql.VALUES("CM_ORDERID", "#{cmOrderid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmUserid() != null) {
            sql.VALUES("CM_USERID", "#{cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmUsescore() != null) {
            sql.VALUES("CM_USESCORE", "#{cmUsescore,jdbcType=INTEGER}");
        }
        
        if (record.getCmNumbersun() != null) {
            sql.VALUES("CM_NUMBERSUN", "#{cmNumbersun,jdbcType=INTEGER}");
        }
        
        if (record.getCmMoneysun() != null) {
            sql.VALUES("CM_MONEYSUN", "#{cmMoneysun,jdbcType=DOUBLE}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmState() != null) {
            sql.VALUES("CM_STATE", "#{cmState,jdbcType=INTEGER}");
        }
        
        if (record.getCmUserbalance() != null) {
            sql.VALUES("CM_USERBALANCE", "#{cmUserbalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCmPaytype() != null) {
            sql.VALUES("CM_PAYTYPE", "#{cmPaytype,jdbcType=INTEGER}");
        }
        
        if (record.getCmPayresult() != null) {
            sql.VALUES("CM_PAYRESULT", "#{cmPayresult,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOrderdetailsids() != null) {
            sql.VALUES("CM_ORDERDETAILSIDS", "#{cmOrderdetailsids,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(OrdersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_ORDERID");
        } else {
            sql.SELECT("CM_ORDERID");
        }
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_USESCORE");
        sql.SELECT("CM_NUMBERSUN");
        sql.SELECT("CM_MONEYSUN");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_STATE");
        sql.SELECT("CM_USERBALANCE");
        sql.SELECT("CM_PAYTYPE");
        sql.SELECT("CM_PAYRESULT");
        sql.SELECT("CM_ORDERDETAILSIDS");
        sql.FROM("TB_ORDERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(OrdersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_ORDERID");
        } else {
            sql.SELECT("CM_ORDERID");
        }
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_USESCORE");
        sql.SELECT("CM_NUMBERSUN");
        sql.SELECT("CM_MONEYSUN");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_STATE");
        sql.SELECT("CM_USERBALANCE");
        sql.SELECT("CM_PAYTYPE");
        sql.SELECT("CM_PAYRESULT");
        sql.FROM("TB_ORDERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrdersWithBLOBs record = (OrdersWithBLOBs) parameter.get("record");
        OrdersExample example = (OrdersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERS");
        
        if (record.getCmOrderid() != null) {
            sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmUserid() != null) {
            sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmUsescore() != null) {
            sql.SET("CM_USESCORE = #{record.cmUsescore,jdbcType=INTEGER}");
        }
        
        if (record.getCmNumbersun() != null) {
            sql.SET("CM_NUMBERSUN = #{record.cmNumbersun,jdbcType=INTEGER}");
        }
        
        if (record.getCmMoneysun() != null) {
            sql.SET("CM_MONEYSUN = #{record.cmMoneysun,jdbcType=DOUBLE}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmState() != null) {
            sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        }
        
        if (record.getCmUserbalance() != null) {
            sql.SET("CM_USERBALANCE = #{record.cmUserbalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCmPaytype() != null) {
            sql.SET("CM_PAYTYPE = #{record.cmPaytype,jdbcType=INTEGER}");
        }
        
        if (record.getCmPayresult() != null) {
            sql.SET("CM_PAYRESULT = #{record.cmPayresult,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOrderdetailsids() != null) {
            sql.SET("CM_ORDERDETAILSIDS = #{record.cmOrderdetailsids,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERS");
        
        sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_USESCORE = #{record.cmUsescore,jdbcType=INTEGER}");
        sql.SET("CM_NUMBERSUN = #{record.cmNumbersun,jdbcType=INTEGER}");
        sql.SET("CM_MONEYSUN = #{record.cmMoneysun,jdbcType=DOUBLE}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        sql.SET("CM_USERBALANCE = #{record.cmUserbalance,jdbcType=DOUBLE}");
        sql.SET("CM_PAYTYPE = #{record.cmPaytype,jdbcType=INTEGER}");
        sql.SET("CM_PAYRESULT = #{record.cmPayresult,jdbcType=VARCHAR}");
        sql.SET("CM_ORDERDETAILSIDS = #{record.cmOrderdetailsids,jdbcType=LONGVARCHAR}");
        
        OrdersExample example = (OrdersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERS");
        
        sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_USESCORE = #{record.cmUsescore,jdbcType=INTEGER}");
        sql.SET("CM_NUMBERSUN = #{record.cmNumbersun,jdbcType=INTEGER}");
        sql.SET("CM_MONEYSUN = #{record.cmMoneysun,jdbcType=DOUBLE}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        sql.SET("CM_USERBALANCE = #{record.cmUserbalance,jdbcType=DOUBLE}");
        sql.SET("CM_PAYTYPE = #{record.cmPaytype,jdbcType=INTEGER}");
        sql.SET("CM_PAYRESULT = #{record.cmPayresult,jdbcType=VARCHAR}");
        
        OrdersExample example = (OrdersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrdersExample example, boolean includeExamplePhrase) {
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