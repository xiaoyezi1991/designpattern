package com.yezi.designpatterns.prototype;

public class Client {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("Strong Message",underlinePen);
        manager.register("Waring Box",mBox);
        manager.register("Slash",sBox);
        Product p1 = manager.create("Strong Message");
        p1.use("Hello world");
        Product p2 = manager.create("Waring Box");
        p2.use("Hello world");
        Product p3 = manager.create("Slash");
        p3.use("Hello world");

    }
}
