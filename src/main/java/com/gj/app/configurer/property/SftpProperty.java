package com.gj.app.configurer.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author guojun
 * @Email guojun49@qq.com
 * @Date 2019-12-06 15:23
 * @Description This is description of class
 * @Since version-1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "sftp")
public class SftpProperty {

	private String Ip;
	private Integer port;
	private String userName;
	private String password;

	private String destPath;
}
