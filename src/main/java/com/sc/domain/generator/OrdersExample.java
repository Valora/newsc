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

        public Criteria andCmOrderidIsNull() {
            addCriterion("CM_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andCmOrderidIsNotNull() {
            addCriterion("CM_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andCmOrderidEqualTo(String value) {
            addCriterion("CM_ORDERID =", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotEqualTo(String value) {
            addCriterion("CM_ORDERID <>", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidGreaterThan(String value) {
            addCriterion("CM_ORDERID >", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ORDERID >=", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidLessThan(String value) {
            addCriterion("CM_ORDERID <", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidLessThanOrEqualTo(String value) {
            addCriterion("CM_ORDERID <=", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidLike(String value) {
            addCriterion("CM_ORDERID like", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotLike(String value) {
            addCriterion("CM_ORDERID not like", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidIn(List<String> values) {
            addCriterion("CM_ORDERID in", values, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotIn(List<String> values) {
            addCriterion("CM_ORDERID not in", values, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidBetween(String value1, String value2) {
            addCriterion("CM_ORDERID between", value1, value2, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotBetween(String value1, String value2) {
            addCriterion("CM_ORDERID not between", value1, value2, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmUseridIsNull() {
            addCriterion("CM_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCmUseridIsNotNull() {
            addCriterion("CM_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCmUseridEqualTo(String value) {
            addCriterion("CM_USERID =", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotEqualTo(String value) {
            addCriterion("CM_USERID <>", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridGreaterThan(String value) {
            addCriterion("CM_USERID >", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CM_USERID >=", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridLessThan(String value) {
            addCriterion("CM_USERID <", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridLessThanOrEqualTo(String value) {
            addCriterion("CM_USERID <=", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridLike(String value) {
            addCriterion("CM_USERID like", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotLike(String value) {
            addCriterion("CM_USERID not like", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridIn(List<String> values) {
            addCriterion("CM_USERID in", values, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotIn(List<String> values) {
            addCriterion("CM_USERID not in", values, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridBetween(String value1, String value2) {
            addCriterion("CM_USERID between", value1, value2, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotBetween(String value1, String value2) {
            addCriterion("CM_USERID not between", value1, value2, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreIsNull() {
            addCriterion("CM_USESCORE is null");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreIsNotNull() {
            addCriterion("CM_USESCORE is not null");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreEqualTo(Integer value) {
            addCriterion("CM_USESCORE =", value, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreNotEqualTo(Integer value) {
            addCriterion("CM_USESCORE <>", value, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreGreaterThan(Integer value) {
            addCriterion("CM_USESCORE >", value, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_USESCORE >=", value, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreLessThan(Integer value) {
            addCriterion("CM_USESCORE <", value, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreLessThanOrEqualTo(Integer value) {
            addCriterion("CM_USESCORE <=", value, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreIn(List<Integer> values) {
            addCriterion("CM_USESCORE in", values, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreNotIn(List<Integer> values) {
            addCriterion("CM_USESCORE not in", values, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreBetween(Integer value1, Integer value2) {
            addCriterion("CM_USESCORE between", value1, value2, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmUsescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_USESCORE not between", value1, value2, "cmUsescore");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunIsNull() {
            addCriterion("CM_NUMBERSUN is null");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunIsNotNull() {
            addCriterion("CM_NUMBERSUN is not null");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN =", value, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunNotEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN <>", value, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunGreaterThan(Integer value) {
            addCriterion("CM_NUMBERSUN >", value, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN >=", value, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunLessThan(Integer value) {
            addCriterion("CM_NUMBERSUN <", value, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunLessThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBERSUN <=", value, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunIn(List<Integer> values) {
            addCriterion("CM_NUMBERSUN in", values, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunNotIn(List<Integer> values) {
            addCriterion("CM_NUMBERSUN not in", values, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBERSUN between", value1, value2, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmNumbersunNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBERSUN not between", value1, value2, "cmNumbersun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunIsNull() {
            addCriterion("CM_MONEYSUN is null");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunIsNotNull() {
            addCriterion("CM_MONEYSUN is not null");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunEqualTo(Double value) {
            addCriterion("CM_MONEYSUN =", value, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunNotEqualTo(Double value) {
            addCriterion("CM_MONEYSUN <>", value, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunGreaterThan(Double value) {
            addCriterion("CM_MONEYSUN >", value, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_MONEYSUN >=", value, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunLessThan(Double value) {
            addCriterion("CM_MONEYSUN <", value, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunLessThanOrEqualTo(Double value) {
            addCriterion("CM_MONEYSUN <=", value, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunIn(List<Double> values) {
            addCriterion("CM_MONEYSUN in", values, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunNotIn(List<Double> values) {
            addCriterion("CM_MONEYSUN not in", values, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunBetween(Double value1, Double value2) {
            addCriterion("CM_MONEYSUN between", value1, value2, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmMoneysunNotBetween(Double value1, Double value2) {
            addCriterion("CM_MONEYSUN not between", value1, value2, "cmMoneysun");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeIsNull() {
            addCriterion("CM_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeIsNotNull() {
            addCriterion("CM_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeEqualTo(Date value) {
            addCriterion("CM_CREATETIME =", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeNotEqualTo(Date value) {
            addCriterion("CM_CREATETIME <>", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeGreaterThan(Date value) {
            addCriterion("CM_CREATETIME >", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME >=", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeLessThan(Date value) {
            addCriterion("CM_CREATETIME <", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME <=", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeIn(List<Date> values) {
            addCriterion("CM_CREATETIME in", values, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeNotIn(List<Date> values) {
            addCriterion("CM_CREATETIME not in", values, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME between", value1, value2, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME not between", value1, value2, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmStateIsNull() {
            addCriterion("CM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCmStateIsNotNull() {
            addCriterion("CM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmStateEqualTo(Integer value) {
            addCriterion("CM_STATE =", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotEqualTo(Integer value) {
            addCriterion("CM_STATE <>", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateGreaterThan(Integer value) {
            addCriterion("CM_STATE >", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE >=", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateLessThan(Integer value) {
            addCriterion("CM_STATE <", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateLessThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE <=", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateIn(List<Integer> values) {
            addCriterion("CM_STATE in", values, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotIn(List<Integer> values) {
            addCriterion("CM_STATE not in", values, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE between", value1, value2, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE not between", value1, value2, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceIsNull() {
            addCriterion("CM_USERBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceIsNotNull() {
            addCriterion("CM_USERBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceEqualTo(Double value) {
            addCriterion("CM_USERBALANCE =", value, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceNotEqualTo(Double value) {
            addCriterion("CM_USERBALANCE <>", value, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceGreaterThan(Double value) {
            addCriterion("CM_USERBALANCE >", value, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_USERBALANCE >=", value, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceLessThan(Double value) {
            addCriterion("CM_USERBALANCE <", value, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceLessThanOrEqualTo(Double value) {
            addCriterion("CM_USERBALANCE <=", value, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceIn(List<Double> values) {
            addCriterion("CM_USERBALANCE in", values, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceNotIn(List<Double> values) {
            addCriterion("CM_USERBALANCE not in", values, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceBetween(Double value1, Double value2) {
            addCriterion("CM_USERBALANCE between", value1, value2, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmUserbalanceNotBetween(Double value1, Double value2) {
            addCriterion("CM_USERBALANCE not between", value1, value2, "cmUserbalance");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeIsNull() {
            addCriterion("CM_PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeIsNotNull() {
            addCriterion("CM_PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE =", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeNotEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE <>", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeGreaterThan(Integer value) {
            addCriterion("CM_PAYTYPE >", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE >=", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeLessThan(Integer value) {
            addCriterion("CM_PAYTYPE <", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE <=", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeIn(List<Integer> values) {
            addCriterion("CM_PAYTYPE in", values, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeNotIn(List<Integer> values) {
            addCriterion("CM_PAYTYPE not in", values, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYTYPE between", value1, value2, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYTYPE not between", value1, value2, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPayresultIsNull() {
            addCriterion("CM_PAYRESULT is null");
            return (Criteria) this;
        }

        public Criteria andCmPayresultIsNotNull() {
            addCriterion("CM_PAYRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCmPayresultEqualTo(String value) {
            addCriterion("CM_PAYRESULT =", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultNotEqualTo(String value) {
            addCriterion("CM_PAYRESULT <>", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultGreaterThan(String value) {
            addCriterion("CM_PAYRESULT >", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PAYRESULT >=", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultLessThan(String value) {
            addCriterion("CM_PAYRESULT <", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultLessThanOrEqualTo(String value) {
            addCriterion("CM_PAYRESULT <=", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultLike(String value) {
            addCriterion("CM_PAYRESULT like", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultNotLike(String value) {
            addCriterion("CM_PAYRESULT not like", value, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultIn(List<String> values) {
            addCriterion("CM_PAYRESULT in", values, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultNotIn(List<String> values) {
            addCriterion("CM_PAYRESULT not in", values, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultBetween(String value1, String value2) {
            addCriterion("CM_PAYRESULT between", value1, value2, "cmPayresult");
            return (Criteria) this;
        }

        public Criteria andCmPayresultNotBetween(String value1, String value2) {
            addCriterion("CM_PAYRESULT not between", value1, value2, "cmPayresult");
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