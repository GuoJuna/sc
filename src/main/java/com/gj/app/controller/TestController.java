package com.gj.app.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2019/1/16
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
@RestController
@RequestMapping("test")
public class TestController {

	@RequestMapping("hello")
	public String hello(String hello){
		if(StrUtil.isNotBlank(hello)){
			return hello;
		}
		return "hello";
	}
}
