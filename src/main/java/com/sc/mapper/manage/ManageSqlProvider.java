package com.sc.mapper.manage;

import org.apache.ibatis.jdbc.SQL;

/**
 * Manage用联立sql
 * Created by valora on 2017/4/26.
 */
public class ManageSqlProvider {
    public String getSellerDetail(String sellerid) {
        SQL sql = new SQL();
        sql.SELECT("c.CM_CREATETIME,\n" +
                "  c.CM_PHONE,\n" +
                "  c.CM_NAME,\n" +
                "  c.CM_CONTACTNAME,\n" +
                "  c.CM_CONTACTPHONE,\n" +
                "  c.CM_PAX,\n" +
                "  c.CM_STOREPATH,\n" +
                "  c.CM_CARDNO,\n" +
                "  c.CM_CARDPATH,\n" +
                "  c.CM_ISEXAMINE,\n" +
                "  c.CM_LICENSEPATH,\n" +
                "  c.CM_REASON,\n" +
                "  c.CM_SELLERID,\n" +
                "  c.CM_ADDRESS,\n" +
                "  c.CM_SELLERNAME,\n" +
                "  c.CM_LAT,\n" +
                "  c.CM_LON,\n" +
                "  g.CM_BRAND");
        sql.FROM("TB_SELLERS c");
        sql.LEFT_OUTER_JOIN("TB_BRANDS g ON c.CM_BRANDID = g.CM_BRANDID");
        sql.WHERE("c.CM_SELLERID =" + sellerid);
        return sql.toString();
    }
}
