package com;

import java.util.ArrayList;

import com.Project1.Account;

public class Client {
    private int id;
    private String name;
    private String phone;
    private ArrayList <Account> accounts;
    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        accounts=new ArrayList<>();
    }
    public boolean addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added successfully!");
        return true;
    }
    public boolean removeAccount(int  AccountId){
        for(Account account:accounts){
            if(account.getId()==AccountId){
                accounts.remove(account);
                System.out.println("Account removed successfully!");
                return true;
            }
            return false;
                    
        }
        return true;
    }
    public String toString(){
        String s="Client ID: "+this.id+" "+"Name: "+this.name+" "+"Phone.No: "+this.phone+"\n";
        for(Account account:accounts){
            s+=account.toString()+"\n";
        }
        return s;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    
}
