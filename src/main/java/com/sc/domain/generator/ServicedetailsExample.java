package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicedetailsExample() {
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

        public Criteria andCmSvidIsNull() {
            addCriterion("CM_SVID is null");
            return (Criteria) this;
        }

        public Criteria andCmSvidIsNotNull() {
            addCriterion("CM_SVID is not null");
            return (Criteria) this;
        }

        public Criteria andCmSvidEqualTo(String value) {
            addCriterion("CM_SVID =", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidNotEqualTo(String value) {
            addCriterion("CM_SVID <>", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidGreaterThan(String value) {
            addCriterion("CM_SVID >", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SVID >=", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidLessThan(String value) {
            addCriterion("CM_SVID <", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidLessThanOrEqualTo(String value) {
            addCriterion("CM_SVID <=", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidLike(String value) {
            addCriterion("CM_SVID like", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidNotLike(String value) {
            addCriterion("CM_SVID not like", value, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidIn(List<String> values) {
            addCriterion("CM_SVID in", values, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidNotIn(List<String> values) {
            addCriterion("CM_SVID not in", values, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidBetween(String value1, String value2) {
            addCriterion("CM_SVID between", value1, value2, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmSvidNotBetween(String value1, String value2) {
            addCriterion("CM_SVID not between", value1, value2, "cmSvid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidIsNull() {
            addCriterion("CM_AFTERSERVICEID is null");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidIsNotNull() {
            addCriterion("CM_AFTERSERVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID =", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidNotEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID <>", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidGreaterThan(String value) {
            addCriterion("CM_AFTERSERVICEID >", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID >=", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidLessThan(String value) {
            addCriterion("CM_AFTERSERVICEID <", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidLessThanOrEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID <=", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidLike(String value) {
            addCriterion("CM_AFTERSERVICEID like", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidNotLike(String value) {
            addCriterion("CM_AFTERSERVICEID not like", value, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidIn(List<String> values) {
            addCriterion("CM_AFTERSERVICEID in", values, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidNotIn(List<String> values) {
            addCriterion("CM_AFTERSERVICEID not in", values, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidBetween(String value1, String value2) {
            addCriterion("CM_AFTERSERVICEID between", value1, value2, "cmAfterserviceid");
            return (Criteria) this;
        }

        public Criteria andCmAfterserviceidNotBetween(String value1, String value2) {
            addCriterion("CM_AFTERSERVICEID not between", value1, value2, "cmAfterserviceid");
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

        public Criteria andCmTypeIsNull() {
            addCriterion("CM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCmTypeIsNotNull() {
            addCriterion("CM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTypeEqualTo(Integer value) {
            addCriterion("CM_TYPE =", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotEqualTo(Integer value) {
            addCriterion("CM_TYPE <>", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeGreaterThan(Integer value) {
            addCriterion("CM_TYPE >", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_TYPE >=", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLessThan(Integer value) {
            addCriterion("CM_TYPE <", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CM_TYPE <=", value, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeIn(List<Integer> values) {
            addCriterion("CM_TYPE in", values, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotIn(List<Integer> values) {
            addCriterion("CM_TYPE not in", values, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeBetween(Integer value1, Integer value2) {
            addCriterion("CM_TYPE between", value1, value2, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_TYPE not between", value1, value2, "cmType");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumIsNull() {
            addCriterion("CM_LOGISTICSNUM is null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumIsNotNull() {
            addCriterion("CM_LOGISTICSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM =", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumNotEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM <>", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumGreaterThan(String value) {
            addCriterion("CM_LOGISTICSNUM >", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM >=", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumLessThan(String value) {
            addCriterion("CM_LOGISTICSNUM <", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumLessThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM <=", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumLike(String value) {
            addCriterion("CM_LOGISTICSNUM like", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumNotLike(String value) {
            addCriterion("CM_LOGISTICSNUM not like", value, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumIn(List<String> values) {
            addCriterion("CM_LOGISTICSNUM in", values, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumNotIn(List<String> values) {
            addCriterion("CM_LOGISTICSNUM not in", values, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNUM between", value1, value2, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsnumNotBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNUM not between", value1, value2, "cmLogisticsnum");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidIsNull() {
            addCriterion("CM_LOGISTICSID is null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidIsNotNull() {
            addCriterion("CM_LOGISTICSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID =", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidNotEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <>", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidGreaterThan(Integer value) {
            addCriterion("CM_LOGISTICSID >", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID >=", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidLessThan(Integer value) {
            addCriterion("CM_LOGISTICSID <", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <=", value, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID in", values, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidNotIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID not in", values, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID between", value1, value2, "cmLogisticsid");
            return (Criteria) this;
        }

        public Criteria andCmLogisticsidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID not between", value1, value2, "cmLogisticsid");
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