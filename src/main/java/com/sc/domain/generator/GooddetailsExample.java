package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class GooddetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GooddetailsExample() {
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

        public Criteria andCmGoodsdetailsidIsNull() {
            addCriterion("CM_GOODSDETAILSID is null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidIsNotNull() {
            addCriterion("CM_GOODSDETAILSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID =", value, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidNotEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID <>", value, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidGreaterThan(Integer value) {
            addCriterion("CM_GOODSDETAILSID >", value, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID >=", value, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidLessThan(Integer value) {
            addCriterion("CM_GOODSDETAILSID <", value, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID <=", value, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidIn(List<Integer> values) {
            addCriterion("CM_GOODSDETAILSID in", values, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidNotIn(List<Integer> values) {
            addCriterion("CM_GOODSDETAILSID not in", values, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidBetween(Integer value1, Integer value2) {
            addCriterion("CM_GOODSDETAILSID between", value1, value2, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsdetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_GOODSDETAILSID not between", value1, value2, "cmGoodsdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidIsNull() {
            addCriterion("CM_GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidIsNotNull() {
            addCriterion("CM_GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidEqualTo(String value) {
            addCriterion("CM_GOODSID =", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotEqualTo(String value) {
            addCriterion("CM_GOODSID <>", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidGreaterThan(String value) {
            addCriterion("CM_GOODSID >", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID >=", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidLessThan(String value) {
            addCriterion("CM_GOODSID <", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID <=", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidLike(String value) {
            addCriterion("CM_GOODSID like", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotLike(String value) {
            addCriterion("CM_GOODSID not like", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidIn(List<String> values) {
            addCriterion("CM_GOODSID in", values, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotIn(List<String> values) {
            addCriterion("CM_GOODSID not in", values, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidBetween(String value1, String value2) {
            addCriterion("CM_GOODSID between", value1, value2, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSID not between", value1, value2, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmColorIsNull() {
            addCriterion("CM_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCmColorIsNotNull() {
            addCriterion("CM_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCmColorEqualTo(String value) {
            addCriterion("CM_COLOR =", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorNotEqualTo(String value) {
            addCriterion("CM_COLOR <>", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorGreaterThan(String value) {
            addCriterion("CM_COLOR >", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorGreaterThanOrEqualTo(String value) {
            addCriterion("CM_COLOR >=", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorLessThan(String value) {
            addCriterion("CM_COLOR <", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorLessThanOrEqualTo(String value) {
            addCriterion("CM_COLOR <=", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorLike(String value) {
            addCriterion("CM_COLOR like", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorNotLike(String value) {
            addCriterion("CM_COLOR not like", value, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorIn(List<String> values) {
            addCriterion("CM_COLOR in", values, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorNotIn(List<String> values) {
            addCriterion("CM_COLOR not in", values, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorBetween(String value1, String value2) {
            addCriterion("CM_COLOR between", value1, value2, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmColorNotBetween(String value1, String value2) {
            addCriterion("CM_COLOR not between", value1, value2, "cmColor");
            return (Criteria) this;
        }

        public Criteria andCmImagepathIsNull() {
            addCriterion("CM_IMAGEPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmImagepathIsNotNull() {
            addCriterion("CM_IMAGEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmImagepathEqualTo(String value) {
            addCriterion("CM_IMAGEPATH =", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathNotEqualTo(String value) {
            addCriterion("CM_IMAGEPATH <>", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathGreaterThan(String value) {
            addCriterion("CM_IMAGEPATH >", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_IMAGEPATH >=", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathLessThan(String value) {
            addCriterion("CM_IMAGEPATH <", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathLessThanOrEqualTo(String value) {
            addCriterion("CM_IMAGEPATH <=", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathLike(String value) {
            addCriterion("CM_IMAGEPATH like", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathNotLike(String value) {
            addCriterion("CM_IMAGEPATH not like", value, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathIn(List<String> values) {
            addCriterion("CM_IMAGEPATH in", values, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathNotIn(List<String> values) {
            addCriterion("CM_IMAGEPATH not in", values, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathBetween(String value1, String value2) {
            addCriterion("CM_IMAGEPATH between", value1, value2, "cmImagepath");
            return (Criteria) this;
        }

        public Criteria andCmImagepathNotBetween(String value1, String value2) {
            addCriterion("CM_IMAGEPATH not between", value1, value2, "cmImagepath");
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