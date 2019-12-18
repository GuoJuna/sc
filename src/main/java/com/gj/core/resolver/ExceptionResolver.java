package com.gj.core.resolver;

import com.gj.core.exception.MessageException;
import com.gj.core.support.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.TimeoutException;

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
@ControllerAdvice(basePackages={"com.gj.app.controller"})
@Slf4j
public class ExceptionResolver {
	//private static final Logger log = LoggerFactory.getLogger(ExceptionResolver.class);
	/**
	 * 运行时未知错误
	 * @param e
	 * @return
	 */
	@ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public Object runException(RuntimeException e){
		log.error("系统内部出错:",e);
		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setMsg("内部请求错误");
		result.setErrorCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
		return result;
	}
	

	/**
	 * 请求超时
	 * @param e
	 * @return
	 */
	@ExceptionHandler(TimeoutException.class)
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
	@ResponseBody
	public Object timeoutException(RuntimeException e){
		log.error("请求超时:" + e.getMessage());
		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setMsg("请求超时");
		result.setErrorCode(String.valueOf(HttpStatus.REQUEST_TIMEOUT.value()));
		return result;
	}

	/**
	 * 请求权限异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler(UndeclaredThrowableException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ResponseBody
	public Object notFoundException(UndeclaredThrowableException e){
		log.error("请求不存在:" + e.getMessage());
		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setMsg("URL请求不存在");
		result.setErrorCode(String.valueOf(HttpStatus.UNAUTHORIZED.value()));
		return result;
	}
	
	/**
	 * 应用系统异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler({MessageException.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public Object messageException(MessageException e) {

		// log记录异常
		log.error("----------------------应用系统处理出错--------------------");
		
		log.error("错误代码:"+e.getErrorCode() + ",错误提示:" + e.getMessage());

		AjaxResult result = new AjaxResult();
		result.setSuccess(true);
		result.setMsg(e.getMessage());
		result.setErrorCode(e.getErrorCode());
		return result;
	}
	
	


}