package com.yezi.designpatterns.delegate.delegate1;

public class Client {
    public static void main(String[] args) {
        Task task = new TaskDelegate();
        task.doTask();
    }
}
