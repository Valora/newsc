package com.sc.mapper.generator;

import com.sc.domain.generator.Sellers;
import com.sc.domain.generator.SellersExample.Criteria;
import com.sc.domain.generator.SellersExample.Criterion;
import com.sc.domain.generator.SellersExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SellersSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
    public String countByExample(SellersExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_SELLERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
    public String deleteByExample(SellersExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_SELLERS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
    public String insertSelective(Sellers record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_SELLERS");
        
        if (record.getCmSellerid() != null) {
            sql.VALUES("CM_SELLERID", "#{cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSellername() != null) {
            sql.VALUES("CM_SELLERNAME", "#{cmSellername,jdbcType=VARCHAR}");
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
        
        if (record.getCmBrandid() != null) {
            sql.VALUES("CM_BRANDID", "#{cmBrandid,jdbcType=INTEGER}");
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
        
        if (record.getCmAddress() != null) {
            sql.VALUES("CM_ADDRESS", "#{cmAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLon() != null) {
            sql.VALUES("CM_LON", "#{cmLon,jdbcType=DOUBLE}");
        }
        
        if (record.getCmLat() != null) {
            sql.VALUES("CM_LAT", "#{cmLat,jdbcType=DOUBLE}");
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
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
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
        sql.SELECT("CM_CARDFACEPATH");
        sql.SELECT("CM_CARDBACKPATH");
        sql.SELECT("CM_PERSONALPATH");
        sql.SELECT("CM_LICENSEPATH");
        sql.SELECT("CM_ADDRESS");
        sql.SELECT("CM_LON");
        sql.SELECT("CM_LAT");
        sql.SELECT("CM_CREATETIME");
        sql.SELECT("CM_ISEXAMINE");
        sql.SELECT("CM_REASON");
        sql.SELECT("CM_CARDNO");
        sql.FROM("TB_SELLERS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Sellers record = (Sellers) parameter.get("record");
        SellersExample example = (SellersExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_SELLERS");
        
        if (record.getCmSellerid() != null) {
            sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        }
        
        if (record.getCmSellername() != null) {
            sql.SET("CM_SELLERNAME = #{record.cmSellername,jdbcType=VARCHAR}");
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
        
        if (record.getCmBrandid() != null) {
            sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
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
        
        if (record.getCmAddress() != null) {
            sql.SET("CM_ADDRESS = #{record.cmAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getCmLon() != null) {
            sql.SET("CM_LON = #{record.cmLon,jdbcType=DOUBLE}");
        }
        
        if (record.getCmLat() != null) {
            sql.SET("CM_LAT = #{record.cmLat,jdbcType=DOUBLE}");
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
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_SELLERS");
        
        sql.SET("CM_SELLERID = #{record.cmSellerid,jdbcType=VARCHAR}");
        sql.SET("CM_SELLERNAME = #{record.cmSellername,jdbcType=VARCHAR}");
        sql.SET("CM_PHONE = #{record.cmPhone,jdbcType=BIGINT}");
        sql.SET("CM_ACCOUNT = #{record.cmAccount,jdbcType=VARCHAR}");
        sql.SET("CM_PASSWORD = #{record.cmPassword,jdbcType=VARCHAR}");
        sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
        sql.SET("CM_CARDFACEPATH = #{record.cmCardfacepath,jdbcType=VARCHAR}");
        sql.SET("CM_CARDBACKPATH = #{record.cmCardbackpath,jdbcType=VARCHAR}");
        sql.SET("CM_PERSONALPATH = #{record.cmPersonalpath,jdbcType=VARCHAR}");
        sql.SET("CM_LICENSEPATH = #{record.cmLicensepath,jdbcType=VARCHAR}");
        sql.SET("CM_ADDRESS = #{record.cmAddress,jdbcType=VARCHAR}");
        sql.SET("CM_LON = #{record.cmLon,jdbcType=DOUBLE}");
        sql.SET("CM_LAT = #{record.cmLat,jdbcType=DOUBLE}");
        sql.SET("CM_CREATETIME = #{record.cmCreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CM_ISEXAMINE = #{record.cmIsexamine,jdbcType=INTEGER}");
        sql.SET("CM_REASON = #{record.cmReason,jdbcType=VARCHAR}");
        sql.SET("CM_CARDNO = #{record.cmCardno,jdbcType=VARCHAR}");
        
        SellersExample example = (SellersExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_SELLERS
     *
     * @mbg.generated Tue Apr 18 16:01:00 CST 2017
     */
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