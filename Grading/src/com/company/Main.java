package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter gpa: ");
        Scanner input = new Scanner(System.in);

        boolean breakPoint = true;

        do
        {
            try
            {
                float gpa = input.nextFloat();

                if (gpa >= 50 && gpa <= 100){
                    System.out.println("Pass!");
                }
                else if (gpa >= 0 && gpa < 50){
                    System.out.println("Fail!");
                }
                else {
                    throw new Exception();
                }
                
                breakPoint = false;
            }
            catch (Exception e)
            {
                System.out.println("Wrong input");

            }
        }
        while(breakPoint == true);
    }
}