package com.sc.mapper.generator;

import com.sc.domain.generator.Userapplications;
import com.sc.domain.generator.UserapplicationsExample.Criteria;
import com.sc.domain.generator.UserapplicationsExample.Criterion;
import com.sc.domain.generator.UserapplicationsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserapplicationsSqlProvider {

    public String countByExample(UserapplicationsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_USERAPPLICATIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserapplicationsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_USERAPPLICATIONS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Userapplications record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_USERAPPLICATIONS");
        
        if (record.getCM_ID() != null) {
            sql.VALUES("CM_ID", "#{CM_ID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_NAME() != null) {
            sql.VALUES("CM_NAME", "#{CM_NAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PHONE() != null) {
            sql.VALUES("CM_PHONE", "#{CM_PHONE,jdbcType=BIGINT}");
        }
        
        if (record.getCM_CARDFACEPATH() != null) {
            sql.VALUES("CM_CARDFACEPATH", "#{CM_CARDFACEPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CARDBACKPATH() != null) {
            sql.VALUES("CM_CARDBACKPATH", "#{CM_CARDBACKPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PERSONALPATH() != null) {
            sql.VALUES("CM_PERSONALPATH", "#{CM_PERSONALPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LICENSEPATH() != null) {
            sql.VALUES("CM_LICENSEPATH", "#{CM_LICENSEPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SHOPEADDRESS() != null) {
            sql.VALUES("CM_SHOPEADDRESS", "#{CM_SHOPEADDRESS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SHOPLON() != null) {
            sql.VALUES("CM_SHOPLON", "#{CM_SHOPLON,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_SHOPLAT() != null) {
            sql.VALUES("CM_SHOPLAT", "#{CM_SHOPLAT,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_STATE() != null) {
            sql.VALUES("CM_STATE", "#{CM_STATE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_REASON() != null) {
            sql.VALUES("CM_REASON", "#{CM_REASON,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_TYPE() != null) {
            sql.VALUES("CM_TYPE", "#{CM_TYPE,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserapplicationsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_ID");
        } else {
            sql.SELECT("CM_ID");
        }
        sql.SELECT("CM_NAME");
        sql.SELECT("CM_PHONE");
        sql.SELECT("CM_CARDFACEPATH");
        sql.SELECT("CM_CARDBACKPATH");
        sql.SELECT("CM_PERSONALPATH");
        sql.SELECT("CM_LICENSEPATH");
        sql.SELECT("CM_SHOPEADDRESS");
        sql.SELECT("CM_SHOPLON");
        sql.SELECT("CM_SHOPLAT");
        sql.SELECT("CM_STATE");
        sql.SELECT("CM_REASON");
        sql.SELECT("CM_TYPE");
        sql.FROM("TB_USERAPPLICATIONS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Userapplications record = (Userapplications) parameter.get("record");
        UserapplicationsExample example = (UserapplicationsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_USERAPPLICATIONS");
        
        if (record.getCM_ID() != null) {
            sql.SET("CM_ID = #{record.CM_ID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_NAME() != null) {
            sql.SET("CM_NAME = #{record.CM_NAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PHONE() != null) {
            sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        }
        
        if (record.getCM_CARDFACEPATH() != null) {
            sql.SET("CM_CARDFACEPATH = #{record.CM_CARDFACEPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CARDBACKPATH() != null) {
            sql.SET("CM_CARDBACKPATH = #{record.CM_CARDBACKPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PERSONALPATH() != null) {
            sql.SET("CM_PERSONALPATH = #{record.CM_PERSONALPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LICENSEPATH() != null) {
            sql.SET("CM_LICENSEPATH = #{record.CM_LICENSEPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SHOPEADDRESS() != null) {
            sql.SET("CM_SHOPEADDRESS = #{record.CM_SHOPEADDRESS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SHOPLON() != null) {
            sql.SET("CM_SHOPLON = #{record.CM_SHOPLON,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_SHOPLAT() != null) {
            sql.SET("CM_SHOPLAT = #{record.CM_SHOPLAT,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_STATE() != null) {
            sql.SET("CM_STATE = #{record.CM_STATE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_REASON() != null) {
            sql.SET("CM_REASON = #{record.CM_REASON,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_TYPE() != null) {
            sql.SET("CM_TYPE = #{record.CM_TYPE,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_USERAPPLICATIONS");
        
        sql.SET("CM_ID = #{record.CM_ID,jdbcType=INTEGER}");
        sql.SET("CM_NAME = #{record.CM_NAME,jdbcType=VARCHAR}");
        sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        sql.SET("CM_CARDFACEPATH = #{record.CM_CARDFACEPATH,jdbcType=VARCHAR}");
        sql.SET("CM_CARDBACKPATH = #{record.CM_CARDBACKPATH,jdbcType=VARCHAR}");
        sql.SET("CM_PERSONALPATH = #{record.CM_PERSONALPATH,jdbcType=VARCHAR}");
        sql.SET("CM_LICENSEPATH = #{record.CM_LICENSEPATH,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPEADDRESS = #{record.CM_SHOPEADDRESS,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPLON = #{record.CM_SHOPLON,jdbcType=DOUBLE}");
        sql.SET("CM_SHOPLAT = #{record.CM_SHOPLAT,jdbcType=DOUBLE}");
        sql.SET("CM_STATE = #{record.CM_STATE,jdbcType=INTEGER}");
        sql.SET("CM_REASON = #{record.CM_REASON,jdbcType=VARCHAR}");
        sql.SET("CM_TYPE = #{record.CM_TYPE,jdbcType=INTEGER}");
        
        UserapplicationsExample example = (UserapplicationsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserapplicationsExample example, boolean includeExamplePhrase) {
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