package com.Project1;

import java.util.ArrayList;

import com.Client;

public class classeg4 {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();

        Client client=new Client(100,"Niventh","9997778654");

        accounts.add(new Account(100,1000,1.5,client));
        accounts.add(new Account(200,2000,2.5,client));

        accounts.get(0).withdraw(2000);
        accounts.get(0).withdraw(1000);
        accounts.get(0).deposit(2000);
        accounts.get(0).withdraw(1000);

        accounts.get(1).deposit(100);
        accounts.get(1).deposit(300);

        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));

        for(Account account:accounts){
            System.out.println("Account "+ account.getId()+":");
            System.out.println("W:"+account.countTransactions('W'));
            System.out.println("D:"+account.countTransactions('D'));
        }
    }

    
    
}
