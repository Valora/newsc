package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class AdminRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminRoleExample() {
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

        public Criteria andCM_IDIsNull() {
            addCriterion("CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCM_IDIsNotNull() {
            addCriterion("CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_IDEqualTo(Integer value) {
            addCriterion("CM_ID =", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDNotEqualTo(Integer value) {
            addCriterion("CM_ID <>", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDGreaterThan(Integer value) {
            addCriterion("CM_ID >", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ID >=", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDLessThan(Integer value) {
            addCriterion("CM_ID <", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ID <=", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDIn(List<Integer> values) {
            addCriterion("CM_ID in", values, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDNotIn(List<Integer> values) {
            addCriterion("CM_ID not in", values, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID between", value1, value2, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID not between", value1, value2, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDIsNull() {
            addCriterion("CM_ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDIsNotNull() {
            addCriterion("CM_ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDEqualTo(String value) {
            addCriterion("CM_ADMINID =", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotEqualTo(String value) {
            addCriterion("CM_ADMINID <>", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDGreaterThan(String value) {
            addCriterion("CM_ADMINID >", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID >=", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDLessThan(String value) {
            addCriterion("CM_ADMINID <", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDLessThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID <=", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDLike(String value) {
            addCriterion("CM_ADMINID like", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotLike(String value) {
            addCriterion("CM_ADMINID not like", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDIn(List<String> values) {
            addCriterion("CM_ADMINID in", values, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotIn(List<String> values) {
            addCriterion("CM_ADMINID not in", values, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDBetween(String value1, String value2) {
            addCriterion("CM_ADMINID between", value1, value2, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotBetween(String value1, String value2) {
            addCriterion("CM_ADMINID not between", value1, value2, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDIsNull() {
            addCriterion("CM_ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDIsNotNull() {
            addCriterion("CM_ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDEqualTo(Integer value) {
            addCriterion("CM_ROLEID =", value, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDNotEqualTo(Integer value) {
            addCriterion("CM_ROLEID <>", value, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDGreaterThan(Integer value) {
            addCriterion("CM_ROLEID >", value, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ROLEID >=", value, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDLessThan(Integer value) {
            addCriterion("CM_ROLEID <", value, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ROLEID <=", value, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDIn(List<Integer> values) {
            addCriterion("CM_ROLEID in", values, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDNotIn(List<Integer> values) {
            addCriterion("CM_ROLEID not in", values, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_ROLEID between", value1, value2, "CM_ROLEID");
            return (Criteria) this;
        }

        public Criteria andCM_ROLEIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ROLEID not between", value1, value2, "CM_ROLEID");
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