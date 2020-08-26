package com.sun.factory.methods;

public class Manger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryInterface factoryInterface = new FactoryPojo();
		PrudactInterface prudactInterface = factoryInterface.found();
		prudactInterface.production();
	}

}
