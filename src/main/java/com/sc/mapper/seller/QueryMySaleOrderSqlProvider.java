package com.sc.mapper.seller;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2017/5/18.
 */
public class QueryMySaleOrderSqlProvider {
    public String QueryMySaleOrderMi(String sellerid, String starttime, String endtime, Integer orderState) {
        SQL sql = new SQL();
        sql.SELECT("c.CM_GOODSID,\n" +
                "  c.CM_ORDERDETAILSID,\n" +
                "  q.CM_MAINFIGUREPATH,\n" +
                "  q.CM_TITLE,\n" +
                "  c.CM_CREATETIME as CM_ORDERCREATETIME,\n" +
                "  q.CM_PRESENTPRICE,\n" +
                "  q.CM_ORIGINALPRICE,\n" +
                "  c.CM_NUMBER,\n" +
                "  c.CM_MONEY,\n" +
                "  c.CM_SPECNUMDETAILS,\n" +
                "  c.CM_SELLERSTATE");
        sql.FROM("TB_ORDERDETAILS c");
        sql.LEFT_OUTER_JOIN("TB_GOODS q ON c.CM_GOODSID = q.CM_GOODSID");
        sql.WHERE("c.CM_SELLERID =" + sellerid);
        sql.AND();
        sql.WHERE("DATE_FORMAT(c.CM_CREATETIME, '%Y-%m-%d %H:%i:%S')>'" + starttime + "'");
        sql.AND();
        sql.WHERE(" DATE_FORMAT(c.CM_CREATETIME, '%Y-%m-%d %H:%i:%S')<'" + endtime + "'");
        sql.AND();
        if (orderState == 1) {
            sql.WHERE("c.CM_SELLERSTATE<>" + 0);
            sql.AND();
            sql.WHERE("c.CM_SELLERSTATE<>" + 1);
        } else {
            sql.WHERE("c.CM_SELLERSTATE=" + orderState);
        }
        sql.ORDER_BY("c.CM_CREATETIME desc");
        return sql.toString();
    }
}
