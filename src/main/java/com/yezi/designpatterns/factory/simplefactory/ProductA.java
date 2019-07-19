package com.yezi.designpatterns.factory.simplefactory;

public class ProductA extends Product {
    @Override
    void implMethod() {
        System.out.println("工厂A");
    }
}
