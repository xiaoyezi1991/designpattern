package com.yezi.designpatterns.factory.simplefactory;

public class Factory {


    public Product createProduct(String pro){
        switch (pro){
            case "A":return new ProductA();
            case "B":return  new ProductB();
            default:return null;
        }
    }

}

