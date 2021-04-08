package com.company;
// main e
public class pcBuilder {
    private static int id;
    private String cpu;
    private String motherBoard;
    private String ram;
    private int ramCount;
    private String storage;
    private int storageCount;
    private String gpu;
    private String casing;
    private String psu;
    private String monitor;
    private String keyboard;
    private String mouse;

    public pcBuilder(int cpu, int motherBoard, int ramCount, int ram, int storage, int s, int gpu)
    {
        setCpu(cpuChoise(cpu));
        setMotherBoard(motherBoardChoise(motherBoard));
        if (ramCount == 8)
        {
            setRam(ramChoise8(ram));
        }
        else
        {
            setRam(ramChoise16(ram));
        }
        if (s == 1)
        {
            setStorage(storageChoiseSSD(storage));
        }
        else
        {
            setStorage((storageChoiseHDD(storage)));
        }
        setGpu(gpuChoise(gpu));
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        pcBuilder.id = id;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getRamCount() {
        return ramCount;
    }

    public void setRamCount(int ramCount) {
        this.ramCount = ramCount;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getStorageCount() {
        return storageCount;
    }

    public void setStorageCount(int storageCount) {
        this.storageCount = storageCount;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCasing() {
        return casing;
    }

    public void setCasing(String casing) {
        this.casing = casing;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    private String cpuChoise(int cpu)
    {
        if (cpu == 1)
        {
            return "AMD Ryzen 3 3300X: $120";
        }
        else if(cpu == 2)
        {
            return "AMD Ryzen 3 3300G: $99";
        }
        else if(cpu == 3)
        {
            return "AMD Ryzen 3 3100: $99";
        }
        else if(cpu == 4)
        {
            return "AMD RYZEN 5 3500X 6-Core 3.6 GHz (4.1 GHz Turbo) Socket AM4 65W 100-100000158CBX Desktop Processor: $184.18";
        }
        else if(cpu == 5)
        {
            return "AMD RYZEN 5 3600 6-Core 3.6 GHz (4.2 GHz Max Boost) Socket AM4 65W 100-100000031BOX Desktop Processor: $224.99";
        }

        return "false";
    }

    private String motherBoardChoise(int motherBoard)
    {
        if (motherBoard == 1)
        {
            return "ASUS ROG Strix B550-F Gaming (WiFi 6) AMD AM4 (3rd Gen Ryzen) ATX Gaming Motherboard: $209.99";
        }
        else if(motherBoard == 2)
        {
            return "MSI B450 GAMING PLUS MAX AM4 AMD B450 SATA 6Gb/s ATX AMD Motherboard: $109.99";
        }
        else if(motherBoard == 3)
        {
            return "GIGABYTE X570 AORUS MASTER AMD Ryzen 3000 PCIe 4.0 SATA 6Gb/s USB 3.2 AMD X570 ATX Motherboard: $369.99";
        }

        return "false";
    }

    private String ramChoise16(int ram)
    {
        if (ram == 1)
        {
            return "1. Corsair Vengeance LPX 16GB (2x8GB) DDR4 DRAM 3200MHz C16 Desktop Memory Kit -Black: $102.99";
        }
        else if(ram == 2)
        {
            return "HyperX Fury 16GB (2x8) 3200MHz DDR4 CL16 DIMM 1Rx8  RGB XMP Desktop Memory dual Stick: $71.00";
        }
        else if(ram == 3)
        {
            return "HyperX Fury 8GB 3200MHz DDR4 CL16 DIMM (Kit of 2)  Black XMP Desktop Memory: $86.99";
        }

        return "false";
    }

    private String ramChoise8 (int ram)
    {
        if (ram == 1)
        {
            return "Corsair Vengeance LPX 8GB 3200MHz DDR4 Desktop RAM single stick: $50.00";
        }
        return "false";
    }

    private String gpuChoise(int gpu)
    {
        if (gpu == 1)
        {
            return "GIGABYTE GeForce GTX 1660 OC 6G Graphics Card, 2 x WINDFORCE Fans, 6GB 192-Bit GDDR5, GV-N1660OC-6GD Video Card: $688.90";
        }
        else if(gpu == 2)
        {
            return "GIGABYTE AORUS GeForce RTX 3060 Ti MASTER 8GB Video Card, GV-N306TAORUS M-8GD: $639.99";
        }
        else if(gpu == 3)
        {
            return "GIGABYTE GeForce RTX 3070 GAMING OC 8GB Video Card, GV-N3070GAMING OC-8GD: $2,799.99";
        }
        else if(gpu == 3)
        {
            return "EVGA GeForce RTX 3080 FTW3 ULTRA GAMING Video Card, 10G-P5-3897-KR, 10GB GDDR6X, iCX3 Technology, ARGB LED, Metal Backplate: $899.99";
        }

        return "false";
    }

    private String storageChoiseHDD(int storage)
    {
        if(storage == 1)
        {
            return "1. WD Blue 1TB Desktop Hard Disk Drive - 7200 RPM SATA 6Gb/s 64MB Cache 3.5 Inch: $41.99";
        }
        else if (storage == 2)
        {
            return "WD Black 1TB Performance Desktop Hard Disk Drive - 7200 RPM SATA 6Gb/s 64MB Cache 3.5 Inch: $69.99";
        }
        else if (storage == 3)
        {
            return "Seagate IronWolf 2TB NAS Hard Drive 5900 RPM 64MB Cache SATA 6.0Gb/s CMR 3.5: $81.99";
        }
        else if (storage == 4)
        {
            return "Seagate Archive HDD v2 ST5000AS0001 5TB 5900 RPM 128MB Cache SATA 6.0Gb/s 3.5: $248.00";
        }

        return "false";
    }

    private String storageChoiseSSD(int storage)
    {
        if(storage == 1)
        {
            return "SAMSUNG 980 PRO M.2 2280 1TB PCI-Express Gen 4.0 x4, NVMe 1.3 Samsung V-NAND Internal Solid State Drive(SSD): $199.99";
        }
        else if(storage == 2)
        {
            return "Sabrent 2TB Rocket Nvme PCIe 4.0 M.2 2280 Internal SSD Maximum Performance Solid State Drive: $299.99";
        }

        return "false";
    }

    public void showInfo()
    {
        System.out.println("_____________________________________FINAL SPECSHEET_____________________________________");
        System.out.println("Cpu: " + getCpu());
        System.out.println("Mother Board: " + getMotherBoard());
        System.out.println("Graphics Card: " + getGpu());
        System.out.println("Ram: " + getRam());
        System.out.println("Storage: " + getStorage());
        System.out.println("\n\n");
    }

    // public void calculate()
    // {
    //     Pattern p = Pattern.compile("\\d+");
    //     Matcher m = p.matcher("string1234more567string890");
    //     while(m.find()) 
    //     {
    //         System.out.println(m.group());
    //     }
    //     // Pattern pattern = Pattern.compile("[^0-9]");
    // }
}