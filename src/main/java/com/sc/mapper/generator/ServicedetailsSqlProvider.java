package com.sc.mapper.generator;

import com.sc.domain.generator.ServicedetailsExample;
import com.sc.domain.generator.ServicedetailsExample.Criteria;
import com.sc.domain.generator.ServicedetailsExample.Criterion;
import com.sc.domain.generator.ServicedetailsWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class ServicedetailsSqlProvider {

    public String countByExample(ServicedetailsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_SERVICEDETAILS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ServicedetailsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_SERVICEDETAILS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ServicedetailsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_SERVICEDETAILS");
        
        if (record.getCmSvid() != null) {
            sql.VALUES("CM_SVID", "#{cmSvid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmAfterserviceid() != null) {
            sql.VALUES("CM_AFTERSERVICEID", "#{cmAfterserviceid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmType() != null) {
            sql.VALUES("CM_TYPE", "#{cmType,jdbcType=INTEGER}");
        }
        
        if (record.getCmLogisticsnum() != null) {
            sql.VALUES("CM_LOGISTICSNUM", "#{cmLogisticsnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLogisticsid() != null) {
            sql.VALUES("CM_LOGISTICSID", "#{cmLogisticsid,jdbcType=INTEGER}");
        }
        
        if (record.getCmLogisticsinfo() != null) {
            sql.VALUES("CM_LOGISTICSINFO", "#{cmLogisticsinfo,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ServicedetailsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_SVID");
        } else {
            sql.SELECT("CM_SVID");
        }
        sql.SELECT("CM_AFTERSERVICEID");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_TYPE");
        sql.SELECT("CM_LOGISTICSNUM");
        sql.SELECT("CM_LOGISTICSID");
        sql.SELECT("CM_LOGISTICSINFO");
        sql.FROM("TB_SERVICEDETAILS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ServicedetailsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_SVID");
        } else {
            sql.SELECT("CM_SVID");
        }
        sql.SELECT("CM_AFTERSERVICEID");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_TYPE");
        sql.SELECT("CM_LOGISTICSNUM");
        sql.SELECT("CM_LOGISTICSID");
        sql.FROM("TB_SERVICEDETAILS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ServicedetailsWithBLOBs record = (ServicedetailsWithBLOBs) parameter.get("record");
        ServicedetailsExample example = (ServicedetailsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_SERVICEDETAILS");
        
        if (record.getCmSvid() != null) {
            sql.SET("CM_SVID = #{record.cmSvid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmAfterserviceid() != null) {
            sql.SET("CM_AFTERSERVICEID = #{record.cmAfterserviceid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmType() != null) {
            sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        }
        
        if (record.getCmLogisticsnum() != null) {
            sql.SET("CM_LOGISTICSNUM = #{record.cmLogisticsnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLogisticsid() != null) {
            sql.SET("CM_LOGISTICSID = #{record.cmLogisticsid,jdbcType=INTEGER}");
        }
        
        if (record.getCmLogisticsinfo() != null) {
            sql.SET("CM_LOGISTICSINFO = #{record.cmLogisticsinfo,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_SERVICEDETAILS");
        
        sql.SET("CM_SVID = #{record.cmSvid,jdbcType=VARCHAR}");
        sql.SET("CM_AFTERSERVICEID = #{record.cmAfterserviceid,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSNUM = #{record.cmLogisticsnum,jdbcType=VARCHAR}");
        sql.SET("CM_LOGISTICSID = #{record.cmLogisticsid,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSINFO = #{record.cmLogisticsinfo,jdbcType=LONGVARCHAR}");
        
        ServicedetailsExample example = (ServicedetailsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_SERVICEDETAILS");
        
        sql.SET("CM_SVID = #{record.cmSvid,jdbcType=VARCHAR}");
        sql.SET("CM_AFTERSERVICEID = #{record.cmAfterserviceid,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        sql.SET("CM_LOGISTICSNUM = #{record.cmLogisticsnum,jdbcType=VARCHAR}");
        sql.SET("CM_LOGISTICSID = #{record.cmLogisticsid,jdbcType=INTEGER}");
        
        ServicedetailsExample example = (ServicedetailsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ServicedetailsExample example, boolean includeExamplePhrase) {
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