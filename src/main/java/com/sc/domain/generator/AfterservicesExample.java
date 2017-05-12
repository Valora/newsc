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

        public Criteria andCmSelleridIsNull() {
            addCriterion("CM_SELLERID is null");
            return (Criteria) this;
        }

        public Criteria andCmSelleridIsNotNull() {
            addCriterion("CM_SELLERID is not null");
            return (Criteria) this;
        }

        public Criteria andCmSelleridEqualTo(String value) {
            addCriterion("CM_SELLERID =", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridNotEqualTo(String value) {
            addCriterion("CM_SELLERID <>", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridGreaterThan(String value) {
            addCriterion("CM_SELLERID >", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SELLERID >=", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridLessThan(String value) {
            addCriterion("CM_SELLERID <", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridLessThanOrEqualTo(String value) {
            addCriterion("CM_SELLERID <=", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridLike(String value) {
            addCriterion("CM_SELLERID like", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridNotLike(String value) {
            addCriterion("CM_SELLERID not like", value, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridIn(List<String> values) {
            addCriterion("CM_SELLERID in", values, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridNotIn(List<String> values) {
            addCriterion("CM_SELLERID not in", values, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridBetween(String value1, String value2) {
            addCriterion("CM_SELLERID between", value1, value2, "cmSellerid");
            return (Criteria) this;
        }

        public Criteria andCmSelleridNotBetween(String value1, String value2) {
            addCriterion("CM_SELLERID not between", value1, value2, "cmSellerid");
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

        public Criteria andCmUseridIsNull() {
            addCriterion("CM_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCmUseridIsNotNull() {
            addCriterion("CM_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCmUseridEqualTo(String value) {
            addCriterion("CM_USERID =", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotEqualTo(String value) {
            addCriterion("CM_USERID <>", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridGreaterThan(String value) {
            addCriterion("CM_USERID >", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CM_USERID >=", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridLessThan(String value) {
            addCriterion("CM_USERID <", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridLessThanOrEqualTo(String value) {
            addCriterion("CM_USERID <=", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridLike(String value) {
            addCriterion("CM_USERID like", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotLike(String value) {
            addCriterion("CM_USERID not like", value, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridIn(List<String> values) {
            addCriterion("CM_USERID in", values, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotIn(List<String> values) {
            addCriterion("CM_USERID not in", values, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridBetween(String value1, String value2) {
            addCriterion("CM_USERID between", value1, value2, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmUseridNotBetween(String value1, String value2) {
            addCriterion("CM_USERID not between", value1, value2, "cmUserid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidIsNull() {
            addCriterion("CM_ORDERDETAILSID is null");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidIsNotNull() {
            addCriterion("CM_ORDERDETAILSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID =", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidNotEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID <>", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidGreaterThan(String value) {
            addCriterion("CM_ORDERDETAILSID >", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID >=", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidLessThan(String value) {
            addCriterion("CM_ORDERDETAILSID <", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidLessThanOrEqualTo(String value) {
            addCriterion("CM_ORDERDETAILSID <=", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidLike(String value) {
            addCriterion("CM_ORDERDETAILSID like", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidNotLike(String value) {
            addCriterion("CM_ORDERDETAILSID not like", value, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidIn(List<String> values) {
            addCriterion("CM_ORDERDETAILSID in", values, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidNotIn(List<String> values) {
            addCriterion("CM_ORDERDETAILSID not in", values, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidBetween(String value1, String value2) {
            addCriterion("CM_ORDERDETAILSID between", value1, value2, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmOrderdetailsidNotBetween(String value1, String value2) {
            addCriterion("CM_ORDERDETAILSID not between", value1, value2, "cmOrderdetailsid");
            return (Criteria) this;
        }

        public Criteria andCmReasonIsNull() {
            addCriterion("CM_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCmReasonIsNotNull() {
            addCriterion("CM_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCmReasonEqualTo(String value) {
            addCriterion("CM_REASON =", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonNotEqualTo(String value) {
            addCriterion("CM_REASON <>", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonGreaterThan(String value) {
            addCriterion("CM_REASON >", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CM_REASON >=", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonLessThan(String value) {
            addCriterion("CM_REASON <", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonLessThanOrEqualTo(String value) {
            addCriterion("CM_REASON <=", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonLike(String value) {
            addCriterion("CM_REASON like", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonNotLike(String value) {
            addCriterion("CM_REASON not like", value, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonIn(List<String> values) {
            addCriterion("CM_REASON in", values, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonNotIn(List<String> values) {
            addCriterion("CM_REASON not in", values, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonBetween(String value1, String value2) {
            addCriterion("CM_REASON between", value1, value2, "cmReason");
            return (Criteria) this;
        }

        public Criteria andCmReasonNotBetween(String value1, String value2) {
            addCriterion("CM_REASON not between", value1, value2, "cmReason");
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

        public Criteria andCmStateIsNull() {
            addCriterion("CM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCmStateIsNotNull() {
            addCriterion("CM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmStateEqualTo(Integer value) {
            addCriterion("CM_STATE =", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotEqualTo(Integer value) {
            addCriterion("CM_STATE <>", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateGreaterThan(Integer value) {
            addCriterion("CM_STATE >", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE >=", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateLessThan(Integer value) {
            addCriterion("CM_STATE <", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateLessThanOrEqualTo(Integer value) {
            addCriterion("CM_STATE <=", value, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateIn(List<Integer> values) {
            addCriterion("CM_STATE in", values, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotIn(List<Integer> values) {
            addCriterion("CM_STATE not in", values, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE between", value1, value2, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_STATE not between", value1, value2, "cmState");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsIsNull() {
            addCriterion("CM_IMGPATHS is null");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsIsNotNull() {
            addCriterion("CM_IMGPATHS is not null");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsEqualTo(String value) {
            addCriterion("CM_IMGPATHS =", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsNotEqualTo(String value) {
            addCriterion("CM_IMGPATHS <>", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsGreaterThan(String value) {
            addCriterion("CM_IMGPATHS >", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsGreaterThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATHS >=", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsLessThan(String value) {
            addCriterion("CM_IMGPATHS <", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsLessThanOrEqualTo(String value) {
            addCriterion("CM_IMGPATHS <=", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsLike(String value) {
            addCriterion("CM_IMGPATHS like", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsNotLike(String value) {
            addCriterion("CM_IMGPATHS not like", value, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsIn(List<String> values) {
            addCriterion("CM_IMGPATHS in", values, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsNotIn(List<String> values) {
            addCriterion("CM_IMGPATHS not in", values, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsBetween(String value1, String value2) {
            addCriterion("CM_IMGPATHS between", value1, value2, "cmImgpaths");
            return (Criteria) this;
        }

        public Criteria andCmImgpathsNotBetween(String value1, String value2) {
            addCriterion("CM_IMGPATHS not between", value1, value2, "cmImgpaths");
            return (Criteria) this;
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