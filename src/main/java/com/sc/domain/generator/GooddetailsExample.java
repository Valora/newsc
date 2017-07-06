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

        public Criteria andCM_GOODSDETAILSIDIsNull() {
            addCriterion("CM_GOODSDETAILSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDIsNotNull() {
            addCriterion("CM_GOODSDETAILSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID =", value, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDNotEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID <>", value, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDGreaterThan(Integer value) {
            addCriterion("CM_GOODSDETAILSID >", value, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID >=", value, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDLessThan(Integer value) {
            addCriterion("CM_GOODSDETAILSID <", value, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_GOODSDETAILSID <=", value, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDIn(List<Integer> values) {
            addCriterion("CM_GOODSDETAILSID in", values, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDNotIn(List<Integer> values) {
            addCriterion("CM_GOODSDETAILSID not in", values, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_GOODSDETAILSID between", value1, value2, "CM_GOODSDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSDETAILSIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_GOODSDETAILSID not between", value1, value2, "CM_GOODSDETAILSID");
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

        public Criteria andCM_COLORIsNull() {
            addCriterion("CM_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCM_COLORIsNotNull() {
            addCriterion("CM_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCM_COLOREqualTo(String value) {
            addCriterion("CM_COLOR =", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORNotEqualTo(String value) {
            addCriterion("CM_COLOR <>", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORGreaterThan(String value) {
            addCriterion("CM_COLOR >", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORGreaterThanOrEqualTo(String value) {
            addCriterion("CM_COLOR >=", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORLessThan(String value) {
            addCriterion("CM_COLOR <", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORLessThanOrEqualTo(String value) {
            addCriterion("CM_COLOR <=", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORLike(String value) {
            addCriterion("CM_COLOR like", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORNotLike(String value) {
            addCriterion("CM_COLOR not like", value, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORIn(List<String> values) {
            addCriterion("CM_COLOR in", values, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORNotIn(List<String> values) {
            addCriterion("CM_COLOR not in", values, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORBetween(String value1, String value2) {
            addCriterion("CM_COLOR between", value1, value2, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_COLORNotBetween(String value1, String value2) {
            addCriterion("CM_COLOR not between", value1, value2, "CM_COLOR");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHIsNull() {
            addCriterion("CM_IMAGEPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHIsNotNull() {
            addCriterion("CM_IMAGEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHEqualTo(String value) {
            addCriterion("CM_IMAGEPATH =", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHNotEqualTo(String value) {
            addCriterion("CM_IMAGEPATH <>", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHGreaterThan(String value) {
            addCriterion("CM_IMAGEPATH >", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_IMAGEPATH >=", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHLessThan(String value) {
            addCriterion("CM_IMAGEPATH <", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_IMAGEPATH <=", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHLike(String value) {
            addCriterion("CM_IMAGEPATH like", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHNotLike(String value) {
            addCriterion("CM_IMAGEPATH not like", value, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHIn(List<String> values) {
            addCriterion("CM_IMAGEPATH in", values, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHNotIn(List<String> values) {
            addCriterion("CM_IMAGEPATH not in", values, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHBetween(String value1, String value2) {
            addCriterion("CM_IMAGEPATH between", value1, value2, "CM_IMAGEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMAGEPATHNotBetween(String value1, String value2) {
            addCriterion("CM_IMAGEPATH not between", value1, value2, "CM_IMAGEPATH");
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