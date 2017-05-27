package com.sc.mapper.seller;


import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2017/5/22.
 */
public class QueryCustomerServiceSqlProvider {
    public String queryCustomerServiceMi(String sellerId, Integer serverstate, String starttime, String endtime) {
        SQL sql = new SQL();
        sql.SELECT("c.CM_ORDERDETAILSID,\n" +
                "  c.CM_AFTERSERVICEID,\n" +
                "  c.CM_STATE,\n" +
                "  c.CM_TYPE,\n" +
                "  c.CM_CREATETIME,\n" +


                "  q.CM_GOODSID,\n" +
                "  q.CM_NUMBER,\n" +
                "  q.CM_MONEY,\n" +
                "  q.CM_SELLERSTATE,\n" +
                "  q.CM_SERVICESTATE,\n" +
                "  q.CM_SPECNUMDETAILS,\n" +
                "  q.CM_SPECNUMDETAILS AS CM_TITLE,\n" +

                "  g.CM_MAINFIGUREPATH,\n" +

                "  m.CM_NAME,\n" +
                "  m.CM_SHOPEADDRESS,\n" +
                "  m.CM_PHONE\n"
        );
        sql.FROM("TB_AFTERSERVICES c");
        sql.LEFT_OUTER_JOIN("TB_ORDERDETAILS q  on c.CM_ORDERDETAILSID=q.CM_ORDERDETAILSID");
        sql.LEFT_OUTER_JOIN("TB_GOODS g  on q.CM_GOODSID=g.CM_GOODSID");
        sql.LEFT_OUTER_JOIN("TB_USERS m  on c.CM_USERID=m.CM_USERID");
        sql.WHERE("c.CM_USERID=" + sellerId);
        sql.AND();
        sql.WHERE("DATE_FORMAT(c.CM_CREATETIME, '%Y-%m-%d %H:%i:%S')>'" + starttime + "'");
        sql.AND();
        sql.WHERE(" DATE_FORMAT(c.CM_CREATETIME, '%Y-%m-%d %H:%i:%S')<'" + endtime + "'");
        if (1 <= serverstate && serverstate <= 4) {
            sql.AND();
            sql.WHERE("CM_STATE=" + serverstate);
        } else if (serverstate > 4) {
            sql.AND();
            sql.WHERE("CM_STATE=5||CM_STATE=6");
        }
        sql.ORDER_BY("CM_CREATETIME desc");
        System.out.println(sql.toString());
        return sql.toString();
    }
}
