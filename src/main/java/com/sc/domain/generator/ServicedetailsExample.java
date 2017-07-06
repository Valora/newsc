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

        public Criteria andCM_SVIDIsNull() {
            addCriterion("CM_SVID is null");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDIsNotNull() {
            addCriterion("CM_SVID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDEqualTo(String value) {
            addCriterion("CM_SVID =", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDNotEqualTo(String value) {
            addCriterion("CM_SVID <>", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDGreaterThan(String value) {
            addCriterion("CM_SVID >", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SVID >=", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDLessThan(String value) {
            addCriterion("CM_SVID <", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDLessThanOrEqualTo(String value) {
            addCriterion("CM_SVID <=", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDLike(String value) {
            addCriterion("CM_SVID like", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDNotLike(String value) {
            addCriterion("CM_SVID not like", value, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDIn(List<String> values) {
            addCriterion("CM_SVID in", values, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDNotIn(List<String> values) {
            addCriterion("CM_SVID not in", values, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDBetween(String value1, String value2) {
            addCriterion("CM_SVID between", value1, value2, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_SVIDNotBetween(String value1, String value2) {
            addCriterion("CM_SVID not between", value1, value2, "CM_SVID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDIsNull() {
            addCriterion("CM_AFTERSERVICEID is null");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDIsNotNull() {
            addCriterion("CM_AFTERSERVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID =", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDNotEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID <>", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDGreaterThan(String value) {
            addCriterion("CM_AFTERSERVICEID >", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID >=", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDLessThan(String value) {
            addCriterion("CM_AFTERSERVICEID <", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDLessThanOrEqualTo(String value) {
            addCriterion("CM_AFTERSERVICEID <=", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDLike(String value) {
            addCriterion("CM_AFTERSERVICEID like", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDNotLike(String value) {
            addCriterion("CM_AFTERSERVICEID not like", value, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDIn(List<String> values) {
            addCriterion("CM_AFTERSERVICEID in", values, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDNotIn(List<String> values) {
            addCriterion("CM_AFTERSERVICEID not in", values, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDBetween(String value1, String value2) {
            addCriterion("CM_AFTERSERVICEID between", value1, value2, "CM_AFTERSERVICEID");
            return (Criteria) this;
        }

        public Criteria andCM_AFTERSERVICEIDNotBetween(String value1, String value2) {
            addCriterion("CM_AFTERSERVICEID not between", value1, value2, "CM_AFTERSERVICEID");
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

        public Criteria andCM_TYPEIsNull() {
            addCriterion("CM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCM_TYPEIsNotNull() {
            addCriterion("CM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_TYPEEqualTo(Integer value) {
            addCriterion("CM_TYPE =", value, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPENotEqualTo(Integer value) {
            addCriterion("CM_TYPE <>", value, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPEGreaterThan(Integer value) {
            addCriterion("CM_TYPE >", value, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_TYPE >=", value, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPELessThan(Integer value) {
            addCriterion("CM_TYPE <", value, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPELessThanOrEqualTo(Integer value) {
            addCriterion("CM_TYPE <=", value, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPEIn(List<Integer> values) {
            addCriterion("CM_TYPE in", values, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPENotIn(List<Integer> values) {
            addCriterion("CM_TYPE not in", values, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPEBetween(Integer value1, Integer value2) {
            addCriterion("CM_TYPE between", value1, value2, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_TYPENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_TYPE not between", value1, value2, "CM_TYPE");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMIsNull() {
            addCriterion("CM_LOGISTICSNUM is null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMIsNotNull() {
            addCriterion("CM_LOGISTICSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM =", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM <>", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMGreaterThan(String value) {
            addCriterion("CM_LOGISTICSNUM >", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM >=", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMLessThan(String value) {
            addCriterion("CM_LOGISTICSNUM <", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMLessThanOrEqualTo(String value) {
            addCriterion("CM_LOGISTICSNUM <=", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMLike(String value) {
            addCriterion("CM_LOGISTICSNUM like", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotLike(String value) {
            addCriterion("CM_LOGISTICSNUM not like", value, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMIn(List<String> values) {
            addCriterion("CM_LOGISTICSNUM in", values, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotIn(List<String> values) {
            addCriterion("CM_LOGISTICSNUM not in", values, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNUM between", value1, value2, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSNUMNotBetween(String value1, String value2) {
            addCriterion("CM_LOGISTICSNUM not between", value1, value2, "CM_LOGISTICSNUM");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDIsNull() {
            addCriterion("CM_LOGISTICSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDIsNotNull() {
            addCriterion("CM_LOGISTICSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID =", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDNotEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <>", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDGreaterThan(Integer value) {
            addCriterion("CM_LOGISTICSID >", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID >=", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDLessThan(Integer value) {
            addCriterion("CM_LOGISTICSID <", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LOGISTICSID <=", value, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID in", values, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDNotIn(List<Integer> values) {
            addCriterion("CM_LOGISTICSID not in", values, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID between", value1, value2, "CM_LOGISTICSID");
            return (Criteria) this;
        }

        public Criteria andCM_LOGISTICSIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LOGISTICSID not between", value1, value2, "CM_LOGISTICSID");
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