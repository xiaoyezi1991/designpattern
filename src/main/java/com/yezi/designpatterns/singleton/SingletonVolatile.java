package com.yezi.designpatterns.singleton;

public class SingletonVolatile {

    private volatile static SingletonVolatile singletonVolatile = null;
    private SingletonVolatile(){

    }
    public static SingletonVolatile getInstance(){
        if(singletonVolatile == null){
            synchronized (SingletonVolatile.class){
                if(singletonVolatile == null){
                    singletonVolatile = new SingletonVolatile();
                }
            }
        }
        return singletonVolatile;
    }
}
