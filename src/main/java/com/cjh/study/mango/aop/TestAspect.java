package com.cjh.study.mango.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class TestAspect {
    @Pointcut("@annotation(com.cjh.study.mango.aop.TestAction)")
    public void annotationPointCut() { }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();

        TestAction action = method.getAnnotation(TestAction.class);
        System.out.println("AFTER " + action.name());
    }

    @Before("execution(* com.cjh.study.mango.service..*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();

        System.out.println("BEFORE " + method.getName());
    }
}
