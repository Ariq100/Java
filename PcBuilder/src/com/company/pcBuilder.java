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

    public pcBuilder(int cpu, int motherBoard, int ramCount, int ram, int storage, int gpu, String casing, String psu, String monitor, String keyboard, String mouse) {
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
        // setRamCount(ramCount);
        setStorage(storage);
        // setStorageCount(storageCount);
        setGpu(gpuchoise(gpu));
        setCasing(casing);
        setPsu(psu);
        setMonitor(monitor);
        // setKeyboard(keyboard);
        // setMouse(mouse);
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

    private String gpuchoise(int gpu)
    {
        if (gpu == 1)
        {
            return "GIGABYTE GeForce GTX 1660 OC 6G Graphics Card, 2 x WINDFORCE Fans, 6GB 192-Bit GDDR5, GV-N1660OC-6GD Video Card: $688.90";
        }
        else if(gpu == 2)
        {
            return "HyperX Fury 16GB (2x8) 3200MHz DDR4 CL16 DIMM 1Rx8  RGB XMP Desktop Memory dual Stick: $71.00";
        }
        else if(gpu == 3)
        {
            return "HyperX Fury 8GB 3200MHz DDR4 CL16 DIMM (Kit of 2)  Black XMP Desktop Memory: $86.99";
        }

        return "false";
    }

//    private boolean cpucompatibility(String cpu, String motherBoard)
//    {
//        if (cpu == cpu.contains("Ryzen 3") || cpu == cpu.contains("Ryzen 5") || cpu == cpu.contains("Ryzen 7")
//            return true;
//        }
//        else if ()
//    }
//
//    private boolean
}