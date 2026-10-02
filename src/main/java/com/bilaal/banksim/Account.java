package com.bilaal.banksim.model;

public class Account {
    private String accountId;
    private String ownerName;
    private double balance;

    public Account(String accountId, String ownerName, double balance) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    public synchronized void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for account " + accountId);
            return;
        }
        double newBalance = balance - amount;
        balance = newBalance;
    }
        public String getAccountId() {
        return accountId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

}