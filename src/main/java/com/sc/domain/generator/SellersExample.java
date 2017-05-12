package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellersExample() {
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

        public Criteria andCmSellernameIsNull() {
            addCriterion("CM_SELLERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCmSellernameIsNotNull() {
            addCriterion("CM_SELLERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmSellernameEqualTo(String value) {
            addCriterion("CM_SELLERNAME =", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameNotEqualTo(String value) {
            addCriterion("CM_SELLERNAME <>", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameGreaterThan(String value) {
            addCriterion("CM_SELLERNAME >", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SELLERNAME >=", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameLessThan(String value) {
            addCriterion("CM_SELLERNAME <", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameLessThanOrEqualTo(String value) {
            addCriterion("CM_SELLERNAME <=", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameLike(String value) {
            addCriterion("CM_SELLERNAME like", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameNotLike(String value) {
            addCriterion("CM_SELLERNAME not like", value, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameIn(List<String> values) {
            addCriterion("CM_SELLERNAME in", values, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameNotIn(List<String> values) {
            addCriterion("CM_SELLERNAME not in", values, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameBetween(String value1, String value2) {
            addCriterion("CM_SELLERNAME between", value1, value2, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmSellernameNotBetween(String value1, String value2) {
            addCriterion("CM_SELLERNAME not between", value1, value2, "cmSellername");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIsNull() {
            addCriterion("CM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIsNotNull() {
            addCriterion("CM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCmPhoneEqualTo(Long value) {
            addCriterion("CM_PHONE =", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotEqualTo(Long value) {
            addCriterion("CM_PHONE <>", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneGreaterThan(Long value) {
            addCriterion("CM_PHONE >", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE >=", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLessThan(Long value) {
            addCriterion("CM_PHONE <", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneLessThanOrEqualTo(Long value) {
            addCriterion("CM_PHONE <=", value, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneIn(List<Long> values) {
            addCriterion("CM_PHONE in", values, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotIn(List<Long> values) {
            addCriterion("CM_PHONE not in", values, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE between", value1, value2, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmPhoneNotBetween(Long value1, Long value2) {
            addCriterion("CM_PHONE not between", value1, value2, "cmPhone");
            return (Criteria) this;
        }

        public Criteria andCmAccountIsNull() {
            addCriterion("CM_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCmAccountIsNotNull() {
            addCriterion("CM_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCmAccountEqualTo(String value) {
            addCriterion("CM_ACCOUNT =", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotEqualTo(String value) {
            addCriterion("CM_ACCOUNT <>", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountGreaterThan(String value) {
            addCriterion("CM_ACCOUNT >", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT >=", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountLessThan(String value) {
            addCriterion("CM_ACCOUNT <", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountLessThanOrEqualTo(String value) {
            addCriterion("CM_ACCOUNT <=", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountLike(String value) {
            addCriterion("CM_ACCOUNT like", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotLike(String value) {
            addCriterion("CM_ACCOUNT not like", value, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountIn(List<String> values) {
            addCriterion("CM_ACCOUNT in", values, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotIn(List<String> values) {
            addCriterion("CM_ACCOUNT not in", values, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT between", value1, value2, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmAccountNotBetween(String value1, String value2) {
            addCriterion("CM_ACCOUNT not between", value1, value2, "cmAccount");
            return (Criteria) this;
        }

        public Criteria andCmPasswordIsNull() {
            addCriterion("CM_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCmPasswordIsNotNull() {
            addCriterion("CM_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCmPasswordEqualTo(String value) {
            addCriterion("CM_PASSWORD =", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotEqualTo(String value) {
            addCriterion("CM_PASSWORD <>", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordGreaterThan(String value) {
            addCriterion("CM_PASSWORD >", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD >=", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordLessThan(String value) {
            addCriterion("CM_PASSWORD <", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordLessThanOrEqualTo(String value) {
            addCriterion("CM_PASSWORD <=", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordLike(String value) {
            addCriterion("CM_PASSWORD like", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotLike(String value) {
            addCriterion("CM_PASSWORD not like", value, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordIn(List<String> values) {
            addCriterion("CM_PASSWORD in", values, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotIn(List<String> values) {
            addCriterion("CM_PASSWORD not in", values, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD between", value1, value2, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmPasswordNotBetween(String value1, String value2) {
            addCriterion("CM_PASSWORD not between", value1, value2, "cmPassword");
            return (Criteria) this;
        }

        public Criteria andCmBrandidIsNull() {
            addCriterion("CM_BRANDID is null");
            return (Criteria) this;
        }

        public Criteria andCmBrandidIsNotNull() {
            addCriterion("CM_BRANDID is not null");
            return (Criteria) this;
        }

        public Criteria andCmBrandidEqualTo(Integer value) {
            addCriterion("CM_BRANDID =", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidNotEqualTo(Integer value) {
            addCriterion("CM_BRANDID <>", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidGreaterThan(Integer value) {
            addCriterion("CM_BRANDID >", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID >=", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidLessThan(Integer value) {
            addCriterion("CM_BRANDID <", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID <=", value, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidIn(List<Integer> values) {
            addCriterion("CM_BRANDID in", values, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidNotIn(List<Integer> values) {
            addCriterion("CM_BRANDID not in", values, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID between", value1, value2, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID not between", value1, value2, "cmBrandid");
            return (Criteria) this;
        }

        public Criteria andCmCardpathIsNull() {
            addCriterion("CM_CARDPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmCardpathIsNotNull() {
            addCriterion("CM_CARDPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmCardpathEqualTo(String value) {
            addCriterion("CM_CARDPATH =", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathNotEqualTo(String value) {
            addCriterion("CM_CARDPATH <>", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathGreaterThan(String value) {
            addCriterion("CM_CARDPATH >", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDPATH >=", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathLessThan(String value) {
            addCriterion("CM_CARDPATH <", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDPATH <=", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathLike(String value) {
            addCriterion("CM_CARDPATH like", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathNotLike(String value) {
            addCriterion("CM_CARDPATH not like", value, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathIn(List<String> values) {
            addCriterion("CM_CARDPATH in", values, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathNotIn(List<String> values) {
            addCriterion("CM_CARDPATH not in", values, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathBetween(String value1, String value2) {
            addCriterion("CM_CARDPATH between", value1, value2, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmCardpathNotBetween(String value1, String value2) {
            addCriterion("CM_CARDPATH not between", value1, value2, "cmCardpath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathIsNull() {
            addCriterion("CM_STOREPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmStorepathIsNotNull() {
            addCriterion("CM_STOREPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmStorepathEqualTo(String value) {
            addCriterion("CM_STOREPATH =", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathNotEqualTo(String value) {
            addCriterion("CM_STOREPATH <>", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathGreaterThan(String value) {
            addCriterion("CM_STOREPATH >", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_STOREPATH >=", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathLessThan(String value) {
            addCriterion("CM_STOREPATH <", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathLessThanOrEqualTo(String value) {
            addCriterion("CM_STOREPATH <=", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathLike(String value) {
            addCriterion("CM_STOREPATH like", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathNotLike(String value) {
            addCriterion("CM_STOREPATH not like", value, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathIn(List<String> values) {
            addCriterion("CM_STOREPATH in", values, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathNotIn(List<String> values) {
            addCriterion("CM_STOREPATH not in", values, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathBetween(String value1, String value2) {
            addCriterion("CM_STOREPATH between", value1, value2, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmStorepathNotBetween(String value1, String value2) {
            addCriterion("CM_STOREPATH not between", value1, value2, "cmStorepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathIsNull() {
            addCriterion("CM_LICENSEPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathIsNotNull() {
            addCriterion("CM_LICENSEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathEqualTo(String value) {
            addCriterion("CM_LICENSEPATH =", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathNotEqualTo(String value) {
            addCriterion("CM_LICENSEPATH <>", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathGreaterThan(String value) {
            addCriterion("CM_LICENSEPATH >", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_LICENSEPATH >=", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathLessThan(String value) {
            addCriterion("CM_LICENSEPATH <", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathLessThanOrEqualTo(String value) {
            addCriterion("CM_LICENSEPATH <=", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathLike(String value) {
            addCriterion("CM_LICENSEPATH like", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathNotLike(String value) {
            addCriterion("CM_LICENSEPATH not like", value, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathIn(List<String> values) {
            addCriterion("CM_LICENSEPATH in", values, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathNotIn(List<String> values) {
            addCriterion("CM_LICENSEPATH not in", values, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathBetween(String value1, String value2) {
            addCriterion("CM_LICENSEPATH between", value1, value2, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmLicensepathNotBetween(String value1, String value2) {
            addCriterion("CM_LICENSEPATH not between", value1, value2, "cmLicensepath");
            return (Criteria) this;
        }

        public Criteria andCmAddressIsNull() {
            addCriterion("CM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCmAddressIsNotNull() {
            addCriterion("CM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCmAddressEqualTo(String value) {
            addCriterion("CM_ADDRESS =", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotEqualTo(String value) {
            addCriterion("CM_ADDRESS <>", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressGreaterThan(String value) {
            addCriterion("CM_ADDRESS >", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS >=", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLessThan(String value) {
            addCriterion("CM_ADDRESS <", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLessThanOrEqualTo(String value) {
            addCriterion("CM_ADDRESS <=", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressLike(String value) {
            addCriterion("CM_ADDRESS like", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotLike(String value) {
            addCriterion("CM_ADDRESS not like", value, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressIn(List<String> values) {
            addCriterion("CM_ADDRESS in", values, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotIn(List<String> values) {
            addCriterion("CM_ADDRESS not in", values, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS between", value1, value2, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmAddressNotBetween(String value1, String value2) {
            addCriterion("CM_ADDRESS not between", value1, value2, "cmAddress");
            return (Criteria) this;
        }

        public Criteria andCmLonIsNull() {
            addCriterion("CM_LON is null");
            return (Criteria) this;
        }

        public Criteria andCmLonIsNotNull() {
            addCriterion("CM_LON is not null");
            return (Criteria) this;
        }

        public Criteria andCmLonEqualTo(Double value) {
            addCriterion("CM_LON =", value, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonNotEqualTo(Double value) {
            addCriterion("CM_LON <>", value, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonGreaterThan(Double value) {
            addCriterion("CM_LON >", value, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_LON >=", value, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonLessThan(Double value) {
            addCriterion("CM_LON <", value, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonLessThanOrEqualTo(Double value) {
            addCriterion("CM_LON <=", value, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonIn(List<Double> values) {
            addCriterion("CM_LON in", values, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonNotIn(List<Double> values) {
            addCriterion("CM_LON not in", values, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonBetween(Double value1, Double value2) {
            addCriterion("CM_LON between", value1, value2, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLonNotBetween(Double value1, Double value2) {
            addCriterion("CM_LON not between", value1, value2, "cmLon");
            return (Criteria) this;
        }

        public Criteria andCmLatIsNull() {
            addCriterion("CM_LAT is null");
            return (Criteria) this;
        }

        public Criteria andCmLatIsNotNull() {
            addCriterion("CM_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andCmLatEqualTo(Double value) {
            addCriterion("CM_LAT =", value, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatNotEqualTo(Double value) {
            addCriterion("CM_LAT <>", value, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatGreaterThan(Double value) {
            addCriterion("CM_LAT >", value, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_LAT >=", value, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatLessThan(Double value) {
            addCriterion("CM_LAT <", value, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatLessThanOrEqualTo(Double value) {
            addCriterion("CM_LAT <=", value, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatIn(List<Double> values) {
            addCriterion("CM_LAT in", values, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatNotIn(List<Double> values) {
            addCriterion("CM_LAT not in", values, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatBetween(Double value1, Double value2) {
            addCriterion("CM_LAT between", value1, value2, "cmLat");
            return (Criteria) this;
        }

        public Criteria andCmLatNotBetween(Double value1, Double value2) {
            addCriterion("CM_LAT not between", value1, value2, "cmLat");
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

        public Criteria andCmIsexamineIsNull() {
            addCriterion("CM_ISEXAMINE is null");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineIsNotNull() {
            addCriterion("CM_ISEXAMINE is not null");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE =", value, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineNotEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE <>", value, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineGreaterThan(Integer value) {
            addCriterion("CM_ISEXAMINE >", value, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE >=", value, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineLessThan(Integer value) {
            addCriterion("CM_ISEXAMINE <", value, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISEXAMINE <=", value, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineIn(List<Integer> values) {
            addCriterion("CM_ISEXAMINE in", values, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineNotIn(List<Integer> values) {
            addCriterion("CM_ISEXAMINE not in", values, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISEXAMINE between", value1, value2, "cmIsexamine");
            return (Criteria) this;
        }

        public Criteria andCmIsexamineNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISEXAMINE not between", value1, value2, "cmIsexamine");
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

        public Criteria andCmCardnoIsNull() {
            addCriterion("CM_CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCmCardnoIsNotNull() {
            addCriterion("CM_CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCmCardnoEqualTo(String value) {
            addCriterion("CM_CARDNO =", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoNotEqualTo(String value) {
            addCriterion("CM_CARDNO <>", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoGreaterThan(String value) {
            addCriterion("CM_CARDNO >", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDNO >=", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoLessThan(String value) {
            addCriterion("CM_CARDNO <", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDNO <=", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoLike(String value) {
            addCriterion("CM_CARDNO like", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoNotLike(String value) {
            addCriterion("CM_CARDNO not like", value, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoIn(List<String> values) {
            addCriterion("CM_CARDNO in", values, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoNotIn(List<String> values) {
            addCriterion("CM_CARDNO not in", values, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoBetween(String value1, String value2) {
            addCriterion("CM_CARDNO between", value1, value2, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmCardnoNotBetween(String value1, String value2) {
            addCriterion("CM_CARDNO not between", value1, value2, "cmCardno");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNull() {
            addCriterion("CM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCmNameIsNotNull() {
            addCriterion("CM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmNameEqualTo(String value) {
            addCriterion("CM_NAME =", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotEqualTo(String value) {
            addCriterion("CM_NAME <>", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThan(String value) {
            addCriterion("CM_NAME >", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_NAME >=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThan(String value) {
            addCriterion("CM_NAME <", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLessThanOrEqualTo(String value) {
            addCriterion("CM_NAME <=", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameLike(String value) {
            addCriterion("CM_NAME like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotLike(String value) {
            addCriterion("CM_NAME not like", value, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameIn(List<String> values) {
            addCriterion("CM_NAME in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotIn(List<String> values) {
            addCriterion("CM_NAME not in", values, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameBetween(String value1, String value2) {
            addCriterion("CM_NAME between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmNameNotBetween(String value1, String value2) {
            addCriterion("CM_NAME not between", value1, value2, "cmName");
            return (Criteria) this;
        }

        public Criteria andCmContactnameIsNull() {
            addCriterion("CM_CONTACTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCmContactnameIsNotNull() {
            addCriterion("CM_CONTACTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCmContactnameEqualTo(String value) {
            addCriterion("CM_CONTACTNAME =", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameNotEqualTo(String value) {
            addCriterion("CM_CONTACTNAME <>", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameGreaterThan(String value) {
            addCriterion("CM_CONTACTNAME >", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTNAME >=", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameLessThan(String value) {
            addCriterion("CM_CONTACTNAME <", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameLessThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTNAME <=", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameLike(String value) {
            addCriterion("CM_CONTACTNAME like", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameNotLike(String value) {
            addCriterion("CM_CONTACTNAME not like", value, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameIn(List<String> values) {
            addCriterion("CM_CONTACTNAME in", values, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameNotIn(List<String> values) {
            addCriterion("CM_CONTACTNAME not in", values, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameBetween(String value1, String value2) {
            addCriterion("CM_CONTACTNAME between", value1, value2, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactnameNotBetween(String value1, String value2) {
            addCriterion("CM_CONTACTNAME not between", value1, value2, "cmContactname");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneIsNull() {
            addCriterion("CM_CONTACTPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneIsNotNull() {
            addCriterion("CM_CONTACTPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE =", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneNotEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE <>", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneGreaterThan(String value) {
            addCriterion("CM_CONTACTPHONE >", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE >=", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneLessThan(String value) {
            addCriterion("CM_CONTACTPHONE <", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneLessThanOrEqualTo(String value) {
            addCriterion("CM_CONTACTPHONE <=", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneLike(String value) {
            addCriterion("CM_CONTACTPHONE like", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneNotLike(String value) {
            addCriterion("CM_CONTACTPHONE not like", value, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneIn(List<String> values) {
            addCriterion("CM_CONTACTPHONE in", values, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneNotIn(List<String> values) {
            addCriterion("CM_CONTACTPHONE not in", values, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneBetween(String value1, String value2) {
            addCriterion("CM_CONTACTPHONE between", value1, value2, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmContactphoneNotBetween(String value1, String value2) {
            addCriterion("CM_CONTACTPHONE not between", value1, value2, "cmContactphone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneIsNull() {
            addCriterion("CM_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneIsNotNull() {
            addCriterion("CM_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneEqualTo(String value) {
            addCriterion("CM_TELEPHONE =", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneNotEqualTo(String value) {
            addCriterion("CM_TELEPHONE <>", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneGreaterThan(String value) {
            addCriterion("CM_TELEPHONE >", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TELEPHONE >=", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneLessThan(String value) {
            addCriterion("CM_TELEPHONE <", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneLessThanOrEqualTo(String value) {
            addCriterion("CM_TELEPHONE <=", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneLike(String value) {
            addCriterion("CM_TELEPHONE like", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneNotLike(String value) {
            addCriterion("CM_TELEPHONE not like", value, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneIn(List<String> values) {
            addCriterion("CM_TELEPHONE in", values, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneNotIn(List<String> values) {
            addCriterion("CM_TELEPHONE not in", values, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneBetween(String value1, String value2) {
            addCriterion("CM_TELEPHONE between", value1, value2, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmTelephoneNotBetween(String value1, String value2) {
            addCriterion("CM_TELEPHONE not between", value1, value2, "cmTelephone");
            return (Criteria) this;
        }

        public Criteria andCmPaxIsNull() {
            addCriterion("CM_PAX is null");
            return (Criteria) this;
        }

        public Criteria andCmPaxIsNotNull() {
            addCriterion("CM_PAX is not null");
            return (Criteria) this;
        }

        public Criteria andCmPaxEqualTo(String value) {
            addCriterion("CM_PAX =", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxNotEqualTo(String value) {
            addCriterion("CM_PAX <>", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxGreaterThan(String value) {
            addCriterion("CM_PAX >", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PAX >=", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxLessThan(String value) {
            addCriterion("CM_PAX <", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxLessThanOrEqualTo(String value) {
            addCriterion("CM_PAX <=", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxLike(String value) {
            addCriterion("CM_PAX like", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxNotLike(String value) {
            addCriterion("CM_PAX not like", value, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxIn(List<String> values) {
            addCriterion("CM_PAX in", values, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxNotIn(List<String> values) {
            addCriterion("CM_PAX not in", values, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxBetween(String value1, String value2) {
            addCriterion("CM_PAX between", value1, value2, "cmPax");
            return (Criteria) this;
        }

        public Criteria andCmPaxNotBetween(String value1, String value2) {
            addCriterion("CM_PAX not between", value1, value2, "cmPax");
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