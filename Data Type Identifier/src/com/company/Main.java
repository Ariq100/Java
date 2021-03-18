package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        if (input.hasNextInt())
        {
            System.out.println("This input type is an integer");
        }
        else if (input.hasNextLine())
        {
            String a = input.nextLine();

            System.out.println(a);

            if (a.length() == 1)
            {
                System.out.println("This input type is a char");
            }
            else if (a == "true" || a == "false")
            {
               System.out.println("This input type is a boolean");
            }
            else
            {
                System.out.println("This input type is a string");
            }
        }
        else
        {
            System.out.println("Dosnt match or smh");
        }
    }
}