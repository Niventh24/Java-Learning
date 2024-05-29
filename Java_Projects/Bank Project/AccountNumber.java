package com.Project1.Bank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

public class AccountNumber {
    private Random ran=new Random();
    private HashSet hashset=new HashSet<>();
    private File file=new File("random_number.txt");
    private int accountNumber(){
        int accNum=5; 
        return accNum;
    }
    private int randomNUmber(){
        int randNumb=0;
        return randNumb;
    }

    private void storeRandomNumber(){

    }

    private void getRandomNumber(){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            if(file.exists()){
                

            }
        } catch (IOException e) { 
            System.out.println(e);
        }
    }
    
}
