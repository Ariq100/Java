package com.company;

public class cpu {
    private String cpu;

    public cpu(String cpu) {
        setCpu(cpu);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    private void cpuStock()
    {
        String[] ryzen3_3300X = new String[]{"AMD Ryzen 3 3300X", "AM4", "95.00"};
        String[] ryzen3_3300G = new String[]{"AMD Ryzen 3 3300G", "AM4", "99"};
        
        String[] ryzen5_3500x = new String[] {"AMD RYZEN 5 3500X 6-Core 3.6 GHz (4.1 GHz Turbo)", "AM4", "184.18"};
        String[] ryzen5_3600 = new String[] {"AMD RYZEN 5 3600 6-Core 3.6 GHz (4.2 GHz Max Boost)", "AM4", "224.99"};

        String[] ryzen7_5800x = new String[] {"AMD Ryzen 7 5800x 8-core", "AM4", "500"};

        String[] ryzen9_57000x = new String[] {"AMD Ryzen 9 5700x 12-core", "AM4", "800"};

        String [][] RYZEN = new String[][] {ryzen3_3300G, ryzen3_3300X, ryzen5_3500x, ryzen5_3600, ryzen7_5800x, ryzen9_57000x};

        String[] intel_Corei5_11600T = new String[] {"Intel® Core™ i5-11600T Processor (12M Cache, up to 4.10 GHz)", "LGA", "217.50"};
    }

    public void showStock()
    {
        for (int i = 0;)
    }
}