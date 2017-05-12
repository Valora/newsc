package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class AdminsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminsExample() {
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

        public Criteria andCmAdminidIsNull() {
            addCriterion("CM_ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andCmAdminidIsNotNull() {
            addCriterion("CM_ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andCmAdminidEqualTo(String value) {
            addCriterion("CM_ADMINID =", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotEqualTo(String value) {
            addCriterion("CM_ADMINID <>", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidGreaterThan(String value) {
            addCriterion("CM_ADMINID >", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID >=", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidLessThan(String value) {
            addCriterion("CM_ADMINID <", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidLessThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID <=", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidLike(String value) {
            addCriterion("CM_ADMINID like", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotLike(String value) {
            addCriterion("CM_ADMINID not like", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidIn(List<String> values) {
            addCriterion("CM_ADMINID in", values, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotIn(List<String> values) {
            addCriterion("CM_ADMINID not in", values, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidBetween(String value1, String value2) {
            addCriterion("CM_ADMINID between", value1, value2, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotBetween(String value1, String value2) {
            addCriterion("CM_ADMINID not between", value1, value2, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNull() {
            addCriterion("CM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNotNull() {
            addCriterion("CM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmNameEqualTo(String value) {
            addCriterion("CM_NAME =", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotEqualTo(String value) {
            addCriterion("CM_NAME <>", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThan(String value) {
            addCriterion("CM_NAME >", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NAME >=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThan(String value) {
            addCriterion("CM_NAME <", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThanOrEqualTo(String value) {
            addCriterion("CM_NAME <=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLike(String value) {
            addCriterion("CM_NAME like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotLike(String value) {
            addCriterion("CM_NAME not like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameIn(List<String> values) {
            addCriterion("CM_NAME in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotIn(List<String> values) {
            addCriterion("CM_NAME not in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameBetween(String value1, String value2) {
            addCriterion("CM_NAME between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotBetween(String value1, String value2) {
            addCriterion("CM_NAME not between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmAccountIsNull() {
            addCriterion("CM_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCmAccountIsNotNull() {
            addCriterion("CM_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCmAccountEqualTo(String value) {
            addCriterion("CM_ACCOUNT =", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotEqualTo(String value) {
            addCriterion("CM_ACCOUNT <>", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountGreaterThan(String value) {
            addCriterion("CM_ACCOUNT >", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT >=", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountLessThan(String value) {
            addCriterion("CM_ACCOUNT <", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountLessThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT <=", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountLike(String value) {
            addCriterion("CM_ACCOUNT like", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotLike(String value) {
            addCriterion("CM_ACCOUNT not like", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountIn(List<String> values) {
            addCriterion("CM_ACCOUNT in", values, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotIn(List<String> values) {
            addCriterion("CM_ACCOUNT not in", values, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT between", value1, value2, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT not between", value1, value2, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmPasswordIsNull() {
            addCriterion("CM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCmPasswordIsNotNull() {
            addCriterion("CM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCmPasswordEqualTo(String value) {
            addCriterion("CM_PASSWORD =", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotEqualTo(String value) {
            addCriterion("CM_PASSWORD <>", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordGreaterThan(String value) {
            addCriterion("CM_PASSWORD >", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD >=", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordLessThan(String value) {
            addCriterion("CM_PASSWORD <", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordLessThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD <=", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordLike(String value) {
            addCriterion("CM_PASSWORD like", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotLike(String value) {
            addCriterion("CM_PASSWORD not like", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordIn(List<String> values) {
            addCriterion("CM_PASSWORD in", values, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotIn(List<String> values) {
            addCriterion("CM_PASSWORD not in", values, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD between", value1, value2, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD not between", value1, value2, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNull() {
            addCriterion("CM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCmLevelIsNotNull() {
            addCriterion("CM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCmLevelEqualTo(Integer value) {
            addCriterion("CM_LEVEL =", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotEqualTo(Integer value) {
            addCriterion("CM_LEVEL <>", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThan(Integer value) {
            addCriterion("CM_LEVEL >", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL >=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThan(Integer value) {
            addCriterion("CM_LEVEL <", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL <=", value, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelIn(List<Integer> values) {
            addCriterion("CM_LEVEL in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotIn(List<Integer> values) {
            addCriterion("CM_LEVEL not in", values, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL not between", value1, value2, "cmLevel");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIsNull() {
            addCriterion("CM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIsNotNull() {
            addCriterion("CM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCmPhoneEqualTo(Long value) {
            addCriterion("CM_PHONE =", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotEqualTo(Long value) {
            addCriterion("CM_PHONE <>", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneGreaterThan(Long value) {
            addCriterion("CM_PHONE >", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE >=", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLessThan(Long value) {
            addCriterion("CM_PHONE <", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLessThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE <=", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIn(List<Long> values) {
            addCriterion("CM_PHONE in", values, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotIn(List<Long> values) {
            addCriterion("CM_PHONE not in", values, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE between", value1, value2, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE not between", value1, value2, "cmPhone");
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