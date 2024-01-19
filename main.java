package com.bank;

import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[]args){

        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();

        BankAccounts[] accounts = new BankAccounts[size];

        for(int i=0; i<size; i++){
            accounts[i] = new BankAccounts();
            System.out.println("Account balance: ");
            accounts[i].AccountBalance = cin.nextInt();
            System.out.println("Acoount number: ");
            accounts[i].AccountNumber = cin.nextInt();
            System.out.println("Account type: ");
            accounts[i].AccountType = cin.next();
            System.out.println("Account history: ");
            accounts[i].TransactionHistory = cin.nextInt();
        }



        clients [] info = new clients[size];
        for(int i=0; i<size; i++){
            info[i] = new clients();
            System.out.println("Name: ");
            info[i].fname = cin.next();
            System.out.println("Last name: ");
            info[i].lname = cin.next();
            System.out.println("Date of birth: ");
            info[i].DateofBirth = cin.nextInt();
            System.out.println("Phone number: ");
            info[i].PhoneNumber = cin.nextInt();
            System.out.println("Pass: ");
            info[i].pass = cin.nextInt();

        }

        banks [] bank = new banks[size];
        for(int i=0; i<size; i++){
            bank[i] = new banks();
            System.out.println("Bank name: ");
            bank[i].name = cin.next();
            System.out.println("Location: ");
            bank[i].location = cin.next();
        }


    }


}



//        for (int i = 0; i < info.length; i++) {
//            System.out.println("Client " + (i + 1) + " Information:");
//            System.out.println("Name: " + info[i].fname);
//            System.out.println("Last Name: " + info[i].lname);
//            System.out.println("Date of Birth: " + info[i].DateofBirth);
//            System.out.println("Phone Number: " + info[i].PhoneNumber);
//            System.out.println("Pass: " + info[i].pass);
//            System.out.println();
//        }



//        for(int i=0; i<size; i++){
//            System.out.println("Account Balance: " + accounts[i].AccountBalance);
//            System.out.println("Account Number: " + accounts[i].AccountNumber);
//            System.out.println("Account Type: " + accounts[i].AccountType);
//            System.out.println("Transaction History: " + accounts[i].TransactionHistory);
//            System.out.println();
//        }