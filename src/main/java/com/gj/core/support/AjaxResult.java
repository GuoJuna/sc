package com.gj.core.support;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2019/1/3
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
@ApiModel(value = "ajaxResult",description = "统一返回对象")
@Data
public class AjaxResult<E> implements Serializable {

	public static final int SUCCESS = 1;
	public static final int FAILURE = -1;

	private static final long serialVersionUID = 5576237395711742681L;

	@ApiModelProperty(name = "success",value = "成功失败标志",required = false)
	private boolean success = false;

	@ApiModelProperty(name = "errorCode",value = "错误代码",required = false)
	private String errorCode;

	@ApiModelProperty(name = "msg",value = "错误消息提示",required = false)
	private String msg = "";

	@ApiModelProperty(name = "data",value = "实际返回数据",required = false)
	private E data = null;


}
