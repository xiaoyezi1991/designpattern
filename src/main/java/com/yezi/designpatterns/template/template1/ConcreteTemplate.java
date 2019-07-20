package com.yezi.designpatterns.template.template1;

public class ConcreteTemplate extends   AbstractTemplate {
    @Override
    public void templateMethod() {
        super.templateMethod();
    }

    @Override
    protected void abstractMethod() {
        System.out.println("具体实现！");
    }

    @Override
    protected void hookMethod() {
        super.hookMethod();
    }

}
