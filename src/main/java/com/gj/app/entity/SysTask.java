package com.gj.app.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysTask implements Serializable {
    private Long id;

    @ApiModelProperty(value = "cron表达式")
    private String cronexpression;

    @ApiModelProperty(value = "任务调用的方法名")
    private String methodname;

    @ApiModelProperty(value = "任务是否有状态")
    private String isconcurrent;

    @ApiModelProperty(value = "任务描述")
    private String description;

    @ApiModelProperty(value = "更新者")
    private String updateby;

    @ApiModelProperty(value = "任务执行时调用哪个类的方法 包名+类名")
    private String beanclass;

    @ApiModelProperty(value = "创建时间")
    private Date createdate;

    @ApiModelProperty(value = "任务状态")
    private String jobstatus;

    @ApiModelProperty(value = "任务分组")
    private String jobgroup;

    @ApiModelProperty(value = "更新时间")
    private Date updatedate;

    @ApiModelProperty(value = "创建者")
    private String createby;

    @ApiModelProperty(value = "Spring bean")
    private String springbean;

    @ApiModelProperty(value = "任务名")
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cronexpression=").append(cronexpression);
        sb.append(", methodname=").append(methodname);
        sb.append(", isconcurrent=").append(isconcurrent);
        sb.append(", description=").append(description);
        sb.append(", updateby=").append(updateby);
        sb.append(", beanclass=").append(beanclass);
        sb.append(", createdate=").append(createdate);
        sb.append(", jobstatus=").append(jobstatus);
        sb.append(", jobgroup=").append(jobgroup);
        sb.append(", updatedate=").append(updatedate);
        sb.append(", createby=").append(createby);
        sb.append(", springbean=").append(springbean);
        sb.append(", jobname=").append(jobname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}