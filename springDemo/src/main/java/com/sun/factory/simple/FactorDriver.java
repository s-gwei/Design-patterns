package com.sun.factory.simple;

import java.sql.Driver;

//工厂类角色 
public class FactorDriver {
	
	//工厂方法 
	//注意 返回类型为抽象产品角色 
	public Car Car(String str){
		if(str.equals("Benz")){
			return new Benz();
		}else if(str.equals("Bmw")){
			return new Bmw();
		}
		return null;
	}

}
