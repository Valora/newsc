package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class RolePowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolePowerExample() {
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

        public Criteria andCmIdIsNull() {
            addCriterion("CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("CM_ID =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("CM_ID <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("CM_ID >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ID >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("CM_ID <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ID <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("CM_ID in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("CM_ID not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmRoleidIsNull() {
            addCriterion("CM_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andCmRoleidIsNotNull() {
            addCriterion("CM_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andCmRoleidEqualTo(Integer value) {
            addCriterion("CM_ROLEID =", value, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidNotEqualTo(Integer value) {
            addCriterion("CM_ROLEID <>", value, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidGreaterThan(Integer value) {
            addCriterion("CM_ROLEID >", value, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ROLEID >=", value, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidLessThan(Integer value) {
            addCriterion("CM_ROLEID <", value, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ROLEID <=", value, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidIn(List<Integer> values) {
            addCriterion("CM_ROLEID in", values, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidNotIn(List<Integer> values) {
            addCriterion("CM_ROLEID not in", values, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidBetween(Integer value1, Integer value2) {
            addCriterion("CM_ROLEID between", value1, value2, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ROLEID not between", value1, value2, "cmRoleid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridIsNull() {
            addCriterion("CM_POWERID is null");
            return (Criteria) this;
        }

        public Criteria andCmPoweridIsNotNull() {
            addCriterion("CM_POWERID is not null");
            return (Criteria) this;
        }

        public Criteria andCmPoweridEqualTo(Integer value) {
            addCriterion("CM_POWERID =", value, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridNotEqualTo(Integer value) {
            addCriterion("CM_POWERID <>", value, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridGreaterThan(Integer value) {
            addCriterion("CM_POWERID >", value, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_POWERID >=", value, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridLessThan(Integer value) {
            addCriterion("CM_POWERID <", value, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridLessThanOrEqualTo(Integer value) {
            addCriterion("CM_POWERID <=", value, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridIn(List<Integer> values) {
            addCriterion("CM_POWERID in", values, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridNotIn(List<Integer> values) {
            addCriterion("CM_POWERID not in", values, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridBetween(Integer value1, Integer value2) {
            addCriterion("CM_POWERID between", value1, value2, "cmPowerid");
            return (Criteria) this;
        }

        public Criteria andCmPoweridNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_POWERID not between", value1, value2, "cmPowerid");
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