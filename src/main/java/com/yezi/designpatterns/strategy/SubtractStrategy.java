package com.yezi.designpatterns.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1-num2;
    }
}
