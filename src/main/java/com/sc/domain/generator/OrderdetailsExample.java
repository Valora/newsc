package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCM_ORDERDETAILSIDIsNull() {
            addCriterion("CM_ORDERDETAILSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDIsNotNull() {
            addCriterion("CM_ORDERDETAILSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID =", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID <>", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDGreaterThan(String value) {
            addCriterion("CM_ORDERDETAILSID >", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID >=", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDLessThan(String value) {
            addCriterion("CM_ORDERDETAILSID <", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDLessThanOrEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID <=", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDLike(String value) {
            addCriterion("CM_ORDERDETAILSID like", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotLike(String value) {
            addCriterion("CM_ORDERDETAILSID not like", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDIn(List<String> values) {
            addCriterion("CM_ORDERDETAILSID in", values, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotIn(List<String> values) {
            addCriterion("CM_ORDERDETAILSID not in", values, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDBetween(String value1, String value2) {
            addCriterion("CM_ORDERDETAILSID between", value1, value2, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotBetween(String value1, String value2) {
            addCriterion("CM_ORDERDETAILSID not between", value1, value2, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDIsNull() {
            addCriterion("CM_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDIsNotNull() {
            addCriterion("CM_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDEqualTo(String value) {
            addCriterion("CM_ORDERID =", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDNotEqualTo(String value) {
            addCriterion("CM_ORDERID <>", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDGreaterThan(String value) {
            addCriterion("CM_ORDERID >", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ORDERID >=", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDLessThan(String value) {
            addCriterion("CM_ORDERID <", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDLessThanOrEqualTo(String value) {
            addCriterion("CM_ORDERID <=", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDLike(String value) {
            addCriterion("CM_ORDERID like", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDNotLike(String value) {
            addCriterion("CM_ORDERID not like", value, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDIn(List<String> values) {
            addCriterion("CM_ORDERID in", values, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDNotIn(List<String> values) {
            addCriterion("CM_ORDERID not in", values, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDBetween(String value1, String value2) {
            addCriterion("CM_ORDERID between", value1, value2, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERIDNotBetween(String value1, String value2) {
            addCriterion("CM_ORDERID not between", value1, value2, "CM_ORDERID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIsNull() {
            addCriterion("CM_GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIsNotNull() {
            addCriterion("CM_GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDEqualTo(String value) {
            addCriterion("CM_GOODSID =", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotEqualTo(String value) {
            addCriterion("CM_GOODSID <>", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDGreaterThan(String value) {
            addCriterion("CM_GOODSID >", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID >=", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLessThan(String value) {
            addCriterion("CM_GOODSID <", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID <=", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLike(String value) {
            addCriterion("CM_GOODSID like", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotLike(String value) {
            addCriterion("CM_GOODSID not like", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIn(List<String> values) {
            addCriterion("CM_GOODSID in", values, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotIn(List<String> values) {
            addCriterion("CM_GOODSID not in", values, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDBetween(String value1, String value2) {
            addCriterion("CM_GOODSID between", value1, value2, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSID not between", value1, value2, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDIsNull() {
            addCriterion("CM_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDIsNotNull() {
            addCriterion("CM_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDEqualTo(String value) {
            addCriterion("CM_USERID =", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotEqualTo(String value) {
            addCriterion("CM_USERID <>", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDGreaterThan(String value) {
            addCriterion("CM_USERID >", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_USERID >=", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDLessThan(String value) {
            addCriterion("CM_USERID <", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDLessThanOrEqualTo(String value) {
            addCriterion("CM_USERID <=", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDLike(String value) {
            addCriterion("CM_USERID like", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotLike(String value) {
            addCriterion("CM_USERID not like", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDIn(List<String> values) {
            addCriterion("CM_USERID in", values, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotIn(List<String> values) {
            addCriterion("CM_USERID not in", values, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDBetween(String value1, String value2) {
            addCriterion("CM_USERID between", value1, value2, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotBetween(String value1, String value2) {
            addCriterion("CM_USERID not between", value1, value2, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERIsNull() {
            addCriterion("CM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERIsNotNull() {
            addCriterion("CM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBEREqualTo(Integer value) {
            addCriterion("CM_NUMBER =", value, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERNotEqualTo(Integer value) {
            addCriterion("CM_NUMBER <>", value, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERGreaterThan(Integer value) {
            addCriterion("CM_NUMBER >", value, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBER >=", value, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERLessThan(Integer value) {
            addCriterion("CM_NUMBER <", value, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERLessThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBER <=", value, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERIn(List<Integer> values) {
            addCriterion("CM_NUMBER in", values, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERNotIn(List<Integer> values) {
            addCriterion("CM_NUMBER not in", values, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBER between", value1, value2, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBER not between", value1, value2, "CM_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYIsNull() {
            addCriterion("CM_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYIsNotNull() {
            addCriterion("CM_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYEqualTo(Double value) {
            addCriterion("CM_MONEY =", value, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYNotEqualTo(Double value) {
            addCriterion("CM_MONEY <>", value, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYGreaterThan(Double value) {
            addCriterion("CM_MONEY >", value, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_MONEY >=", value, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYLessThan(Double value) {
            addCriterion("CM_MONEY <", value, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYLessThanOrEqualTo(Double value) {
            addCriterion("CM_MONEY <=", value, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYIn(List<Double> values) {
            addCriterion("CM_MONEY in", values, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYNotIn(List<Double> values) {
            addCriterion("CM_MONEY not in", values, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYBetween(Double value1, Double value2) {
            addCriterion("CM_MONEY between", value1, value2, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYNotBetween(Double value1, Double value2) {
            addCriterion("CM_MONEY not between", value1, value2, "CM_MONEY");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDIsNull() {
            addCriterion("CM_SELLERID is null");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDIsNotNull() {
            addCriterion("CM_SELLERID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDEqualTo(String value) {
            addCriterion("CM_SELLERID =", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotEqualTo(String value) {
            addCriterion("CM_SELLERID <>", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDGreaterThan(String value) {
            addCriterion("CM_SELLERID >", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SELLERID >=", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDLessThan(String value) {
            addCriterion("CM_SELLERID <", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDLessThanOrEqualTo(String value) {
            addCriterion("CM_SELLERID <=", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDLike(String value) {
            addCriterion("CM_SELLERID like", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotLike(String value) {
            addCriterion("CM_SELLERID not like", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDIn(List<String> values) {
            addCriterion("CM_SELLERID in", values, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotIn(List<String> values) {
            addCriterion("CM_SELLERID not in", values, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDBetween(String value1, String value2) {
            addCriterion("CM_SELLERID between", value1, value2, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotBetween(String value1, String value2) {
            addCriterion("CM_SELLERID not between", value1, value2, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEIsNull() {
            addCriterion("CM_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEIsNotNull() {
            addCriterion("CM_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEEqualTo(Date value) {
            addCriterion("CM_CREATETIME =", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMENotEqualTo(Date value) {
            addCriterion("CM_CREATETIME <>", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEGreaterThan(Date value) {
            addCriterion("CM_CREATETIME >", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME >=", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMELessThan(Date value) {
            addCriterion("CM_CREATETIME <", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMELessThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME <=", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEIn(List<Date> values) {
            addCriterion("CM_CREATETIME in", values, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMENotIn(List<Date> values) {
            addCriterion("CM_CREATETIME not in", values, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME between", value1, value2, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMENotBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME not between", value1, value2, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEIsNull() {
            addCriterion("CM_SERVICESTATE is null");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEIsNotNull() {
            addCriterion("CM_SERVICESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE =", value, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATENotEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE <>", value, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEGreaterThan(Integer value) {
            addCriterion("CM_SERVICESTATE >", value, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE >=", value, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATELessThan(Integer value) {
            addCriterion("CM_SERVICESTATE <", value, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATELessThanOrEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE <=", value, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEIn(List<Integer> values) {
            addCriterion("CM_SERVICESTATE in", values, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATENotIn(List<Integer> values) {
            addCriterion("CM_SERVICESTATE not in", values, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATEBetween(Integer value1, Integer value2) {
            addCriterion("CM_SERVICESTATE between", value1, value2, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SERVICESTATENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SERVICESTATE not between", value1, value2, "CM_SERVICESTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEIsNull() {
            addCriterion("CM_SELLERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEIsNotNull() {
            addCriterion("CM_SELLERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE =", value, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATENotEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE <>", value, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEGreaterThan(Integer value) {
            addCriterion("CM_SELLERSTATE >", value, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE >=", value, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATELessThan(Integer value) {
            addCriterion("CM_SELLERSTATE <", value, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATELessThanOrEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE <=", value, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEIn(List<Integer> values) {
            addCriterion("CM_SELLERSTATE in", values, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATENotIn(List<Integer> values) {
            addCriterion("CM_SELLERSTATE not in", values, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATEBetween(Integer value1, Integer value2) {
            addCriterion("CM_SELLERSTATE between", value1, value2, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERSTATENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SELLERSTATE not between", value1, value2, "CM_SELLERSTATE");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMIsNull() {
            addCriterion("CM_LOGISTICSNUM is null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMIsNotNull() {
            addCriterion("CM_LOGISTICSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM =", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM <>", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMGreaterThan(String value) {
            addCriterion("CM_LOGISTICSNUM >", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM >=", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMLessThan(String value) {
            addCriterion("CM_LOGISTICSNUM <", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMLessThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM <=", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMLike(String value) {
            addCriterion("CM_LOGISTICSNUM like", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotLike(String value) {
            addCriterion("CM_LOGISTICSNUM not like", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMIn(List<String> values) {
            addCriterion("CM_LOGISTICSNUM in", values, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotIn(List<String> values) {
            addCriterion("CM_LOGISTICSNUM not in", values, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNUM between", value1, value2, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNUM not between", value1, value2, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDIsNull() {
            addCriterion("CM_LOGISTICSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDIsNotNull() {
            addCriterion("CM_LOGISTICSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID =", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDNotEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <>", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDGreaterThan(Integer value) {
            addCriterion("CM_LOGISTICSID >", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID >=", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDLessThan(Integer value) {
            addCriterion("CM_LOGISTICSID <", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <=", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID in", values, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDNotIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID not in", values, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID between", value1, value2, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID not between", value1, value2, "CM_LOGISTICSID");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}