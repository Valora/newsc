package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class BrandsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandsExample() {
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

        public Criteria andCM_BRANDIDIsNull() {
            addCriterion("CM_BRANDID is null");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDIsNotNull() {
            addCriterion("CM_BRANDID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDEqualTo(Integer value) {
            addCriterion("CM_BRANDID =", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDNotEqualTo(Integer value) {
            addCriterion("CM_BRANDID <>", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDGreaterThan(Integer value) {
            addCriterion("CM_BRANDID >", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID >=", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDLessThan(Integer value) {
            addCriterion("CM_BRANDID <", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID <=", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDIn(List<Integer> values) {
            addCriterion("CM_BRANDID in", values, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDNotIn(List<Integer> values) {
            addCriterion("CM_BRANDID not in", values, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID between", value1, value2, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID not between", value1, value2, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIsNull() {
            addCriterion("CM_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIsNotNull() {
            addCriterion("CM_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDEqualTo(String value) {
            addCriterion("CM_BRAND =", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDNotEqualTo(String value) {
            addCriterion("CM_BRAND <>", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDGreaterThan(String value) {
            addCriterion("CM_BRAND >", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_BRAND >=", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDLessThan(String value) {
            addCriterion("CM_BRAND <", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDLessThanOrEqualTo(String value) {
            addCriterion("CM_BRAND <=", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDLike(String value) {
            addCriterion("CM_BRAND like", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDNotLike(String value) {
            addCriterion("CM_BRAND not like", value, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIn(List<String> values) {
            addCriterion("CM_BRAND in", values, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDNotIn(List<String> values) {
            addCriterion("CM_BRAND not in", values, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDBetween(String value1, String value2) {
            addCriterion("CM_BRAND between", value1, value2, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDNotBetween(String value1, String value2) {
            addCriterion("CM_BRAND not between", value1, value2, "CM_BRAND");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERIsNull() {
            addCriterion("CM_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERIsNotNull() {
            addCriterion("CM_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andCM_OTHEREqualTo(String value) {
            addCriterion("CM_OTHER =", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotEqualTo(String value) {
            addCriterion("CM_OTHER <>", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERGreaterThan(String value) {
            addCriterion("CM_OTHER >", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERGreaterThanOrEqualTo(String value) {
            addCriterion("CM_OTHER >=", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERLessThan(String value) {
            addCriterion("CM_OTHER <", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERLessThanOrEqualTo(String value) {
            addCriterion("CM_OTHER <=", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERLike(String value) {
            addCriterion("CM_OTHER like", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotLike(String value) {
            addCriterion("CM_OTHER not like", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERIn(List<String> values) {
            addCriterion("CM_OTHER in", values, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotIn(List<String> values) {
            addCriterion("CM_OTHER not in", values, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERBetween(String value1, String value2) {
            addCriterion("CM_OTHER between", value1, value2, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotBetween(String value1, String value2) {
            addCriterion("CM_OTHER not between", value1, value2, "CM_OTHER");
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