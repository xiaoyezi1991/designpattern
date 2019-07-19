package com.yezi.designpatterns.delegate.delegate1.impl;

import com.yezi.designpatterns.delegate.delegate1.Task;

public class ConcreteTaskA implements Task {
    @Override
    public void doTask() {
        System.out.println("委派给A执行！");
    }
}
