package com.yezi.designpatterns.singleton;

public class Singleton3 {
    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {       // 1
                // 只需在第一次创建实例时才同步
                if (singleton3 == null) {       // 2
                    singleton3 = new Singleton3();      // 3
                }
            }
        }
        return singleton3;
    }
}
