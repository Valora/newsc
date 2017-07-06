package com.sc.mapper.generator;

import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample.Criteria;
import com.sc.domain.generator.SellersExample.Criterion;
import com.sc.domain.generator.SellersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SellersSqlProvider {

    public String countByExample(SellersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_SELLERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SellersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_SELLERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Sellers record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_SELLERS");
        
        if (record.getCM_SELLERID() != null) {
            sql.VALUES("CM_SELLERID", "#{CM_SELLERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SELLERNAME() != null) {
            sql.VALUES("CM_SELLERNAME", "#{CM_SELLERNAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PHONE() != null) {
            sql.VALUES("CM_PHONE", "#{CM_PHONE,jdbcType=BIGINT}");
        }
        
        if (record.getCM_ACCOUNT() != null) {
            sql.VALUES("CM_ACCOUNT", "#{CM_ACCOUNT,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PASSWORD() != null) {
            sql.VALUES("CM_PASSWORD", "#{CM_PASSWORD,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_BRANDID() != null) {
            sql.VALUES("CM_BRANDID", "#{CM_BRANDID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_CARDPATH() != null) {
            sql.VALUES("CM_CARDPATH", "#{CM_CARDPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_STOREPATH() != null) {
            sql.VALUES("CM_STOREPATH", "#{CM_STOREPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LICENSEPATH() != null) {
            sql.VALUES("CM_LICENSEPATH", "#{CM_LICENSEPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_ADDRESS() != null) {
            sql.VALUES("CM_ADDRESS", "#{CM_ADDRESS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LON() != null) {
            sql.VALUES("CM_LON", "#{CM_LON,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_LAT() != null) {
            sql.VALUES("CM_LAT", "#{CM_LAT,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.VALUES("CM_CREATETIME", "#{CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_ISEXAMINE() != null) {
            sql.VALUES("CM_ISEXAMINE", "#{CM_ISEXAMINE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_REASON() != null) {
            sql.VALUES("CM_REASON", "#{CM_REASON,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CARDNO() != null) {
            sql.VALUES("CM_CARDNO", "#{CM_CARDNO,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_NAME() != null) {
            sql.VALUES("CM_NAME", "#{CM_NAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CONTACTNAME() != null) {
            sql.VALUES("CM_CONTACTNAME", "#{CM_CONTACTNAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CONTACTPHONE() != null) {
            sql.VALUES("CM_CONTACTPHONE", "#{CM_CONTACTPHONE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_TELEPHONE() != null) {
            sql.VALUES("CM_TELEPHONE", "#{CM_TELEPHONE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PAX() != null) {
            sql.VALUES("CM_PAX", "#{CM_PAX,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SellersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_SELLERID");
        } else {
            sql.SELECT("CM_SELLERID");
        }
        sql.SELECT("CM_SELLERNAME");
        sql.SELECT("CM_PHONE");
        sql.SELECT("CM_ACCOUNT");
        sql.SELECT("CM_PASSWORD");
        sql.SELECT("CM_BRANDID");
        sql.SELECT("CM_CARDPATH");
        sql.SELECT("CM_STOREPATH");
        sql.SELECT("CM_LICENSEPATH");
        sql.SELECT("CM_ADDRESS");
        sql.SELECT("CM_LON");
        sql.SELECT("CM_LAT");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_ISEXAMINE");
        sql.SELECT("CM_REASON");
        sql.SELECT("CM_CARDNO");
        sql.SELECT("CM_NAME");
        sql.SELECT("CM_CONTACTNAME");
        sql.SELECT("CM_CONTACTPHONE");
        sql.SELECT("CM_TELEPHONE");
        sql.SELECT("CM_PAX");
        sql.FROM("TB_SELLERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Sellers record = (Sellers) parameter.get("record");
        SellersExample example = (SellersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_SELLERS");
        
        if (record.getCM_SELLERID() != null) {
            sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_SELLERNAME() != null) {
            sql.SET("CM_SELLERNAME = #{record.CM_SELLERNAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PHONE() != null) {
            sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        }
        
        if (record.getCM_ACCOUNT() != null) {
            sql.SET("CM_ACCOUNT = #{record.CM_ACCOUNT,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PASSWORD() != null) {
            sql.SET("CM_PASSWORD = #{record.CM_PASSWORD,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_BRANDID() != null) {
            sql.SET("CM_BRANDID = #{record.CM_BRANDID,jdbcType=INTEGER}");
        }
        
        if (record.getCM_CARDPATH() != null) {
            sql.SET("CM_CARDPATH = #{record.CM_CARDPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_STOREPATH() != null) {
            sql.SET("CM_STOREPATH = #{record.CM_STOREPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LICENSEPATH() != null) {
            sql.SET("CM_LICENSEPATH = #{record.CM_LICENSEPATH,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_ADDRESS() != null) {
            sql.SET("CM_ADDRESS = #{record.CM_ADDRESS,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_LON() != null) {
            sql.SET("CM_LON = #{record.CM_LON,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_LAT() != null) {
            sql.SET("CM_LAT = #{record.CM_LAT,jdbcType=DOUBLE}");
        }
        
        if (record.getCM_CREATETIME() != null) {
            sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCM_ISEXAMINE() != null) {
            sql.SET("CM_ISEXAMINE = #{record.CM_ISEXAMINE,jdbcType=INTEGER}");
        }
        
        if (record.getCM_REASON() != null) {
            sql.SET("CM_REASON = #{record.CM_REASON,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CARDNO() != null) {
            sql.SET("CM_CARDNO = #{record.CM_CARDNO,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_NAME() != null) {
            sql.SET("CM_NAME = #{record.CM_NAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CONTACTNAME() != null) {
            sql.SET("CM_CONTACTNAME = #{record.CM_CONTACTNAME,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_CONTACTPHONE() != null) {
            sql.SET("CM_CONTACTPHONE = #{record.CM_CONTACTPHONE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_TELEPHONE() != null) {
            sql.SET("CM_TELEPHONE = #{record.CM_TELEPHONE,jdbcType=VARCHAR}");
        }
        
        if (record.getCM_PAX() != null) {
            sql.SET("CM_PAX = #{record.CM_PAX,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_SELLERS");
        
        sql.SET("CM_SELLERID = #{record.CM_SELLERID,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERNAME = #{record.CM_SELLERNAME,jdbcType=VARCHAR}");
        sql.SET("CM_PHONE = #{record.CM_PHONE,jdbcType=BIGINT}");
        sql.SET("CM_ACCOUNT = #{record.CM_ACCOUNT,jdbcType=VARCHAR}");
        sql.SET("CM_PASSWORD = #{record.CM_PASSWORD,jdbcType=VARCHAR}");
        sql.SET("CM_BRANDID = #{record.CM_BRANDID,jdbcType=INTEGER}");
        sql.SET("CM_CARDPATH = #{record.CM_CARDPATH,jdbcType=VARCHAR}");
        sql.SET("CM_STOREPATH = #{record.CM_STOREPATH,jdbcType=VARCHAR}");
        sql.SET("CM_LICENSEPATH = #{record.CM_LICENSEPATH,jdbcType=VARCHAR}");
        sql.SET("CM_ADDRESS = #{record.CM_ADDRESS,jdbcType=VARCHAR}");
        sql.SET("CM_LON = #{record.CM_LON,jdbcType=DOUBLE}");
        sql.SET("CM_LAT = #{record.CM_LAT,jdbcType=DOUBLE}");
        sql.SET("CM_CREATETIME = #{record.CM_CREATETIME,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISEXAMINE = #{record.CM_ISEXAMINE,jdbcType=INTEGER}");
        sql.SET("CM_REASON = #{record.CM_REASON,jdbcType=VARCHAR}");
        sql.SET("CM_CARDNO = #{record.CM_CARDNO,jdbcType=VARCHAR}");
        sql.SET("CM_NAME = #{record.CM_NAME,jdbcType=VARCHAR}");
        sql.SET("CM_CONTACTNAME = #{record.CM_CONTACTNAME,jdbcType=VARCHAR}");
        sql.SET("CM_CONTACTPHONE = #{record.CM_CONTACTPHONE,jdbcType=VARCHAR}");
        sql.SET("CM_TELEPHONE = #{record.CM_TELEPHONE,jdbcType=VARCHAR}");
        sql.SET("CM_PAX = #{record.CM_PAX,jdbcType=VARCHAR}");
        
        SellersExample example = (SellersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SellersExample example, boolean includeExamplePhrase) {
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