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

        public Criteria andCM_SHOWIDIsNull() {
            addCriterion("CM_SHOWID is null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDIsNotNull() {
            addCriterion("CM_SHOWID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDEqualTo(Integer value) {
            addCriterion("CM_SHOWID =", value, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDNotEqualTo(Integer value) {
            addCriterion("CM_SHOWID <>", value, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDGreaterThan(Integer value) {
            addCriterion("CM_SHOWID >", value, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SHOWID >=", value, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDLessThan(Integer value) {
            addCriterion("CM_SHOWID <", value, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SHOWID <=", value, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDIn(List<Integer> values) {
            addCriterion("CM_SHOWID in", values, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDNotIn(List<Integer> values) {
            addCriterion("CM_SHOWID not in", values, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_SHOWID between", value1, value2, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_SHOWIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SHOWID not between", value1, value2, "CM_SHOWID");
            return (Criteria) this;
        }

        public Criteria andCM_PATHIsNull() {
            addCriterion("CM_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_PATHIsNotNull() {
            addCriterion("CM_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PATHEqualTo(String value) {
            addCriterion("CM_PATH =", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHNotEqualTo(String value) {
            addCriterion("CM_PATH <>", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHGreaterThan(String value) {
            addCriterion("CM_PATH >", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PATH >=", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHLessThan(String value) {
            addCriterion("CM_PATH <", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHLessThanOrEqualTo(String value) {
            addCriterion("CM_PATH <=", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHLike(String value) {
            addCriterion("CM_PATH like", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHNotLike(String value) {
            addCriterion("CM_PATH not like", value, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHIn(List<String> values) {
            addCriterion("CM_PATH in", values, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHNotIn(List<String> values) {
            addCriterion("CM_PATH not in", values, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHBetween(String value1, String value2) {
            addCriterion("CM_PATH between", value1, value2, "CM_PATH");
            return (Criteria) this;
        }

        public Criteria andCM_PATHNotBetween(String value1, String value2) {
            addCriterion("CM_PATH not between", value1, value2, "CM_PATH");
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

        public Criteria andCM_ISTOPIsNull() {
            addCriterion("CM_ISTOP is null");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPIsNotNull() {
            addCriterion("CM_ISTOP is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPEqualTo(Integer value) {
            addCriterion("CM_ISTOP =", value, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPNotEqualTo(Integer value) {
            addCriterion("CM_ISTOP <>", value, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPGreaterThan(Integer value) {
            addCriterion("CM_ISTOP >", value, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISTOP >=", value, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPLessThan(Integer value) {
            addCriterion("CM_ISTOP <", value, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISTOP <=", value, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPIn(List<Integer> values) {
            addCriterion("CM_ISTOP in", values, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPNotIn(List<Integer> values) {
            addCriterion("CM_ISTOP not in", values, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISTOP between", value1, value2, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_ISTOPNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISTOP not between", value1, value2, "CM_ISTOP");
            return (Criteria) this;
        }

        public Criteria andCM_URLIsNull() {
            addCriterion("CM_URL is null");
            return (Criteria) this;
        }

        public Criteria andCM_URLIsNotNull() {
            addCriterion("CM_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCM_URLEqualTo(String value) {
            addCriterion("CM_URL =", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLNotEqualTo(String value) {
            addCriterion("CM_URL <>", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLGreaterThan(String value) {
            addCriterion("CM_URL >", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLGreaterThanOrEqualTo(String value) {
            addCriterion("CM_URL >=", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLLessThan(String value) {
            addCriterion("CM_URL <", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLLessThanOrEqualTo(String value) {
            addCriterion("CM_URL <=", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLLike(String value) {
            addCriterion("CM_URL like", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLNotLike(String value) {
            addCriterion("CM_URL not like", value, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLIn(List<String> values) {
            addCriterion("CM_URL in", values, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLNotIn(List<String> values) {
            addCriterion("CM_URL not in", values, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLBetween(String value1, String value2) {
            addCriterion("CM_URL between", value1, value2, "CM_URL");
            return (Criteria) this;
        }

        public Criteria andCM_URLNotBetween(String value1, String value2) {
            addCriterion("CM_URL not between", value1, value2, "CM_URL");
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