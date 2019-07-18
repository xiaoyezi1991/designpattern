package com.yezi.designpatterns.proxy.interfaces;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star star;

    public StarHandler(Star traget) {
        this.star = traget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null ;
        System.out.println("演唱会马上开始了。。。。");
        object  = method.invoke(star,args);
        System.out.println("演唱会完美收官。。。。。");
        return object;
    }
}
