package com.yezi.designpatterns.template.template1;

public abstract class AbstractTemplate {
    //模板方法
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    //声明方法由子类实现
    protected  abstract  void abstractMethod();
    //基本方法
    protected  void hookMethod(){}

    private final void concreteMethod(){

    }
}
