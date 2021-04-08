package com.company;
import java.util.Scanner;

public class pcBuilder {
    private String optRam;
    private String optMotherBoard;
    private String optStorage;
    private String optGpu;
    // private String optCasing;
    // private String optPsu;
    // private String optMonitor;
    private String optCpu;
    private String[] cpu ;

    private String[] ram;
    private String[] storage;
    private String[] gpu;
    // private String[] casing;
    // private String[] psu;
    // private String[] monitor;

    public pcBuilder(String optRam, String optMotherBoard, String optStorage, String optGpu, String[] cpu, String[] ram, String[] storage, String[] gpu) {
        setOptRam(optRam);
        setOptMotherBoard(optMotherBoard);
        setOptStorage(optStorage);
        setGpu(gpu);
        setCpu(cpu);
        setStorage(storage);
        setGpu(gpu);
    }

    public String getOptRam() {
        return optRam;
    }

    public void setOptRam(String optRam) {
        this.optRam = optRam;
    }

    public String getOptMotherBoard() {
        return optMotherBoard;
    }

    public void setOptMotherBoard(String optMotherBoard) {
        this.optMotherBoard = optMotherBoard;
    }

    public String getOptStorage() {
        return optStorage;
    }

    public void setOptStorage(String optStorage) {
        this.optStorage = optStorage;
    }

    public String getOptGpu() {
        return optGpu;
    }

    public void setOptGpu(String optGpu) {
        this.optGpu = optGpu;
    }

    public String getOptCasing() {
        return optCasing;
    }

    public void setOptCasing(String optCasing) {
        this.optCasing = optCasing;
    }

    public String getOptPsu() {
        return optPsu;
    }

    public void setOptPsu(String optPsu) {
        this.optPsu = optPsu;
    }

    public String getOptMonitor() {
        return optMonitor;
    }

    public void setOptMonitor(String optMonitor) {
        this.optMonitor = optMonitor;
    }

    public String getOptCpu() {
        return optCpu;
    }

    public void setOptCpu(String optCpu) {
        this.optCpu = optCpu;
    }

    public String[] getCpu() {
        return cpu;
    }

    public void setCpu(String[] cpu) {
        this.cpu = cpu;
    }

    public String[] getRam() {
        return ram;
    }

    public void setRam(String[] ram) {
        this.ram = ram;
    }

    public String[] getStorage() {
        return storage;
    }

    public void setStorage(String[] storage) {
        this.storage = storage;
    }

    public String[] getGpu() {
        return gpu;
    }

    public void setGpu(String[] gpu) {
        this.gpu = gpu;
    }

    public String[] getCasing() {
        return casing;
    }

    public void setCasing(String[] casing) {
        this.casing = casing;
    }

    public String[] getPsu() {
        return psu;
    }

    public void setPsu(String[] psu) {
        this.psu = psu;
    }

    public String[] getMonitor() {
        return monitor;
    }

    public void setMonitor(String[] monitor) {
        this.monitor = monitor;
    }

    public void motherBoardPicker(){
        String[] x570 = {"GIGABYTE X570 AORUS MASTER", "AM4", "369.99"};
        String[] asusPrimeX399A = {"Asus Prime X399-A AMD", "TR4", "345.69"};

        if (optCpu == "1") {
            String[] motherBoard = x570;
        }
        else if(optCpu == "2") {
            String[] motherBoard = asusPrimeX399A;
        }

        else{
            System.out.println("Wrong input");
        }
    }

    public void cpuPicker(){
        String[] ryzen_5_3600x = {"ryzen 5 3600x", "AM4", "350"};
        String[] ryzen_3_3400g = {"ryzen 3 3400g", "AM4", "145"};

        if (optCpu == "1") {
            String[] cpu = ryzen_5_3600x;
        }
        else if(optCpu == "2") {
            String[] cpu = ryzen_3_3400g;
        }
        else{
            System.out.println("Wrong input");
        }
    }

    public void ramPicker(){
        String[] Corsair_Vengeance_16gb = {" Corsair_Vengeance_16gb" ,"16","3200mhz","DDR4","102.99"};
        String[] HyperxFury_16gb = {" HyperxFury_16gb","16","3200mhz","DDR4","71.00"};

        if (optCpu == "1") {
            String[] ram = Corsair_Vengeance_16gb ;
        }
        else if(optCpu == "2") {
            String[] ram = HyperxFury_16gb;
        }
        else{
            System.out.println("Wrong input");
        }
    }

    public void gpuPicker(){
        String[] GTX1660Ti = {"MSI Gaming GeForce GTX 1660","6"," 800"};
        String[] RTX3060 = {"ZOTAC Gaming GeForce RTX 3060 Twin Edge", "12", "1800"};

        if (optCpu == "1") {
            String[] gpu =  GTX1660Ti;
        }
        else if(optCpu == "2") {
            String[] gpu = RTX3060;
        }
        else{
            System.out.println("Wrong input");
        }
    }

    public void storagePicker(){
        String[] Blue_1TB_Desktop_Hard_Disk_Drive = {"1","41.99"};
        String[] Black_2TB_Performance_Desktop_Hard_Disk_Drive = {"2","69.99"};

        if (optCpu == "1") {
            String[] storage = Blue_1TB_Desktop_Hard_Disk_Drive;
        }
        else if(optCpu == "2") {
            String[] storage = Black_2TB_Performance_Desktop_Hard_Disk_Drive;
        }

        else{
            System.out.println("Wrong input");
        }
    }

    public void showInfo() {
        for(int i=0;i<cpu.length;i++)
        {
            System.out.print(cpu[i]);

        }
    }
}