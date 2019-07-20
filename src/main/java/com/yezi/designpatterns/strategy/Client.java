package com.yezi.designpatterns.strategy;

public class Client {
    public static void main(String[] args) {
        Environment environment = new Environment(new AddStrategy());
        System.out.println(environment.calulate(3300,222));
    }
}
