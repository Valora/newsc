package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class ShowsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowsExample() {
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

        public Criteria andCmShowidIsNull() {
            addCriterion("CM_SHOWID is null");
            return (Criteria) this;
        }

        public Criteria andCmShowidIsNotNull() {
            addCriterion("CM_SHOWID is not null");
            return (Criteria) this;
        }

        public Criteria andCmShowidEqualTo(Integer value) {
            addCriterion("CM_SHOWID =", value, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidNotEqualTo(Integer value) {
            addCriterion("CM_SHOWID <>", value, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidGreaterThan(Integer value) {
            addCriterion("CM_SHOWID >", value, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SHOWID >=", value, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidLessThan(Integer value) {
            addCriterion("CM_SHOWID <", value, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SHOWID <=", value, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidIn(List<Integer> values) {
            addCriterion("CM_SHOWID in", values, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidNotIn(List<Integer> values) {
            addCriterion("CM_SHOWID not in", values, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidBetween(Integer value1, Integer value2) {
            addCriterion("CM_SHOWID between", value1, value2, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmShowidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SHOWID not between", value1, value2, "cmShowid");
            return (Criteria) this;
        }

        public Criteria andCmPathIsNull() {
            addCriterion("CM_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCmPathIsNotNull() {
            addCriterion("CM_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmPathEqualTo(String value) {
            addCriterion("CM_PATH =", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathNotEqualTo(String value) {
            addCriterion("CM_PATH <>", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathGreaterThan(String value) {
            addCriterion("CM_PATH >", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PATH >=", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathLessThan(String value) {
            addCriterion("CM_PATH <", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathLessThanOrEqualTo(String value) {
            addCriterion("CM_PATH <=", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathLike(String value) {
            addCriterion("CM_PATH like", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathNotLike(String value) {
            addCriterion("CM_PATH not like", value, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathIn(List<String> values) {
            addCriterion("CM_PATH in", values, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathNotIn(List<String> values) {
            addCriterion("CM_PATH not in", values, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathBetween(String value1, String value2) {
            addCriterion("CM_PATH between", value1, value2, "cmPath");
            return (Criteria) this;
        }

        public Criteria andCmPathNotBetween(String value1, String value2) {
            addCriterion("CM_PATH not between", value1, value2, "cmPath");
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

        public Criteria andCmIstopIsNull() {
            addCriterion("CM_ISTOP is null");
            return (Criteria) this;
        }

        public Criteria andCmIstopIsNotNull() {
            addCriterion("CM_ISTOP is not null");
            return (Criteria) this;
        }

        public Criteria andCmIstopEqualTo(Integer value) {
            addCriterion("CM_ISTOP =", value, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopNotEqualTo(Integer value) {
            addCriterion("CM_ISTOP <>", value, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopGreaterThan(Integer value) {
            addCriterion("CM_ISTOP >", value, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISTOP >=", value, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopLessThan(Integer value) {
            addCriterion("CM_ISTOP <", value, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISTOP <=", value, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopIn(List<Integer> values) {
            addCriterion("CM_ISTOP in", values, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopNotIn(List<Integer> values) {
            addCriterion("CM_ISTOP not in", values, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISTOP between", value1, value2, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmIstopNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISTOP not between", value1, value2, "cmIstop");
            return (Criteria) this;
        }

        public Criteria andCmUrlIsNull() {
            addCriterion("CM_URL is null");
            return (Criteria) this;
        }

        public Criteria andCmUrlIsNotNull() {
            addCriterion("CM_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCmUrlEqualTo(String value) {
            addCriterion("CM_URL =", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlNotEqualTo(String value) {
            addCriterion("CM_URL <>", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlGreaterThan(String value) {
            addCriterion("CM_URL >", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CM_URL >=", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlLessThan(String value) {
            addCriterion("CM_URL <", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlLessThanOrEqualTo(String value) {
            addCriterion("CM_URL <=", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlLike(String value) {
            addCriterion("CM_URL like", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlNotLike(String value) {
            addCriterion("CM_URL not like", value, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlIn(List<String> values) {
            addCriterion("CM_URL in", values, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlNotIn(List<String> values) {
            addCriterion("CM_URL not in", values, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlBetween(String value1, String value2) {
            addCriterion("CM_URL between", value1, value2, "cmUrl");
            return (Criteria) this;
        }

        public Criteria andCmUrlNotBetween(String value1, String value2) {
            addCriterion("CM_URL not between", value1, value2, "cmUrl");
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