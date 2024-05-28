package com.Project1;

import java.util.*;


import com.Client;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client clients;
    private ArrayList<Transaction> transactions;
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated=new Date();
    }
    
    public Account(int id, double balance, double annualInterestRate, Client clients) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.clients = clients;
        this.transactions=new ArrayList<>();
        dateCreated=new Date();
    }
    public boolean withdraw(double Amount){
        if(this.balance<Amount){
            return false;
        }
        balance-=Amount;
        this.transactions.add(new Transaction('W', Amount,this.balance, "Withdrawn "+Amount));
        return true;
    }
    public void deposit(double amount){
        balance+=amount;
        this.transactions.add(new Transaction('D', amount,this.balance, "Deposited "+amount));
    }
    public int countTransactions(char type){
        int count=0;
        for(Transaction transaction: transactions){
            if(transaction.getType()==type)
                count++;
        }
        return count;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "Account ID: "+this.id + " "+ "Balance:"+this.balance+" "+"Annual Interest Rate: "+ this.annualInterestRate+" "+"Account creation: "+this.dateCreated+"\n"+transactions;
    }

    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }
    
    
    


    

    
    
}
