package com.nina.hometask1.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountBalanceLogger implements Observer {

    private static final Logger logger
            = LoggerFactory.getLogger(AccountBalanceLogger.class);

    @Override
    public void update(String event, double balanceChange, double currentBalance) {
        logger.info("Account balance changed");
        logger.info("Event: {}", event);
        logger.info("Change amount: {}", balanceChange);
        logger.info("Current balance: {}", currentBalance);
    }
}
