package com.gj.core.filter;

import com.thetransactioncompany.cors.CORSFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

@Configuration
public class AppFilter {


    @Bean
    public FilterRegistrationBean createCORSFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean(new CORSFilter());
        registration.addUrlPatterns("/*");
        registration.setName("CORSFilter");
        return registration;
    }



    @Bean
    public FilterRegistrationBean createXssFilter(){
        FilterRegistrationBean registration = new FilterRegistrationBean(new XssFilter());
        registration.addUrlPatterns("/*");
        registration.setName("XssFilter");
        return registration;
    }

}
