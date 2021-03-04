package com.company;

public class Student {
    private static int id;
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
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
        if (gpa < 0.0f && gpa > 5.0f)
        {
            return true;
        }

        return false;
    }

    boolean promotionOrDemotion(float gpa)
    {
        if (gpaValidator(gpa))
        {
            if (gpa < 3.5)
            {
                return true;
            }
        }

        return false;
    }
}
