package com.nina.hometask1.bank;

public class AccountBalanceLogger implements Observer {

    @Override
    public void update(String event, double balanceChange, double currentBalance) {
        System.out.println("\nAccount balance changed");
        System.out.println(String.format("Event: %s", event));
        System.out.println(String.format("Change amount: %.2f", balanceChange));
        System.out.println(String.format("Current balance: %.2f", currentBalance));
    }
}
