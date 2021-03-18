package com.company;

public class Student {
    private static int id;
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        if (gpaValidator(gpa))
        {
            this.name = name;
            this.gpa = gpa;

            object(gpa);
        }

        else
        {
            System.out.println("GPA must be more then 0.0 and less then 5.0");
        }
    }

    public void showInfo()
    {
        System.out.println("Name : " + this.name);
        System.out.println("GPA : " + this.gpa);
    }

    public float getGpa()
    {
        return gpa;
    }

    public boolean gpaValidator(float gpa)
    {
        if (gpa > 0.0f && gpa <= 5.0f)
        {
            return true;
        }

        return false;
    }

    public void object(float gpa)
    {
        if (promotionOrDemotion(gpa))
        {
            System.out.println("Promotion");
        }
        else
        {
            System.out.println("Demotion");
        }
    }

    boolean promotionOrDemotion(float gpa)
    {
        if (gpa > 3.5f)
        {
            return true;
        }

        return false;
    }
}