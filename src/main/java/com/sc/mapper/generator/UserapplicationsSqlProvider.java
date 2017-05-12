package com.sc.mapper.generator;

import com.sc.domain.generator.Userapplications;
import com.sc.domain.generator.UserapplicationsExample;
import com.sc.domain.generator.UserapplicationsExample.Criteria;
import com.sc.domain.generator.UserapplicationsExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

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
        
        if (record.getCmId() != null) {
            sql.VALUES("CM_ID", "#{cmId,jdbcType=INTEGER}");
        }
        
        if (record.getCmName() != null) {
            sql.VALUES("CM_NAME", "#{cmName,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPhone() != null) {
            sql.VALUES("CM_PHONE", "#{cmPhone,jdbcType=BIGINT}");
        }
        
        if (record.getCmCardfacepath() != null) {
            sql.VALUES("CM_CARDFACEPATH", "#{cmCardfacepath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCardbackpath() != null) {
            sql.VALUES("CM_CARDBACKPATH", "#{cmCardbackpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPersonalpath() != null) {
            sql.VALUES("CM_PERSONALPATH", "#{cmPersonalpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLicensepath() != null) {
            sql.VALUES("CM_LICENSEPATH", "#{cmLicensepath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmShopeaddress() != null) {
            sql.VALUES("CM_SHOPEADDRESS", "#{cmShopeaddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCmShoplon() != null) {
            sql.VALUES("CM_SHOPLON", "#{cmShoplon,jdbcType=DOUBLE}");
        }
        
        if (record.getCmShoplat() != null) {
            sql.VALUES("CM_SHOPLAT", "#{cmShoplat,jdbcType=DOUBLE}");
        }
        
        if (record.getCmState() != null) {
            sql.VALUES("CM_STATE", "#{cmState,jdbcType=INTEGER}");
        }
        
        if (record.getCmReason() != null) {
            sql.VALUES("CM_REASON", "#{cmReason,jdbcType=VARCHAR}");
        }
        
        if (record.getCmType() != null) {
            sql.VALUES("CM_TYPE", "#{cmType,jdbcType=INTEGER}");
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
        
        if (record.getCmId() != null) {
            sql.SET("CM_ID = #{record.cmId,jdbcType=INTEGER}");
        }
        
        if (record.getCmName() != null) {
            sql.SET("CM_NAME = #{record.cmName,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPhone() != null) {
            sql.SET("CM_PHONE = #{record.cmPhone,jdbcType=BIGINT}");
        }
        
        if (record.getCmCardfacepath() != null) {
            sql.SET("CM_CARDFACEPATH = #{record.cmCardfacepath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCardbackpath() != null) {
            sql.SET("CM_CARDBACKPATH = #{record.cmCardbackpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPersonalpath() != null) {
            sql.SET("CM_PERSONALPATH = #{record.cmPersonalpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLicensepath() != null) {
            sql.SET("CM_LICENSEPATH = #{record.cmLicensepath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmShopeaddress() != null) {
            sql.SET("CM_SHOPEADDRESS = #{record.cmShopeaddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCmShoplon() != null) {
            sql.SET("CM_SHOPLON = #{record.cmShoplon,jdbcType=DOUBLE}");
        }
        
        if (record.getCmShoplat() != null) {
            sql.SET("CM_SHOPLAT = #{record.cmShoplat,jdbcType=DOUBLE}");
        }
        
        if (record.getCmState() != null) {
            sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        }
        
        if (record.getCmReason() != null) {
            sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        }
        
        if (record.getCmType() != null) {
            sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_USERAPPLICATIONS");
        
        sql.SET("CM_ID = #{record.cmId,jdbcType=INTEGER}");
        sql.SET("CM_NAME = #{record.cmName,jdbcType=VARCHAR}");
        sql.SET("CM_PHONE = #{record.cmPhone,jdbcType=BIGINT}");
        sql.SET("CM_CARDFACEPATH = #{record.cmCardfacepath,jdbcType=VARCHAR}");
        sql.SET("CM_CARDBACKPATH = #{record.cmCardbackpath,jdbcType=VARCHAR}");
        sql.SET("CM_PERSONALPATH = #{record.cmPersonalpath,jdbcType=VARCHAR}");
        sql.SET("CM_LICENSEPATH = #{record.cmLicensepath,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPEADDRESS = #{record.cmShopeaddress,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPLON = #{record.cmShoplon,jdbcType=DOUBLE}");
        sql.SET("CM_SHOPLAT = #{record.cmShoplat,jdbcType=DOUBLE}");
        sql.SET("CM_STATE = #{record.cmState,jdbcType=INTEGER}");
        sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        sql.SET("CM_TYPE = #{record.cmType,jdbcType=INTEGER}");
        
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