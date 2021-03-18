package com.company;

public class Main {

    public static void main(String[] args) {
        Management acc1 = new Management("abc 12", "ariq", "Student Account", 0);
        acc1.showInfo();

        System.out.println("\n");

        Management acc2 = new Management( "12","awd", "Family Account", 0);
        acc2.showInfo();
//        float a = 10;
//        acc1.withdrawAmount(a);
    }
}
