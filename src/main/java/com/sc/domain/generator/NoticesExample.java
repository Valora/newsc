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

        public Criteria andCM_NOTICEIIDIsNull() {
            addCriterion("CM_NOTICEIID is null");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDIsNotNull() {
            addCriterion("CM_NOTICEIID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID =", value, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDNotEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID <>", value, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDGreaterThan(Integer value) {
            addCriterion("CM_NOTICEIID >", value, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID >=", value, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDLessThan(Integer value) {
            addCriterion("CM_NOTICEIID <", value, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_NOTICEIID <=", value, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDIn(List<Integer> values) {
            addCriterion("CM_NOTICEIID in", values, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDNotIn(List<Integer> values) {
            addCriterion("CM_NOTICEIID not in", values, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_NOTICEIID between", value1, value2, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_NOTICEIIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_NOTICEIID not between", value1, value2, "CM_NOTICEIID");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEIsNull() {
            addCriterion("CM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEIsNotNull() {
            addCriterion("CM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEEqualTo(String value) {
            addCriterion("CM_TITLE =", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotEqualTo(String value) {
            addCriterion("CM_TITLE <>", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEGreaterThan(String value) {
            addCriterion("CM_TITLE >", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TITLE >=", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLELessThan(String value) {
            addCriterion("CM_TITLE <", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLELessThanOrEqualTo(String value) {
            addCriterion("CM_TITLE <=", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLELike(String value) {
            addCriterion("CM_TITLE like", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotLike(String value) {
            addCriterion("CM_TITLE not like", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEIn(List<String> values) {
            addCriterion("CM_TITLE in", values, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotIn(List<String> values) {
            addCriterion("CM_TITLE not in", values, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEBetween(String value1, String value2) {
            addCriterion("CM_TITLE between", value1, value2, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotBetween(String value1, String value2) {
            addCriterion("CM_TITLE not between", value1, value2, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTIsNull() {
            addCriterion("CM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTIsNotNull() {
            addCriterion("CM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTEqualTo(String value) {
            addCriterion("CM_CONTENT =", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTNotEqualTo(String value) {
            addCriterion("CM_CONTENT <>", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTGreaterThan(String value) {
            addCriterion("CM_CONTENT >", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CONTENT >=", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTLessThan(String value) {
            addCriterion("CM_CONTENT <", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTLessThanOrEqualTo(String value) {
            addCriterion("CM_CONTENT <=", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTLike(String value) {
            addCriterion("CM_CONTENT like", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTNotLike(String value) {
            addCriterion("CM_CONTENT not like", value, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTIn(List<String> values) {
            addCriterion("CM_CONTENT in", values, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTNotIn(List<String> values) {
            addCriterion("CM_CONTENT not in", values, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTBetween(String value1, String value2) {
            addCriterion("CM_CONTENT between", value1, value2, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_CONTENTNotBetween(String value1, String value2) {
            addCriterion("CM_CONTENT not between", value1, value2, "CM_CONTENT");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERIsNull() {
            addCriterion("CM_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERIsNotNull() {
            addCriterion("CM_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andCM_OTHEREqualTo(String value) {
            addCriterion("CM_OTHER =", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotEqualTo(String value) {
            addCriterion("CM_OTHER <>", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERGreaterThan(String value) {
            addCriterion("CM_OTHER >", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERGreaterThanOrEqualTo(String value) {
            addCriterion("CM_OTHER >=", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERLessThan(String value) {
            addCriterion("CM_OTHER <", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERLessThanOrEqualTo(String value) {
            addCriterion("CM_OTHER <=", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERLike(String value) {
            addCriterion("CM_OTHER like", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotLike(String value) {
            addCriterion("CM_OTHER not like", value, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERIn(List<String> values) {
            addCriterion("CM_OTHER in", values, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotIn(List<String> values) {
            addCriterion("CM_OTHER not in", values, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERBetween(String value1, String value2) {
            addCriterion("CM_OTHER between", value1, value2, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_OTHERNotBetween(String value1, String value2) {
            addCriterion("CM_OTHER not between", value1, value2, "CM_OTHER");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORIsNull() {
            addCriterion("CM_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORIsNotNull() {
            addCriterion("CM_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CREATOREqualTo(String value) {
            addCriterion("CM_CREATOR =", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORNotEqualTo(String value) {
            addCriterion("CM_CREATOR <>", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORGreaterThan(String value) {
            addCriterion("CM_CREATOR >", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CREATOR >=", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORLessThan(String value) {
            addCriterion("CM_CREATOR <", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORLessThanOrEqualTo(String value) {
            addCriterion("CM_CREATOR <=", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORLike(String value) {
            addCriterion("CM_CREATOR like", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORNotLike(String value) {
            addCriterion("CM_CREATOR not like", value, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORIn(List<String> values) {
            addCriterion("CM_CREATOR in", values, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORNotIn(List<String> values) {
            addCriterion("CM_CREATOR not in", values, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORBetween(String value1, String value2) {
            addCriterion("CM_CREATOR between", value1, value2, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_CREATORNotBetween(String value1, String value2) {
            addCriterion("CM_CREATOR not between", value1, value2, "CM_CREATOR");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEIsNull() {
            addCriterion("CM_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEIsNotNull() {
            addCriterion("CM_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEEqualTo(Date value) {
            addCriterion("CM_DEADLINE =", value, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINENotEqualTo(Date value) {
            addCriterion("CM_DEADLINE <>", value, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEGreaterThan(Date value) {
            addCriterion("CM_DEADLINE >", value, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_DEADLINE >=", value, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINELessThan(Date value) {
            addCriterion("CM_DEADLINE <", value, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINELessThanOrEqualTo(Date value) {
            addCriterion("CM_DEADLINE <=", value, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEIn(List<Date> values) {
            addCriterion("CM_DEADLINE in", values, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINENotIn(List<Date> values) {
            addCriterion("CM_DEADLINE not in", values, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINEBetween(Date value1, Date value2) {
            addCriterion("CM_DEADLINE between", value1, value2, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_DEADLINENotBetween(Date value1, Date value2) {
            addCriterion("CM_DEADLINE not between", value1, value2, "CM_DEADLINE");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDIsNull() {
            addCriterion("CM_ADMINID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDIsNotNull() {
            addCriterion("CM_ADMINID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDEqualTo(String value) {
            addCriterion("CM_ADMINID =", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotEqualTo(String value) {
            addCriterion("CM_ADMINID <>", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDGreaterThan(String value) {
            addCriterion("CM_ADMINID >", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID >=", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDLessThan(String value) {
            addCriterion("CM_ADMINID <", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDLessThanOrEqualTo(String value) {
            addCriterion("CM_ADMINID <=", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDLike(String value) {
            addCriterion("CM_ADMINID like", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotLike(String value) {
            addCriterion("CM_ADMINID not like", value, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDIn(List<String> values) {
            addCriterion("CM_ADMINID in", values, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotIn(List<String> values) {
            addCriterion("CM_ADMINID not in", values, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDBetween(String value1, String value2) {
            addCriterion("CM_ADMINID between", value1, value2, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_ADMINIDNotBetween(String value1, String value2) {
            addCriterion("CM_ADMINID not between", value1, value2, "CM_ADMINID");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEIsNull() {
            addCriterion("CM_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEIsNotNull() {
            addCriterion("CM_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEEqualTo(Date value) {
            addCriterion("CM_CREATETIME =", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMENotEqualTo(Date value) {
            addCriterion("CM_CREATETIME <>", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEGreaterThan(Date value) {
            addCriterion("CM_CREATETIME >", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME >=", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMELessThan(Date value) {
            addCriterion("CM_CREATETIME <", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMELessThanOrEqualTo(Date value) {
            addCriterion("CM_CREATETIME <=", value, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEIn(List<Date> values) {
            addCriterion("CM_CREATETIME in", values, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMENotIn(List<Date> values) {
            addCriterion("CM_CREATETIME not in", values, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMEBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME between", value1, value2, "CM_CREATETIME");
            return (Criteria) this;
        }

        public Criteria andCM_CREATETIMENotBetween(Date value1, Date value2) {
            addCriterion("CM_CREATETIME not between", value1, value2, "CM_CREATETIME");
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