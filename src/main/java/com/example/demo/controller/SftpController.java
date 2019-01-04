package com.example.demo.controller;

import cn.hutool.extra.ssh.JschUtil;
import cn.hutool.extra.ssh.Sftp;
import com.example.demo.configurer.property.SftpProperty;
import com.example.demo.support.AjaxResult;
import com.example.demo.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
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
@Api(value = "sftp",tags = "sftp",produces = "application/json", consumes = "application/json")
@RestController
@RequestMapping("sftp")
public class SftpController {

	@Autowired
	private SftpProperty sftpProperty;

	@ApiOperation(value = "测试", httpMethod = "POST", produces = "application/json",consumes = "application/json")
	@ApiResponse(code = 200, message = "success")
	@RequestMapping("test")
	public String test(){
		return "hello";
	}

	@ApiOperation(value = "上传文件到服务器", httpMethod = "GET", produces = "application/json",consumes = "application/json")
	@ApiResponse(code = 200, message = "success")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "path",value = "文件路径")
	})
	@RequestMapping("put")
	public AjaxResult sftp(String path) throws IOException {
		Sftp sftp= JschUtil.createSftp("39.98.51.43", 22, "root", "Lehappy1234");
		//进入远程目录
		sftp.cd(sftpProperty.getDestPath());
		//上传本地文件
		sftp.put(path, sftpProperty.getDestPath());
		//下载远程文件
		//sftp.get("/usr/local/nginx/html/index.html", "c:/test/index.html");

		//关闭连接
		sftp.close();
		return ResultUtil.renderSuccessMsg("成功");
	}


}
