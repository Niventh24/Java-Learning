package com.Project1.Bank;
import java.time.LocalDate;
import java.util.Random;

public class Accounts {
    private long accountNumber;
    private String accountHolderName;
    private int balance;
    private int pin_number;
    private LocalDate accountCreated;
    private LocalDate accountExpire;

    public  Accounts(String accountHolderName,int balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.accountCreated=LocalDate.now();//new Date();
        this.accountExpire=accountCreated.plusYears(6);
    }

    
}
