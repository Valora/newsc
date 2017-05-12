package com.sc.mapper.generator;

import com.sc.domain.generator.Menus;
import com.sc.domain.generator.MenusExample;
import com.sc.domain.generator.MenusExample.Criteria;
import com.sc.domain.generator.MenusExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class MenusSqlProvider {

    public String countByExample(MenusExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("TB_MENUS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MenusExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("TB_MENUS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Menus record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_MENUS");
        
        if (record.getCmMenuid() != null) {
            sql.VALUES("CM_MENUID", "#{cmMenuid,jdbcType=INTEGER}");
        }
        
        if (record.getCmMenuname() != null) {
            sql.VALUES("CM_MENUNAME", "#{cmMenuname,jdbcType=VARCHAR}");
        }
        
        if (record.getCmMenuurl() != null) {
            sql.VALUES("CM_MENUURL", "#{cmMenuurl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MenusExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CM_MENUID");
        } else {
            sql.SELECT("CM_MENUID");
        }
        sql.SELECT("CM_MENUNAME");
        sql.SELECT("CM_MENUURL");
        sql.FROM("TB_MENUS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Menus record = (Menus) parameter.get("record");
        MenusExample example = (MenusExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("TB_MENUS");
        
        if (record.getCmMenuid() != null) {
            sql.SET("CM_MENUID = #{record.cmMenuid,jdbcType=INTEGER}");
        }
        
        if (record.getCmMenuname() != null) {
            sql.SET("CM_MENUNAME = #{record.cmMenuname,jdbcType=VARCHAR}");
        }
        
        if (record.getCmMenuurl() != null) {
            sql.SET("CM_MENUURL = #{record.cmMenuurl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("TB_MENUS");
        
        sql.SET("CM_MENUID = #{record.cmMenuid,jdbcType=INTEGER}");
        sql.SET("CM_MENUNAME = #{record.cmMenuname,jdbcType=VARCHAR}");
        sql.SET("CM_MENUURL = #{record.cmMenuurl,jdbcType=VARCHAR}");
        
        MenusExample example = (MenusExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MenusExample example, boolean includeExamplePhrase) {
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