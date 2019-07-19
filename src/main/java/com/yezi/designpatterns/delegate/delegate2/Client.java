package com.yezi.designpatterns.delegate.delegate2;

public class Client {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.excute("登录");
        leader.excute("加密");
    }
}
