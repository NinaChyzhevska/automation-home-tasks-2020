package com.nina.hometask1.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebitAccount extends BankAccount {

    private static final Logger logger
            = LoggerFactory.getLogger(DebitAccount.class);

    @Override
    public void withdrawMoney(double money) {
        validateMoney(money);
        if (balance >= money) {
            balance = balance - money - money * calculatePaymentFee();
        } else {
            logger.error("Withdraw more than card limit");
            throw new IllegalStateException("It is impossible to get more money than the account currently has");
        }

        notifyObservers("Withdraw money", money);
    }

    @Override
    public double calculatePaymentFee() {
        return 0.01;
    }
}
