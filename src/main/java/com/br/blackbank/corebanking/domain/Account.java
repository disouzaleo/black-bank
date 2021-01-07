package com.br.blackbank.corebanking.domain;

public class Account {
    private double balance;
    int agency;
    int accountNumber;
    Holder accountHolder;

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amountToDeposit) {
        this.balance += amountToDeposit;
    }

    public boolean withdraw(double amountToWithdraw){
        if(this.balance >= amountToWithdraw) {
            this.balance -= amountToWithdraw;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(Account destinationAccount, int amountToTransfer){
        if(this.withdraw(amountToTransfer)) {
            destinationAccount.deposit(amountToTransfer);
            return true;
        }
        return false;
    }
}