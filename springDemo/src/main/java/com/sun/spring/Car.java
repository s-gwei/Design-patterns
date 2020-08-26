package com.sun.spring;

import org.springframework.stereotype.Component;

/*
 * @Compent 作用就相当于 XML配置
 */
@Component
public class Car {
	public Car(){
		System.out.println("car constructor...");
	}
	
	public void init(){
		System.out.println("car ... init...");
	}
	
	public void detory(){
		System.out.println("car ... detory...");
	}

}
