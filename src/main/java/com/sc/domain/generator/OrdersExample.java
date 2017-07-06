package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andCM_USESCOREIsNull() {
            addCriterion("CM_USESCORE is null");
            return (Criteria) this;
        }

        public Criteria andCM_USESCOREIsNotNull() {
            addCriterion("CM_USESCORE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_USESCOREEqualTo(Integer value) {
            addCriterion("CM_USESCORE =", value, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCORENotEqualTo(Integer value) {
            addCriterion("CM_USESCORE <>", value, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCOREGreaterThan(Integer value) {
            addCriterion("CM_USESCORE >", value, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCOREGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_USESCORE >=", value, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCORELessThan(Integer value) {
            addCriterion("CM_USESCORE <", value, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCORELessThanOrEqualTo(Integer value) {
            addCriterion("CM_USESCORE <=", value, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCOREIn(List<Integer> values) {
            addCriterion("CM_USESCORE in", values, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCORENotIn(List<Integer> values) {
            addCriterion("CM_USESCORE not in", values, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCOREBetween(Integer value1, Integer value2) {
            addCriterion("CM_USESCORE between", value1, value2, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_USESCORENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_USESCORE not between", value1, value2, "CM_USESCORE");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNIsNull() {
            addCriterion("CM_NUMBERSUN is null");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNIsNotNull() {
            addCriterion("CM_NUMBERSUN is not null");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN =", value, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNNotEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN <>", value, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNGreaterThan(Integer value) {
            addCriterion("CM_NUMBERSUN >", value, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN >=", value, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNLessThan(Integer value) {
            addCriterion("CM_NUMBERSUN <", value, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNLessThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN <=", value, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNIn(List<Integer> values) {
            addCriterion("CM_NUMBERSUN in", values, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNNotIn(List<Integer> values) {
            addCriterion("CM_NUMBERSUN not in", values, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBERSUN between", value1, value2, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_NUMBERSUNNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBERSUN not between", value1, value2, "CM_NUMBERSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNIsNull() {
            addCriterion("CM_MONEYSUN is null");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNIsNotNull() {
            addCriterion("CM_MONEYSUN is not null");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNEqualTo(Double value) {
            addCriterion("CM_MONEYSUN =", value, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNNotEqualTo(Double value) {
            addCriterion("CM_MONEYSUN <>", value, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNGreaterThan(Double value) {
            addCriterion("CM_MONEYSUN >", value, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_MONEYSUN >=", value, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNLessThan(Double value) {
            addCriterion("CM_MONEYSUN <", value, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNLessThanOrEqualTo(Double value) {
            addCriterion("CM_MONEYSUN <=", value, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNIn(List<Double> values) {
            addCriterion("CM_MONEYSUN in", values, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNNotIn(List<Double> values) {
            addCriterion("CM_MONEYSUN not in", values, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNBetween(Double value1, Double value2) {
            addCriterion("CM_MONEYSUN between", value1, value2, "CM_MONEYSUN");
            return (Criteria) this;
        }

        public Criteria andCM_MONEYSUNNotBetween(Double value1, Double value2) {
            addCriterion("CM_MONEYSUN not between", value1, value2, "CM_MONEYSUN");
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

        public Criteria andCM_STATEIsNull() {
            addCriterion("CM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCM_STATEIsNotNull() {
            addCriterion("CM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_STATEEqualTo(Integer value) {
            addCriterion("CM_STATE =", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATENotEqualTo(Integer value) {
            addCriterion("CM_STATE <>", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEGreaterThan(Integer value) {
            addCriterion("CM_STATE >", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE >=", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATELessThan(Integer value) {
            addCriterion("CM_STATE <", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATELessThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE <=", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEIn(List<Integer> values) {
            addCriterion("CM_STATE in", values, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATENotIn(List<Integer> values) {
            addCriterion("CM_STATE not in", values, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE between", value1, value2, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE not between", value1, value2, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEIsNull() {
            addCriterion("CM_USERBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEIsNotNull() {
            addCriterion("CM_USERBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEEqualTo(Double value) {
            addCriterion("CM_USERBALANCE =", value, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCENotEqualTo(Double value) {
            addCriterion("CM_USERBALANCE <>", value, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEGreaterThan(Double value) {
            addCriterion("CM_USERBALANCE >", value, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_USERBALANCE >=", value, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCELessThan(Double value) {
            addCriterion("CM_USERBALANCE <", value, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCELessThanOrEqualTo(Double value) {
            addCriterion("CM_USERBALANCE <=", value, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEIn(List<Double> values) {
            addCriterion("CM_USERBALANCE in", values, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCENotIn(List<Double> values) {
            addCriterion("CM_USERBALANCE not in", values, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCEBetween(Double value1, Double value2) {
            addCriterion("CM_USERBALANCE between", value1, value2, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_USERBALANCENotBetween(Double value1, Double value2) {
            addCriterion("CM_USERBALANCE not between", value1, value2, "CM_USERBALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEIsNull() {
            addCriterion("CM_PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEIsNotNull() {
            addCriterion("CM_PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE =", value, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPENotEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE <>", value, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEGreaterThan(Integer value) {
            addCriterion("CM_PAYTYPE >", value, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE >=", value, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPELessThan(Integer value) {
            addCriterion("CM_PAYTYPE <", value, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPELessThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE <=", value, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEIn(List<Integer> values) {
            addCriterion("CM_PAYTYPE in", values, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPENotIn(List<Integer> values) {
            addCriterion("CM_PAYTYPE not in", values, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPEBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYTYPE between", value1, value2, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYTYPENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYTYPE not between", value1, value2, "CM_PAYTYPE");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTIsNull() {
            addCriterion("CM_PAYRESULT is null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTIsNotNull() {
            addCriterion("CM_PAYRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTEqualTo(String value) {
            addCriterion("CM_PAYRESULT =", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTNotEqualTo(String value) {
            addCriterion("CM_PAYRESULT <>", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTGreaterThan(String value) {
            addCriterion("CM_PAYRESULT >", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PAYRESULT >=", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTLessThan(String value) {
            addCriterion("CM_PAYRESULT <", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTLessThanOrEqualTo(String value) {
            addCriterion("CM_PAYRESULT <=", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTLike(String value) {
            addCriterion("CM_PAYRESULT like", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTNotLike(String value) {
            addCriterion("CM_PAYRESULT not like", value, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTIn(List<String> values) {
            addCriterion("CM_PAYRESULT in", values, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTNotIn(List<String> values) {
            addCriterion("CM_PAYRESULT not in", values, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTBetween(String value1, String value2) {
            addCriterion("CM_PAYRESULT between", value1, value2, "CM_PAYRESULT");
            return (Criteria) this;
        }

        public Criteria andCM_PAYRESULTNotBetween(String value1, String value2) {
            addCriterion("CM_PAYRESULT not between", value1, value2, "CM_PAYRESULT");
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