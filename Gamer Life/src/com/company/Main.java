package com.company;

public class Main {

    public static void main(String[] args) {
        ReadyPlayer player1 = new ReadyPlayer("SA","ariq100");

//        player1.showInfo();

        int eliteCoins = 500;

        player1.buyEliteCoins(eliteCoins);

        System.out.println(player1.getEliteCoins());
    }
}
