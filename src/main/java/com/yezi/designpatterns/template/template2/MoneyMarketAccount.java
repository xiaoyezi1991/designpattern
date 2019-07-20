package com.yezi.designpatterns.template.template2;

public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.22;
    }
}
