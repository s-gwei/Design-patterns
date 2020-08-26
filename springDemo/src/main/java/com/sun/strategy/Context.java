package com.sun.strategy;

public class Context {
    //接口的好处就在于它可以指向实现了它的任意实现类
    private IStrategy strategy;
    
    //通过锦囊的构造函数，去指定具体要选择哪条策略去处理遇到的危险
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void operate(){
        this.strategy.operate();
    }

}
