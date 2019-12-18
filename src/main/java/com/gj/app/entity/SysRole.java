package com.gj.app.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    private Long id;

    @ApiModelProperty(value = "角色名称")
    private String rolename;

    @ApiModelProperty(value = "角色标识")
    private String rolesign;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建用户id")
    private Long useridcreate;

    @ApiModelProperty(value = "创建时间")
    private Date gmtcreate;

    @ApiModelProperty(value = "创建时间")
    private Date gmtmodified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolesign() {
        return rolesign;
    }

    public void setRolesign(String rolesign) {
        this.rolesign = rolesign == null ? null : rolesign.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getUseridcreate() {
        return useridcreate;
    }

    public void setUseridcreate(Long useridcreate) {
        this.useridcreate = useridcreate;
    }

    public Date getGmtcreate() {
        return gmtcreate;
    }

    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    public Date getGmtmodified() {
        return gmtmodified;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rolename=").append(rolename);
        sb.append(", rolesign=").append(rolesign);
        sb.append(", remark=").append(remark);
        sb.append(", useridcreate=").append(useridcreate);
        sb.append(", gmtcreate=").append(gmtcreate);
        sb.append(", gmtmodified=").append(gmtmodified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}