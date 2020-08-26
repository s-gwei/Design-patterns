package com.sun.factory.simple;

public class Magnate {

	//简单工厂模式，将实例的创建交给工厂，但是每次都会创建新的实例
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorDriver factorDriver  = new FactorDriver();
		Car car = factorDriver.Car("Benz");
		car.driver();
	}
    
}
