package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticesExample() {
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

        public Criteria andCmNoticeiidIsNull() {
            addCriterion("CM_NOTICEIID is null");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidIsNotNull() {
            addCriterion("CM_NOTICEIID is not null");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID =", value, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidNotEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID <>", value, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidGreaterThan(Integer value) {
            addCriterion("CM_NOTICEIID >", value, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID >=", value, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidLessThan(Integer value) {
            addCriterion("CM_NOTICEIID <", value, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID <=", value, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidIn(List<Integer> values) {
            addCriterion("CM_NOTICEIID in", values, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidNotIn(List<Integer> values) {
            addCriterion("CM_NOTICEIID not in", values, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidBetween(Integer value1, Integer value2) {
            addCriterion("CM_NOTICEIID between", value1, value2, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmNoticeiidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_NOTICEIID not between", value1, value2, "cmNoticeiid");
            return (Criteria) this;
        }

        public Criteria andCmTitleIsNull() {
            addCriterion("CM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCmTitleIsNotNull() {
            addCriterion("CM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTitleEqualTo(String value) {
            addCriterion("CM_TITLE =", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotEqualTo(String value) {
            addCriterion("CM_TITLE <>", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleGreaterThan(String value) {
            addCriterion("CM_TITLE >", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TITLE >=", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleLessThan(String value) {
            addCriterion("CM_TITLE <", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleLessThanOrEqualTo(String value) {
            addCriterion("CM_TITLE <=", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleLike(String value) {
            addCriterion("CM_TITLE like", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotLike(String value) {
            addCriterion("CM_TITLE not like", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleIn(List<String> values) {
            addCriterion("CM_TITLE in", values, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotIn(List<String> values) {
            addCriterion("CM_TITLE not in", values, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleBetween(String value1, String value2) {
            addCriterion("CM_TITLE between", value1, value2, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotBetween(String value1, String value2) {
            addCriterion("CM_TITLE not between", value1, value2, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmContentIsNull() {
            addCriterion("CM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCmContentIsNotNull() {
            addCriterion("CM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCmContentEqualTo(String value) {
            addCriterion("CM_CONTENT =", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotEqualTo(String value) {
            addCriterion("CM_CONTENT <>", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentGreaterThan(String value) {
            addCriterion("CM_CONTENT >", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CONTENT >=", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentLessThan(String value) {
            addCriterion("CM_CONTENT <", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentLessThanOrEqualTo(String value) {
            addCriterion("CM_CONTENT <=", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentLike(String value) {
            addCriterion("CM_CONTENT like", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotLike(String value) {
            addCriterion("CM_CONTENT not like", value, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentIn(List<String> values) {
            addCriterion("CM_CONTENT in", values, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotIn(List<String> values) {
            addCriterion("CM_CONTENT not in", values, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentBetween(String value1, String value2) {
            addCriterion("CM_CONTENT between", value1, value2, "cmContent");
            return (Criteria) this;
        }

        public Criteria andCmContentNotBetween(String value1, String value2) {
            addCriterion("CM_CONTENT not between", value1, value2, "cmContent");
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

        public Criteria andCmCreatorIsNull() {
            addCriterion("CM_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCmCreatorIsNotNull() {
            addCriterion("CM_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCmCreatorEqualTo(String value) {
            addCriterion("CM_CREATOR =", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorNotEqualTo(String value) {
            addCriterion("CM_CREATOR <>", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorGreaterThan(String value) {
            addCriterion("CM_CREATOR >", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CREATOR >=", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorLessThan(String value) {
            addCriterion("CM_CREATOR <", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorLessThanOrEqualTo(String value) {
            addCriterion("CM_CREATOR <=", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorLike(String value) {
            addCriterion("CM_CREATOR like", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorNotLike(String value) {
            addCriterion("CM_CREATOR not like", value, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorIn(List<String> values) {
            addCriterion("CM_CREATOR in", values, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorNotIn(List<String> values) {
            addCriterion("CM_CREATOR not in", values, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorBetween(String value1, String value2) {
            addCriterion("CM_CREATOR between", value1, value2, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmCreatorNotBetween(String value1, String value2) {
            addCriterion("CM_CREATOR not between", value1, value2, "cmCreator");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineIsNull() {
            addCriterion("CM_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineIsNotNull() {
            addCriterion("CM_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineEqualTo(Date value) {
            addCriterion("CM_DEADLINE =", value, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineNotEqualTo(Date value) {
            addCriterion("CM_DEADLINE <>", value, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineGreaterThan(Date value) {
            addCriterion("CM_DEADLINE >", value, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_DEADLINE >=", value, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineLessThan(Date value) {
            addCriterion("CM_DEADLINE <", value, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("CM_DEADLINE <=", value, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineIn(List<Date> values) {
            addCriterion("CM_DEADLINE in", values, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineNotIn(List<Date> values) {
            addCriterion("CM_DEADLINE not in", values, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineBetween(Date value1, Date value2) {
            addCriterion("CM_DEADLINE between", value1, value2, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("CM_DEADLINE not between", value1, value2, "cmDeadline");
            return (Criteria) this;
        }

        public Criteria andCmAdminidIsNull() {
            addCriterion("CM_ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andCmAdminidIsNotNull() {
            addCriterion("CM_ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andCmAdminidEqualTo(String value) {
            addCriterion("CM_ADMINID =", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotEqualTo(String value) {
            addCriterion("CM_ADMINID <>", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidGreaterThan(String value) {
            addCriterion("CM_ADMINID >", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID >=", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidLessThan(String value) {
            addCriterion("CM_ADMINID <", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidLessThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID <=", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidLike(String value) {
            addCriterion("CM_ADMINID like", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotLike(String value) {
            addCriterion("CM_ADMINID not like", value, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidIn(List<String> values) {
            addCriterion("CM_ADMINID in", values, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotIn(List<String> values) {
            addCriterion("CM_ADMINID not in", values, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidBetween(String value1, String value2) {
            addCriterion("CM_ADMINID between", value1, value2, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmAdminidNotBetween(String value1, String value2) {
            addCriterion("CM_ADMINID not between", value1, value2, "cmAdminid");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeIsNull() {
            addCriterion("CM_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeIsNotNull() {
            addCriterion("CM_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeEqualTo(Date value) {
            addCriterion("CM_CREATETIME =", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeNotEqualTo(Date value) {
            addCriterion("CM_CREATETIME <>", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeGreaterThan(Date value) {
            addCriterion("CM_CREATETIME >", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME >=", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeLessThan(Date value) {
            addCriterion("CM_CREATETIME <", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME <=", value, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeIn(List<Date> values) {
            addCriterion("CM_CREATETIME in", values, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeNotIn(List<Date> values) {
            addCriterion("CM_CREATETIME not in", values, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME between", value1, value2, "cmCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME not between", value1, value2, "cmCreatetime");
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