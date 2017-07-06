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

        public Criteria andCM_ADDRESSIDIsNull() {
            addCriterion("CM_ADDRESSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDIsNotNull() {
            addCriterion("CM_ADDRESSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID =", value, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDNotEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID <>", value, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDGreaterThan(Integer value) {
            addCriterion("CM_ADDRESSID >", value, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID >=", value, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDLessThan(Integer value) {
            addCriterion("CM_ADDRESSID <", value, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ADDRESSID <=", value, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDIn(List<Integer> values) {
            addCriterion("CM_ADDRESSID in", values, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDNotIn(List<Integer> values) {
            addCriterion("CM_ADDRESSID not in", values, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_ADDRESSID between", value1, value2, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ADDRESSID not between", value1, value2, "CM_ADDRESSID");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIsNull() {
            addCriterion("CM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIsNotNull() {
            addCriterion("CM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSEqualTo(String value) {
            addCriterion("CM_ADDRESS =", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSNotEqualTo(String value) {
            addCriterion("CM_ADDRESS <>", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSGreaterThan(String value) {
            addCriterion("CM_ADDRESS >", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS >=", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSLessThan(String value) {
            addCriterion("CM_ADDRESS <", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS <=", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSLike(String value) {
            addCriterion("CM_ADDRESS like", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSNotLike(String value) {
            addCriterion("CM_ADDRESS not like", value, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSIn(List<String> values) {
            addCriterion("CM_ADDRESS in", values, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSNotIn(List<String> values) {
            addCriterion("CM_ADDRESS not in", values, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS between", value1, value2, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS not between", value1, value2, "CM_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDIsNull() {
            addCriterion("CM_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDIsNotNull() {
            addCriterion("CM_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDEqualTo(String value) {
            addCriterion("CM_USERID =", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotEqualTo(String value) {
            addCriterion("CM_USERID <>", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDGreaterThan(String value) {
            addCriterion("CM_USERID >", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_USERID >=", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDLessThan(String value) {
            addCriterion("CM_USERID <", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDLessThanOrEqualTo(String value) {
            addCriterion("CM_USERID <=", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDLike(String value) {
            addCriterion("CM_USERID like", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotLike(String value) {
            addCriterion("CM_USERID not like", value, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDIn(List<String> values) {
            addCriterion("CM_USERID in", values, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotIn(List<String> values) {
            addCriterion("CM_USERID not in", values, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDBetween(String value1, String value2) {
            addCriterion("CM_USERID between", value1, value2, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_USERIDNotBetween(String value1, String value2) {
            addCriterion("CM_USERID not between", value1, value2, "CM_USERID");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTIsNull() {
            addCriterion("CM_ISFIRST is null");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTIsNotNull() {
            addCriterion("CM_ISFIRST is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTEqualTo(Integer value) {
            addCriterion("CM_ISFIRST =", value, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTNotEqualTo(Integer value) {
            addCriterion("CM_ISFIRST <>", value, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTGreaterThan(Integer value) {
            addCriterion("CM_ISFIRST >", value, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISFIRST >=", value, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTLessThan(Integer value) {
            addCriterion("CM_ISFIRST <", value, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISFIRST <=", value, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTIn(List<Integer> values) {
            addCriterion("CM_ISFIRST in", values, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTNotIn(List<Integer> values) {
            addCriterion("CM_ISFIRST not in", values, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISFIRST between", value1, value2, "CM_ISFIRST");
            return (Criteria) this;
        }

        public Criteria andCM_ISFIRSTNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISFIRST not between", value1, value2, "CM_ISFIRST");
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