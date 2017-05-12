package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailsExample() {
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

        public Criteria andCmNumberIsNull() {
            addCriterion("CM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCmNumberIsNotNull() {
            addCriterion("CM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCmNumberEqualTo(Integer value) {
            addCriterion("CM_NUMBER =", value, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberNotEqualTo(Integer value) {
            addCriterion("CM_NUMBER <>", value, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberGreaterThan(Integer value) {
            addCriterion("CM_NUMBER >", value, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBER >=", value, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberLessThan(Integer value) {
            addCriterion("CM_NUMBER <", value, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberLessThanOrEqualTo(Integer value) {
            addCriterion("CM_NUMBER <=", value, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberIn(List<Integer> values) {
            addCriterion("CM_NUMBER in", values, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberNotIn(List<Integer> values) {
            addCriterion("CM_NUMBER not in", values, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBER between", value1, value2, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_NUMBER not between", value1, value2, "cmNumber");
            return (Criteria) this;
        }

        public Criteria andCmMoneyIsNull() {
            addCriterion("CM_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCmMoneyIsNotNull() {
            addCriterion("CM_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCmMoneyEqualTo(Double value) {
            addCriterion("CM_MONEY =", value, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyNotEqualTo(Double value) {
            addCriterion("CM_MONEY <>", value, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyGreaterThan(Double value) {
            addCriterion("CM_MONEY >", value, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_MONEY >=", value, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyLessThan(Double value) {
            addCriterion("CM_MONEY <", value, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyLessThanOrEqualTo(Double value) {
            addCriterion("CM_MONEY <=", value, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyIn(List<Double> values) {
            addCriterion("CM_MONEY in", values, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyNotIn(List<Double> values) {
            addCriterion("CM_MONEY not in", values, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyBetween(Double value1, Double value2) {
            addCriterion("CM_MONEY between", value1, value2, "cmMoney");
            return (Criteria) this;
        }

        public Criteria andCmMoneyNotBetween(Double value1, Double value2) {
            addCriterion("CM_MONEY not between", value1, value2, "cmMoney");
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

        public Criteria andCmServicestateIsNull() {
            addCriterion("CM_SERVICESTATE is null");
            return (Criteria) this;
        }

        public Criteria andCmServicestateIsNotNull() {
            addCriterion("CM_SERVICESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmServicestateEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE =", value, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateNotEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE <>", value, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateGreaterThan(Integer value) {
            addCriterion("CM_SERVICESTATE >", value, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE >=", value, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateLessThan(Integer value) {
            addCriterion("CM_SERVICESTATE <", value, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SERVICESTATE <=", value, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateIn(List<Integer> values) {
            addCriterion("CM_SERVICESTATE in", values, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateNotIn(List<Integer> values) {
            addCriterion("CM_SERVICESTATE not in", values, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateBetween(Integer value1, Integer value2) {
            addCriterion("CM_SERVICESTATE between", value1, value2, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmServicestateNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SERVICESTATE not between", value1, value2, "cmServicestate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateIsNull() {
            addCriterion("CM_SELLERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateIsNotNull() {
            addCriterion("CM_SELLERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE =", value, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateNotEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE <>", value, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateGreaterThan(Integer value) {
            addCriterion("CM_SELLERSTATE >", value, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE >=", value, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateLessThan(Integer value) {
            addCriterion("CM_SELLERSTATE <", value, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SELLERSTATE <=", value, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateIn(List<Integer> values) {
            addCriterion("CM_SELLERSTATE in", values, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateNotIn(List<Integer> values) {
            addCriterion("CM_SELLERSTATE not in", values, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateBetween(Integer value1, Integer value2) {
            addCriterion("CM_SELLERSTATE between", value1, value2, "cmSellerstate");
            return (Criteria) this;
        }

        public Criteria andCmSellerstateNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SELLERSTATE not between", value1, value2, "cmSellerstate");
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