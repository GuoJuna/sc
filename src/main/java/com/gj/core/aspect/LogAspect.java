package com.gj.core.aspect;


import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


@Aspect
@Slf4j
@Component
public class LogAspect {

    @Pointcut("execution(* com.gj.app.controller..*(..))")
    public void logPointCut(){

    }

    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint)  {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        StringBuilder sb = new StringBuilder(2000);
        SimpleDateFormat sfFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date dateTime = Calendar.getInstance().getTime();
        sb.append("\n").append("---------------------------开始进行系统日志统一处理记录----------------------------");
        sb.append("\n").append("---------------------------").append(sfFormat.format(dateTime))
                .append("----------------------------------\n");
        // 记录下请求内容
        sb.append("\n请求地址 : " + request.getRequestURL().toString());
        sb.append("\n请求类型 : " + request.getMethod());
        // 获取真实的ip地址
        sb.append("\nIP地址 : " + HttpUtil.getClientIP(request));
        sb.append("\n控制器 : " + joinPoint.getSignature().getDeclaringTypeName());
        sb.append("\n方法 : "  + joinPoint.getSignature().getName());
        sb.append("\n参数 : " + Arrays.toString(joinPoint.getArgs())).append("\n");
        log.info(sb.toString());

    }

    @AfterReturning(returning = "ret", pointcut = "logPointCut()")// returning的值和doAfterReturning的参数名一致
    public void doAfterReturning(Object ret) {
        log.info("\n返回值 : " + JSONUtil.toJsonStr(ret));
    }

    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object ob = pjp.proceed();// ob 为方法的返回值
        log.info("\n耗时 : " + (System.currentTimeMillis() - startTime) + "毫秒");
        return ob;
    }

}
