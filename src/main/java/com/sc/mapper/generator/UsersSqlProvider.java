package com.sc.mapper.generator;

import com.sc.domain.generator.Users;
import com.sc.domain.generator.UsersExample;
import com.sc.domain.generator.UsersExample.Criteria;
import com.sc.domain.generator.UsersExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class UsersSqlProvider {

    public String countByExample(UsersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_USERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UsersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_USERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Users record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_USERS");
        
        if (record.getCmUserid() != null) {
            sql.VALUES("CM_USERID", "#{cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmShopname() != null) {
            sql.VALUES("CM_SHOPNAME", "#{cmShopname,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPhone() != null) {
            sql.VALUES("CM_PHONE", "#{cmPhone,jdbcType=BIGINT}");
        }
        
        if (record.getCmAccount() != null) {
            sql.VALUES("CM_ACCOUNT", "#{cmAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPassword() != null) {
            sql.VALUES("CM_PASSWORD", "#{cmPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getCmIntegral() != null) {
            sql.VALUES("CM_INTEGRAL", "#{cmIntegral,jdbcType=INTEGER}");
        }
        
        if (record.getCmBalance() != null) {
            sql.VALUES("CM_BALANCE", "#{cmBalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCmCardpath() != null) {
            sql.VALUES("CM_CARDPATH", "#{cmCardpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmStorepath() != null) {
            sql.VALUES("CM_STOREPATH", "#{cmStorepath,jdbcType=VARCHAR}");
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
        
        if (record.getCmLevel() != null) {
            sql.VALUES("CM_LEVEL", "#{cmLevel,jdbcType=INTEGER}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.VALUES("CM_CREATETIME", "#{cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmIsexamine() != null) {
            sql.VALUES("CM_ISEXAMINE", "#{cmIsexamine,jdbcType=INTEGER}");
        }
        
        if (record.getCmReason() != null) {
            sql.VALUES("CM_REASON", "#{cmReason,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCardno() != null) {
            sql.VALUES("CM_CARDNO", "#{cmCardno,jdbcType=VARCHAR}");
        }
        
        if (record.getCmName() != null) {
            sql.VALUES("CM_NAME", "#{cmName,jdbcType=VARCHAR}");
        }
        
        if (record.getCmContactname() != null) {
            sql.VALUES("CM_CONTACTNAME", "#{cmContactname,jdbcType=VARCHAR}");
        }
        
        if (record.getCmContactphone() != null) {
            sql.VALUES("CM_CONTACTPHONE", "#{cmContactphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCmTelephone() != null) {
            sql.VALUES("CM_TELEPHONE", "#{cmTelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPax() != null) {
            sql.VALUES("CM_PAX", "#{cmPax,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsersExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_USERID");
        } else {
            sql.SELECT("CM_USERID");
        }
        sql.SELECT("CM_SHOPNAME");
        sql.SELECT("CM_PHONE");
        sql.SELECT("CM_ACCOUNT");
        sql.SELECT("CM_PASSWORD");
        sql.SELECT("CM_INTEGRAL");
        sql.SELECT("CM_BALANCE");
        sql.SELECT("CM_CARDPATH");
        sql.SELECT("CM_STOREPATH");
        sql.SELECT("CM_LICENSEPATH");
        sql.SELECT("CM_SHOPEADDRESS");
        sql.SELECT("CM_SHOPLON");
        sql.SELECT("CM_SHOPLAT");
        sql.SELECT("CM_LEVEL");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_ISEXAMINE");
        sql.SELECT("CM_REASON");
        sql.SELECT("CM_CARDNO");
        sql.SELECT("CM_NAME");
        sql.SELECT("CM_CONTACTNAME");
        sql.SELECT("CM_CONTACTPHONE");
        sql.SELECT("CM_TELEPHONE");
        sql.SELECT("CM_PAX");
        sql.FROM("TB_USERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Users record = (Users) parameter.get("record");
        UsersExample example = (UsersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_USERS");
        
        if (record.getCmUserid() != null) {
            sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmShopname() != null) {
            sql.SET("CM_SHOPNAME = #{record.cmShopname,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPhone() != null) {
            sql.SET("CM_PHONE = #{record.cmPhone,jdbcType=BIGINT}");
        }
        
        if (record.getCmAccount() != null) {
            sql.SET("CM_ACCOUNT = #{record.cmAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPassword() != null) {
            sql.SET("CM_PASSWORD = #{record.cmPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getCmIntegral() != null) {
            sql.SET("CM_INTEGRAL = #{record.cmIntegral,jdbcType=INTEGER}");
        }
        
        if (record.getCmBalance() != null) {
            sql.SET("CM_BALANCE = #{record.cmBalance,jdbcType=DOUBLE}");
        }
        
        if (record.getCmCardpath() != null) {
            sql.SET("CM_CARDPATH = #{record.cmCardpath,jdbcType=VARCHAR}");
        }
        
        if (record.getCmStorepath() != null) {
            sql.SET("CM_STOREPATH = #{record.cmStorepath,jdbcType=VARCHAR}");
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
        
        if (record.getCmLevel() != null) {
            sql.SET("CM_LEVEL = #{record.cmLevel,jdbcType=INTEGER}");
        }
        
        if (record.getCmCreatetime() != null) {
            sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCmIsexamine() != null) {
            sql.SET("CM_ISEXAMINE = #{record.cmIsexamine,jdbcType=INTEGER}");
        }
        
        if (record.getCmReason() != null) {
            sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        }
        
        if (record.getCmCardno() != null) {
            sql.SET("CM_CARDNO = #{record.cmCardno,jdbcType=VARCHAR}");
        }
        
        if (record.getCmName() != null) {
            sql.SET("CM_NAME = #{record.cmName,jdbcType=VARCHAR}");
        }
        
        if (record.getCmContactname() != null) {
            sql.SET("CM_CONTACTNAME = #{record.cmContactname,jdbcType=VARCHAR}");
        }
        
        if (record.getCmContactphone() != null) {
            sql.SET("CM_CONTACTPHONE = #{record.cmContactphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCmTelephone() != null) {
            sql.SET("CM_TELEPHONE = #{record.cmTelephone,jdbcType=VARCHAR}");
        }
        
        if (record.getCmPax() != null) {
            sql.SET("CM_PAX = #{record.cmPax,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_USERS");
        
        sql.SET("CM_USERID = #{record.cmUserid,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPNAME = #{record.cmShopname,jdbcType=VARCHAR}");
        sql.SET("CM_PHONE = #{record.cmPhone,jdbcType=BIGINT}");
        sql.SET("CM_ACCOUNT = #{record.cmAccount,jdbcType=VARCHAR}");
        sql.SET("CM_PASSWORD = #{record.cmPassword,jdbcType=VARCHAR}");
        sql.SET("CM_INTEGRAL = #{record.cmIntegral,jdbcType=INTEGER}");
        sql.SET("CM_BALANCE = #{record.cmBalance,jdbcType=DOUBLE}");
        sql.SET("CM_CARDPATH = #{record.cmCardpath,jdbcType=VARCHAR}");
        sql.SET("CM_STOREPATH = #{record.cmStorepath,jdbcType=VARCHAR}");
        sql.SET("CM_LICENSEPATH = #{record.cmLicensepath,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPEADDRESS = #{record.cmShopeaddress,jdbcType=VARCHAR}");
        sql.SET("CM_SHOPLON = #{record.cmShoplon,jdbcType=DOUBLE}");
        sql.SET("CM_SHOPLAT = #{record.cmShoplat,jdbcType=DOUBLE}");
        sql.SET("CM_LEVEL = #{record.cmLevel,jdbcType=INTEGER}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISEXAMINE = #{record.cmIsexamine,jdbcType=INTEGER}");
        sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        sql.SET("CM_CARDNO = #{record.cmCardno,jdbcType=VARCHAR}");
        sql.SET("CM_NAME = #{record.cmName,jdbcType=VARCHAR}");
        sql.SET("CM_CONTACTNAME = #{record.cmContactname,jdbcType=VARCHAR}");
        sql.SET("CM_CONTACTPHONE = #{record.cmContactphone,jdbcType=VARCHAR}");
        sql.SET("CM_TELEPHONE = #{record.cmTelephone,jdbcType=VARCHAR}");
        sql.SET("CM_PAX = #{record.cmPax,jdbcType=VARCHAR}");
        
        UsersExample example = (UsersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsersExample example, boolean includeExamplePhrase) {
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