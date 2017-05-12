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

        public Criteria andCmIdIsNull() {
            addCriterion("CM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("CM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("CM_ID =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("CM_ID <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("CM_ID >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ID >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("CM_ID <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ID <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("CM_ID in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("CM_ID not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ID not between", value1, value2, "cmId");
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

        public Criteria andCmCardfacepathIsNull() {
            addCriterion("CM_CARDFACEPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathIsNotNull() {
            addCriterion("CM_CARDFACEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH =", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathNotEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH <>", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathGreaterThan(String value) {
            addCriterion("CM_CARDFACEPATH >", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH >=", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathLessThan(String value) {
            addCriterion("CM_CARDFACEPATH <", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDFACEPATH <=", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathLike(String value) {
            addCriterion("CM_CARDFACEPATH like", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathNotLike(String value) {
            addCriterion("CM_CARDFACEPATH not like", value, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathIn(List<String> values) {
            addCriterion("CM_CARDFACEPATH in", values, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathNotIn(List<String> values) {
            addCriterion("CM_CARDFACEPATH not in", values, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathBetween(String value1, String value2) {
            addCriterion("CM_CARDFACEPATH between", value1, value2, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardfacepathNotBetween(String value1, String value2) {
            addCriterion("CM_CARDFACEPATH not between", value1, value2, "cmCardfacepath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathIsNull() {
            addCriterion("CM_CARDBACKPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathIsNotNull() {
            addCriterion("CM_CARDBACKPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH =", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathNotEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH <>", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathGreaterThan(String value) {
            addCriterion("CM_CARDBACKPATH >", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH >=", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathLessThan(String value) {
            addCriterion("CM_CARDBACKPATH <", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathLessThanOrEqualTo(String value) {
            addCriterion("CM_CARDBACKPATH <=", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathLike(String value) {
            addCriterion("CM_CARDBACKPATH like", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathNotLike(String value) {
            addCriterion("CM_CARDBACKPATH not like", value, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathIn(List<String> values) {
            addCriterion("CM_CARDBACKPATH in", values, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathNotIn(List<String> values) {
            addCriterion("CM_CARDBACKPATH not in", values, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathBetween(String value1, String value2) {
            addCriterion("CM_CARDBACKPATH between", value1, value2, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmCardbackpathNotBetween(String value1, String value2) {
            addCriterion("CM_CARDBACKPATH not between", value1, value2, "cmCardbackpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathIsNull() {
            addCriterion("CM_PERSONALPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathIsNotNull() {
            addCriterion("CM_PERSONALPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathEqualTo(String value) {
            addCriterion("CM_PERSONALPATH =", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathNotEqualTo(String value) {
            addCriterion("CM_PERSONALPATH <>", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathGreaterThan(String value) {
            addCriterion("CM_PERSONALPATH >", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_PERSONALPATH >=", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathLessThan(String value) {
            addCriterion("CM_PERSONALPATH <", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathLessThanOrEqualTo(String value) {
            addCriterion("CM_PERSONALPATH <=", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathLike(String value) {
            addCriterion("CM_PERSONALPATH like", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathNotLike(String value) {
            addCriterion("CM_PERSONALPATH not like", value, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathIn(List<String> values) {
            addCriterion("CM_PERSONALPATH in", values, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathNotIn(List<String> values) {
            addCriterion("CM_PERSONALPATH not in", values, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathBetween(String value1, String value2) {
            addCriterion("CM_PERSONALPATH between", value1, value2, "cmPersonalpath");
            return (Criteria) this;
        }

        public Criteria andCmPersonalpathNotBetween(String value1, String value2) {
            addCriterion("CM_PERSONALPATH not between", value1, value2, "cmPersonalpath");
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

        public Criteria andCmShopeaddressIsNull() {
            addCriterion("CM_SHOPEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressIsNotNull() {
            addCriterion("CM_SHOPEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS =", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressNotEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS <>", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressGreaterThan(String value) {
            addCriterion("CM_SHOPEADDRESS >", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS >=", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressLessThan(String value) {
            addCriterion("CM_SHOPEADDRESS <", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressLessThanOrEqualTo(String value) {
            addCriterion("CM_SHOPEADDRESS <=", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressLike(String value) {
            addCriterion("CM_SHOPEADDRESS like", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressNotLike(String value) {
            addCriterion("CM_SHOPEADDRESS not like", value, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressIn(List<String> values) {
            addCriterion("CM_SHOPEADDRESS in", values, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressNotIn(List<String> values) {
            addCriterion("CM_SHOPEADDRESS not in", values, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressBetween(String value1, String value2) {
            addCriterion("CM_SHOPEADDRESS between", value1, value2, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShopeaddressNotBetween(String value1, String value2) {
            addCriterion("CM_SHOPEADDRESS not between", value1, value2, "cmShopeaddress");
            return (Criteria) this;
        }

        public Criteria andCmShoplonIsNull() {
            addCriterion("CM_SHOPLON is null");
            return (Criteria) this;
        }

        public Criteria andCmShoplonIsNotNull() {
            addCriterion("CM_SHOPLON is not null");
            return (Criteria) this;
        }

        public Criteria andCmShoplonEqualTo(Double value) {
            addCriterion("CM_SHOPLON =", value, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonNotEqualTo(Double value) {
            addCriterion("CM_SHOPLON <>", value, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonGreaterThan(Double value) {
            addCriterion("CM_SHOPLON >", value, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLON >=", value, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonLessThan(Double value) {
            addCriterion("CM_SHOPLON <", value, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonLessThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLON <=", value, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonIn(List<Double> values) {
            addCriterion("CM_SHOPLON in", values, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonNotIn(List<Double> values) {
            addCriterion("CM_SHOPLON not in", values, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLON between", value1, value2, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplonNotBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLON not between", value1, value2, "cmShoplon");
            return (Criteria) this;
        }

        public Criteria andCmShoplatIsNull() {
            addCriterion("CM_SHOPLAT is null");
            return (Criteria) this;
        }

        public Criteria andCmShoplatIsNotNull() {
            addCriterion("CM_SHOPLAT is not null");
            return (Criteria) this;
        }

        public Criteria andCmShoplatEqualTo(Double value) {
            addCriterion("CM_SHOPLAT =", value, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatNotEqualTo(Double value) {
            addCriterion("CM_SHOPLAT <>", value, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatGreaterThan(Double value) {
            addCriterion("CM_SHOPLAT >", value, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLAT >=", value, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatLessThan(Double value) {
            addCriterion("CM_SHOPLAT <", value, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatLessThanOrEqualTo(Double value) {
            addCriterion("CM_SHOPLAT <=", value, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatIn(List<Double> values) {
            addCriterion("CM_SHOPLAT in", values, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatNotIn(List<Double> values) {
            addCriterion("CM_SHOPLAT not in", values, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLAT between", value1, value2, "cmShoplat");
            return (Criteria) this;
        }

        public Criteria andCmShoplatNotBetween(Double value1, Double value2) {
            addCriterion("CM_SHOPLAT not between", value1, value2, "cmShoplat");
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