package com.gj.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTaskExample() {
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

        public Criteria andCronexpressionIsNull() {
            addCriterion("cronExpression is null");
            return (Criteria) this;
        }

        public Criteria andCronexpressionIsNotNull() {
            addCriterion("cronExpression is not null");
            return (Criteria) this;
        }

        public Criteria andCronexpressionEqualTo(String value) {
            addCriterion("cronExpression =", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotEqualTo(String value) {
            addCriterion("cronExpression <>", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionGreaterThan(String value) {
            addCriterion("cronExpression >", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionGreaterThanOrEqualTo(String value) {
            addCriterion("cronExpression >=", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionLessThan(String value) {
            addCriterion("cronExpression <", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionLessThanOrEqualTo(String value) {
            addCriterion("cronExpression <=", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionLike(String value) {
            addCriterion("cronExpression like", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotLike(String value) {
            addCriterion("cronExpression not like", value, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionIn(List<String> values) {
            addCriterion("cronExpression in", values, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotIn(List<String> values) {
            addCriterion("cronExpression not in", values, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionBetween(String value1, String value2) {
            addCriterion("cronExpression between", value1, value2, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andCronexpressionNotBetween(String value1, String value2) {
            addCriterion("cronExpression not between", value1, value2, "cronexpression");
            return (Criteria) this;
        }

        public Criteria andMethodnameIsNull() {
            addCriterion("methodName is null");
            return (Criteria) this;
        }

        public Criteria andMethodnameIsNotNull() {
            addCriterion("methodName is not null");
            return (Criteria) this;
        }

        public Criteria andMethodnameEqualTo(String value) {
            addCriterion("methodName =", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotEqualTo(String value) {
            addCriterion("methodName <>", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameGreaterThan(String value) {
            addCriterion("methodName >", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("methodName >=", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLessThan(String value) {
            addCriterion("methodName <", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLessThanOrEqualTo(String value) {
            addCriterion("methodName <=", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameLike(String value) {
            addCriterion("methodName like", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotLike(String value) {
            addCriterion("methodName not like", value, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameIn(List<String> values) {
            addCriterion("methodName in", values, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotIn(List<String> values) {
            addCriterion("methodName not in", values, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameBetween(String value1, String value2) {
            addCriterion("methodName between", value1, value2, "methodname");
            return (Criteria) this;
        }

        public Criteria andMethodnameNotBetween(String value1, String value2) {
            addCriterion("methodName not between", value1, value2, "methodname");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentIsNull() {
            addCriterion("isConcurrent is null");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentIsNotNull() {
            addCriterion("isConcurrent is not null");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentEqualTo(String value) {
            addCriterion("isConcurrent =", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotEqualTo(String value) {
            addCriterion("isConcurrent <>", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentGreaterThan(String value) {
            addCriterion("isConcurrent >", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentGreaterThanOrEqualTo(String value) {
            addCriterion("isConcurrent >=", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentLessThan(String value) {
            addCriterion("isConcurrent <", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentLessThanOrEqualTo(String value) {
            addCriterion("isConcurrent <=", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentLike(String value) {
            addCriterion("isConcurrent like", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotLike(String value) {
            addCriterion("isConcurrent not like", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentIn(List<String> values) {
            addCriterion("isConcurrent in", values, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotIn(List<String> values) {
            addCriterion("isConcurrent not in", values, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentBetween(String value1, String value2) {
            addCriterion("isConcurrent between", value1, value2, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotBetween(String value1, String value2) {
            addCriterion("isConcurrent not between", value1, value2, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateBy like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateBy not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andBeanclassIsNull() {
            addCriterion("beanClass is null");
            return (Criteria) this;
        }

        public Criteria andBeanclassIsNotNull() {
            addCriterion("beanClass is not null");
            return (Criteria) this;
        }

        public Criteria andBeanclassEqualTo(String value) {
            addCriterion("beanClass =", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassNotEqualTo(String value) {
            addCriterion("beanClass <>", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassGreaterThan(String value) {
            addCriterion("beanClass >", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassGreaterThanOrEqualTo(String value) {
            addCriterion("beanClass >=", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassLessThan(String value) {
            addCriterion("beanClass <", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassLessThanOrEqualTo(String value) {
            addCriterion("beanClass <=", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassLike(String value) {
            addCriterion("beanClass like", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassNotLike(String value) {
            addCriterion("beanClass not like", value, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassIn(List<String> values) {
            addCriterion("beanClass in", values, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassNotIn(List<String> values) {
            addCriterion("beanClass not in", values, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassBetween(String value1, String value2) {
            addCriterion("beanClass between", value1, value2, "beanclass");
            return (Criteria) this;
        }

        public Criteria andBeanclassNotBetween(String value1, String value2) {
            addCriterion("beanClass not between", value1, value2, "beanclass");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNull() {
            addCriterion("jobStatus is null");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNotNull() {
            addCriterion("jobStatus is not null");
            return (Criteria) this;
        }

        public Criteria andJobstatusEqualTo(String value) {
            addCriterion("jobStatus =", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotEqualTo(String value) {
            addCriterion("jobStatus <>", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThan(String value) {
            addCriterion("jobStatus >", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThanOrEqualTo(String value) {
            addCriterion("jobStatus >=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThan(String value) {
            addCriterion("jobStatus <", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThanOrEqualTo(String value) {
            addCriterion("jobStatus <=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLike(String value) {
            addCriterion("jobStatus like", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotLike(String value) {
            addCriterion("jobStatus not like", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusIn(List<String> values) {
            addCriterion("jobStatus in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotIn(List<String> values) {
            addCriterion("jobStatus not in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusBetween(String value1, String value2) {
            addCriterion("jobStatus between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotBetween(String value1, String value2) {
            addCriterion("jobStatus not between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobgroupIsNull() {
            addCriterion("jobGroup is null");
            return (Criteria) this;
        }

        public Criteria andJobgroupIsNotNull() {
            addCriterion("jobGroup is not null");
            return (Criteria) this;
        }

        public Criteria andJobgroupEqualTo(String value) {
            addCriterion("jobGroup =", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupNotEqualTo(String value) {
            addCriterion("jobGroup <>", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupGreaterThan(String value) {
            addCriterion("jobGroup >", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupGreaterThanOrEqualTo(String value) {
            addCriterion("jobGroup >=", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupLessThan(String value) {
            addCriterion("jobGroup <", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupLessThanOrEqualTo(String value) {
            addCriterion("jobGroup <=", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupLike(String value) {
            addCriterion("jobGroup like", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupNotLike(String value) {
            addCriterion("jobGroup not like", value, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupIn(List<String> values) {
            addCriterion("jobGroup in", values, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupNotIn(List<String> values) {
            addCriterion("jobGroup not in", values, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupBetween(String value1, String value2) {
            addCriterion("jobGroup between", value1, value2, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andJobgroupNotBetween(String value1, String value2) {
            addCriterion("jobGroup not between", value1, value2, "jobgroup");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createBy like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createBy not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andSpringbeanIsNull() {
            addCriterion("springBean is null");
            return (Criteria) this;
        }

        public Criteria andSpringbeanIsNotNull() {
            addCriterion("springBean is not null");
            return (Criteria) this;
        }

        public Criteria andSpringbeanEqualTo(String value) {
            addCriterion("springBean =", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanNotEqualTo(String value) {
            addCriterion("springBean <>", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanGreaterThan(String value) {
            addCriterion("springBean >", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanGreaterThanOrEqualTo(String value) {
            addCriterion("springBean >=", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanLessThan(String value) {
            addCriterion("springBean <", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanLessThanOrEqualTo(String value) {
            addCriterion("springBean <=", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanLike(String value) {
            addCriterion("springBean like", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanNotLike(String value) {
            addCriterion("springBean not like", value, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanIn(List<String> values) {
            addCriterion("springBean in", values, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanNotIn(List<String> values) {
            addCriterion("springBean not in", values, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanBetween(String value1, String value2) {
            addCriterion("springBean between", value1, value2, "springbean");
            return (Criteria) this;
        }

        public Criteria andSpringbeanNotBetween(String value1, String value2) {
            addCriterion("springBean not between", value1, value2, "springbean");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobName not between", value1, value2, "jobname");
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