package com.company;

public class Main {
    public static void main(String[] args)
    {
        Mobile m1 = new Mobile("Someone", "0124534545656756", 15, "Color os", true);
        m1.showInfo();

        float amount = 5;

        rechargeAmount(amount);

        m1.showInfo();

        Mobile m2 = new Mobile("Someone Else","345036056587768", 100,"ios", false);
        m2.showInfo();

        float amount = 100.10;

        rechargeAmount(amount);

        m2.showInfo();
    }
}