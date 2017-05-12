package com.sc.mapper.generator;

import com.sc.domain.generator.OrderdetailsExample;
import com.sc.domain.generator.OrderdetailsExample.Criteria;
import com.sc.domain.generator.OrderdetailsExample.Criterion;
import com.sc.domain.generator.OrderdetailsWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

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
        
        if (record.getCmOrderdetailsid() != null) {
            sql.VALUES("CM_ORDERDETAILSID", "#{cmOrderdetailsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOrderid() != null) {
            sql.VALUES("CM_ORDERID", "#{cmOrderid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmGoodsid() != null) {
            sql.VALUES("CM_GOODSID", "#{cmGoodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmUserid() != null) {
            sql.VALUES("CM_USERID", "#{cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmNumber() != null) {
            sql.VALUES("CM_NUMBER", "#{cmNumber,jdbcType=INTEGER}");
        }
        
        if (record.getCmMoney() != null) {
            sql.VALUES("CM_MONEY", "#{cmMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getCmSellerid() != null) {
            sql.VALUES("CM_SELLERID", "#{cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmServicestate() != null) {
            sql.VALUES("CM_SERVICESTATE", "#{cmServicestate,jdbcType=INTEGER}");
        }
        
        if (record.getCmSellerstate() != null) {
            sql.VALUES("CM_SELLERSTATE", "#{cmSellerstate,jdbcType=INTEGER}");
        }
        
        if (record.getCmLogisticsnum() != null) {
            sql.VALUES("CM_LOGISTICSNUM", "#{cmLogisticsnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLogisticsid() != null) {
            sql.VALUES("CM_LOGISTICSID", "#{cmLogisticsid,jdbcType=INTEGER}");
        }
        
        if (record.getCmSpecnumdetails() != null) {
            sql.VALUES("CM_SPECNUMDETAILS", "#{cmSpecnumdetails,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCmLogisticsinfo() != null) {
            sql.VALUES("CM_LOGISTICSINFO", "#{cmLogisticsinfo,jdbcType=LONGVARCHAR}");
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
        
        if (record.getCmOrderdetailsid() != null) {
            sql.SET("CM_ORDERDETAILSID = #{record.cmOrderdetailsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOrderid() != null) {
            sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmGoodsid() != null) {
            sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmUserid() != null) {
            sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmNumber() != null) {
            sql.SET("CM_NUMBER = #{record.cmNumber,jdbcType=INTEGER}");
        }
        
        if (record.getCmMoney() != null) {
            sql.SET("CM_MONEY = #{record.cmMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getCmSellerid() != null) {
            sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmServicestate() != null) {
            sql.SET("CM_SERVICESTATE = #{record.cmServicestate,jdbcType=INTEGER}");
        }
        
        if (record.getCmSellerstate() != null) {
            sql.SET("CM_SELLERSTATE = #{record.cmSellerstate,jdbcType=INTEGER}");
        }
        
        if (record.getCmLogisticsnum() != null) {
            sql.SET("CM_LOGISTICSNUM = #{record.cmLogisticsnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLogisticsid() != null) {
            sql.SET("CM_LOGISTICSID = #{record.cmLogisticsid,jdbcType=INTEGER}");
        }
        
        if (record.getCmSpecnumdetails() != null) {
            sql.SET("CM_SPECNUMDETAILS = #{record.cmSpecnumdetails,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getCmLogisticsinfo() != null) {
            sql.SET("CM_LOGISTICSINFO = #{record.cmLogisticsinfo,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERDETAILS");
        
        sql.SET("CM_ORDERDETAILSID = #{record.cmOrderdetailsid,jdbcType=VARCHAR}");
        sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_NUMBER = #{record.cmNumber,jdbcType=INTEGER}");
        sql.SET("CM_MONEY = #{record.cmMoney,jdbcType=DOUBLE}");
        sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_SERVICESTATE = #{record.cmServicestate,jdbcType=INTEGER}");
        sql.SET("CM_SELLERSTATE = #{record.cmSellerstate,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSNUM = #{record.cmLogisticsnum,jdbcType=VARCHAR}");
        sql.SET("CM_LOGISTICSID = #{record.cmLogisticsid,jdbcType=INTEGER}");
        sql.SET("CM_SPECNUMDETAILS = #{record.cmSpecnumdetails,jdbcType=LONGVARCHAR}");
        sql.SET("CM_LOGISTICSINFO = #{record.cmLogisticsinfo,jdbcType=LONGVARCHAR}");
        
        OrderdetailsExample example = (OrderdetailsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_ORDERDETAILS");
        
        sql.SET("CM_ORDERDETAILSID = #{record.cmOrderdetailsid,jdbcType=VARCHAR}");
        sql.SET("CM_ORDERID = #{record.cmOrderid,jdbcType=VARCHAR}");
        sql.SET("CM_GOODSID = #{record.cmGoodsid,jdbcType=VARCHAR}");
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_NUMBER = #{record.cmNumber,jdbcType=INTEGER}");
        sql.SET("CM_MONEY = #{record.cmMoney,jdbcType=DOUBLE}");
        sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_SERVICESTATE = #{record.cmServicestate,jdbcType=INTEGER}");
        sql.SET("CM_SELLERSTATE = #{record.cmSellerstate,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSNUM = #{record.cmLogisticsnum,jdbcType=VARCHAR}");
        sql.SET("CM_LOGISTICSID = #{record.cmLogisticsid,jdbcType=INTEGER}");
        
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