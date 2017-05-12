package com.sc.mapper.generator;

import com.sc.domain.generator.Brands;
import com.sc.domain.generator.BrandsExample;
import com.sc.domain.generator.BrandsExample.Criteria;
import com.sc.domain.generator.BrandsExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class BrandsSqlProvider {

    public String countByExample(BrandsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_BRANDS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(BrandsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_BRANDS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Brands record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_BRANDS");
        
        if (record.getCmBrandid() != null) {
            sql.VALUES("CM_BRANDID", "#{cmBrandid,jdbcType=INTEGER}");
        }
        
        if (record.getCmBrand() != null) {
            sql.VALUES("CM_BRAND", "#{cmBrand,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOther() != null) {
            sql.VALUES("CM_OTHER", "#{cmOther,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(BrandsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_BRANDID");
        } else {
            sql.SELECT("CM_BRANDID");
        }
        sql.SELECT("CM_BRAND");
        sql.SELECT("CM_OTHER");
        sql.FROM("TB_BRANDS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Brands record = (Brands) parameter.get("record");
        BrandsExample example = (BrandsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_BRANDS");
        
        if (record.getCmBrandid() != null) {
            sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
        }
        
        if (record.getCmBrand() != null) {
            sql.SET("CM_BRAND = #{record.cmBrand,jdbcType=VARCHAR}");
        }
        
        if (record.getCmOther() != null) {
            sql.SET("CM_OTHER = #{record.cmOther,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_BRANDS");
        
        sql.SET("CM_BRANDID = #{record.cmBrandid,jdbcType=INTEGER}");
        sql.SET("CM_BRAND = #{record.cmBrand,jdbcType=VARCHAR}");
        sql.SET("CM_OTHER = #{record.cmOther,jdbcType=VARCHAR}");
        
        BrandsExample example = (BrandsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, BrandsExample example, boolean includeExamplePhrase) {
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