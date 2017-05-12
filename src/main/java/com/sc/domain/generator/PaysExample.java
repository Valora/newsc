package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaysExample() {
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

        public Criteria andCmPayidIsNull() {
            addCriterion("CM_PAYID is null");
            return (Criteria) this;
        }

        public Criteria andCmPayidIsNotNull() {
            addCriterion("CM_PAYID is not null");
            return (Criteria) this;
        }

        public Criteria andCmPayidEqualTo(Integer value) {
            addCriterion("CM_PAYID =", value, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidNotEqualTo(Integer value) {
            addCriterion("CM_PAYID <>", value, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidGreaterThan(Integer value) {
            addCriterion("CM_PAYID >", value, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYID >=", value, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidLessThan(Integer value) {
            addCriterion("CM_PAYID <", value, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYID <=", value, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidIn(List<Integer> values) {
            addCriterion("CM_PAYID in", values, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidNotIn(List<Integer> values) {
            addCriterion("CM_PAYID not in", values, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYID between", value1, value2, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmPayidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYID not between", value1, value2, "cmPayid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidIsNull() {
            addCriterion("CM_ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andCmOrderidIsNotNull() {
            addCriterion("CM_ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andCmOrderidEqualTo(String value) {
            addCriterion("CM_ORDERID =", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotEqualTo(String value) {
            addCriterion("CM_ORDERID <>", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidGreaterThan(String value) {
            addCriterion("CM_ORDERID >", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ORDERID >=", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidLessThan(String value) {
            addCriterion("CM_ORDERID <", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidLessThanOrEqualTo(String value) {
            addCriterion("CM_ORDERID <=", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidLike(String value) {
            addCriterion("CM_ORDERID like", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotLike(String value) {
            addCriterion("CM_ORDERID not like", value, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidIn(List<String> values) {
            addCriterion("CM_ORDERID in", values, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotIn(List<String> values) {
            addCriterion("CM_ORDERID not in", values, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidBetween(String value1, String value2) {
            addCriterion("CM_ORDERID between", value1, value2, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmOrderidNotBetween(String value1, String value2) {
            addCriterion("CM_ORDERID not between", value1, value2, "cmOrderid");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonIsNull() {
            addCriterion("CM_PAYJSON is null");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonIsNotNull() {
            addCriterion("CM_PAYJSON is not null");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonEqualTo(String value) {
            addCriterion("CM_PAYJSON =", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonNotEqualTo(String value) {
            addCriterion("CM_PAYJSON <>", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonGreaterThan(String value) {
            addCriterion("CM_PAYJSON >", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PAYJSON >=", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonLessThan(String value) {
            addCriterion("CM_PAYJSON <", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonLessThanOrEqualTo(String value) {
            addCriterion("CM_PAYJSON <=", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonLike(String value) {
            addCriterion("CM_PAYJSON like", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonNotLike(String value) {
            addCriterion("CM_PAYJSON not like", value, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonIn(List<String> values) {
            addCriterion("CM_PAYJSON in", values, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonNotIn(List<String> values) {
            addCriterion("CM_PAYJSON not in", values, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonBetween(String value1, String value2) {
            addCriterion("CM_PAYJSON between", value1, value2, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmPayjsonNotBetween(String value1, String value2) {
            addCriterion("CM_PAYJSON not between", value1, value2, "cmPayjson");
            return (Criteria) this;
        }

        public Criteria andCmTimeIsNull() {
            addCriterion("CM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCmTimeIsNotNull() {
            addCriterion("CM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmTimeEqualTo(Date value) {
            addCriterion("CM_TIME =", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotEqualTo(Date value) {
            addCriterion("CM_TIME <>", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeGreaterThan(Date value) {
            addCriterion("CM_TIME >", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_TIME >=", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeLessThan(Date value) {
            addCriterion("CM_TIME <", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CM_TIME <=", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeIn(List<Date> values) {
            addCriterion("CM_TIME in", values, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotIn(List<Date> values) {
            addCriterion("CM_TIME not in", values, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeBetween(Date value1, Date value2) {
            addCriterion("CM_TIME between", value1, value2, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CM_TIME not between", value1, value2, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeIsNull() {
            addCriterion("CM_PAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeIsNotNull() {
            addCriterion("CM_PAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE =", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeNotEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE <>", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeGreaterThan(Integer value) {
            addCriterion("CM_PAYTYPE >", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE >=", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeLessThan(Integer value) {
            addCriterion("CM_PAYTYPE <", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("CM_PAYTYPE <=", value, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeIn(List<Integer> values) {
            addCriterion("CM_PAYTYPE in", values, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeNotIn(List<Integer> values) {
            addCriterion("CM_PAYTYPE not in", values, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYTYPE between", value1, value2, "cmPaytype");
            return (Criteria) this;
        }

        public Criteria andCmPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_PAYTYPE not between", value1, value2, "cmPaytype");
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