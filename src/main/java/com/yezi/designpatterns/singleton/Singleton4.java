package com.yezi.designpatterns.singleton;

public class Singleton4 {

    private static ThreadLocal<Singleton4> threadLocal = new ThreadLocal<Singleton4>();
    private static Singleton4 singleton4 = null;
    private Singleton4(){}
    public static  Singleton4 getSingleton4(){

        if(threadLocal.get()==null){
            createSingleton4();
        }
        return singleton4;
    }

    private static  void createSingleton4(){
        synchronized (Singleton4.class){
            if(singleton4 == null){
                singleton4 = new Singleton4();
            }
        }
        threadLocal.set(singleton4);      // 将单例放入当前线程的局部变量中
    }
}
