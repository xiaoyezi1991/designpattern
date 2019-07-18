package com.yezi.designpatterns.singleton;

public class SingletonThreadLocal {

    private SingletonThreadLocal(){}
    private static final ThreadLocal<SingletonThreadLocal> tlSingleton =
            new ThreadLocal<SingletonThreadLocal>(){

                @Override
                protected SingletonThreadLocal initialValue() {
                    return new SingletonThreadLocal();
                }
            };

    public static SingletonThreadLocal getInstance(){
        return  tlSingleton.get();
    }
}
