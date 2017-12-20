package cn.querydata.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QdDatabaseExample implements Serializable{
    @Override
    public String toString() {
        return "QdDatabaseExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QdDatabaseExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDbTypeIsNull() {
            addCriterion("db_type is null");
            return (Criteria) this;
        }

        public Criteria andDbTypeIsNotNull() {
            addCriterion("db_type is not null");
            return (Criteria) this;
        }

        public Criteria andDbTypeEqualTo(String value) {
            addCriterion("db_type =", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotEqualTo(String value) {
            addCriterion("db_type <>", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeGreaterThan(String value) {
            addCriterion("db_type >", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeGreaterThanOrEqualTo(String value) {
            addCriterion("db_type >=", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeLessThan(String value) {
            addCriterion("db_type <", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeLessThanOrEqualTo(String value) {
            addCriterion("db_type <=", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeLike(String value) {
            addCriterion("db_type like", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotLike(String value) {
            addCriterion("db_type not like", value, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeIn(List<String> values) {
            addCriterion("db_type in", values, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotIn(List<String> values) {
            addCriterion("db_type not in", values, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeBetween(String value1, String value2) {
            addCriterion("db_type between", value1, value2, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbTypeNotBetween(String value1, String value2) {
            addCriterion("db_type not between", value1, value2, "dbType");
            return (Criteria) this;
        }

        public Criteria andDbAddressIsNull() {
            addCriterion("db_address is null");
            return (Criteria) this;
        }

        public Criteria andDbAddressIsNotNull() {
            addCriterion("db_address is not null");
            return (Criteria) this;
        }

        public Criteria andDbAddressEqualTo(String value) {
            addCriterion("db_address =", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressNotEqualTo(String value) {
            addCriterion("db_address <>", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressGreaterThan(String value) {
            addCriterion("db_address >", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressGreaterThanOrEqualTo(String value) {
            addCriterion("db_address >=", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressLessThan(String value) {
            addCriterion("db_address <", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressLessThanOrEqualTo(String value) {
            addCriterion("db_address <=", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressLike(String value) {
            addCriterion("db_address like", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressNotLike(String value) {
            addCriterion("db_address not like", value, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressIn(List<String> values) {
            addCriterion("db_address in", values, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressNotIn(List<String> values) {
            addCriterion("db_address not in", values, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressBetween(String value1, String value2) {
            addCriterion("db_address between", value1, value2, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbAddressNotBetween(String value1, String value2) {
            addCriterion("db_address not between", value1, value2, "dbAddress");
            return (Criteria) this;
        }

        public Criteria andDbPortIsNull() {
            addCriterion("db_port is null");
            return (Criteria) this;
        }

        public Criteria andDbPortIsNotNull() {
            addCriterion("db_port is not null");
            return (Criteria) this;
        }

        public Criteria andDbPortEqualTo(String value) {
            addCriterion("db_port =", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotEqualTo(String value) {
            addCriterion("db_port <>", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortGreaterThan(String value) {
            addCriterion("db_port >", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortGreaterThanOrEqualTo(String value) {
            addCriterion("db_port >=", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortLessThan(String value) {
            addCriterion("db_port <", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortLessThanOrEqualTo(String value) {
            addCriterion("db_port <=", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortLike(String value) {
            addCriterion("db_port like", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotLike(String value) {
            addCriterion("db_port not like", value, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortIn(List<String> values) {
            addCriterion("db_port in", values, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotIn(List<String> values) {
            addCriterion("db_port not in", values, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortBetween(String value1, String value2) {
            addCriterion("db_port between", value1, value2, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbPortNotBetween(String value1, String value2) {
            addCriterion("db_port not between", value1, value2, "dbPort");
            return (Criteria) this;
        }

        public Criteria andDbNameIsNull() {
            addCriterion("db_name is null");
            return (Criteria) this;
        }

        public Criteria andDbNameIsNotNull() {
            addCriterion("db_name is not null");
            return (Criteria) this;
        }

        public Criteria andDbNameEqualTo(String value) {
            addCriterion("db_name =", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotEqualTo(String value) {
            addCriterion("db_name <>", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameGreaterThan(String value) {
            addCriterion("db_name >", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameGreaterThanOrEqualTo(String value) {
            addCriterion("db_name >=", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLessThan(String value) {
            addCriterion("db_name <", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLessThanOrEqualTo(String value) {
            addCriterion("db_name <=", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameLike(String value) {
            addCriterion("db_name like", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotLike(String value) {
            addCriterion("db_name not like", value, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameIn(List<String> values) {
            addCriterion("db_name in", values, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotIn(List<String> values) {
            addCriterion("db_name not in", values, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameBetween(String value1, String value2) {
            addCriterion("db_name between", value1, value2, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbNameNotBetween(String value1, String value2) {
            addCriterion("db_name not between", value1, value2, "dbName");
            return (Criteria) this;
        }

        public Criteria andDbUserIsNull() {
            addCriterion("db_user is null");
            return (Criteria) this;
        }

        public Criteria andDbUserIsNotNull() {
            addCriterion("db_user is not null");
            return (Criteria) this;
        }

        public Criteria andDbUserEqualTo(String value) {
            addCriterion("db_user =", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserNotEqualTo(String value) {
            addCriterion("db_user <>", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserGreaterThan(String value) {
            addCriterion("db_user >", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserGreaterThanOrEqualTo(String value) {
            addCriterion("db_user >=", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserLessThan(String value) {
            addCriterion("db_user <", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserLessThanOrEqualTo(String value) {
            addCriterion("db_user <=", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserLike(String value) {
            addCriterion("db_user like", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserNotLike(String value) {
            addCriterion("db_user not like", value, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserIn(List<String> values) {
            addCriterion("db_user in", values, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserNotIn(List<String> values) {
            addCriterion("db_user not in", values, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserBetween(String value1, String value2) {
            addCriterion("db_user between", value1, value2, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbUserNotBetween(String value1, String value2) {
            addCriterion("db_user not between", value1, value2, "dbUser");
            return (Criteria) this;
        }

        public Criteria andDbPasswdIsNull() {
            addCriterion("db_passwd is null");
            return (Criteria) this;
        }

        public Criteria andDbPasswdIsNotNull() {
            addCriterion("db_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andDbPasswdEqualTo(String value) {
            addCriterion("db_passwd =", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdNotEqualTo(String value) {
            addCriterion("db_passwd <>", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdGreaterThan(String value) {
            addCriterion("db_passwd >", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("db_passwd >=", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdLessThan(String value) {
            addCriterion("db_passwd <", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdLessThanOrEqualTo(String value) {
            addCriterion("db_passwd <=", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdLike(String value) {
            addCriterion("db_passwd like", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdNotLike(String value) {
            addCriterion("db_passwd not like", value, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdIn(List<String> values) {
            addCriterion("db_passwd in", values, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdNotIn(List<String> values) {
            addCriterion("db_passwd not in", values, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdBetween(String value1, String value2) {
            addCriterion("db_passwd between", value1, value2, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbPasswdNotBetween(String value1, String value2) {
            addCriterion("db_passwd not between", value1, value2, "dbPasswd");
            return (Criteria) this;
        }

        public Criteria andDbStatusIsNull() {
            addCriterion("db_status is null");
            return (Criteria) this;
        }

        public Criteria andDbStatusIsNotNull() {
            addCriterion("db_status is not null");
            return (Criteria) this;
        }

        public Criteria andDbStatusEqualTo(Integer value) {
            addCriterion("db_status =", value, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusNotEqualTo(Integer value) {
            addCriterion("db_status <>", value, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusGreaterThan(Integer value) {
            addCriterion("db_status >", value, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("db_status >=", value, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusLessThan(Integer value) {
            addCriterion("db_status <", value, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusLessThanOrEqualTo(Integer value) {
            addCriterion("db_status <=", value, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusIn(List<Integer> values) {
            addCriterion("db_status in", values, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusNotIn(List<Integer> values) {
            addCriterion("db_status not in", values, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusBetween(Integer value1, Integer value2) {
            addCriterion("db_status between", value1, value2, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andDbStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("db_status not between", value1, value2, "dbStatus");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
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