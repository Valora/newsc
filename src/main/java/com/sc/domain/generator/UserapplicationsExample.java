package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.List;

public class UserapplicationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserapplicationsExample() {
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

        public Criteria andCM_IDIsNull() {
            addCriterion("CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCM_IDIsNotNull() {
            addCriterion("CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_IDEqualTo(Integer value) {
            addCriterion("CM_ID =", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDNotEqualTo(Integer value) {
            addCriterion("CM_ID <>", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDGreaterThan(Integer value) {
            addCriterion("CM_ID >", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ID >=", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDLessThan(Integer value) {
            addCriterion("CM_ID <", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ID <=", value, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDIn(List<Integer> values) {
            addCriterion("CM_ID in", values, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDNotIn(List<Integer> values) {
            addCriterion("CM_ID not in", values, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID between", value1, value2, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID not between", value1, value2, "CM_ID");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEIsNull() {
            addCriterion("CM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEIsNotNull() {
            addCriterion("CM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEEqualTo(String value) {
            addCriterion("CM_NAME =", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotEqualTo(String value) {
            addCriterion("CM_NAME <>", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEGreaterThan(String value) {
            addCriterion("CM_NAME >", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NAME >=", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMELessThan(String value) {
            addCriterion("CM_NAME <", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMELessThanOrEqualTo(String value) {
            addCriterion("CM_NAME <=", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMELike(String value) {
            addCriterion("CM_NAME like", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotLike(String value) {
            addCriterion("CM_NAME not like", value, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEIn(List<String> values) {
            addCriterion("CM_NAME in", values, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotIn(List<String> values) {
            addCriterion("CM_NAME not in", values, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMEBetween(String value1, String value2) {
            addCriterion("CM_NAME between", value1, value2, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_NAMENotBetween(String value1, String value2) {
            addCriterion("CM_NAME not between", value1, value2, "CM_NAME");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEIsNull() {
            addCriterion("CM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEIsNotNull() {
            addCriterion("CM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEEqualTo(Long value) {
            addCriterion("CM_PHONE =", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONENotEqualTo(Long value) {
            addCriterion("CM_PHONE <>", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEGreaterThan(Long value) {
            addCriterion("CM_PHONE >", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEGreaterThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE >=", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONELessThan(Long value) {
            addCriterion("CM_PHONE <", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONELessThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE <=", value, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEIn(List<Long> values) {
            addCriterion("CM_PHONE in", values, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONENotIn(List<Long> values) {
            addCriterion("CM_PHONE not in", values, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONEBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE between", value1, value2, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PHONENotBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE not between", value1, value2, "CM_PHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHIsNull() {
            addCriterion("CM_CARDFACEPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHIsNotNull() {
            addCriterion("CM_CARDFACEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH =", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHNotEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH <>", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHGreaterThan(String value) {
            addCriterion("CM_CARDFACEPATH >", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH >=", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHLessThan(String value) {
            addCriterion("CM_CARDFACEPATH <", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH <=", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHLike(String value) {
            addCriterion("CM_CARDFACEPATH like", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHNotLike(String value) {
            addCriterion("CM_CARDFACEPATH not like", value, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHIn(List<String> values) {
            addCriterion("CM_CARDFACEPATH in", values, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHNotIn(List<String> values) {
            addCriterion("CM_CARDFACEPATH not in", values, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHBetween(String value1, String value2) {
            addCriterion("CM_CARDFACEPATH between", value1, value2, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDFACEPATHNotBetween(String value1, String value2) {
            addCriterion("CM_CARDFACEPATH not between", value1, value2, "CM_CARDFACEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHIsNull() {
            addCriterion("CM_CARDBACKPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHIsNotNull() {
            addCriterion("CM_CARDBACKPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH =", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHNotEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH <>", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHGreaterThan(String value) {
            addCriterion("CM_CARDBACKPATH >", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH >=", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHLessThan(String value) {
            addCriterion("CM_CARDBACKPATH <", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH <=", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHLike(String value) {
            addCriterion("CM_CARDBACKPATH like", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHNotLike(String value) {
            addCriterion("CM_CARDBACKPATH not like", value, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHIn(List<String> values) {
            addCriterion("CM_CARDBACKPATH in", values, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHNotIn(List<String> values) {
            addCriterion("CM_CARDBACKPATH not in", values, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHBetween(String value1, String value2) {
            addCriterion("CM_CARDBACKPATH between", value1, value2, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDBACKPATHNotBetween(String value1, String value2) {
            addCriterion("CM_CARDBACKPATH not between", value1, value2, "CM_CARDBACKPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHIsNull() {
            addCriterion("CM_PERSONALPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHIsNotNull() {
            addCriterion("CM_PERSONALPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHEqualTo(String value) {
            addCriterion("CM_PERSONALPATH =", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHNotEqualTo(String value) {
            addCriterion("CM_PERSONALPATH <>", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHGreaterThan(String value) {
            addCriterion("CM_PERSONALPATH >", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PERSONALPATH >=", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHLessThan(String value) {
            addCriterion("CM_PERSONALPATH <", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_PERSONALPATH <=", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHLike(String value) {
            addCriterion("CM_PERSONALPATH like", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHNotLike(String value) {
            addCriterion("CM_PERSONALPATH not like", value, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHIn(List<String> values) {
            addCriterion("CM_PERSONALPATH in", values, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHNotIn(List<String> values) {
            addCriterion("CM_PERSONALPATH not in", values, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHBetween(String value1, String value2) {
            addCriterion("CM_PERSONALPATH between", value1, value2, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_PERSONALPATHNotBetween(String value1, String value2) {
            addCriterion("CM_PERSONALPATH not between", value1, value2, "CM_PERSONALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHIsNull() {
            addCriterion("CM_LICENSEPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHIsNotNull() {
            addCriterion("CM_LICENSEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHEqualTo(String value) {
            addCriterion("CM_LICENSEPATH =", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHNotEqualTo(String value) {
            addCriterion("CM_LICENSEPATH <>", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHGreaterThan(String value) {
            addCriterion("CM_LICENSEPATH >", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LICENSEPATH >=", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHLessThan(String value) {
            addCriterion("CM_LICENSEPATH <", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_LICENSEPATH <=", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHLike(String value) {
            addCriterion("CM_LICENSEPATH like", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHNotLike(String value) {
            addCriterion("CM_LICENSEPATH not like", value, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHIn(List<String> values) {
            addCriterion("CM_LICENSEPATH in", values, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHNotIn(List<String> values) {
            addCriterion("CM_LICENSEPATH not in", values, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHBetween(String value1, String value2) {
            addCriterion("CM_LICENSEPATH between", value1, value2, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_LICENSEPATHNotBetween(String value1, String value2) {
            addCriterion("CM_LICENSEPATH not between", value1, value2, "CM_LICENSEPATH");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSIsNull() {
            addCriterion("CM_SHOPEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSIsNotNull() {
            addCriterion("CM_SHOPEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS =", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSNotEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS <>", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSGreaterThan(String value) {
            addCriterion("CM_SHOPEADDRESS >", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS >=", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSLessThan(String value) {
            addCriterion("CM_SHOPEADDRESS <", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSLessThanOrEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS <=", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSLike(String value) {
            addCriterion("CM_SHOPEADDRESS like", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSNotLike(String value) {
            addCriterion("CM_SHOPEADDRESS not like", value, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSIn(List<String> values) {
            addCriterion("CM_SHOPEADDRESS in", values, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSNotIn(List<String> values) {
            addCriterion("CM_SHOPEADDRESS not in", values, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSBetween(String value1, String value2) {
            addCriterion("CM_SHOPEADDRESS between", value1, value2, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPEADDRESSNotBetween(String value1, String value2) {
            addCriterion("CM_SHOPEADDRESS not between", value1, value2, "CM_SHOPEADDRESS");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONIsNull() {
            addCriterion("CM_SHOPLON is null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONIsNotNull() {
            addCriterion("CM_SHOPLON is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONEqualTo(Double value) {
            addCriterion("CM_SHOPLON =", value, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONNotEqualTo(Double value) {
            addCriterion("CM_SHOPLON <>", value, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONGreaterThan(Double value) {
            addCriterion("CM_SHOPLON >", value, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLON >=", value, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONLessThan(Double value) {
            addCriterion("CM_SHOPLON <", value, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONLessThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLON <=", value, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONIn(List<Double> values) {
            addCriterion("CM_SHOPLON in", values, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONNotIn(List<Double> values) {
            addCriterion("CM_SHOPLON not in", values, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLON between", value1, value2, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLONNotBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLON not between", value1, value2, "CM_SHOPLON");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATIsNull() {
            addCriterion("CM_SHOPLAT is null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATIsNotNull() {
            addCriterion("CM_SHOPLAT is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATEqualTo(Double value) {
            addCriterion("CM_SHOPLAT =", value, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATNotEqualTo(Double value) {
            addCriterion("CM_SHOPLAT <>", value, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATGreaterThan(Double value) {
            addCriterion("CM_SHOPLAT >", value, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLAT >=", value, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATLessThan(Double value) {
            addCriterion("CM_SHOPLAT <", value, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATLessThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLAT <=", value, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATIn(List<Double> values) {
            addCriterion("CM_SHOPLAT in", values, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATNotIn(List<Double> values) {
            addCriterion("CM_SHOPLAT not in", values, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLAT between", value1, value2, "CM_SHOPLAT");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPLATNotBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLAT not between", value1, value2, "CM_SHOPLAT");
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