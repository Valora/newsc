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

        public Criteria andCM_COLLECTIONIDIsNull() {
            addCriterion("CM_COLLECTIONID is null");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDIsNotNull() {
            addCriterion("CM_COLLECTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID =", value, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDNotEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID <>", value, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDGreaterThan(Integer value) {
            addCriterion("CM_COLLECTIONID >", value, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID >=", value, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDLessThan(Integer value) {
            addCriterion("CM_COLLECTIONID <", value, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_COLLECTIONID <=", value, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDIn(List<Integer> values) {
            addCriterion("CM_COLLECTIONID in", values, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDNotIn(List<Integer> values) {
            addCriterion("CM_COLLECTIONID not in", values, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_COLLECTIONID between", value1, value2, "CM_COLLECTIONID");
            return (Criteria) this;
        }

        public Criteria andCM_COLLECTIONIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_COLLECTIONID not between", value1, value2, "CM_COLLECTIONID");
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

        public Criteria andCM_GOODSIDIsNull() {
            addCriterion("CM_GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIsNotNull() {
            addCriterion("CM_GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDEqualTo(String value) {
            addCriterion("CM_GOODSID =", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotEqualTo(String value) {
            addCriterion("CM_GOODSID <>", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDGreaterThan(String value) {
            addCriterion("CM_GOODSID >", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID >=", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLessThan(String value) {
            addCriterion("CM_GOODSID <", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID <=", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLike(String value) {
            addCriterion("CM_GOODSID like", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotLike(String value) {
            addCriterion("CM_GOODSID not like", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIn(List<String> values) {
            addCriterion("CM_GOODSID in", values, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotIn(List<String> values) {
            addCriterion("CM_GOODSID not in", values, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDBetween(String value1, String value2) {
            addCriterion("CM_GOODSID between", value1, value2, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSID not between", value1, value2, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEIsNull() {
            addCriterion("CM_JOINTIME is null");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEIsNotNull() {
            addCriterion("CM_JOINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEEqualTo(Date value) {
            addCriterion("CM_JOINTIME =", value, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMENotEqualTo(Date value) {
            addCriterion("CM_JOINTIME <>", value, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEGreaterThan(Date value) {
            addCriterion("CM_JOINTIME >", value, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_JOINTIME >=", value, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMELessThan(Date value) {
            addCriterion("CM_JOINTIME <", value, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMELessThanOrEqualTo(Date value) {
            addCriterion("CM_JOINTIME <=", value, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEIn(List<Date> values) {
            addCriterion("CM_JOINTIME in", values, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMENotIn(List<Date> values) {
            addCriterion("CM_JOINTIME not in", values, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMEBetween(Date value1, Date value2) {
            addCriterion("CM_JOINTIME between", value1, value2, "CM_JOINTIME");
            return (Criteria) this;
        }

        public Criteria andCM_JOINTIMENotBetween(Date value1, Date value2) {
            addCriterion("CM_JOINTIME not between", value1, value2, "CM_JOINTIME");
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