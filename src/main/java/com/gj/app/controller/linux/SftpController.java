package com.gj.app.controller.linux;

import cn.hutool.extra.ssh.JschUtil;
import cn.hutool.extra.ssh.Sftp;
import com.gj.app.configurer.property.SftpProperty;
import com.gj.core.support.AjaxResult;
import com.gj.app.util.CommandUtil;
import com.gj.app.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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
@Api(value = "上传",tags = "上传")
@RestController
@RequestMapping("sftp")
public class SftpController {

	@Autowired
	private SftpProperty sftpProperty;

	/**
	 * 上传文件到服务器
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@ApiOperation(value = "上传", httpMethod = "POST", produces = "application/json",consumes = "application/json")
	@ApiResponse(code = 200, message = "success")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "file",value = "文件",dataType = "MultipartFile", allowMultiple = true)
	})
	@RequestMapping("putLe")
	public AjaxResult putLe(MultipartFile file) throws IOException {
		//上传目录  只需修改--上传路径
		String partialPath = "/usr/local/nginx/html";

		String fileName = file.getOriginalFilename();
		String tempPath = "c:/temp/";
		String path = tempPath+fileName;
		File dest = new File(path);
		file.transferTo(dest);
		Sftp sftp= JschUtil.createSftp(sftpProperty.getIp(), sftpProperty.getPort(), sftpProperty.getUserName(), sftpProperty.getPassword());
		//进入远程目录
		sftp.cd(partialPath);
		//上传本地文件
		sftp.put(path, partialPath);
		//下载远程文件
		//sftp.get("/usr/local/nginx/html/index.html", "c:/test/index.html");

		//关闭连接
		sftp.close();
		dest.delete();

		//执行shell命令
		CommandUtil rec=new CommandUtil(sftpProperty.getIp(), sftpProperty.getUserName(),sftpProperty.getPassword());
		//CommandUtil.cmdTar(rec,"tar -xvf "+partialPath+"/"+fileName+" -C "+partialPath);
		//CommandUtil.cmdTar(rec,"tar -xvf "+partialPath+"/"+fileName);
		System.out.println("unrar x "+partialPath+"/"+fileName);
		CommandUtil.cmdTar(rec,"unrar x -y "+partialPath+"/"+fileName+" "+partialPath );
		return ResultUtil.renderSuccessMsg("成功");
	}


	/**
	 * 上传下载
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public AjaxResult sftp(String path) throws IOException {
		Sftp sftp= JschUtil.createSftp(sftpProperty.getIp(), sftpProperty.getPort(), sftpProperty.getUserName(), sftpProperty.getPassword());
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
