package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andCM_SHOPNAMEIsNull() {
            addCriterion("CM_SHOPNAME is null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMEIsNotNull() {
            addCriterion("CM_SHOPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMEEqualTo(String value) {
            addCriterion("CM_SHOPNAME =", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMENotEqualTo(String value) {
            addCriterion("CM_SHOPNAME <>", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMEGreaterThan(String value) {
            addCriterion("CM_SHOPNAME >", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SHOPNAME >=", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMELessThan(String value) {
            addCriterion("CM_SHOPNAME <", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMELessThanOrEqualTo(String value) {
            addCriterion("CM_SHOPNAME <=", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMELike(String value) {
            addCriterion("CM_SHOPNAME like", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMENotLike(String value) {
            addCriterion("CM_SHOPNAME not like", value, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMEIn(List<String> values) {
            addCriterion("CM_SHOPNAME in", values, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMENotIn(List<String> values) {
            addCriterion("CM_SHOPNAME not in", values, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMEBetween(String value1, String value2) {
            addCriterion("CM_SHOPNAME between", value1, value2, "CM_SHOPNAME");
            return (Criteria) this;
        }

        public Criteria andCM_SHOPNAMENotBetween(String value1, String value2) {
            addCriterion("CM_SHOPNAME not between", value1, value2, "CM_SHOPNAME");
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

        public Criteria andCM_ACCOUNTIsNull() {
            addCriterion("CM_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTIsNotNull() {
            addCriterion("CM_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTEqualTo(String value) {
            addCriterion("CM_ACCOUNT =", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotEqualTo(String value) {
            addCriterion("CM_ACCOUNT <>", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTGreaterThan(String value) {
            addCriterion("CM_ACCOUNT >", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT >=", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTLessThan(String value) {
            addCriterion("CM_ACCOUNT <", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTLessThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT <=", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTLike(String value) {
            addCriterion("CM_ACCOUNT like", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotLike(String value) {
            addCriterion("CM_ACCOUNT not like", value, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTIn(List<String> values) {
            addCriterion("CM_ACCOUNT in", values, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotIn(List<String> values) {
            addCriterion("CM_ACCOUNT not in", values, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT between", value1, value2, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_ACCOUNTNotBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT not between", value1, value2, "CM_ACCOUNT");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDIsNull() {
            addCriterion("CM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDIsNotNull() {
            addCriterion("CM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDEqualTo(String value) {
            addCriterion("CM_PASSWORD =", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotEqualTo(String value) {
            addCriterion("CM_PASSWORD <>", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDGreaterThan(String value) {
            addCriterion("CM_PASSWORD >", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD >=", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDLessThan(String value) {
            addCriterion("CM_PASSWORD <", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDLessThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD <=", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDLike(String value) {
            addCriterion("CM_PASSWORD like", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotLike(String value) {
            addCriterion("CM_PASSWORD not like", value, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDIn(List<String> values) {
            addCriterion("CM_PASSWORD in", values, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotIn(List<String> values) {
            addCriterion("CM_PASSWORD not in", values, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD between", value1, value2, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_PASSWORDNotBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD not between", value1, value2, "CM_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALIsNull() {
            addCriterion("CM_INTEGRAL is null");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALIsNotNull() {
            addCriterion("CM_INTEGRAL is not null");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALEqualTo(Integer value) {
            addCriterion("CM_INTEGRAL =", value, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALNotEqualTo(Integer value) {
            addCriterion("CM_INTEGRAL <>", value, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALGreaterThan(Integer value) {
            addCriterion("CM_INTEGRAL >", value, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_INTEGRAL >=", value, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALLessThan(Integer value) {
            addCriterion("CM_INTEGRAL <", value, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALLessThanOrEqualTo(Integer value) {
            addCriterion("CM_INTEGRAL <=", value, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALIn(List<Integer> values) {
            addCriterion("CM_INTEGRAL in", values, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALNotIn(List<Integer> values) {
            addCriterion("CM_INTEGRAL not in", values, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALBetween(Integer value1, Integer value2) {
            addCriterion("CM_INTEGRAL between", value1, value2, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_INTEGRALNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_INTEGRAL not between", value1, value2, "CM_INTEGRAL");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEIsNull() {
            addCriterion("CM_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEIsNotNull() {
            addCriterion("CM_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEEqualTo(Double value) {
            addCriterion("CM_BALANCE =", value, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCENotEqualTo(Double value) {
            addCriterion("CM_BALANCE <>", value, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEGreaterThan(Double value) {
            addCriterion("CM_BALANCE >", value, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_BALANCE >=", value, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCELessThan(Double value) {
            addCriterion("CM_BALANCE <", value, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCELessThanOrEqualTo(Double value) {
            addCriterion("CM_BALANCE <=", value, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEIn(List<Double> values) {
            addCriterion("CM_BALANCE in", values, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCENotIn(List<Double> values) {
            addCriterion("CM_BALANCE not in", values, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCEBetween(Double value1, Double value2) {
            addCriterion("CM_BALANCE between", value1, value2, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_BALANCENotBetween(Double value1, Double value2) {
            addCriterion("CM_BALANCE not between", value1, value2, "CM_BALANCE");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHIsNull() {
            addCriterion("CM_CARDPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHIsNotNull() {
            addCriterion("CM_CARDPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHEqualTo(String value) {
            addCriterion("CM_CARDPATH =", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHNotEqualTo(String value) {
            addCriterion("CM_CARDPATH <>", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHGreaterThan(String value) {
            addCriterion("CM_CARDPATH >", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDPATH >=", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHLessThan(String value) {
            addCriterion("CM_CARDPATH <", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDPATH <=", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHLike(String value) {
            addCriterion("CM_CARDPATH like", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHNotLike(String value) {
            addCriterion("CM_CARDPATH not like", value, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHIn(List<String> values) {
            addCriterion("CM_CARDPATH in", values, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHNotIn(List<String> values) {
            addCriterion("CM_CARDPATH not in", values, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHBetween(String value1, String value2) {
            addCriterion("CM_CARDPATH between", value1, value2, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_CARDPATHNotBetween(String value1, String value2) {
            addCriterion("CM_CARDPATH not between", value1, value2, "CM_CARDPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHIsNull() {
            addCriterion("CM_STOREPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHIsNotNull() {
            addCriterion("CM_STOREPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHEqualTo(String value) {
            addCriterion("CM_STOREPATH =", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHNotEqualTo(String value) {
            addCriterion("CM_STOREPATH <>", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHGreaterThan(String value) {
            addCriterion("CM_STOREPATH >", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_STOREPATH >=", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHLessThan(String value) {
            addCriterion("CM_STOREPATH <", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_STOREPATH <=", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHLike(String value) {
            addCriterion("CM_STOREPATH like", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHNotLike(String value) {
            addCriterion("CM_STOREPATH not like", value, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHIn(List<String> values) {
            addCriterion("CM_STOREPATH in", values, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHNotIn(List<String> values) {
            addCriterion("CM_STOREPATH not in", values, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHBetween(String value1, String value2) {
            addCriterion("CM_STOREPATH between", value1, value2, "CM_STOREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_STOREPATHNotBetween(String value1, String value2) {
            addCriterion("CM_STOREPATH not between", value1, value2, "CM_STOREPATH");
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

        public Criteria andCM_LEVELIsNull() {
            addCriterion("CM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELIsNotNull() {
            addCriterion("CM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELEqualTo(Integer value) {
            addCriterion("CM_LEVEL =", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELNotEqualTo(Integer value) {
            addCriterion("CM_LEVEL <>", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELGreaterThan(Integer value) {
            addCriterion("CM_LEVEL >", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL >=", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELLessThan(Integer value) {
            addCriterion("CM_LEVEL <", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELLessThanOrEqualTo(Integer value) {
            addCriterion("CM_LEVEL <=", value, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELIn(List<Integer> values) {
            addCriterion("CM_LEVEL in", values, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELNotIn(List<Integer> values) {
            addCriterion("CM_LEVEL not in", values, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL between", value1, value2, "CM_LEVEL");
            return (Criteria) this;
        }

        public Criteria andCM_LEVELNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_LEVEL not between", value1, value2, "CM_LEVEL");
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

        public Criteria andCM_ISEXAMINEIsNull() {
            addCriterion("CM_ISEXAMINE is null");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINEIsNotNull() {
            addCriterion("CM_ISEXAMINE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINEEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE =", value, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINENotEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE <>", value, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINEGreaterThan(Integer value) {
            addCriterion("CM_ISEXAMINE >", value, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE >=", value, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINELessThan(Integer value) {
            addCriterion("CM_ISEXAMINE <", value, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINELessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE <=", value, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINEIn(List<Integer> values) {
            addCriterion("CM_ISEXAMINE in", values, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINENotIn(List<Integer> values) {
            addCriterion("CM_ISEXAMINE not in", values, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINEBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISEXAMINE between", value1, value2, "CM_ISEXAMINE");
            return (Criteria) this;
        }

        public Criteria andCM_ISEXAMINENotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISEXAMINE not between", value1, value2, "CM_ISEXAMINE");
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

        public Criteria andCM_CARDNOIsNull() {
            addCriterion("CM_CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOIsNotNull() {
            addCriterion("CM_CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOEqualTo(String value) {
            addCriterion("CM_CARDNO =", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNONotEqualTo(String value) {
            addCriterion("CM_CARDNO <>", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOGreaterThan(String value) {
            addCriterion("CM_CARDNO >", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDNO >=", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOLessThan(String value) {
            addCriterion("CM_CARDNO <", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDNO <=", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOLike(String value) {
            addCriterion("CM_CARDNO like", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNONotLike(String value) {
            addCriterion("CM_CARDNO not like", value, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOIn(List<String> values) {
            addCriterion("CM_CARDNO in", values, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNONotIn(List<String> values) {
            addCriterion("CM_CARDNO not in", values, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNOBetween(String value1, String value2) {
            addCriterion("CM_CARDNO between", value1, value2, "CM_CARDNO");
            return (Criteria) this;
        }

        public Criteria andCM_CARDNONotBetween(String value1, String value2) {
            addCriterion("CM_CARDNO not between", value1, value2, "CM_CARDNO");
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

        public Criteria andCM_CONTACTNAMEIsNull() {
            addCriterion("CM_CONTACTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMEIsNotNull() {
            addCriterion("CM_CONTACTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMEEqualTo(String value) {
            addCriterion("CM_CONTACTNAME =", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMENotEqualTo(String value) {
            addCriterion("CM_CONTACTNAME <>", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMEGreaterThan(String value) {
            addCriterion("CM_CONTACTNAME >", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTNAME >=", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMELessThan(String value) {
            addCriterion("CM_CONTACTNAME <", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMELessThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTNAME <=", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMELike(String value) {
            addCriterion("CM_CONTACTNAME like", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMENotLike(String value) {
            addCriterion("CM_CONTACTNAME not like", value, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMEIn(List<String> values) {
            addCriterion("CM_CONTACTNAME in", values, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMENotIn(List<String> values) {
            addCriterion("CM_CONTACTNAME not in", values, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMEBetween(String value1, String value2) {
            addCriterion("CM_CONTACTNAME between", value1, value2, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTNAMENotBetween(String value1, String value2) {
            addCriterion("CM_CONTACTNAME not between", value1, value2, "CM_CONTACTNAME");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEIsNull() {
            addCriterion("CM_CONTACTPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEIsNotNull() {
            addCriterion("CM_CONTACTPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE =", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONENotEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE <>", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEGreaterThan(String value) {
            addCriterion("CM_CONTACTPHONE >", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE >=", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONELessThan(String value) {
            addCriterion("CM_CONTACTPHONE <", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONELessThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE <=", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONELike(String value) {
            addCriterion("CM_CONTACTPHONE like", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONENotLike(String value) {
            addCriterion("CM_CONTACTPHONE not like", value, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEIn(List<String> values) {
            addCriterion("CM_CONTACTPHONE in", values, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONENotIn(List<String> values) {
            addCriterion("CM_CONTACTPHONE not in", values, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONEBetween(String value1, String value2) {
            addCriterion("CM_CONTACTPHONE between", value1, value2, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_CONTACTPHONENotBetween(String value1, String value2) {
            addCriterion("CM_CONTACTPHONE not between", value1, value2, "CM_CONTACTPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEIsNull() {
            addCriterion("CM_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEIsNotNull() {
            addCriterion("CM_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEEqualTo(String value) {
            addCriterion("CM_TELEPHONE =", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONENotEqualTo(String value) {
            addCriterion("CM_TELEPHONE <>", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEGreaterThan(String value) {
            addCriterion("CM_TELEPHONE >", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TELEPHONE >=", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONELessThan(String value) {
            addCriterion("CM_TELEPHONE <", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONELessThanOrEqualTo(String value) {
            addCriterion("CM_TELEPHONE <=", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONELike(String value) {
            addCriterion("CM_TELEPHONE like", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONENotLike(String value) {
            addCriterion("CM_TELEPHONE not like", value, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEIn(List<String> values) {
            addCriterion("CM_TELEPHONE in", values, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONENotIn(List<String> values) {
            addCriterion("CM_TELEPHONE not in", values, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONEBetween(String value1, String value2) {
            addCriterion("CM_TELEPHONE between", value1, value2, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_TELEPHONENotBetween(String value1, String value2) {
            addCriterion("CM_TELEPHONE not between", value1, value2, "CM_TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andCM_PAXIsNull() {
            addCriterion("CM_PAX is null");
            return (Criteria) this;
        }

        public Criteria andCM_PAXIsNotNull() {
            addCriterion("CM_PAX is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PAXEqualTo(String value) {
            addCriterion("CM_PAX =", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXNotEqualTo(String value) {
            addCriterion("CM_PAX <>", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXGreaterThan(String value) {
            addCriterion("CM_PAX >", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PAX >=", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXLessThan(String value) {
            addCriterion("CM_PAX <", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXLessThanOrEqualTo(String value) {
            addCriterion("CM_PAX <=", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXLike(String value) {
            addCriterion("CM_PAX like", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXNotLike(String value) {
            addCriterion("CM_PAX not like", value, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXIn(List<String> values) {
            addCriterion("CM_PAX in", values, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXNotIn(List<String> values) {
            addCriterion("CM_PAX not in", values, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXBetween(String value1, String value2) {
            addCriterion("CM_PAX between", value1, value2, "CM_PAX");
            return (Criteria) this;
        }

        public Criteria andCM_PAXNotBetween(String value1, String value2) {
            addCriterion("CM_PAX not between", value1, value2, "CM_PAX");
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