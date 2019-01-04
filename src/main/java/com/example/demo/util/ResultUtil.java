package com.example.demo.util;

import com.example.demo.constant.BizErrorConstant;
import com.example.demo.support.AjaxResult;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2018/11/27
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
public class ResultUtil {

	/**
	 * 失败
	 * @return
	 */
	public static AjaxResult renderError(){
		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setErrorCode(BizErrorConstant.Error.Error.getType());
		result.setMsg(BizErrorConstant.Error.Error.getTypeName());
		return result;
	}

	/**
	 * 验证码错误
	 * @return
	 */
	public static AjaxResult renderCodeError(){
		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setErrorCode(BizErrorConstant.Error.CodeError.getType());
		result.setMsg(BizErrorConstant.Error.CodeError.getTypeName());
		return result;
	}

	/**
	 * 参数异常
	 * @return
	 */
	public static AjaxResult renderParamError(){
		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setErrorCode(BizErrorConstant.Error.ParamError.getType());
		result.setMsg(BizErrorConstant.Error.ParamError.getTypeName());
		return result;
	}

	/**
	 * 成功返回数据
	 * @param obj
	 * @param <T>
	 * @return
	 */
	public static<T> AjaxResult<T> renderSuccess(T obj) {
		AjaxResult<T> result = new AjaxResult();
		result.setErrorCode(BizErrorConstant.Success.Success.getType());
		result.setMsg(BizErrorConstant.Success.Success.getTypeName());
		result.setData(obj);
		result.setSuccess(true);
		return result;
	}

	/**
	 * 成功返回数据
	 * @param msg
	 * @param <T>
	 * @return
	 */
	public static<T> AjaxResult<T> renderSuccessMsg(String msg) {
		AjaxResult<T> result = new AjaxResult();
		result.setErrorCode(BizErrorConstant.Success.Success.getType());
		result.setMsg(BizErrorConstant.Success.Success.getTypeName());
		result.setMsg(msg);
		result.setSuccess(true);
		return result;
	}


	/**
	 * 返回状态
	 * @param obj
	 * @param <T>
	 * @return
	 */
	public static<T> AjaxResult<T> render(Boolean obj) {
		AjaxResult<T> result = new AjaxResult();
		result.setSuccess(true);
		if(obj){
			result.setErrorCode(BizErrorConstant.Success.Success.getType());
			result.setMsg(BizErrorConstant.Success.Success.getTypeName());
		}else{
			result.setErrorCode(BizErrorConstant.Error.Error.getType());
			result.setMsg(BizErrorConstant.Error.Error.getTypeName());
		}
		return result;
	}


}
