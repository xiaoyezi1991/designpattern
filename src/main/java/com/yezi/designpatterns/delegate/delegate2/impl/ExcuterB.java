package com.yezi.designpatterns.delegate.delegate2.impl;

import com.yezi.designpatterns.delegate.delegate2.IExcuter;

public class ExcuterB implements IExcuter {
    @Override
    public void excute(String commend) {
        System.out.println("员工B开始执行"+commend+"的任务！");
    }
}
