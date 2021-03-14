package com.company;

public class Main {

    public static void main(String[] args) {
        ReadyPlayer player1 = new ReadyPlayer("SA","ariq100");

        player1.showInfo();

        System.out.println("\n\n");

        int readyCoins = 100;
        player1.setReadyCoins(readyCoins);

        int eliteCoins = 500;
        player1.buyEliteCoins(eliteCoins);

        player1.setUsername("m0r_EzZz");

        player1.setFullname("dokan");

        player1.showInfo();
    }
}
