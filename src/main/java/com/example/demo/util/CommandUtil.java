package com.example.demo.util;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2019/1/15
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
/**
 * 远程执行linux的shell script
 * @author Ickes
 * @since V0.1
 */

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;



/**
 * 远程执行linux的shell script
 * @author Ickes
 * @since V0.1
 */
@Slf4j
public class CommandUtil {
	//字符编码默认是utf-8
	private static String DEFAULTCHART = "UTF-8";
	private Connection conn;
	private String ip;
	private String userName;
	private String userPwd;

	public CommandUtil(String ip, String userName, String userPwd) {
		this.ip = ip;
		this.userName = userName;
		this.userPwd = userPwd;
	}


	public CommandUtil() {

	}

	public static void  cmdTar(String cmd){
		CommandUtil rec=new CommandUtil("39.98.51.43", "root","Lehappy1234");
		//执行命令
		String rs = rec.execute(cmd);
		log.info(rs);
		//执行脚本
		//rec.execute("sh /usr/local/tomcat/bin/statup.sh");
		//这个方法与上面最大的区别就是，上面的方法，不管执行成功与否都返回，
		//这个方法呢，如果命令或者脚本执行错误将返回空字符串
		//rec.executeSuccess("ifconfig");
	}



	/**
	 * 远程登录linux的主机
	 *
	 * @return 登录成功返回true，否则返回false
	 * @author Ickes
	 * @since V0.1
	 */
	public Boolean login() {
		boolean flg = false;
		try {
			conn = new Connection(ip);
			conn.connect();//连接
			flg = conn.authenticateWithPassword(userName, userPwd);//认证
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flg;
	}

	/**
	 * @param cmd 即将执行的命令
	 * @return 命令执行完后返回的结果值
	 * @author Ickes
	 * 远程执行shll脚本或者命令
	 * @since V0.1
	 */
	public String execute(String cmd) {
		String result = "";
		try {
			if (login()) {
				Session session = conn.openSession();//打开一个会话
				session.execCommand(cmd);//执行命令
				result = processStdout(session.getStdout(), DEFAULTCHART);
				//如果为得到标准输出为空，说明脚本执行出错了
				if (StrUtil.isEmpty(result)) {
					result = processStdout(session.getStderr(), DEFAULTCHART);
				}
				conn.close();
				session.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}


	/**
	 * @param cmd 即将执行的命令
	 * @return 命令执行成功后返回的结果值，如果命令执行失败，返回空字符串，不是null
	 * @author Ickes
	 * 远程执行shll脚本或者命令
	 * @since V0.1
	 */
	public String executeSuccess(String cmd) {
		String result = "";
		try {
			if (login()) {
				Session session = conn.openSession();//打开一个会话
				session.execCommand(cmd);//执行命令
				result = processStdout(session.getStdout(), DEFAULTCHART);
				conn.close();
				session.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 解析脚本执行返回的结果集
	 *
	 * @param in      输入流对象
	 * @param charset 编码
	 * @return 以纯文本的格式返回
	 * @author Ickes
	 * @since V0.1
	 */
	private String processStdout(InputStream in, String charset) {
		InputStream stdout = new StreamGobbler(in);
		StringBuffer buffer = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(stdout, charset));
			String line = null;
			while ((line = br.readLine()) != null) {
				buffer.append(line + "\n");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		cmdTar("pwd");
	}
}