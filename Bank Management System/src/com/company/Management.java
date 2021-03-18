package com.company;
import java.util.*;

public class Management {
    private String id;
    private String name;
    private String type;
    private float balance;

    public Management(String id, String name, String type, float balance) {
        if (type == "Savings Account" || type == "Student Account" || type == "Family Account")
        {
            this.id = idCreator();
            this.name = name;
            this.type = type;
            this.balance = balance;
        }

        else
        {
            System.out.println("There was a problem creating the account.\nPlease check your inputs again.");
        }
    }

    public  String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void showInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Account Type: " + this.type);
        System.out.println("Balance: " + this.balance);
        System.out.println(this.id);
    }

    public String idCreator()
    {
//        String comName = "BracBank_";

        String number = this.id + 1;

        setId("BracBank_" + number);

        return 0;
    }

    public float withdrawAmount(float amount)
    {
        if(this.balance - amount >= 500)
        {
            setBalance(this.balance - amount);
        }

        else
        {
            System.out.println("You need to have money to withdraw!!");
        }

         return 0;
    }

    public float depositAmount(float amount)
    {
        if(amount >= 100 && amount <= 100000)
        {
            setBalance(this.balance + amount);
        }

        else
        {
            System.out.println("You need money to diposit ur kidney will work too!!");
        }

        return 0;
    }
}
