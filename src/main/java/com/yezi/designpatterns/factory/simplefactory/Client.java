package com.yezi.designpatterns.factory.simplefactory;

public class Client {
    public static void main(String[] args){
        new Factory().createProduct("A").implMethod();
    }
}
