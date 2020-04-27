package com.nina.hometask1.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount debitAccount = new DebitAccount();
        debitAccount.addObserver(new AccountBalanceLogger());
        debitAccount.addMoney(20.22);
        debitAccount.withdrawMoney(10);
        BankAccount creditAccount = new CreditAccount();
        creditAccount.addObserver(new AccountBalanceLogger());
        creditAccount.withdrawMoney(100);
        creditAccount.addMoney(300);
        creditAccount.withdrawMoney(20);
    }
}
