package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        pcBuilder[] build = new pcBuilder[1];

        for (int i = 0; i < build.length; i++)
        {
            Scanner sc = new Scanner(System.in);

            Ryzen();
            System.out.print("Enter CPU: ");
            int cpu = sc.nextInt();
            System.out.println(" ");
            AM4();
            System.out.print("Enter motherBoard: ");
            int motherBoard = sc.nextInt();
            ram16();
            System.out.print("Enter ram: ");
            int ram = sc.nextInt();

            build[i] = new pcBuilder(cpu, motherBoard);
        }
    }

    public static void Ryzen()
    {
        System.out.println("1. AMD Ryzen 3 3300X: $120 \n" +
                "2. AMD Ryzen 3 3300G: $99 \n" +
                "3. AMD Ryzen 3 3100: $99\n");
    }

    public static void AM4()
    {
        System.out.println("1.ASUS ROG Strix B550-F Gaming (WiFi 6) AMD AM4 (3rd Gen Ryzen) ATX Gaming Motherboard: $209.99\n"+
                    "2. MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard: $109.99\n"+
                    "3. GIGABYTE X570 AORUS MASTER AMD Ryzen 3000 PCIe 4.0 SATA 6Gb/s USB 3.2 AMD X570 ATX Motherboard: $369.99\n");
    }

    public static void ram16()
    {
        System.out.println("1. Corsair Vengeance LPX 16GB (2x8GB) DDR4 DRAM 3200MHz C16 Desktop Memory Kit -Black: $102.99\n"+
                    "2. HyperX Fury 16GB (2x8) 3200MHz DDR4 CL16 DIMM 1Rx8  RGB XMP Desktop Memory dual Stick: $71.00\n"+
                    "3. HyperX Fury 8GB 3200MHz DDR4 CL16 DIMM (Kit of 2)  Black XMP Desktop Memory: $86.99\n");
    }

    // public static void ram8()
    // {
    //     System.out.println()
    // }
}