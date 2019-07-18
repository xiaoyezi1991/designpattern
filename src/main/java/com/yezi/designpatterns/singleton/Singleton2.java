package com.yezi.designpatterns.singleton;

public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static Singleton2 getSingleton2(){
        synchronized(Singleton2.class){  // 使用 synchronized 块，临界资源的同步互斥访问
            if (singleton2 == null) {
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }
}
