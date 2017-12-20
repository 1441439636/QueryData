package cn.querydata.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QdAdminExample implements Serializable{
    @Override
    public String toString() {
        return "QdAdminExample{" +
                "orderByClause='" + orderByClause + '\'' +
                ", distinct=" + distinct +
                ", oredCriteria=" + oredCriteria +
                '}';
    }

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QdAdminExample() {
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

        public Criteria andAdminNumIsNull() {
            addCriterion("admin_num is null");
            return (Criteria) this;
        }

        public Criteria andAdminNumIsNotNull() {
            addCriterion("admin_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNumEqualTo(String value) {
            addCriterion("admin_num =", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotEqualTo(String value) {
            addCriterion("admin_num <>", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumGreaterThan(String value) {
            addCriterion("admin_num >", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumGreaterThanOrEqualTo(String value) {
            addCriterion("admin_num >=", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumLessThan(String value) {
            addCriterion("admin_num <", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumLessThanOrEqualTo(String value) {
            addCriterion("admin_num <=", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumLike(String value) {
            addCriterion("admin_num like", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotLike(String value) {
            addCriterion("admin_num not like", value, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumIn(List<String> values) {
            addCriterion("admin_num in", values, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotIn(List<String> values) {
            addCriterion("admin_num not in", values, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumBetween(String value1, String value2) {
            addCriterion("admin_num between", value1, value2, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminNumNotBetween(String value1, String value2) {
            addCriterion("admin_num not between", value1, value2, "adminNum");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdIsNull() {
            addCriterion("admin_passwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdIsNotNull() {
            addCriterion("admin_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdEqualTo(String value) {
            addCriterion("admin_passwd =", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdNotEqualTo(String value) {
            addCriterion("admin_passwd <>", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdGreaterThan(String value) {
            addCriterion("admin_passwd >", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_passwd >=", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdLessThan(String value) {
            addCriterion("admin_passwd <", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdLessThanOrEqualTo(String value) {
            addCriterion("admin_passwd <=", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdLike(String value) {
            addCriterion("admin_passwd like", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdNotLike(String value) {
            addCriterion("admin_passwd not like", value, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdIn(List<String> values) {
            addCriterion("admin_passwd in", values, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdNotIn(List<String> values) {
            addCriterion("admin_passwd not in", values, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdBetween(String value1, String value2) {
            addCriterion("admin_passwd between", value1, value2, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminPasswdNotBetween(String value1, String value2) {
            addCriterion("admin_passwd not between", value1, value2, "adminPasswd");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNull() {
            addCriterion("admin_type is null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNotNull() {
            addCriterion("admin_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeEqualTo(Integer value) {
            addCriterion("admin_type =", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotEqualTo(Integer value) {
            addCriterion("admin_type <>", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThan(Integer value) {
            addCriterion("admin_type >", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_type >=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThan(Integer value) {
            addCriterion("admin_type <", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_type <=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIn(List<Integer> values) {
            addCriterion("admin_type in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotIn(List<Integer> values) {
            addCriterion("admin_type not in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeBetween(Integer value1, Integer value2) {
            addCriterion("admin_type between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_type not between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminInfoIsNull() {
            addCriterion("admin_info is null");
            return (Criteria) this;
        }

        public Criteria andAdminInfoIsNotNull() {
            addCriterion("admin_info is not null");
            return (Criteria) this;
        }

        public Criteria andAdminInfoEqualTo(String value) {
            addCriterion("admin_info =", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoNotEqualTo(String value) {
            addCriterion("admin_info <>", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoGreaterThan(String value) {
            addCriterion("admin_info >", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoGreaterThanOrEqualTo(String value) {
            addCriterion("admin_info >=", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoLessThan(String value) {
            addCriterion("admin_info <", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoLessThanOrEqualTo(String value) {
            addCriterion("admin_info <=", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoLike(String value) {
            addCriterion("admin_info like", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoNotLike(String value) {
            addCriterion("admin_info not like", value, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoIn(List<String> values) {
            addCriterion("admin_info in", values, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoNotIn(List<String> values) {
            addCriterion("admin_info not in", values, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoBetween(String value1, String value2) {
            addCriterion("admin_info between", value1, value2, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminInfoNotBetween(String value1, String value2) {
            addCriterion("admin_info not between", value1, value2, "adminInfo");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminMailIsNull() {
            addCriterion("admin_mail is null");
            return (Criteria) this;
        }

        public Criteria andAdminMailIsNotNull() {
            addCriterion("admin_mail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMailEqualTo(String value) {
            addCriterion("admin_mail =", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailNotEqualTo(String value) {
            addCriterion("admin_mail <>", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailGreaterThan(String value) {
            addCriterion("admin_mail >", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_mail >=", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailLessThan(String value) {
            addCriterion("admin_mail <", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailLessThanOrEqualTo(String value) {
            addCriterion("admin_mail <=", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailLike(String value) {
            addCriterion("admin_mail like", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailNotLike(String value) {
            addCriterion("admin_mail not like", value, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailIn(List<String> values) {
            addCriterion("admin_mail in", values, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailNotIn(List<String> values) {
            addCriterion("admin_mail not in", values, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailBetween(String value1, String value2) {
            addCriterion("admin_mail between", value1, value2, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminMailNotBetween(String value1, String value2) {
            addCriterion("admin_mail not between", value1, value2, "adminMail");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
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