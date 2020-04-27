package com.nina.hometask1.bank;

public class DebitAccount extends BankAccount {
    @Override
    public void withdrawMoney(double money) {
        validateMoney(money);
        if (balance > 0) {
            balance = balance - money - money * calculatePaymentFee();
        } else {
            throw new IllegalStateException("It is impossible to get more money than the account currently has");
        }

        notifyObservers("Withdraw money", money);
    }

    @Override
    public double calculatePaymentFee() {
        return 0.01;
    }
}
