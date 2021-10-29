package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cpu[] cpu = new cpu[1];
        motherBoard[] motherBoard = new motherBoard[1];
//        motherBoard b = new motherBoard();

        Scanner sc = new Scanner(System.in);

        System.out.print("Input cpu: ");
        String cpu_1 = sc.nextLine();

        String motherBoard_1;
        do {
            System.out.print("Input motherBoard: ");
            motherBoard_1 = sc.nextLine();
        }
        while (!motherBoardSupport(cpu_1, motherBoard_1));

        cpu c1 = new cpu(cpu_1);
        motherBoard m1 = new motherBoard(motherBoard_1);
    }


    private static boolean motherBoardSupport(String cpu, String motherBoard) {
        if (cpu.contains("AM4") && motherBoard.contains("AM4")) {
            return true;
        } else if (cpu.contains("LGA") && motherBoard.contains("LGA")) {
            return true;
        }

        return false;
    }
}