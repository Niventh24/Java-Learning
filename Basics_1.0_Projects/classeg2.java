package com.Project1;

public class classeg2 {
    public static void main(String[] args) {
        Account testaccount=new Account(1122,20000,4.5);
        if(testaccount.withdraw(20500))
            System.out.println("Withdraw successfull!");
        else
            System.out.println("Withdraw unsuccessfull!");
        testaccount.deposit(3000);
        System.out.println("The accound ID id "+testaccount.getId());
        System.out.println("The balance amount in account is "+testaccount.getBalance());
        System.out.println("The annual interest rate is "+testaccount.getAnnualInterestRate());
        System.out.println("The account was created in "+testaccount.getDateCreated());
    }
    
}
