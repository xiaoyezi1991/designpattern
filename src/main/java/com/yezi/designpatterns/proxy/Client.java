package com.yezi.designpatterns.proxy;

import com.yezi.designpatterns.proxy.interfaces.Star;
import com.yezi.designpatterns.proxy.interfaces.StarHandler;
import com.yezi.designpatterns.proxy.interfaces.impl.RealStar;

import java.lang.reflect.Proxy;

public class Client {
    public static  void main(String[] args){
        Star star  = new RealStar();
        StarHandler handler = new StarHandler(star);
        Star proxy  = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);
        proxy.sing();
    }
}
