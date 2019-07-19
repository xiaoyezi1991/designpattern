package com.yezi.designpatterns.delegate.delegate1;

import com.yezi.designpatterns.delegate.delegate1.impl.ConcreteTaskA;
import com.yezi.designpatterns.delegate.delegate1.impl.ConcreteTaskB;

import java.util.Random;

public class TaskDelegate implements Task {
    @Override
    public void doTask() {
        System.out.println("代理执行开始！");
        Task task = null;
        if(new Random().nextBoolean()){
            task = new ConcreteTaskA();
            task.doTask();
        }else{
            task = new ConcreteTaskB();
            task.doTask();
        }
        System.out.println("代理执行结束！");

    }
}
