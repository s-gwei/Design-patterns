package com.sun.strategy;

public class Test {

	/*
	 * 
	 * 策略模式像是实现了接口的多态而已
	 * 父类的引用指向子类的对象
	 */
	
	 public static void main(String[] args) {
	        Context context;
	        
	        //刚到吴国的时候拆开第一个
	        System.out.println("----------刚刚到吴国的时候拆开第一个---------------");
	        context = new Context(new BackDoor());
	        context.operate();//拆开执行
	        System.out.println("\n");
	        
	        //当刘备乐不思蜀时，拆开第二个
	        System.out.println("----------刘备乐不思蜀，拆第二个了---------------");
	        context = new Context(new GivenGreenLight());
	        context.operate();//拆开执行
	        System.out.println("\n");
	        
	        //孙权的小追兵了，咋办？拆开第三个锦囊
	        System.out.println("----------孙权的小追兵了，咋办？拆开第三个锦囊---------------");
	        context = new Context(new BlackEnemy());
	        context.operate();//拆开执行
	        System.out.println("\n");
	    }

}
