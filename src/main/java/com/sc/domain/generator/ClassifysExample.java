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

        public Criteria andCmClassifyidIsNull() {
            addCriterion("CM_CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidIsNotNull() {
            addCriterion("CM_CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID =", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidNotEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <>", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidGreaterThan(Integer value) {
            addCriterion("CM_CLASSIFYID >", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID >=", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidLessThan(Integer value) {
            addCriterion("CM_CLASSIFYID <", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <=", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID in", values, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidNotIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID not in", values, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID between", value1, value2, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID not between", value1, value2, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameIsNull() {
            addCriterion("CM_CLASSIFYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameIsNotNull() {
            addCriterion("CM_CLASSIFYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME =", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameNotEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME <>", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameGreaterThan(String value) {
            addCriterion("CM_CLASSIFYNAME >", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME >=", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameLessThan(String value) {
            addCriterion("CM_CLASSIFYNAME <", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameLessThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYNAME <=", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameLike(String value) {
            addCriterion("CM_CLASSIFYNAME like", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameNotLike(String value) {
            addCriterion("CM_CLASSIFYNAME not like", value, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameIn(List<String> values) {
            addCriterion("CM_CLASSIFYNAME in", values, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameNotIn(List<String> values) {
            addCriterion("CM_CLASSIFYNAME not in", values, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYNAME between", value1, value2, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmClassifynameNotBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYNAME not between", value1, value2, "cmClassifyname");
            return (Criteria) this;
        }

        public Criteria andCmParentidIsNull() {
            addCriterion("CM_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andCmParentidIsNotNull() {
            addCriterion("CM_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCmParentidEqualTo(Integer value) {
            addCriterion("CM_PARENTID =", value, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidNotEqualTo(Integer value) {
            addCriterion("CM_PARENTID <>", value, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidGreaterThan(Integer value) {
            addCriterion("CM_PARENTID >", value, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PARENTID >=", value, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidLessThan(Integer value) {
            addCriterion("CM_PARENTID <", value, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PARENTID <=", value, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidIn(List<Integer> values) {
            addCriterion("CM_PARENTID in", values, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidNotIn(List<Integer> values) {
            addCriterion("CM_PARENTID not in", values, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidBetween(Integer value1, Integer value2) {
            addCriterion("CM_PARENTID between", value1, value2, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PARENTID not between", value1, value2, "cmParentid");
            return (Criteria) this;
        }

        public Criteria andCmImgpathIsNull() {
            addCriterion("CM_IMGPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmImgpathIsNotNull() {
            addCriterion("CM_IMGPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmImgpathEqualTo(String value) {
            addCriterion("CM_IMGPATH =", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathNotEqualTo(String value) {
            addCriterion("CM_IMGPATH <>", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathGreaterThan(String value) {
            addCriterion("CM_IMGPATH >", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATH >=", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathLessThan(String value) {
            addCriterion("CM_IMGPATH <", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathLessThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATH <=", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathLike(String value) {
            addCriterion("CM_IMGPATH like", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathNotLike(String value) {
            addCriterion("CM_IMGPATH not like", value, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathIn(List<String> values) {
            addCriterion("CM_IMGPATH in", values, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathNotIn(List<String> values) {
            addCriterion("CM_IMGPATH not in", values, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathBetween(String value1, String value2) {
            addCriterion("CM_IMGPATH between", value1, value2, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmImgpathNotBetween(String value1, String value2) {
            addCriterion("CM_IMGPATH not between", value1, value2, "cmImgpath");
            return (Criteria) this;
        }

        public Criteria andCmSortIsNull() {
            addCriterion("CM_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCmSortIsNotNull() {
            addCriterion("CM_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCmSortEqualTo(Integer value) {
            addCriterion("CM_SORT =", value, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortNotEqualTo(Integer value) {
            addCriterion("CM_SORT <>", value, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortGreaterThan(Integer value) {
            addCriterion("CM_SORT >", value, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SORT >=", value, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortLessThan(Integer value) {
            addCriterion("CM_SORT <", value, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SORT <=", value, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortIn(List<Integer> values) {
            addCriterion("CM_SORT in", values, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortNotIn(List<Integer> values) {
            addCriterion("CM_SORT not in", values, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortBetween(Integer value1, Integer value2) {
            addCriterion("CM_SORT between", value1, value2, "cmSort");
            return (Criteria) this;
        }

        public Criteria andCmSortNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SORT not between", value1, value2, "cmSort");
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