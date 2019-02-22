package com.gj.app.controller.linux;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2019/2/22
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

import com.gj.app.configurer.property.SftpProperty;
import com.gj.app.util.CommandUtil;
import com.gj.app.util.ResultUtil;
import com.gj.core.support.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 乐融融后台执行启动程序
 */
@Api(value = "启动程序",tags = "启动程序")
@RestController
@RequestMapping("sftp")
public class LehappyAdminController {

	@Autowired
	private SftpProperty sftpProperty;

	/**
	 * 启动项目
	 * @return
	 */
	@ApiOperation(value = "启动项目", httpMethod = "POST", produces = "application/json",consumes = "application/json")
	@ApiResponse(code = 200, message = "success")
	@RequestMapping("start")
	public AjaxResult<Object> start(){
		CommandUtil rec=new CommandUtil(sftpProperty.getIp(), sftpProperty.getUserName(),sftpProperty.getPassword());
		String rs = CommandUtil.cmdTar(rec, "cd /usr/local/springboot && sh lehappyadmin-start.sh");
		return ResultUtil.renderSuccessMsg(rs);
	}


}
