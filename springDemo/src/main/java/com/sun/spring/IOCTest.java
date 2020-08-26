package com.sun.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();
		System.out.println("容器创建完成...");
		System.out.println(annotationConfigApplicationContext.getApplicationName());
		//关闭容器
		
		annotationConfigApplicationContext.close();
	}

}
