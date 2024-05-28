package com.Project1;

import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date=new Date();
    }
    public char getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
    public double getBalance() {
        return balance;
    }
    public Date getDate() {
        return date;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return "Transaction [type=" + type + ", amount=" + amount + ", balance=" + balance + ", date=" + date
                + ", description=" + description + "]"+"\n";
    }

    
    
}
