package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class LogisticssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticssExample() {
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

        public Criteria andCmLogisticsidIsNull() {
            addCriterion("CM_LOGISTICSID is null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidIsNotNull() {
            addCriterion("CM_LOGISTICSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID =", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidNotEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <>", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidGreaterThan(Integer value) {
            addCriterion("CM_LOGISTICSID >", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID >=", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidLessThan(Integer value) {
            addCriterion("CM_LOGISTICSID <", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <=", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID in", values, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidNotIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID not in", values, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID between", value1, value2, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID not between", value1, value2, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameIsNull() {
            addCriterion("CM_LOGISTICSNAME is null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameIsNotNull() {
            addCriterion("CM_LOGISTICSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameEqualTo(String value) {
            addCriterion("CM_LOGISTICSNAME =", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameNotEqualTo(String value) {
            addCriterion("CM_LOGISTICSNAME <>", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameGreaterThan(String value) {
            addCriterion("CM_LOGISTICSNAME >", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNAME >=", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameLessThan(String value) {
            addCriterion("CM_LOGISTICSNAME <", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameLessThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNAME <=", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameLike(String value) {
            addCriterion("CM_LOGISTICSNAME like", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameNotLike(String value) {
            addCriterion("CM_LOGISTICSNAME not like", value, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameIn(List<String> values) {
            addCriterion("CM_LOGISTICSNAME in", values, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameNotIn(List<String> values) {
            addCriterion("CM_LOGISTICSNAME not in", values, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNAME between", value1, value2, "cmLogisticsname");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnameNotBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNAME not between", value1, value2, "cmLogisticsname");
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