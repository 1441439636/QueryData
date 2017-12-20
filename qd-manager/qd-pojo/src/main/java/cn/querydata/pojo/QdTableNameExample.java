package cn.querydata.pojo;

import java.util.ArrayList;
import java.util.List;

public class QdTableNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QdTableNameExample() {
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

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableChNameIsNull() {
            addCriterion("table_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andTableChNameIsNotNull() {
            addCriterion("table_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableChNameEqualTo(String value) {
            addCriterion("table_ch_name =", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameNotEqualTo(String value) {
            addCriterion("table_ch_name <>", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameGreaterThan(String value) {
            addCriterion("table_ch_name >", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_ch_name >=", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameLessThan(String value) {
            addCriterion("table_ch_name <", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameLessThanOrEqualTo(String value) {
            addCriterion("table_ch_name <=", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameLike(String value) {
            addCriterion("table_ch_name like", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameNotLike(String value) {
            addCriterion("table_ch_name not like", value, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameIn(List<String> values) {
            addCriterion("table_ch_name in", values, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameNotIn(List<String> values) {
            addCriterion("table_ch_name not in", values, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameBetween(String value1, String value2) {
            addCriterion("table_ch_name between", value1, value2, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChNameNotBetween(String value1, String value2) {
            addCriterion("table_ch_name not between", value1, value2, "tableChName");
            return (Criteria) this;
        }

        public Criteria andTableChStatusIsNull() {
            addCriterion("table_ch_status is null");
            return (Criteria) this;
        }

        public Criteria andTableChStatusIsNotNull() {
            addCriterion("table_ch_status is not null");
            return (Criteria) this;
        }

        public Criteria andTableChStatusEqualTo(Integer value) {
            addCriterion("table_ch_status =", value, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusNotEqualTo(Integer value) {
            addCriterion("table_ch_status <>", value, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusGreaterThan(Integer value) {
            addCriterion("table_ch_status >", value, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_ch_status >=", value, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusLessThan(Integer value) {
            addCriterion("table_ch_status <", value, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusLessThanOrEqualTo(Integer value) {
            addCriterion("table_ch_status <=", value, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusIn(List<Integer> values) {
            addCriterion("table_ch_status in", values, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusNotIn(List<Integer> values) {
            addCriterion("table_ch_status not in", values, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusBetween(Integer value1, Integer value2) {
            addCriterion("table_ch_status between", value1, value2, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andTableChStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("table_ch_status not between", value1, value2, "tableChStatus");
            return (Criteria) this;
        }

        public Criteria andDbIdIsNull() {
            addCriterion("db_id is null");
            return (Criteria) this;
        }

        public Criteria andDbIdIsNotNull() {
            addCriterion("db_id is not null");
            return (Criteria) this;
        }

        public Criteria andDbIdEqualTo(Integer value) {
            addCriterion("db_id =", value, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdNotEqualTo(Integer value) {
            addCriterion("db_id <>", value, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdGreaterThan(Integer value) {
            addCriterion("db_id >", value, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("db_id >=", value, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdLessThan(Integer value) {
            addCriterion("db_id <", value, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdLessThanOrEqualTo(Integer value) {
            addCriterion("db_id <=", value, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdIn(List<Integer> values) {
            addCriterion("db_id in", values, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdNotIn(List<Integer> values) {
            addCriterion("db_id not in", values, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdBetween(Integer value1, Integer value2) {
            addCriterion("db_id between", value1, value2, "dbId");
            return (Criteria) this;
        }

        public Criteria andDbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("db_id not between", value1, value2, "dbId");
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