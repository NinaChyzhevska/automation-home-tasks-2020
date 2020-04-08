package com.nina.hometask1.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    protected double balance;
    private List<Observer> observers = new ArrayList<>();

    public void addMoney(double money) {
        validateMoney(money);
        balance += money;
        notifyObservers("Added money", money);
    }

    public abstract void withdrawMoney(double money);
    public abstract double calculatePaymentFee();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    protected void notifyObservers(String event, double balanceChange) {
        observers.forEach(observer -> observer.update(event, balanceChange, balance));
    }

    protected void validateMoney(double money) {
        if (money <= 0) {
            throw new IllegalArgumentException("Money amount should be positive");
        }
    }
}
