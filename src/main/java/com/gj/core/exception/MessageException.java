package com.gj.core.exception;
/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2019/1/2
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
public class MessageException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String errorCode;//错误码


	public MessageException() {
		super();
	}

	public MessageException(String errorCode,String message) {
		super(message);
		this.setErrorCode(errorCode);
	}

	public MessageException(String message){
		super(message);
	}

	public MessageException(String message,Exception e) {
		super(message);		
	}

	public MessageException(String errorCode,String message, Throwable cause) {
		super(message, cause);
		this.setErrorCode(errorCode);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
