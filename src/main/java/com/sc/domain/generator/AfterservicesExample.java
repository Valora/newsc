package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AfterservicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AfterservicesExample() {
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

        public Criteria andCM_SELLERIDIsNull() {
            addCriterion("CM_SELLERID is null");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDIsNotNull() {
            addCriterion("CM_SELLERID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDEqualTo(String value) {
            addCriterion("CM_SELLERID =", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotEqualTo(String value) {
            addCriterion("CM_SELLERID <>", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDGreaterThan(String value) {
            addCriterion("CM_SELLERID >", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SELLERID >=", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDLessThan(String value) {
            addCriterion("CM_SELLERID <", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDLessThanOrEqualTo(String value) {
            addCriterion("CM_SELLERID <=", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDLike(String value) {
            addCriterion("CM_SELLERID like", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotLike(String value) {
            addCriterion("CM_SELLERID not like", value, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDIn(List<String> values) {
            addCriterion("CM_SELLERID in", values, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotIn(List<String> values) {
            addCriterion("CM_SELLERID not in", values, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDBetween(String value1, String value2) {
            addCriterion("CM_SELLERID between", value1, value2, "CM_SELLERID");
            return (Criteria) this;
        }

        public Criteria andCM_SELLERIDNotBetween(String value1, String value2) {
            addCriterion("CM_SELLERID not between", value1, value2, "CM_SELLERID");
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

        public Criteria andCM_ORDERDETAILSIDIsNull() {
            addCriterion("CM_ORDERDETAILSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDIsNotNull() {
            addCriterion("CM_ORDERDETAILSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID =", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID <>", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDGreaterThan(String value) {
            addCriterion("CM_ORDERDETAILSID >", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID >=", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDLessThan(String value) {
            addCriterion("CM_ORDERDETAILSID <", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDLessThanOrEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID <=", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDLike(String value) {
            addCriterion("CM_ORDERDETAILSID like", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotLike(String value) {
            addCriterion("CM_ORDERDETAILSID not like", value, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDIn(List<String> values) {
            addCriterion("CM_ORDERDETAILSID in", values, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotIn(List<String> values) {
            addCriterion("CM_ORDERDETAILSID not in", values, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDBetween(String value1, String value2) {
            addCriterion("CM_ORDERDETAILSID between", value1, value2, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_ORDERDETAILSIDNotBetween(String value1, String value2) {
            addCriterion("CM_ORDERDETAILSID not between", value1, value2, "CM_ORDERDETAILSID");
            return (Criteria) this;
        }

        public Criteria andCM_REASONIsNull() {
            addCriterion("CM_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCM_REASONIsNotNull() {
            addCriterion("CM_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCM_REASONEqualTo(String value) {
            addCriterion("CM_REASON =", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONNotEqualTo(String value) {
            addCriterion("CM_REASON <>", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONGreaterThan(String value) {
            addCriterion("CM_REASON >", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REASON >=", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONLessThan(String value) {
            addCriterion("CM_REASON <", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONLessThanOrEqualTo(String value) {
            addCriterion("CM_REASON <=", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONLike(String value) {
            addCriterion("CM_REASON like", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONNotLike(String value) {
            addCriterion("CM_REASON not like", value, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONIn(List<String> values) {
            addCriterion("CM_REASON in", values, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONNotIn(List<String> values) {
            addCriterion("CM_REASON not in", values, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONBetween(String value1, String value2) {
            addCriterion("CM_REASON between", value1, value2, "CM_REASON");
            return (Criteria) this;
        }

        public Criteria andCM_REASONNotBetween(String value1, String value2) {
            addCriterion("CM_REASON not between", value1, value2, "CM_REASON");
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

        public Criteria andCM_STATEIsNull() {
            addCriterion("CM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCM_STATEIsNotNull() {
            addCriterion("CM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_STATEEqualTo(Integer value) {
            addCriterion("CM_STATE =", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATENotEqualTo(Integer value) {
            addCriterion("CM_STATE <>", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEGreaterThan(Integer value) {
            addCriterion("CM_STATE >", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE >=", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATELessThan(Integer value) {
            addCriterion("CM_STATE <", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATELessThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE <=", value, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEIn(List<Integer> values) {
            addCriterion("CM_STATE in", values, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATENotIn(List<Integer> values) {
            addCriterion("CM_STATE not in", values, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATEBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE between", value1, value2, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_STATENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE not between", value1, value2, "CM_STATE");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSIsNull() {
            addCriterion("CM_IMGPATHS is null");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSIsNotNull() {
            addCriterion("CM_IMGPATHS is not null");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSEqualTo(String value) {
            addCriterion("CM_IMGPATHS =", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSNotEqualTo(String value) {
            addCriterion("CM_IMGPATHS <>", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSGreaterThan(String value) {
            addCriterion("CM_IMGPATHS >", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSGreaterThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATHS >=", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSLessThan(String value) {
            addCriterion("CM_IMGPATHS <", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSLessThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATHS <=", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSLike(String value) {
            addCriterion("CM_IMGPATHS like", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSNotLike(String value) {
            addCriterion("CM_IMGPATHS not like", value, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSIn(List<String> values) {
            addCriterion("CM_IMGPATHS in", values, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSNotIn(List<String> values) {
            addCriterion("CM_IMGPATHS not in", values, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSBetween(String value1, String value2) {
            addCriterion("CM_IMGPATHS between", value1, value2, "CM_IMGPATHS");
            return (Criteria) this;
        }

        public Criteria andCM_IMGPATHSNotBetween(String value1, String value2) {
            addCriterion("CM_IMGPATHS not between", value1, value2, "CM_IMGPATHS");
            return (Criteria) this;
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