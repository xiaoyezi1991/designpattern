package com.yezi.designpatterns.delegate.delegate3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SelvletDispatcher {
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public SelvletDispatcher() {
        //简单实现一个controller的映射
        try {
            Class clazz  = MemberAction.class;
            handlerMapping.add(new Handler().setController(clazz.newInstance()).setMethod(clazz.getMethod("getMemberById", new Class[]{String.class})).setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void doDisPatch(HttpServletRequest request,HttpServletResponse response){
        String uri = request.getRequestURI();//1.获取用户的URI
        Handler handler = null;
        for(Handler h:handlerMapping){//2.根据URI去handlerMapping找到对应的handler
            if(uri.equalsIgnoreCase(h.getUrl())){
                handler = h;
                break;
            }
        }
        //3.将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //4、获取到Method执行的结果，通过Response返回出去
        try {
            response.getWriter().write(String.valueOf(object));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * 具体的hanlder对象
     */
    class Handler{
        //controller对象
        private Object controller;
        //controller对象映射的方法
        private  String url;
        //ulr对应的方法
        private Method method;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return  this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }
}
