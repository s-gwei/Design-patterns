package com.sun.factory.methods;

//具体工厂类角色 
public class FactoryPojo_2 implements FactoryInterface {

	public PrudactInterface found() {
		// TODO Auto-generated method stub
      PrudactInterface prudactPojo_2 = new PrudactPojo_2();
      return prudactPojo_2;
	}

}
