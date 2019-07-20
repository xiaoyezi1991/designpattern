package com.yezi.designpatterns.template.template2;

public class CDAccount extends  Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.033;
    }
}
