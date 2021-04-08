package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        pcBuilder[] build = new pcBuilder[1];

        System.out.print("Enter CPU: ");
        String optCpu = sc.nextLine();
        System.out.println(" ");

        System.out.print("Enter motherBoard: ");
        String optMotherBoard = sc.nextLine();

        System.out.print("Enter gpu: ");
        String optGpu = sc.nextLine();

        System.out.print("Enter Ram: ");
        String  = sc.nextLine();
        String  = sc.nextLine();
        System.out.println(" ");

        build[1] = new pcBuilder(optRam, optMotherBoard, optStorage, optGpu, cpu, ram, storage, gpu);
    }
}   