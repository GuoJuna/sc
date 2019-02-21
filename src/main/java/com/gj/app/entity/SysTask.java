package com.gj.app.entity;

import java.io.Serializable;
import java.util.Date;

public class SysTask implements Serializable {
    private Long id;

    private String cronexpression;

    private String methodname;

    private String isconcurrent;

    private String description;

    private String updateby;

    private String beanclass;

    private Date createdate;

    private String jobstatus;

    private String jobgroup;

    private Date updatedate;

    private String createby;

    private String springbean;

    private String jobname;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCronexpression() {
        return cronexpression;
    }

    public void setCronexpression(String cronexpression) {
        this.cronexpression = cronexpression == null ? null : cronexpression.trim();
    }

    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname == null ? null : methodname.trim();
    }

    public String getIsconcurrent() {
        return isconcurrent;
    }

    public void setIsconcurrent(String isconcurrent) {
        this.isconcurrent = isconcurrent == null ? null : isconcurrent.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public String getBeanclass() {
        return beanclass;
    }

    public void setBeanclass(String beanclass) {
        this.beanclass = beanclass == null ? null : beanclass.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus == null ? null : jobstatus.trim();
    }

    public String getJobgroup() {
        return jobgroup;
    }

    public void setJobgroup(String jobgroup) {
        this.jobgroup = jobgroup == null ? null : jobgroup.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getSpringbean() {
        return springbean;
    }

    public void setSpringbean(String springbean) {
        this.springbean = springbean == null ? null : springbean.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }
}