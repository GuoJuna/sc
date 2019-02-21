package com.gj.app.entity;

import java.io.Serializable;

public class SysOperationLogWithBLOBs extends SysOperationLog implements Serializable {
    private String method;

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
}