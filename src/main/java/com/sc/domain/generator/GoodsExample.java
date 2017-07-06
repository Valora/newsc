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

        public Criteria andCM_GOODSIDIsNull() {
            addCriterion("CM_GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIsNotNull() {
            addCriterion("CM_GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDEqualTo(String value) {
            addCriterion("CM_GOODSID =", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotEqualTo(String value) {
            addCriterion("CM_GOODSID <>", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDGreaterThan(String value) {
            addCriterion("CM_GOODSID >", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID >=", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLessThan(String value) {
            addCriterion("CM_GOODSID <", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSID <=", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDLike(String value) {
            addCriterion("CM_GOODSID like", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotLike(String value) {
            addCriterion("CM_GOODSID not like", value, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDIn(List<String> values) {
            addCriterion("CM_GOODSID in", values, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotIn(List<String> values) {
            addCriterion("CM_GOODSID not in", values, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDBetween(String value1, String value2) {
            addCriterion("CM_GOODSID between", value1, value2, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSIDNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSID not between", value1, value2, "CM_GOODSID");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMIsNull() {
            addCriterion("CM_GOODSARTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMIsNotNull() {
            addCriterion("CM_GOODSARTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM =", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMNotEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM <>", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMGreaterThan(String value) {
            addCriterion("CM_GOODSARTNUM >", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMGreaterThanOrEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM >=", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMLessThan(String value) {
            addCriterion("CM_GOODSARTNUM <", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMLessThanOrEqualTo(String value) {
            addCriterion("CM_GOODSARTNUM <=", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMLike(String value) {
            addCriterion("CM_GOODSARTNUM like", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMNotLike(String value) {
            addCriterion("CM_GOODSARTNUM not like", value, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMIn(List<String> values) {
            addCriterion("CM_GOODSARTNUM in", values, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMNotIn(List<String> values) {
            addCriterion("CM_GOODSARTNUM not in", values, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMBetween(String value1, String value2) {
            addCriterion("CM_GOODSARTNUM between", value1, value2, "CM_GOODSARTNUM");
            return (Criteria) this;
        }

        public Criteria andCM_GOODSARTNUMNotBetween(String value1, String value2) {
            addCriterion("CM_GOODSARTNUM not between", value1, value2, "CM_GOODSARTNUM");
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

        public Criteria andCM_CLASSIFYIDIsNull() {
            addCriterion("CM_CLASSIFYID is null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDIsNotNull() {
            addCriterion("CM_CLASSIFYID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID =", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDNotEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <>", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDGreaterThan(Integer value) {
            addCriterion("CM_CLASSIFYID >", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID >=", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDLessThan(Integer value) {
            addCriterion("CM_CLASSIFYID <", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_CLASSIFYID <=", value, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID in", values, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDNotIn(List<Integer> values) {
            addCriterion("CM_CLASSIFYID not in", values, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID between", value1, value2, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_CLASSIFYID not between", value1, value2, "CM_CLASSIFYID");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSIsNull() {
            addCriterion("CM_CLASSIFYTABS is null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSIsNotNull() {
            addCriterion("CM_CLASSIFYTABS is not null");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS =", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSNotEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS <>", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSGreaterThan(String value) {
            addCriterion("CM_CLASSIFYTABS >", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSGreaterThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS >=", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSLessThan(String value) {
            addCriterion("CM_CLASSIFYTABS <", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSLessThanOrEqualTo(String value) {
            addCriterion("CM_CLASSIFYTABS <=", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSLike(String value) {
            addCriterion("CM_CLASSIFYTABS like", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSNotLike(String value) {
            addCriterion("CM_CLASSIFYTABS not like", value, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSIn(List<String> values) {
            addCriterion("CM_CLASSIFYTABS in", values, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSNotIn(List<String> values) {
            addCriterion("CM_CLASSIFYTABS not in", values, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYTABS between", value1, value2, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_CLASSIFYTABSNotBetween(String value1, String value2) {
            addCriterion("CM_CLASSIFYTABS not between", value1, value2, "CM_CLASSIFYTABS");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDIsNull() {
            addCriterion("CM_BRANDID is null");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDIsNotNull() {
            addCriterion("CM_BRANDID is not null");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDEqualTo(Integer value) {
            addCriterion("CM_BRANDID =", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDNotEqualTo(Integer value) {
            addCriterion("CM_BRANDID <>", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDGreaterThan(Integer value) {
            addCriterion("CM_BRANDID >", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID >=", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDLessThan(Integer value) {
            addCriterion("CM_BRANDID <", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDLessThanOrEqualTo(Integer value) {
            addCriterion("CM_BRANDID <=", value, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDIn(List<Integer> values) {
            addCriterion("CM_BRANDID in", values, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDNotIn(List<Integer> values) {
            addCriterion("CM_BRANDID not in", values, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID between", value1, value2, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_BRANDIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_BRANDID not between", value1, value2, "CM_BRANDID");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEIsNull() {
            addCriterion("CM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEIsNotNull() {
            addCriterion("CM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEEqualTo(String value) {
            addCriterion("CM_TITLE =", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotEqualTo(String value) {
            addCriterion("CM_TITLE <>", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEGreaterThan(String value) {
            addCriterion("CM_TITLE >", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEGreaterThanOrEqualTo(String value) {
            addCriterion("CM_TITLE >=", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLELessThan(String value) {
            addCriterion("CM_TITLE <", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLELessThanOrEqualTo(String value) {
            addCriterion("CM_TITLE <=", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLELike(String value) {
            addCriterion("CM_TITLE like", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotLike(String value) {
            addCriterion("CM_TITLE not like", value, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEIn(List<String> values) {
            addCriterion("CM_TITLE in", values, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotIn(List<String> values) {
            addCriterion("CM_TITLE not in", values, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLEBetween(String value1, String value2) {
            addCriterion("CM_TITLE between", value1, value2, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_TITLENotBetween(String value1, String value2) {
            addCriterion("CM_TITLE not between", value1, value2, "CM_TITLE");
            return (Criteria) this;
        }

        public Criteria andCM_SALESIsNull() {
            addCriterion("CM_SALES is null");
            return (Criteria) this;
        }

        public Criteria andCM_SALESIsNotNull() {
            addCriterion("CM_SALES is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SALESEqualTo(Integer value) {
            addCriterion("CM_SALES =", value, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESNotEqualTo(Integer value) {
            addCriterion("CM_SALES <>", value, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESGreaterThan(Integer value) {
            addCriterion("CM_SALES >", value, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_SALES >=", value, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESLessThan(Integer value) {
            addCriterion("CM_SALES <", value, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESLessThanOrEqualTo(Integer value) {
            addCriterion("CM_SALES <=", value, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESIn(List<Integer> values) {
            addCriterion("CM_SALES in", values, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESNotIn(List<Integer> values) {
            addCriterion("CM_SALES not in", values, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESBetween(Integer value1, Integer value2) {
            addCriterion("CM_SALES between", value1, value2, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_SALESNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_SALES not between", value1, value2, "CM_SALES");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEIsNull() {
            addCriterion("CM_ORIGINALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEIsNotNull() {
            addCriterion("CM_ORIGINALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE =", value, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICENotEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE <>", value, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEGreaterThan(Double value) {
            addCriterion("CM_ORIGINALPRICE >", value, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE >=", value, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICELessThan(Double value) {
            addCriterion("CM_ORIGINALPRICE <", value, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICELessThanOrEqualTo(Double value) {
            addCriterion("CM_ORIGINALPRICE <=", value, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEIn(List<Double> values) {
            addCriterion("CM_ORIGINALPRICE in", values, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICENotIn(List<Double> values) {
            addCriterion("CM_ORIGINALPRICE not in", values, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICEBetween(Double value1, Double value2) {
            addCriterion("CM_ORIGINALPRICE between", value1, value2, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_ORIGINALPRICENotBetween(Double value1, Double value2) {
            addCriterion("CM_ORIGINALPRICE not between", value1, value2, "CM_ORIGINALPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEIsNull() {
            addCriterion("CM_PRESENTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEIsNotNull() {
            addCriterion("CM_PRESENTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE =", value, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICENotEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE <>", value, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEGreaterThan(Double value) {
            addCriterion("CM_PRESENTPRICE >", value, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE >=", value, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICELessThan(Double value) {
            addCriterion("CM_PRESENTPRICE <", value, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICELessThanOrEqualTo(Double value) {
            addCriterion("CM_PRESENTPRICE <=", value, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEIn(List<Double> values) {
            addCriterion("CM_PRESENTPRICE in", values, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICENotIn(List<Double> values) {
            addCriterion("CM_PRESENTPRICE not in", values, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICEBetween(Double value1, Double value2) {
            addCriterion("CM_PRESENTPRICE between", value1, value2, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_PRESENTPRICENotBetween(Double value1, Double value2) {
            addCriterion("CM_PRESENTPRICE not between", value1, value2, "CM_PRESENTPRICE");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHIsNull() {
            addCriterion("CM_MAINFIGUREPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHIsNotNull() {
            addCriterion("CM_MAINFIGUREPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH =", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHNotEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH <>", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHGreaterThan(String value) {
            addCriterion("CM_MAINFIGUREPATH >", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH >=", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHLessThan(String value) {
            addCriterion("CM_MAINFIGUREPATH <", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_MAINFIGUREPATH <=", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHLike(String value) {
            addCriterion("CM_MAINFIGUREPATH like", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHNotLike(String value) {
            addCriterion("CM_MAINFIGUREPATH not like", value, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHIn(List<String> values) {
            addCriterion("CM_MAINFIGUREPATH in", values, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHNotIn(List<String> values) {
            addCriterion("CM_MAINFIGUREPATH not in", values, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHBetween(String value1, String value2) {
            addCriterion("CM_MAINFIGUREPATH between", value1, value2, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_MAINFIGUREPATHNotBetween(String value1, String value2) {
            addCriterion("CM_MAINFIGUREPATH not between", value1, value2, "CM_MAINFIGUREPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHIsNull() {
            addCriterion("CM_HORIZONTALPATH is null");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHIsNotNull() {
            addCriterion("CM_HORIZONTALPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH =", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHNotEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH <>", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHGreaterThan(String value) {
            addCriterion("CM_HORIZONTALPATH >", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHGreaterThanOrEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH >=", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHLessThan(String value) {
            addCriterion("CM_HORIZONTALPATH <", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHLessThanOrEqualTo(String value) {
            addCriterion("CM_HORIZONTALPATH <=", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHLike(String value) {
            addCriterion("CM_HORIZONTALPATH like", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHNotLike(String value) {
            addCriterion("CM_HORIZONTALPATH not like", value, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHIn(List<String> values) {
            addCriterion("CM_HORIZONTALPATH in", values, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHNotIn(List<String> values) {
            addCriterion("CM_HORIZONTALPATH not in", values, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHBetween(String value1, String value2) {
            addCriterion("CM_HORIZONTALPATH between", value1, value2, "CM_HORIZONTALPATH");
            return (Criteria) this;
        }

        public Criteria andCM_HORIZONTALPATHNotBetween(String value1, String value2) {
            addCriterion("CM_HORIZONTALPATH not between", value1, value2, "CM_HORIZONTALPATH");
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

        public Criteria andCM_ISOFFIsNull() {
            addCriterion("CM_ISOFF is null");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFIsNotNull() {
            addCriterion("CM_ISOFF is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFEqualTo(Integer value) {
            addCriterion("CM_ISOFF =", value, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFNotEqualTo(Integer value) {
            addCriterion("CM_ISOFF <>", value, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFGreaterThan(Integer value) {
            addCriterion("CM_ISOFF >", value, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISOFF >=", value, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFLessThan(Integer value) {
            addCriterion("CM_ISOFF <", value, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISOFF <=", value, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFIn(List<Integer> values) {
            addCriterion("CM_ISOFF in", values, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFNotIn(List<Integer> values) {
            addCriterion("CM_ISOFF not in", values, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISOFF between", value1, value2, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISOFFNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISOFF not between", value1, value2, "CM_ISOFF");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONIsNull() {
            addCriterion("CM_ISPROMOTION is null");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONIsNotNull() {
            addCriterion("CM_ISPROMOTION is not null");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION =", value, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONNotEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION <>", value, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONGreaterThan(Integer value) {
            addCriterion("CM_ISPROMOTION >", value, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION >=", value, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONLessThan(Integer value) {
            addCriterion("CM_ISPROMOTION <", value, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONLessThanOrEqualTo(Integer value) {
            addCriterion("CM_ISPROMOTION <=", value, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONIn(List<Integer> values) {
            addCriterion("CM_ISPROMOTION in", values, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONNotIn(List<Integer> values) {
            addCriterion("CM_ISPROMOTION not in", values, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISPROMOTION between", value1, value2, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_ISPROMOTIONNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_ISPROMOTION not between", value1, value2, "CM_ISPROMOTION");
            return (Criteria) this;
        }

        public Criteria andCM_SPECIsNull() {
            addCriterion("CM_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andCM_SPECIsNotNull() {
            addCriterion("CM_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andCM_SPECEqualTo(String value) {
            addCriterion("CM_SPEC =", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECNotEqualTo(String value) {
            addCriterion("CM_SPEC <>", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECGreaterThan(String value) {
            addCriterion("CM_SPEC >", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECGreaterThanOrEqualTo(String value) {
            addCriterion("CM_SPEC >=", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECLessThan(String value) {
            addCriterion("CM_SPEC <", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECLessThanOrEqualTo(String value) {
            addCriterion("CM_SPEC <=", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECLike(String value) {
            addCriterion("CM_SPEC like", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECNotLike(String value) {
            addCriterion("CM_SPEC not like", value, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECIn(List<String> values) {
            addCriterion("CM_SPEC in", values, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECNotIn(List<String> values) {
            addCriterion("CM_SPEC not in", values, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECBetween(String value1, String value2) {
            addCriterion("CM_SPEC between", value1, value2, "CM_SPEC");
            return (Criteria) this;
        }

        public Criteria andCM_SPECNotBetween(String value1, String value2) {
            addCriterion("CM_SPEC not between", value1, value2, "CM_SPEC");
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