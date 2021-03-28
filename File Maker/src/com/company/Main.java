package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many inputs do you want to make: ");
        int t = input.nextInt();

        FileMaker[] file = new FileMaker[t];

        for (int i = 0; i < file.length; i++)
        {
            System.out.print("File Name: ");
            String fileName = input.nextLine();
            System.out.print("File Type: ");
            String fileType = input.nextLine();

            file[i] = new FileMaker(fileName, fileType);

            System.out.println("\n");
        }

        for (int i = 0; i < file.length; i++)
        {
            file[i].showInfo();
        }
    }
}