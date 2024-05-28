package com.Project1;

import com.Client;

public class classeg3 {
    public static void main(String[] args) {
        Client[] clients=new Client[2];

        clients[0]=new Client(100,"Niventh","9456789123");//creating client1 with 2 account

        clients[0].addAccount(new Account(1, 1000, 1.5));
        clients[0].addAccount(new Account(2, 2000, 2.5));

        clients[1]=new Client(200,"Niv2","9456778123");//creating client 2 with 3 accounts
        
        clients[1].addAccount(new Account(3, 3000, 3.5));
        clients[1].addAccount(new Account(4, 4000, 4.5));
        clients[1].addAccount(new Account(5, 5000, 5.5));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());
    }
    
}
