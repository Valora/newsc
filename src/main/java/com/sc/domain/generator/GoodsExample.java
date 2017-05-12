package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andCmGoodsidIsNull() {
            addCriterion("CM_GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidIsNotNull() {
            addCriterion("CM_GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidEqualTo(String value) {
            addCriterion("CM_GOODSID =", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotEqualTo(String value) {
            addCriterion("CM_GOODSID <>", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidGreaterThan(String value) {
            addCriterion("CM_GOODSID >", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID >=", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidLessThan(String value) {
            addCriterion("CM_GOODSID <", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID <=", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidLike(String value) {
            addCriterion("CM_GOODSID like", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotLike(String value) {
            addCriterion("CM_GOODSID not like", value, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidIn(List<String> values) {
            addCriterion("CM_GOODSID in", values, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotIn(List<String> values) {
            addCriterion("CM_GOODSID not in", values, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidBetween(String value1, String value2) {
            addCriterion("CM_GOODSID between", value1, value2, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsidNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSID not between", value1, value2, "cmGoodsid");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumIsNull() {
            addCriterion("CM_GOODSARTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumIsNotNull() {
            addCriterion("CM_GOODSARTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM =", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumNotEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM <>", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumGreaterThan(String value) {
            addCriterion("CM_GOODSARTNUM >", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM >=", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumLessThan(String value) {
            addCriterion("CM_GOODSARTNUM <", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM <=", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumLike(String value) {
            addCriterion("CM_GOODSARTNUM like", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumNotLike(String value) {
            addCriterion("CM_GOODSARTNUM not like", value, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumIn(List<String> values) {
            addCriterion("CM_GOODSARTNUM in", values, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumNotIn(List<String> values) {
            addCriterion("CM_GOODSARTNUM not in", values, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumBetween(String value1, String value2) {
            addCriterion("CM_GOODSARTNUM between", value1, value2, "cmGoodsartnum");
            return (Criteria) this;
        }

        public Criteria andCmGoodsartnumNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSARTNUM not between", value1, value2, "cmGoodsartnum");
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

        public Criteria andCmClassifyidIsNull() {
            addCriterion("CM_CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidIsNotNull() {
            addCriterion("CM_CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID =", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidNotEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <>", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidGreaterThan(Integer value) {
            addCriterion("CM_CLASSIFYID >", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID >=", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidLessThan(Integer value) {
            addCriterion("CM_CLASSIFYID <", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidLessThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <=", value, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID in", values, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidNotIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID not in", values, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID between", value1, value2, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID not between", value1, value2, "cmClassifyid");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsIsNull() {
            addCriterion("CM_CLASSIFYTABS is null");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsIsNotNull() {
            addCriterion("CM_CLASSIFYTABS is not null");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS =", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsNotEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS <>", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsGreaterThan(String value) {
            addCriterion("CM_CLASSIFYTABS >", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS >=", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsLessThan(String value) {
            addCriterion("CM_CLASSIFYTABS <", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsLessThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS <=", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsLike(String value) {
            addCriterion("CM_CLASSIFYTABS like", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsNotLike(String value) {
            addCriterion("CM_CLASSIFYTABS not like", value, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsIn(List<String> values) {
            addCriterion("CM_CLASSIFYTABS in", values, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsNotIn(List<String> values) {
            addCriterion("CM_CLASSIFYTABS not in", values, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYTABS between", value1, value2, "cmClassifytabs");
            return (Criteria) this;
        }

        public Criteria andCmClassifytabsNotBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYTABS not between", value1, value2, "cmClassifytabs");
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

        public Criteria andCmTitleIsNull() {
            addCriterion("CM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCmTitleIsNotNull() {
            addCriterion("CM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCmTitleEqualTo(String value) {
            addCriterion("CM_TITLE =", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotEqualTo(String value) {
            addCriterion("CM_TITLE <>", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleGreaterThan(String value) {
            addCriterion("CM_TITLE >", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TITLE >=", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleLessThan(String value) {
            addCriterion("CM_TITLE <", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleLessThanOrEqualTo(String value) {
            addCriterion("CM_TITLE <=", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleLike(String value) {
            addCriterion("CM_TITLE like", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotLike(String value) {
            addCriterion("CM_TITLE not like", value, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleIn(List<String> values) {
            addCriterion("CM_TITLE in", values, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotIn(List<String> values) {
            addCriterion("CM_TITLE not in", values, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleBetween(String value1, String value2) {
            addCriterion("CM_TITLE between", value1, value2, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmTitleNotBetween(String value1, String value2) {
            addCriterion("CM_TITLE not between", value1, value2, "cmTitle");
            return (Criteria) this;
        }

        public Criteria andCmSalesIsNull() {
            addCriterion("CM_SALES is null");
            return (Criteria) this;
        }

        public Criteria andCmSalesIsNotNull() {
            addCriterion("CM_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andCmSalesEqualTo(Integer value) {
            addCriterion("CM_SALES =", value, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesNotEqualTo(Integer value) {
            addCriterion("CM_SALES <>", value, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesGreaterThan(Integer value) {
            addCriterion("CM_SALES >", value, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SALES >=", value, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesLessThan(Integer value) {
            addCriterion("CM_SALES <", value, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SALES <=", value, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesIn(List<Integer> values) {
            addCriterion("CM_SALES in", values, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesNotIn(List<Integer> values) {
            addCriterion("CM_SALES not in", values, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesBetween(Integer value1, Integer value2) {
            addCriterion("CM_SALES between", value1, value2, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SALES not between", value1, value2, "cmSales");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceIsNull() {
            addCriterion("CM_ORIGINALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceIsNotNull() {
            addCriterion("CM_ORIGINALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE =", value, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceNotEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE <>", value, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceGreaterThan(Double value) {
            addCriterion("CM_ORIGINALPRICE >", value, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE >=", value, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceLessThan(Double value) {
            addCriterion("CM_ORIGINALPRICE <", value, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceLessThanOrEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE <=", value, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceIn(List<Double> values) {
            addCriterion("CM_ORIGINALPRICE in", values, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceNotIn(List<Double> values) {
            addCriterion("CM_ORIGINALPRICE not in", values, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceBetween(Double value1, Double value2) {
            addCriterion("CM_ORIGINALPRICE between", value1, value2, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmOriginalpriceNotBetween(Double value1, Double value2) {
            addCriterion("CM_ORIGINALPRICE not between", value1, value2, "cmOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceIsNull() {
            addCriterion("CM_PRESENTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceIsNotNull() {
            addCriterion("CM_PRESENTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE =", value, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceNotEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE <>", value, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceGreaterThan(Double value) {
            addCriterion("CM_PRESENTPRICE >", value, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE >=", value, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceLessThan(Double value) {
            addCriterion("CM_PRESENTPRICE <", value, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceLessThanOrEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE <=", value, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceIn(List<Double> values) {
            addCriterion("CM_PRESENTPRICE in", values, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceNotIn(List<Double> values) {
            addCriterion("CM_PRESENTPRICE not in", values, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceBetween(Double value1, Double value2) {
            addCriterion("CM_PRESENTPRICE between", value1, value2, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmPresentpriceNotBetween(Double value1, Double value2) {
            addCriterion("CM_PRESENTPRICE not between", value1, value2, "cmPresentprice");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathIsNull() {
            addCriterion("CM_MAINFIGUREPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathIsNotNull() {
            addCriterion("CM_MAINFIGUREPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH =", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathNotEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH <>", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathGreaterThan(String value) {
            addCriterion("CM_MAINFIGUREPATH >", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH >=", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathLessThan(String value) {
            addCriterion("CM_MAINFIGUREPATH <", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathLessThanOrEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH <=", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathLike(String value) {
            addCriterion("CM_MAINFIGUREPATH like", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathNotLike(String value) {
            addCriterion("CM_MAINFIGUREPATH not like", value, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathIn(List<String> values) {
            addCriterion("CM_MAINFIGUREPATH in", values, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathNotIn(List<String> values) {
            addCriterion("CM_MAINFIGUREPATH not in", values, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathBetween(String value1, String value2) {
            addCriterion("CM_MAINFIGUREPATH between", value1, value2, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmMainfigurepathNotBetween(String value1, String value2) {
            addCriterion("CM_MAINFIGUREPATH not between", value1, value2, "cmMainfigurepath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathIsNull() {
            addCriterion("CM_HORIZONTALPATH is null");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathIsNotNull() {
            addCriterion("CM_HORIZONTALPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH =", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathNotEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH <>", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathGreaterThan(String value) {
            addCriterion("CM_HORIZONTALPATH >", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH >=", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathLessThan(String value) {
            addCriterion("CM_HORIZONTALPATH <", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathLessThanOrEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH <=", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathLike(String value) {
            addCriterion("CM_HORIZONTALPATH like", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathNotLike(String value) {
            addCriterion("CM_HORIZONTALPATH not like", value, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathIn(List<String> values) {
            addCriterion("CM_HORIZONTALPATH in", values, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathNotIn(List<String> values) {
            addCriterion("CM_HORIZONTALPATH not in", values, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathBetween(String value1, String value2) {
            addCriterion("CM_HORIZONTALPATH between", value1, value2, "cmHorizontalpath");
            return (Criteria) this;
        }

        public Criteria andCmHorizontalpathNotBetween(String value1, String value2) {
            addCriterion("CM_HORIZONTALPATH not between", value1, value2, "cmHorizontalpath");
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

        public Criteria andCmIsoffIsNull() {
            addCriterion("CM_ISOFF is null");
            return (Criteria) this;
        }

        public Criteria andCmIsoffIsNotNull() {
            addCriterion("CM_ISOFF is not null");
            return (Criteria) this;
        }

        public Criteria andCmIsoffEqualTo(Integer value) {
            addCriterion("CM_ISOFF =", value, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffNotEqualTo(Integer value) {
            addCriterion("CM_ISOFF <>", value, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffGreaterThan(Integer value) {
            addCriterion("CM_ISOFF >", value, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISOFF >=", value, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffLessThan(Integer value) {
            addCriterion("CM_ISOFF <", value, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISOFF <=", value, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffIn(List<Integer> values) {
            addCriterion("CM_ISOFF in", values, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffNotIn(List<Integer> values) {
            addCriterion("CM_ISOFF not in", values, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISOFF between", value1, value2, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIsoffNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISOFF not between", value1, value2, "cmIsoff");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionIsNull() {
            addCriterion("CM_ISPROMOTION is null");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionIsNotNull() {
            addCriterion("CM_ISPROMOTION is not null");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION =", value, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionNotEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION <>", value, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionGreaterThan(Integer value) {
            addCriterion("CM_ISPROMOTION >", value, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION >=", value, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionLessThan(Integer value) {
            addCriterion("CM_ISPROMOTION <", value, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION <=", value, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionIn(List<Integer> values) {
            addCriterion("CM_ISPROMOTION in", values, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionNotIn(List<Integer> values) {
            addCriterion("CM_ISPROMOTION not in", values, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISPROMOTION between", value1, value2, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmIspromotionNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISPROMOTION not between", value1, value2, "cmIspromotion");
            return (Criteria) this;
        }

        public Criteria andCmSpecIsNull() {
            addCriterion("CM_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andCmSpecIsNotNull() {
            addCriterion("CM_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andCmSpecEqualTo(String value) {
            addCriterion("CM_SPEC =", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecNotEqualTo(String value) {
            addCriterion("CM_SPEC <>", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecGreaterThan(String value) {
            addCriterion("CM_SPEC >", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SPEC >=", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecLessThan(String value) {
            addCriterion("CM_SPEC <", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecLessThanOrEqualTo(String value) {
            addCriterion("CM_SPEC <=", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecLike(String value) {
            addCriterion("CM_SPEC like", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecNotLike(String value) {
            addCriterion("CM_SPEC not like", value, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecIn(List<String> values) {
            addCriterion("CM_SPEC in", values, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecNotIn(List<String> values) {
            addCriterion("CM_SPEC not in", values, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecBetween(String value1, String value2) {
            addCriterion("CM_SPEC between", value1, value2, "cmSpec");
            return (Criteria) this;
        }

        public Criteria andCmSpecNotBetween(String value1, String value2) {
            addCriterion("CM_SPEC not between", value1, value2, "cmSpec");
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