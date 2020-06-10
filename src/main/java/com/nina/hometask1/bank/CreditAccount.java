package com.nina.hometask1.bank;

public class CreditAccount extends BankAccount {
    @Override
    public void withdrawMoney(double money) {
        validateMoney(money);
        balance -= money;
        balance -= money * calculatePaymentFee();
        notifyObservers("Withdraw money", money);
    }

    @Override
    public double calculatePaymentFee() {
        if (balance > 0) {
            return 0.01;
        } else {
            return 0.05;
        }
    }
}
