package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Ariq", 3);

        float gpa = s1.getGpa();

        s1.promotionOrDemotion(gpa);
    }
}
