package com.sun.factory.abstrac;

//工厂类角色 
public class Factory implements IFactory {

	public IProduct1 createProduct1() {
		// TODO Auto-generated method stub
		return new Product1();
	}

	public IProduct2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2();
	}

}
