package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        pcBuilder[] build = new pcBuilder[1];

        for (int i = 0; i < build.length; i++)
        {
            Scanner sc = new Scanner(System.in);

            Cpu();
            System.out.print("Enter CPU: ");
            int cpu = sc.nextInt();
            System.out.println(" ");
            AM4();
            System.out.print("Enter motherBoard: ");
            int motherBoard = sc.nextInt();

            System.out.println("Only 8gb and 16 ram are available as of now..\n");
            System.out.print("Ram Count: ");
            int ramCount = sc.nextInt();
            int ram;
            if (ramCount == 8)
            {
                ram8();
                System.out.print("Enter ram: ");
                ram = sc.nextInt();
            }
            else if (ramCount == 16)
            {
                ram16();

                System.out.print("Enter ram: ");
                ram = sc.nextInt();
            }
            
            System.out.print("Do you want an ssd or a hard Drive or both??\n1. SSD\n2. Hard Drive\n 3.Both\n");
            int choose = sc.nextInt();
            if(choose == 1)
            {
                SSD();
                System.out.print("Enter Storage:");
                int storage = sc.nextInt();
            }
            else if (choose == 2)
            {
                hardDrive();
                System.out.print("Enter Storage:");
                int storage = sc.nextInt();
            }
            
            do
            {
                gpu();
                System.out.println("Enter gpu: ");
                int graphicsCard = sc.nextInt();
            }
            while(gpuBottleNeck(cpu, graphicsCard));

            build[i] = new pcBuilder(cpu, motherBoard, ramcount, ram, storage);
        }
    }
    public static void Cpu()
    {
        System.out.println("_________CPU_____________\n"+
                "1. AMD Ryzen 3 3300X: $95.00 \n" +
                "2. Intel Core i5-10600K Comet Lake 6-Core 4.1 GHz LGA 1200 125W BX8070110600K Desktop Processor:  \n" +
                "3. AMD Ryzen 3 3100: $99.00\n"+
                "4. AMD RYZEN 5 3500X 6-Core 3.6 GHz (4.1 GHz Turbo) Socket AM4 65W 100-100000158CBX Desktop Processor: $184.18\n"+
                "5. AMD RYZEN 5 3600 6-Core 3.6 GHz (4.2 GHz Max Boost) Socket AM4 65W 100-100000031BOX Desktop Processor: $224.99\n");
    }

    public static void AM4()
    {
        System.out.println("________MOTHERBOARDS_________\n"+
                    "1. MSI PRO Z490-A PRO LGA 1200 Intel Z490 SATA 6Gb/s ATX Intel Motherboard\n"+
                    "2. MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard: $109.99\n"+
                    "3. GIGABYTE X570 AORUS MASTER AMD Ryzen 3000 PCIe 4.0 SATA 6Gb/s USB 3.2 AMD X570 ATX Motherboard: $369.99\n");
    }

    public static void ram16()
    {
        System.out.println(("______RAM________\n")+
                    "1. Corsair Vengeance LPX 16GB (2x8GB) DDR4 DRAM 3200MHz C16 Desktop Memory Kit -Black: $102.99\n"+
                    "2. HyperX Fury 16GB (2x8) 3200MHz DDR4 CL16 DIMM 1Rx8  RGB XMP Desktop Memory dual Stick: $71.00\n"+
                    "3. HyperX Fury 8GB 3200MHz DDR4 CL16 DIMM (Kit of 2)  Black XMP Desktop Memory: $86.99\n");
    }

    public static void ram8()
    {
        System.out.println("1. Corsair Vengeance LPX 8GB 3200MHz DDR4 Desktop RAM single stick: $50.00\n");
    }

    public static void hardDrive()
    {
        System.out.println("1. WD Blue 1TB Desktop Hard Disk Drive - 7200 RPM SATA 6Gb/s 64MB Cache 3.5 Inch: $41.99\n" +
                            "2. WD Black 1TB Performance Desktop Hard Disk Drive - 7200 RPM SATA 6Gb/s 64MB Cache 3.5 Inch: $69.99\n"+
                            "3. Seagate IronWolf 2TB NAS Hard Drive 5900 RPM 64MB Cache SATA 6.0Gb/s CMR 3.5: $81.99\n"+
                            "4. Seagate Archive HDD v2 ST5000AS0001 5TB 5900 RPM 128MB Cache SATA 6.0Gb/s 3.5: $248.00\n");
    }

    public static void SSD()
    {
        System.out.println("1. SAMSUNG 980 PRO M.2 2280 1TB PCI-Express Gen 4.0 x4, NVMe 1.3 Samsung V-NAND Internal Solid State Drive(SSD): $199.99\n"+
                            "2. Sabrent 2TB Rocket Nvme PCIe 4.0 M.2 2280 Internal SSD Maximum Performance Solid State Drive: $299.99\n");
    }

    public static void gpu()
    {
        System.out.println("1. GIGABYTE GeForce GTX 1660 OC 6G Graphics Card, 2 x WINDFORCE Fans, 6GB 192-Bit GDDR5, GV-N1660OC-6GD Video Card: $688.90\n"+
                            "2. GIGABYTE AORUS GeForce RTX 3060 Ti MASTER 8GB Video Card, GV-N306TAORUS M-8GD: $639.99\n"+
                            "3. GIGABYTE GeForce RTX 3070 GAMING OC 8GB Video Card, GV-N3070GAMING OC-8GD: $2,799.99\n"+
                            "4. EVGA GeForce RTX 3080 FTW3 ULTRA GAMING Video Card, 10G-P5-3897-KR, 10GB GDDR6X, iCX3 Technology, ARGB LED, Metal Backplate: $899.99\n");
    }
    public boolean gpuBottleNeck(int cpu, int gpu)
    {
        if ((cpu == 1 || cpu == 2 || cpu == 3) && (gpu == 2 || gpu == 3 || gpu == 4))
        {
            return true;
        }
        else if ((cpu == 4 || cpu == 5) && (gpu == 4 || gpu == 3))
        {
            return true;
        }
        
        return false;
    }
}