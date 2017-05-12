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

        public Criteria andCmBrandidIsNull() {
            addCriterion("CM_BRANDID is null");
            return (Criteria) this;
        }

        public Criteria andCmBrandidIsNotNull() {
            addCriterion("CM_BRANDID is not null");
            return (Criteria) this;
        }

        public Criteria andCmBrandidEqualTo(Integer value) {
            addCriterion("CM_BRANDID =", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidNotEqualTo(Integer value) {
            addCriterion("CM_BRANDID <>", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidGreaterThan(Integer value) {
            addCriterion("CM_BRANDID >", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID >=", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidLessThan(Integer value) {
            addCriterion("CM_BRANDID <", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID <=", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidIn(List<Integer> values) {
            addCriterion("CM_BRANDID in", values, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidNotIn(List<Integer> values) {
            addCriterion("CM_BRANDID not in", values, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID between", value1, value2, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID not between", value1, value2, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandIsNull() {
            addCriterion("CM_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andCmBrandIsNotNull() {
            addCriterion("CM_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andCmBrandEqualTo(String value) {
            addCriterion("CM_BRAND =", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandNotEqualTo(String value) {
            addCriterion("CM_BRAND <>", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandGreaterThan(String value) {
            addCriterion("CM_BRAND >", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandGreaterThanOrEqualTo(String value) {
            addCriterion("CM_BRAND >=", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandLessThan(String value) {
            addCriterion("CM_BRAND <", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandLessThanOrEqualTo(String value) {
            addCriterion("CM_BRAND <=", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandLike(String value) {
            addCriterion("CM_BRAND like", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandNotLike(String value) {
            addCriterion("CM_BRAND not like", value, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandIn(List<String> values) {
            addCriterion("CM_BRAND in", values, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandNotIn(List<String> values) {
            addCriterion("CM_BRAND not in", values, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandBetween(String value1, String value2) {
            addCriterion("CM_BRAND between", value1, value2, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmBrandNotBetween(String value1, String value2) {
            addCriterion("CM_BRAND not between", value1, value2, "cmBrand");
            return (Criteria) this;
        }

        public Criteria andCmOtherIsNull() {
            addCriterion("CM_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andCmOtherIsNotNull() {
            addCriterion("CM_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andCmOtherEqualTo(String value) {
            addCriterion("CM_OTHER =", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherNotEqualTo(String value) {
            addCriterion("CM_OTHER <>", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherGreaterThan(String value) {
            addCriterion("CM_OTHER >", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherGreaterThanOrEqualTo(String value) {
            addCriterion("CM_OTHER >=", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherLessThan(String value) {
            addCriterion("CM_OTHER <", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherLessThanOrEqualTo(String value) {
            addCriterion("CM_OTHER <=", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherLike(String value) {
            addCriterion("CM_OTHER like", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherNotLike(String value) {
            addCriterion("CM_OTHER not like", value, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherIn(List<String> values) {
            addCriterion("CM_OTHER in", values, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherNotIn(List<String> values) {
            addCriterion("CM_OTHER not in", values, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherBetween(String value1, String value2) {
            addCriterion("CM_OTHER between", value1, value2, "cmOther");
            return (Criteria) this;
        }

        public Criteria andCmOtherNotBetween(String value1, String value2) {
            addCriterion("CM_OTHER not between", value1, value2, "cmOther");
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