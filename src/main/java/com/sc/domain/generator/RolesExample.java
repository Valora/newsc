package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class RolesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolesExample() {
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

        public Criteria andCmRolenameIsNull() {
            addCriterion("CM_ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andCmRolenameIsNotNull() {
            addCriterion("CM_ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmRolenameEqualTo(String value) {
            addCriterion("CM_ROLENAME =", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameNotEqualTo(String value) {
            addCriterion("CM_ROLENAME <>", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameGreaterThan(String value) {
            addCriterion("CM_ROLENAME >", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ROLENAME >=", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameLessThan(String value) {
            addCriterion("CM_ROLENAME <", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameLessThanOrEqualTo(String value) {
            addCriterion("CM_ROLENAME <=", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameLike(String value) {
            addCriterion("CM_ROLENAME like", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameNotLike(String value) {
            addCriterion("CM_ROLENAME not like", value, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameIn(List<String> values) {
            addCriterion("CM_ROLENAME in", values, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameNotIn(List<String> values) {
            addCriterion("CM_ROLENAME not in", values, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameBetween(String value1, String value2) {
            addCriterion("CM_ROLENAME between", value1, value2, "cmRolename");
            return (Criteria) this;
        }

        public Criteria andCmRolenameNotBetween(String value1, String value2) {
            addCriterion("CM_ROLENAME not between", value1, value2, "cmRolename");
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