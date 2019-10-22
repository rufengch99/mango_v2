package com.cjh.study.mango.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cjh.study.mango.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
