package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class AddressesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressesExample() {
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

        public Criteria andCmAddressidIsNull() {
            addCriterion("CM_ADDRESSID is null");
            return (Criteria) this;
        }

        public Criteria andCmAddressidIsNotNull() {
            addCriterion("CM_ADDRESSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmAddressidEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID =", value, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidNotEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID <>", value, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidGreaterThan(Integer value) {
            addCriterion("CM_ADDRESSID >", value, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID >=", value, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidLessThan(Integer value) {
            addCriterion("CM_ADDRESSID <", value, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID <=", value, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidIn(List<Integer> values) {
            addCriterion("CM_ADDRESSID in", values, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidNotIn(List<Integer> values) {
            addCriterion("CM_ADDRESSID not in", values, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidBetween(Integer value1, Integer value2) {
            addCriterion("CM_ADDRESSID between", value1, value2, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ADDRESSID not between", value1, value2, "cmAddressid");
            return (Criteria) this;
        }

        public Criteria andCmAddressIsNull() {
            addCriterion("CM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCmAddressIsNotNull() {
            addCriterion("CM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCmAddressEqualTo(String value) {
            addCriterion("CM_ADDRESS =", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotEqualTo(String value) {
            addCriterion("CM_ADDRESS <>", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressGreaterThan(String value) {
            addCriterion("CM_ADDRESS >", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS >=", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLessThan(String value) {
            addCriterion("CM_ADDRESS <", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLessThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS <=", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLike(String value) {
            addCriterion("CM_ADDRESS like", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotLike(String value) {
            addCriterion("CM_ADDRESS not like", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressIn(List<String> values) {
            addCriterion("CM_ADDRESS in", values, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotIn(List<String> values) {
            addCriterion("CM_ADDRESS not in", values, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS between", value1, value2, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS not between", value1, value2, "cmAddress");
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

        public Criteria andCmIsfirstIsNull() {
            addCriterion("CM_ISFIRST is null");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstIsNotNull() {
            addCriterion("CM_ISFIRST is not null");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstEqualTo(Integer value) {
            addCriterion("CM_ISFIRST =", value, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstNotEqualTo(Integer value) {
            addCriterion("CM_ISFIRST <>", value, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstGreaterThan(Integer value) {
            addCriterion("CM_ISFIRST >", value, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISFIRST >=", value, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstLessThan(Integer value) {
            addCriterion("CM_ISFIRST <", value, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISFIRST <=", value, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstIn(List<Integer> values) {
            addCriterion("CM_ISFIRST in", values, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstNotIn(List<Integer> values) {
            addCriterion("CM_ISFIRST not in", values, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISFIRST between", value1, value2, "cmIsfirst");
            return (Criteria) this;
        }

        public Criteria andCmIsfirstNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISFIRST not between", value1, value2, "cmIsfirst");
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