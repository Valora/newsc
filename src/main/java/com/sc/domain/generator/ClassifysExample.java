package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class ClassifysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassifysExample() {
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

        public Criteria andCM_CLASSIFYIDIsNull() {
            addCriterion("CM_CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDIsNotNull() {
            addCriterion("CM_CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID =", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDNotEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <>", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDGreaterThan(Integer value) {
            addCriterion("CM_CLASSIFYID >", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID >=", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDLessThan(Integer value) {
            addCriterion("CM_CLASSIFYID <", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <=", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID in", values, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDNotIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID not in", values, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID between", value1, value2, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID not between", value1, value2, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEIsNull() {
            addCriterion("CM_CLASSIFYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEIsNotNull() {
            addCriterion("CM_CLASSIFYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME =", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMENotEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME <>", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEGreaterThan(String value) {
            addCriterion("CM_CLASSIFYNAME >", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME >=", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMELessThan(String value) {
            addCriterion("CM_CLASSIFYNAME <", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMELessThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME <=", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMELike(String value) {
            addCriterion("CM_CLASSIFYNAME like", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMENotLike(String value) {
            addCriterion("CM_CLASSIFYNAME not like", value, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEIn(List<String> values) {
            addCriterion("CM_CLASSIFYNAME in", values, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMENotIn(List<String> values) {
            addCriterion("CM_CLASSIFYNAME not in", values, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMEBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYNAME between", value1, value2, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYNAMENotBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYNAME not between", value1, value2, "CM_CLASSIFYNAME");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDIsNull() {
            addCriterion("CM_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDIsNotNull() {
            addCriterion("CM_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDEqualTo(Integer value) {
            addCriterion("CM_PARENTID =", value, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDNotEqualTo(Integer value) {
            addCriterion("CM_PARENTID <>", value, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDGreaterThan(Integer value) {
            addCriterion("CM_PARENTID >", value, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PARENTID >=", value, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDLessThan(Integer value) {
            addCriterion("CM_PARENTID <", value, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PARENTID <=", value, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDIn(List<Integer> values) {
            addCriterion("CM_PARENTID in", values, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDNotIn(List<Integer> values) {
            addCriterion("CM_PARENTID not in", values, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_PARENTID between", value1, value2, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_PARENTIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PARENTID not between", value1, value2, "CM_PARENTID");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHIsNull() {
            addCriterion("CM_IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHIsNotNull() {
            addCriterion("CM_IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHEqualTo(String value) {
            addCriterion("CM_IMGPATH =", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHNotEqualTo(String value) {
            addCriterion("CM_IMGPATH <>", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHGreaterThan(String value) {
            addCriterion("CM_IMGPATH >", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATH >=", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHLessThan(String value) {
            addCriterion("CM_IMGPATH <", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATH <=", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHLike(String value) {
            addCriterion("CM_IMGPATH like", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHNotLike(String value) {
            addCriterion("CM_IMGPATH not like", value, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHIn(List<String> values) {
            addCriterion("CM_IMGPATH in", values, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHNotIn(List<String> values) {
            addCriterion("CM_IMGPATH not in", values, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHBetween(String value1, String value2) {
            addCriterion("CM_IMGPATH between", value1, value2, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHNotBetween(String value1, String value2) {
            addCriterion("CM_IMGPATH not between", value1, value2, "CM_IMGPATH");
            return (Criteria) this;
        }

        public Criteria andCM_SORTIsNull() {
            addCriterion("CM_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCM_SORTIsNotNull() {
            addCriterion("CM_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SORTEqualTo(Integer value) {
            addCriterion("CM_SORT =", value, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTNotEqualTo(Integer value) {
            addCriterion("CM_SORT <>", value, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTGreaterThan(Integer value) {
            addCriterion("CM_SORT >", value, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SORT >=", value, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTLessThan(Integer value) {
            addCriterion("CM_SORT <", value, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SORT <=", value, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTIn(List<Integer> values) {
            addCriterion("CM_SORT in", values, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTNotIn(List<Integer> values) {
            addCriterion("CM_SORT not in", values, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTBetween(Integer value1, Integer value2) {
            addCriterion("CM_SORT between", value1, value2, "CM_SORT");
            return (Criteria) this;
        }

        public Criteria andCM_SORTNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SORT not between", value1, value2, "CM_SORT");
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