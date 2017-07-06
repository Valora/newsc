package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaysExample() {
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

        public Criteria andCM_PAYIDIsNull() {
            addCriterion("CM_PAYID is null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDIsNotNull() {
            addCriterion("CM_PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDEqualTo(Integer value) {
            addCriterion("CM_PAYID =", value, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDNotEqualTo(Integer value) {
            addCriterion("CM_PAYID <>", value, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDGreaterThan(Integer value) {
            addCriterion("CM_PAYID >", value, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYID >=", value, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDLessThan(Integer value) {
            addCriterion("CM_PAYID <", value, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYID <=", value, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDIn(List<Integer> values) {
            addCriterion("CM_PAYID in", values, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDNotIn(List<Integer> values) {
            addCriterion("CM_PAYID not in", values, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYID between", value1, value2, "CM_PAYID");
            return (Criteria) this;
        }

        public Criteria andCM_PAYIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYID not between", value1, value2, "CM_PAYID");
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

        public Criteria andCM_PAYJSONIsNull() {
            addCriterion("CM_PAYJSON is null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONIsNotNull() {
            addCriterion("CM_PAYJSON is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONEqualTo(String value) {
            addCriterion("CM_PAYJSON =", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONNotEqualTo(String value) {
            addCriterion("CM_PAYJSON <>", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONGreaterThan(String value) {
            addCriterion("CM_PAYJSON >", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PAYJSON >=", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONLessThan(String value) {
            addCriterion("CM_PAYJSON <", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONLessThanOrEqualTo(String value) {
            addCriterion("CM_PAYJSON <=", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONLike(String value) {
            addCriterion("CM_PAYJSON like", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONNotLike(String value) {
            addCriterion("CM_PAYJSON not like", value, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONIn(List<String> values) {
            addCriterion("CM_PAYJSON in", values, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONNotIn(List<String> values) {
            addCriterion("CM_PAYJSON not in", values, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONBetween(String value1, String value2) {
            addCriterion("CM_PAYJSON between", value1, value2, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_PAYJSONNotBetween(String value1, String value2) {
            addCriterion("CM_PAYJSON not between", value1, value2, "CM_PAYJSON");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEIsNull() {
            addCriterion("CM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEIsNotNull() {
            addCriterion("CM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEEqualTo(Date value) {
            addCriterion("CM_TIME =", value, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMENotEqualTo(Date value) {
            addCriterion("CM_TIME <>", value, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEGreaterThan(Date value) {
            addCriterion("CM_TIME >", value, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_TIME >=", value, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMELessThan(Date value) {
            addCriterion("CM_TIME <", value, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMELessThanOrEqualTo(Date value) {
            addCriterion("CM_TIME <=", value, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEIn(List<Date> values) {
            addCriterion("CM_TIME in", values, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMENotIn(List<Date> values) {
            addCriterion("CM_TIME not in", values, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMEBetween(Date value1, Date value2) {
            addCriterion("CM_TIME between", value1, value2, "CM_TIME");
            return (Criteria) this;
        }

        public Criteria andCM_TIMENotBetween(Date value1, Date value2) {
            addCriterion("CM_TIME not between", value1, value2, "CM_TIME");
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