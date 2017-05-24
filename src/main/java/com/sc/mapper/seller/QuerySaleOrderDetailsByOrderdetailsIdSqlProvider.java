package com.sc.mapper.seller;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Administrator on 2017/5/19.
 */
public class QuerySaleOrderDetailsByOrderdetailsIdSqlProvider {
    public String QuerySaleOrderDetailMi(String orderdetailsid) {
        SQL sql = new SQL();
        sql.SELECT("c.CM_CREATETIME,\n" +
                "  c.CM_SPECNUMDETAILS,\n" +
                "  c.CM_MONEY,\n" +
                "  c.CM_NUMBER,\n" +
                "  c.CM_SELLERSTATE,\n" +
                "  c.CM_SERVICESTATE,\n" +
                "  c.CM_LOGISTICSNUM,\n" +
                "  c.CM_LOGISTICSID,\n" +
                "  c.CM_LOGISTICSINFO,\n" +
                "  q.CM_LOGISTICSNAME,\n" +
                "  d.CM_PHONE,\n" +
                "  d.CM_SHOPEADDRESS,\n" +
                "  d.CM_SHOPNAME"
        );
        sql.FROM("TB_ORDERDETAILS  c");
        sql.LEFT_OUTER_JOIN("TB_USERS d on c.CM_USERID = d.CM_USERID");
        sql.LEFT_OUTER_JOIN("TB_LOGISTICSS q on c.CM_LOGISTICSID = q.CM_LOGISTICSID");
        sql.WHERE("c.CM_ORDERDETAILSID=" + orderdetailsid);
        return sql.toString();
    }
}
