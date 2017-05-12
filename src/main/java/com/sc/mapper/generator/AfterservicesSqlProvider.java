package com.sc.mapper.generator;

import com.sc.domain.generator.Afterservices;
import com.sc.domain.generator.AfterservicesExample;
import com.sc.domain.generator.AfterservicesExample.Criteria;
import com.sc.domain.generator.AfterservicesExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class AfterservicesSqlProvider {

    public String countByExample(AfterservicesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_AFTERSERVICES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AfterservicesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_AFTERSERVICES");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Afterservices record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_AFTERSERVICES");
        
        if (record.getCmAfterserviceid() != null) {
            sql.VALUES("CM_AFTERSERVICEID", "#{cmAfterserviceid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSellerid() != null) {
            sql.VALUES("CM_SELLERID", "#{cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmUserid() != null) {
            sql.VALUES("CM_USERID", "#{cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOrderdetailsid() != null) {
            sql.VALUES("CM_ORDERDETAILSID", "#{cmOrderdetailsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmReason() != null) {
            sql.VALUES("CM_REASON", "#{cmReason,jdbcType=VARCHAR}");
        }
        
        if (record.getCmType() != null) {
            sql.VALUES("CM_TYPE", "#{cmType,jdbcType=INTEGER}");
        }
        
        if (record.getCmState() != null) {
            sql.VALUES("CM_STATE", "#{cmState,jdbcType=INTEGER}");
        }
        
        if (record.getCmImgpaths() != null) {
            sql.VALUES("CM_IMGPATHS", "#{cmImgpaths,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSvid() != null) {
            sql.VALUES("CM_SVID", "#{cmSvid,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AfterservicesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_AFTERSERVICEID");
        } else {
            sql.SELECT("CM_AFTERSERVICEID");
        }
        sql.SELECT("CM_SELLERID");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_USERID");
        sql.SELECT("CM_ORDERDETAILSID");
        sql.SELECT("CM_REASON");
        sql.SELECT("CM_TYPE");
        sql.SELECT("CM_STATE");
        sql.SELECT("CM_IMGPATHS");
        sql.SELECT("CM_SVID");
        sql.FROM("TB_AFTERSERVICES");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Afterservices record = (Afterservices) parameter.get("record");
        AfterservicesExample example = (AfterservicesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_AFTERSERVICES");
        
        if (record.getCmAfterserviceid() != null) {
            sql.SET("CM_AFTERSERVICEID = #{record.cmAfterserviceid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSellerid() != null) {
            sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmUserid() != null) {
            sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOrderdetailsid() != null) {
            sql.SET("CM_ORDERDETAILSID = #{record.cmOrderdetailsid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmReason() != null) {
            sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        }
        
        if (record.getCmType() != null) {
            sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        }
        
        if (record.getCmState() != null) {
            sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        }
        
        if (record.getCmImgpaths() != null) {
            sql.SET("CM_IMGPATHS = #{record.cmImgpaths,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSvid() != null) {
            sql.SET("CM_SVID = #{record.cmSvid,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_AFTERSERVICES");
        
        sql.SET("CM_AFTERSERVICEID = #{record.cmAfterserviceid,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_ORDERDETAILSID = #{record.cmOrderdetailsid,jdbcType=VARCHAR}");
        sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        sql.SET("CM_IMGPATHS = #{record.cmImgpaths,jdbcType=VARCHAR}");
        sql.SET("CM_SVID = #{record.cmSvid,jdbcType=VARCHAR}");
        
        AfterservicesExample example = (AfterservicesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AfterservicesExample example, boolean includeExamplePhrase) {
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