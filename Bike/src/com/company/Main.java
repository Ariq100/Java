package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Bike[] bike = new Bike[2];

        for (int i = 0; i < bike.length; i++)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("Manufacturer: ");
            String manufacturer = input.nextLine();
            System.out.print("Model: ");
            String model = input.nextLine();

            bike[i] = new Bike(manufacturer, model);

            System.out.println("\n");
        }

        for (int i = 0; i < bike.length; i++)
        {
            bike[i].showInfo();
        }
    }
}
