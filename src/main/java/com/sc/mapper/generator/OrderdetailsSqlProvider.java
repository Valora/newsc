package com.sc.mapper.generator;

import com.sc.domain.generator.OrderdetailsExample.Criteria;
import com.sc.domain.generator.OrderdetailsExample.Criterion;
import com.sc.domain.generator.OrderdetailsExample;
import com.sc.domain.generator.OrderdetailsWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderdetailsSqlProvider {

    public String countByExample(OrderdetailsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_ORDERDETAILS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrderdetailsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_ORDERDETAILS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OrderdetailsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_ORDERDETAILS");
        
        if (record.getCM_ORDERDETAILSID() != null) {
            sql.VALUES("CM_ORDERDETAILSID", "#{CM_ORDERDETAILSID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_ORDERID() != null) {
            sql.VALUES("CM_ORDERID", "#{CM_ORDERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_GOODSID() != null) {
            sql.VALUES("CM_GOODSID", "#{CM_GOODSID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_USERID() != null) {
            sql.VALUES("CM_USERID", "#{CM_USERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_NUMBER() != null) {
            sql.VALUES("CM_NUMBER", "#{CM_NUMBER,jdbcType=INTEGER}");
        }
        
        if (record.getCM_MONEY() != null) {
            sql.VALUES("CM_MONEY", "#{CM_MONEY,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_SELLERID() != null) {
            sql.VALUES("CM_SELLERID", "#{CM_SELLERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.VALUES("CM_CREATETIME", "#{CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_SERVICESTATE() != null) {
            sql.VALUES("CM_SERVICESTATE", "#{CM_SERVICESTATE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_SELLERSTATE() != null) {
            sql.VALUES("CM_SELLERSTATE", "#{CM_SELLERSTATE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_LOGISTICSNUM() != null) {
            sql.VALUES("CM_LOGISTICSNUM", "#{CM_LOGISTICSNUM,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LOGISTICSID() != null) {
            sql.VALUES("CM_LOGISTICSID", "#{CM_LOGISTICSID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_SPECNUMDETAILS() != null) {
            sql.VALUES("CM_SPECNUMDETAILS", "#{CM_SPECNUMDETAILS,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCM_LOGISTICSINFO() != null) {
            sql.VALUES("CM_LOGISTICSINFO", "#{CM_LOGISTICSINFO,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(OrderdetailsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_ORDERDETAILSID");
        } else {
            sql.SELECT("CM_ORDERDETAILSID");
        }
        sql.SELECT("CM_ORDERID");
        sql.SELECT("CM_GOODSID");
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_NUMBER");
        sql.SELECT("CM_MONEY");
        sql.SELECT("CM_SELLERID");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_SERVICESTATE");
        sql.SELECT("CM_SELLERSTATE");
        sql.SELECT("CM_LOGISTICSNUM");
        sql.SELECT("CM_LOGISTICSID");
        sql.SELECT("CM_SPECNUMDETAILS");
        sql.SELECT("CM_LOGISTICSINFO");
        sql.FROM("TB_ORDERDETAILS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(OrderdetailsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_ORDERDETAILSID");
        } else {
            sql.SELECT("CM_ORDERDETAILSID");
        }
        sql.SELECT("CM_ORDERID");
        sql.SELECT("CM_GOODSID");
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_NUMBER");
        sql.SELECT("CM_MONEY");
        sql.SELECT("CM_SELLERID");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_SERVICESTATE");
        sql.SELECT("CM_SELLERSTATE");
        sql.SELECT("CM_LOGISTICSNUM");
        sql.SELECT("CM_LOGISTICSID");
        sql.FROM("TB_ORDERDETAILS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrderdetailsWithBLOBs record = (OrderdetailsWithBLOBs) parameter.get("record");
        OrderdetailsExample example = (OrderdetailsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERDETAILS");
        
        if (record.getCM_ORDERDETAILSID() != null) {
            sql.SET("CM_ORDERDETAILSID = #{record.CM_ORDERDETAILSID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_ORDERID() != null) {
            sql.SET("CM_ORDERID = #{record.CM_ORDERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_GOODSID() != null) {
            sql.SET("CM_GOODSID = #{record.CM_GOODSID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_USERID() != null) {
            sql.SET("CM_USERID = #{record.CM_USERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_NUMBER() != null) {
            sql.SET("CM_NUMBER = #{record.CM_NUMBER,jdbcType=INTEGER}");
        }
        
        if (record.getCM_MONEY() != null) {
            sql.SET("CM_MONEY = #{record.CM_MONEY,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_SELLERID() != null) {
            sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_SERVICESTATE() != null) {
            sql.SET("CM_SERVICESTATE = #{record.CM_SERVICESTATE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_SELLERSTATE() != null) {
            sql.SET("CM_SELLERSTATE = #{record.CM_SELLERSTATE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_LOGISTICSNUM() != null) {
            sql.SET("CM_LOGISTICSNUM = #{record.CM_LOGISTICSNUM,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LOGISTICSID() != null) {
            sql.SET("CM_LOGISTICSID = #{record.CM_LOGISTICSID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_SPECNUMDETAILS() != null) {
            sql.SET("CM_SPECNUMDETAILS = #{record.CM_SPECNUMDETAILS,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCM_LOGISTICSINFO() != null) {
            sql.SET("CM_LOGISTICSINFO = #{record.CM_LOGISTICSINFO,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERDETAILS");
        
        sql.SET("CM_ORDERDETAILSID = #{record.CM_ORDERDETAILSID,jdbcType=VARCHAR}");
        sql.SET("CM_ORDERID = #{record.CM_ORDERID,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSID = #{record.CM_GOODSID,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.CM_USERID,jdbcType=VARCHAR}");
        sql.SET("CM_NUMBER = #{record.CM_NUMBER,jdbcType=INTEGER}");
        sql.SET("CM_MONEY = #{record.CM_MONEY,jdbcType=DOUBLE}");
        sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        sql.SET("CM_SERVICESTATE = #{record.CM_SERVICESTATE,jdbcType=INTEGER}");
        sql.SET("CM_SELLERSTATE = #{record.CM_SELLERSTATE,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSNUM = #{record.CM_LOGISTICSNUM,jdbcType=VARCHAR}");
        sql.SET("CM_LOGISTICSID = #{record.CM_LOGISTICSID,jdbcType=INTEGER}");
        sql.SET("CM_SPECNUMDETAILS = #{record.CM_SPECNUMDETAILS,jdbcType=LONGVARCHAR}");
        sql.SET("CM_LOGISTICSINFO = #{record.CM_LOGISTICSINFO,jdbcType=LONGVARCHAR}");
        
        OrderdetailsExample example = (OrderdetailsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERDETAILS");
        
        sql.SET("CM_ORDERDETAILSID = #{record.CM_ORDERDETAILSID,jdbcType=VARCHAR}");
        sql.SET("CM_ORDERID = #{record.CM_ORDERID,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSID = #{record.CM_GOODSID,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.CM_USERID,jdbcType=VARCHAR}");
        sql.SET("CM_NUMBER = #{record.CM_NUMBER,jdbcType=INTEGER}");
        sql.SET("CM_MONEY = #{record.CM_MONEY,jdbcType=DOUBLE}");
        sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        sql.SET("CM_SERVICESTATE = #{record.CM_SERVICESTATE,jdbcType=INTEGER}");
        sql.SET("CM_SELLERSTATE = #{record.CM_SELLERSTATE,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSNUM = #{record.CM_LOGISTICSNUM,jdbcType=VARCHAR}");
        sql.SET("CM_LOGISTICSID = #{record.CM_LOGISTICSID,jdbcType=INTEGER}");
        
        OrderdetailsExample example = (OrderdetailsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrderdetailsExample example, boolean includeExamplePhrase) {
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