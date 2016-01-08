package com.coocaa.anniecode.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQueueIsNull() {
            addCriterion("queue is null");
            return (Criteria) this;
        }

        public Criteria andQueueIsNotNull() {
            addCriterion("queue is not null");
            return (Criteria) this;
        }

        public Criteria andQueueEqualTo(String value) {
            addCriterion("queue =", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotEqualTo(String value) {
            addCriterion("queue <>", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueGreaterThan(String value) {
            addCriterion("queue >", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueGreaterThanOrEqualTo(String value) {
            addCriterion("queue >=", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueLessThan(String value) {
            addCriterion("queue <", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueLessThanOrEqualTo(String value) {
            addCriterion("queue <=", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueLike(String value) {
            addCriterion("queue like", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotLike(String value) {
            addCriterion("queue not like", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueIn(List<String> values) {
            addCriterion("queue in", values, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotIn(List<String> values) {
            addCriterion("queue not in", values, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueBetween(String value1, String value2) {
            addCriterion("queue between", value1, value2, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotBetween(String value1, String value2) {
            addCriterion("queue not between", value1, value2, "queue");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andTimeDateIsNull() {
            addCriterion("time_date is null");
            return (Criteria) this;
        }

        public Criteria andTimeDateIsNotNull() {
            addCriterion("time_date is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDateEqualTo(Date value) {
            addCriterion("time_date =", value, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateNotEqualTo(Date value) {
            addCriterion("time_date <>", value, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateGreaterThan(Date value) {
            addCriterion("time_date >", value, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("time_date >=", value, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateLessThan(Date value) {
            addCriterion("time_date <", value, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateLessThanOrEqualTo(Date value) {
            addCriterion("time_date <=", value, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateIn(List<Date> values) {
            addCriterion("time_date in", values, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateNotIn(List<Date> values) {
            addCriterion("time_date not in", values, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateBetween(Date value1, Date value2) {
            addCriterion("time_date between", value1, value2, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeDateNotBetween(Date value1, Date value2) {
            addCriterion("time_date not between", value1, value2, "timeDate");
            return (Criteria) this;
        }

        public Criteria andTimeSecondIsNull() {
            addCriterion("time_second is null");
            return (Criteria) this;
        }

        public Criteria andTimeSecondIsNotNull() {
            addCriterion("time_second is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSecondEqualTo(Integer value) {
            addCriterion("time_second =", value, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondNotEqualTo(Integer value) {
            addCriterion("time_second <>", value, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondGreaterThan(Integer value) {
            addCriterion("time_second >", value, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_second >=", value, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondLessThan(Integer value) {
            addCriterion("time_second <", value, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondLessThanOrEqualTo(Integer value) {
            addCriterion("time_second <=", value, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondIn(List<Integer> values) {
            addCriterion("time_second in", values, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondNotIn(List<Integer> values) {
            addCriterion("time_second not in", values, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondBetween(Integer value1, Integer value2) {
            addCriterion("time_second between", value1, value2, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andTimeSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("time_second not between", value1, value2, "timeSecond");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
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