package cn.querydata.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QdColumnNameExample implements Serializable{
    @Override
    public String toString() {
        return "QdColumnNameExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QdColumnNameExample() {
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

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameIsNull() {
            addCriterion("column_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnChNameIsNotNull() {
            addCriterion("column_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnChNameEqualTo(String value) {
            addCriterion("column_ch_name =", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameNotEqualTo(String value) {
            addCriterion("column_ch_name <>", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameGreaterThan(String value) {
            addCriterion("column_ch_name >", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_ch_name >=", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameLessThan(String value) {
            addCriterion("column_ch_name <", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameLessThanOrEqualTo(String value) {
            addCriterion("column_ch_name <=", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameLike(String value) {
            addCriterion("column_ch_name like", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameNotLike(String value) {
            addCriterion("column_ch_name not like", value, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameIn(List<String> values) {
            addCriterion("column_ch_name in", values, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameNotIn(List<String> values) {
            addCriterion("column_ch_name not in", values, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameBetween(String value1, String value2) {
            addCriterion("column_ch_name between", value1, value2, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColumnChNameNotBetween(String value1, String value2) {
            addCriterion("column_ch_name not between", value1, value2, "columnChName");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusIsNull() {
            addCriterion("colmn_ch_status is null");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusIsNotNull() {
            addCriterion("colmn_ch_status is not null");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusEqualTo(Integer value) {
            addCriterion("colmn_ch_status =", value, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusNotEqualTo(Integer value) {
            addCriterion("colmn_ch_status <>", value, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusGreaterThan(Integer value) {
            addCriterion("colmn_ch_status >", value, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("colmn_ch_status >=", value, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusLessThan(Integer value) {
            addCriterion("colmn_ch_status <", value, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusLessThanOrEqualTo(Integer value) {
            addCriterion("colmn_ch_status <=", value, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusIn(List<Integer> values) {
            addCriterion("colmn_ch_status in", values, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusNotIn(List<Integer> values) {
            addCriterion("colmn_ch_status not in", values, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusBetween(Integer value1, Integer value2) {
            addCriterion("colmn_ch_status between", value1, value2, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColmnChStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("colmn_ch_status not between", value1, value2, "colmnChStatus");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeIsNull() {
            addCriterion("column_data_type is null");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeIsNotNull() {
            addCriterion("column_data_type is not null");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeEqualTo(String value) {
            addCriterion("column_data_type =", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeNotEqualTo(String value) {
            addCriterion("column_data_type <>", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeGreaterThan(String value) {
            addCriterion("column_data_type >", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("column_data_type >=", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeLessThan(String value) {
            addCriterion("column_data_type <", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeLessThanOrEqualTo(String value) {
            addCriterion("column_data_type <=", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeLike(String value) {
            addCriterion("column_data_type like", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeNotLike(String value) {
            addCriterion("column_data_type not like", value, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeIn(List<String> values) {
            addCriterion("column_data_type in", values, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeNotIn(List<String> values) {
            addCriterion("column_data_type not in", values, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeBetween(String value1, String value2) {
            addCriterion("column_data_type between", value1, value2, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnDataTypeNotBetween(String value1, String value2) {
            addCriterion("column_data_type not between", value1, value2, "columnDataType");
            return (Criteria) this;
        }

        public Criteria andColumnNoIsNull() {
            addCriterion("column_no is null");
            return (Criteria) this;
        }

        public Criteria andColumnNoIsNotNull() {
            addCriterion("column_no is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNoEqualTo(Integer value) {
            addCriterion("column_no =", value, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoNotEqualTo(Integer value) {
            addCriterion("column_no <>", value, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoGreaterThan(Integer value) {
            addCriterion("column_no >", value, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_no >=", value, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoLessThan(Integer value) {
            addCriterion("column_no <", value, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoLessThanOrEqualTo(Integer value) {
            addCriterion("column_no <=", value, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoIn(List<Integer> values) {
            addCriterion("column_no in", values, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoNotIn(List<Integer> values) {
            addCriterion("column_no not in", values, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoBetween(Integer value1, Integer value2) {
            addCriterion("column_no between", value1, value2, "columnNo");
            return (Criteria) this;
        }

        public Criteria andColumnNoNotBetween(Integer value1, Integer value2) {
            addCriterion("column_no not between", value1, value2, "columnNo");
            return (Criteria) this;
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