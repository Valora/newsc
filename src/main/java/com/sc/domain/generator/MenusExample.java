package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class MenusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenusExample() {
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

        public Criteria andCmMenuidIsNull() {
            addCriterion("CM_MENUID is null");
            return (Criteria) this;
        }

        public Criteria andCmMenuidIsNotNull() {
            addCriterion("CM_MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andCmMenuidEqualTo(Integer value) {
            addCriterion("CM_MENUID =", value, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidNotEqualTo(Integer value) {
            addCriterion("CM_MENUID <>", value, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidGreaterThan(Integer value) {
            addCriterion("CM_MENUID >", value, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_MENUID >=", value, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidLessThan(Integer value) {
            addCriterion("CM_MENUID <", value, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_MENUID <=", value, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidIn(List<Integer> values) {
            addCriterion("CM_MENUID in", values, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidNotIn(List<Integer> values) {
            addCriterion("CM_MENUID not in", values, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidBetween(Integer value1, Integer value2) {
            addCriterion("CM_MENUID between", value1, value2, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_MENUID not between", value1, value2, "cmMenuid");
            return (Criteria) this;
        }

        public Criteria andCmMenunameIsNull() {
            addCriterion("CM_MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andCmMenunameIsNotNull() {
            addCriterion("CM_MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmMenunameEqualTo(String value) {
            addCriterion("CM_MENUNAME =", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameNotEqualTo(String value) {
            addCriterion("CM_MENUNAME <>", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameGreaterThan(String value) {
            addCriterion("CM_MENUNAME >", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MENUNAME >=", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameLessThan(String value) {
            addCriterion("CM_MENUNAME <", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameLessThanOrEqualTo(String value) {
            addCriterion("CM_MENUNAME <=", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameLike(String value) {
            addCriterion("CM_MENUNAME like", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameNotLike(String value) {
            addCriterion("CM_MENUNAME not like", value, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameIn(List<String> values) {
            addCriterion("CM_MENUNAME in", values, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameNotIn(List<String> values) {
            addCriterion("CM_MENUNAME not in", values, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameBetween(String value1, String value2) {
            addCriterion("CM_MENUNAME between", value1, value2, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenunameNotBetween(String value1, String value2) {
            addCriterion("CM_MENUNAME not between", value1, value2, "cmMenuname");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlIsNull() {
            addCriterion("CM_MENUURL is null");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlIsNotNull() {
            addCriterion("CM_MENUURL is not null");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlEqualTo(String value) {
            addCriterion("CM_MENUURL =", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlNotEqualTo(String value) {
            addCriterion("CM_MENUURL <>", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlGreaterThan(String value) {
            addCriterion("CM_MENUURL >", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MENUURL >=", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlLessThan(String value) {
            addCriterion("CM_MENUURL <", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlLessThanOrEqualTo(String value) {
            addCriterion("CM_MENUURL <=", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlLike(String value) {
            addCriterion("CM_MENUURL like", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlNotLike(String value) {
            addCriterion("CM_MENUURL not like", value, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlIn(List<String> values) {
            addCriterion("CM_MENUURL in", values, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlNotIn(List<String> values) {
            addCriterion("CM_MENUURL not in", values, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlBetween(String value1, String value2) {
            addCriterion("CM_MENUURL between", value1, value2, "cmMenuurl");
            return (Criteria) this;
        }

        public Criteria andCmMenuurlNotBetween(String value1, String value2) {
            addCriterion("CM_MENUURL not between", value1, value2, "cmMenuurl");
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