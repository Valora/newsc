package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionsExample() {
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

        public Criteria andCmCollectionidIsNull() {
            addCriterion("CM_COLLECTIONID is null");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidIsNotNull() {
            addCriterion("CM_COLLECTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID =", value, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidNotEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID <>", value, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidGreaterThan(Integer value) {
            addCriterion("CM_COLLECTIONID >", value, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID >=", value, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidLessThan(Integer value) {
            addCriterion("CM_COLLECTIONID <", value, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID <=", value, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidIn(List<Integer> values) {
            addCriterion("CM_COLLECTIONID in", values, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidNotIn(List<Integer> values) {
            addCriterion("CM_COLLECTIONID not in", values, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidBetween(Integer value1, Integer value2) {
            addCriterion("CM_COLLECTIONID between", value1, value2, "cmCollectionid");
            return (Criteria) this;
        }

        public Criteria andCmCollectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_COLLECTIONID not between", value1, value2, "cmCollectionid");
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

        public Criteria andCmJointimeIsNull() {
            addCriterion("CM_JOINTIME is null");
            return (Criteria) this;
        }

        public Criteria andCmJointimeIsNotNull() {
            addCriterion("CM_JOINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmJointimeEqualTo(Date value) {
            addCriterion("CM_JOINTIME =", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotEqualTo(Date value) {
            addCriterion("CM_JOINTIME <>", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeGreaterThan(Date value) {
            addCriterion("CM_JOINTIME >", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_JOINTIME >=", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeLessThan(Date value) {
            addCriterion("CM_JOINTIME <", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeLessThanOrEqualTo(Date value) {
            addCriterion("CM_JOINTIME <=", value, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeIn(List<Date> values) {
            addCriterion("CM_JOINTIME in", values, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotIn(List<Date> values) {
            addCriterion("CM_JOINTIME not in", values, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeBetween(Date value1, Date value2) {
            addCriterion("CM_JOINTIME between", value1, value2, "cmJointime");
            return (Criteria) this;
        }

        public Criteria andCmJointimeNotBetween(Date value1, Date value2) {
            addCriterion("CM_JOINTIME not between", value1, value2, "cmJointime");
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