package com.nina.hometask1.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger
            = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            BankAccount debitAccount = new DebitAccount();
            debitAccount.addObserver(new AccountBalanceLogger());
            debitAccount.addMoney(20.22);
            debitAccount.withdrawMoney(100);
            debitAccount.withdrawMoney(1);
        } catch (IllegalStateException e) {
            logger.error("Exception occurred:", e);
        }
    }
}
