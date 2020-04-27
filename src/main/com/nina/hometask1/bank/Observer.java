package com.nina.hometask1.bank;

public interface Observer {
    void update(String event, double balanceChange, double currentBalance);
}
