package com.sun.factory.methods;
//具体工厂类角色 
public class FactoryPojo implements FactoryInterface {

	public PrudactInterface found() {
		// TODO Auto-generated method stub
	    //实现创建对象方法，
		PrudactInterface prudactPojo = new PrudactPojo();
		return prudactPojo;
	}

}
