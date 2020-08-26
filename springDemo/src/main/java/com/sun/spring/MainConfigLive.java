package com.sun.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 生命周期：创建，初始化，销毁
 * 自定义初始化和销毁
 * 1）
 * 指定初始化销毁方法：
 * 
 * 
 */
@ComponentScan("com.sun.spring")
@Configuration
public class MainConfigLive {
//	@Bean 需要在配置类中使用，即类上需要加上@Configuration注解
	@Bean(initMethod="init",destroyMethod="detory")
	public Car car(){
		return null;
		
	}

}
