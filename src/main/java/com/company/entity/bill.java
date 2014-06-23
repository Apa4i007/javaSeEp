package com.company.entity;

import com.company.intarfaces.BankOperations;

public class Bill implements BankOperations {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int money) {
            this.balance = this.balance - money;
    }

    @Override
    public void fill(int money) {
        this.balance = this.balance + money;
    }
}
