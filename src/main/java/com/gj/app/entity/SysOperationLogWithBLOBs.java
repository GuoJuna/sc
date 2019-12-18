package com.gj.app.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SysOperationLogWithBLOBs extends SysOperationLog implements Serializable {
    @ApiModelProperty(value = "方法名称")
    private String method;

    @ApiModelProperty(value = "备注")
    private String message;

    private static final long serialVersionUID = 1L;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", method=").append(method);
        sb.append(", message=").append(message);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}