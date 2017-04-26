package com.sc.domain.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public RegisterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
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

        public Criteria andCmCodeIsNull() {
            addCriterion("CM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCmCodeIsNotNull() {
            addCriterion("CM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCmCodeEqualTo(Integer value) {
            addCriterion("CM_CODE =", value, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeNotEqualTo(Integer value) {
            addCriterion("CM_CODE <>", value, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeGreaterThan(Integer value) {
            addCriterion("CM_CODE >", value, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_CODE >=", value, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeLessThan(Integer value) {
            addCriterion("CM_CODE <", value, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CM_CODE <=", value, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeIn(List<Integer> values) {
            addCriterion("CM_CODE in", values, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeNotIn(List<Integer> values) {
            addCriterion("CM_CODE not in", values, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeBetween(Integer value1, Integer value2) {
            addCriterion("CM_CODE between", value1, value2, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_CODE not between", value1, value2, "cmCode");
            return (Criteria) this;
        }

        public Criteria andCmTimeIsNull() {
            addCriterion("CM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCmTimeIsNotNull() {
            addCriterion("CM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCmTimeEqualTo(Date value) {
            addCriterion("CM_TIME =", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotEqualTo(Date value) {
            addCriterion("CM_TIME <>", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeGreaterThan(Date value) {
            addCriterion("CM_TIME >", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CM_TIME >=", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeLessThan(Date value) {
            addCriterion("CM_TIME <", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeLessThanOrEqualTo(Date value) {
            addCriterion("CM_TIME <=", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeIn(List<Date> values) {
            addCriterion("CM_TIME in", values, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotIn(List<Date> values) {
            addCriterion("CM_TIME not in", values, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeBetween(Date value1, Date value2) {
            addCriterion("CM_TIME between", value1, value2, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotBetween(Date value1, Date value2) {
            addCriterion("CM_TIME not between", value1, value2, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmCountIsNull() {
            addCriterion("CM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCmCountIsNotNull() {
            addCriterion("CM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCmCountEqualTo(Integer value) {
            addCriterion("CM_COUNT =", value, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountNotEqualTo(Integer value) {
            addCriterion("CM_COUNT <>", value, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountGreaterThan(Integer value) {
            addCriterion("CM_COUNT >", value, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CM_COUNT >=", value, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountLessThan(Integer value) {
            addCriterion("CM_COUNT <", value, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountLessThanOrEqualTo(Integer value) {
            addCriterion("CM_COUNT <=", value, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountIn(List<Integer> values) {
            addCriterion("CM_COUNT in", values, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountNotIn(List<Integer> values) {
            addCriterion("CM_COUNT not in", values, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountBetween(Integer value1, Integer value2) {
            addCriterion("CM_COUNT between", value1, value2, "cmCount");
            return (Criteria) this;
        }

        public Criteria andCmCountNotBetween(Integer value1, Integer value2) {
            addCriterion("CM_COUNT not between", value1, value2, "cmCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_REGISTER
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 26 09:05:28 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TB_REGISTER
     *
     * @mbg.generated Wed Apr 26 09:05:28 CST 2017
     */
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