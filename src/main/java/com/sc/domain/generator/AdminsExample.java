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

        public Criteria andCM_NAMEIsNull() {
            addCriterion("CM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEIsNotNull() {
            addCriterion("CM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEEqualTo(String value) {
            addCriterion("CM_NAME =", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotEqualTo(String value) {
            addCriterion("CM_NAME <>", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEGreaterThan(String value) {
            addCriterion("CM_NAME >", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NAME >=", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMELessThan(String value) {
            addCriterion("CM_NAME <", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMELessThanOrEqualTo(String value) {
            addCriterion("CM_NAME <=", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMELike(String value) {
            addCriterion("CM_NAME like", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotLike(String value) {
            addCriterion("CM_NAME not like", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEIn(List<String> values) {
            addCriterion("CM_NAME in", values, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotIn(List<String> values) {
            addCriterion("CM_NAME not in", values, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEBetween(String value1, String value2) {
            addCriterion("CM_NAME between", value1, value2, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotBetween(String value1, String value2) {
            addCriterion("CM_NAME not between", value1, value2, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTIsNull() {
            addCriterion("CM_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTIsNotNull() {
            addCriterion("CM_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTEqualTo(String value) {
            addCriterion("CM_ACCOUNT =", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotEqualTo(String value) {
            addCriterion("CM_ACCOUNT <>", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTGreaterThan(String value) {
            addCriterion("CM_ACCOUNT >", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT >=", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTLessThan(String value) {
            addCriterion("CM_ACCOUNT <", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTLessThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT <=", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTLike(String value) {
            addCriterion("CM_ACCOUNT like", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotLike(String value) {
            addCriterion("CM_ACCOUNT not like", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTIn(List<String> values) {
            addCriterion("CM_ACCOUNT in", values, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotIn(List<String> values) {
            addCriterion("CM_ACCOUNT not in", values, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT between", value1, value2, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT not between", value1, value2, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDIsNull() {
            addCriterion("CM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDIsNotNull() {
            addCriterion("CM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDEqualTo(String value) {
            addCriterion("CM_PASSWORD =", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotEqualTo(String value) {
            addCriterion("CM_PASSWORD <>", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDGreaterThan(String value) {
            addCriterion("CM_PASSWORD >", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD >=", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDLessThan(String value) {
            addCriterion("CM_PASSWORD <", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDLessThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD <=", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDLike(String value) {
            addCriterion("CM_PASSWORD like", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotLike(String value) {
            addCriterion("CM_PASSWORD not like", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDIn(List<String> values) {
            addCriterion("CM_PASSWORD in", values, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotIn(List<String> values) {
            addCriterion("CM_PASSWORD not in", values, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD between", value1, value2, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD not between", value1, value2, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELIsNull() {
            addCriterion("CM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELIsNotNull() {
            addCriterion("CM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELEqualTo(Integer value) {
            addCriterion("CM_LEVEL =", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELNotEqualTo(Integer value) {
            addCriterion("CM_LEVEL <>", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELGreaterThan(Integer value) {
            addCriterion("CM_LEVEL >", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL >=", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELLessThan(Integer value) {
            addCriterion("CM_LEVEL <", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL <=", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELIn(List<Integer> values) {
            addCriterion("CM_LEVEL in", values, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELNotIn(List<Integer> values) {
            addCriterion("CM_LEVEL not in", values, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL between", value1, value2, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL not between", value1, value2, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEIsNull() {
            addCriterion("CM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEIsNotNull() {
            addCriterion("CM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEEqualTo(Long value) {
            addCriterion("CM_PHONE =", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONENotEqualTo(Long value) {
            addCriterion("CM_PHONE <>", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEGreaterThan(Long value) {
            addCriterion("CM_PHONE >", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEGreaterThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE >=", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONELessThan(Long value) {
            addCriterion("CM_PHONE <", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONELessThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE <=", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEIn(List<Long> values) {
            addCriterion("CM_PHONE in", values, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONENotIn(List<Long> values) {
            addCriterion("CM_PHONE not in", values, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE between", value1, value2, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONENotBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE not between", value1, value2, "CM_PHONE");
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