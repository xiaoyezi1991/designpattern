package com.yezi.designpatterns.singleton;

public class Test {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i =0; i<threads.length;i++){
            threads[i] = new TestThread();
        }
        for(int i = 0;i<threads.length;i++){
            threads[i].start();
        }
    }
}
class TestThread  extends Thread{

    @Override
    public void run() {
        int hash = Singleton5.getSingleton5().hashCode();
        System.out.println(hash);
    }
}