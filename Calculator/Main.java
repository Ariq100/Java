import java.util.Scanner;

public class Main {
    static void addition(int value_1, int value_2) 
    {
        System.out.print(value_1 + " + " + value_2 + " = ");
        System.out.print(value_1 + value_2);
    }

    static void subtraction(int value_1, int value_2) 
    {
        System.out.print(value_1 + " - " + value_2 + " = ");
        System.out.print(value_1 - value_2);
    }

    static void multiplication(int value_1, int value_2) 
    {
        System.out.print(value_1 + " * " + value_2 + " = ");
        System.out.print(value_1 * value_2);
    }

    static void divition(int value_1, int value_2) 
    {
        System.out.print(value_1 + " / " + value_2 + " = ");
        System.out.print(value_1 / value_2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        int value_1 = scanner.nextInt();

        System.out.print("Enter the second value : ");
        int value_2 = scanner.nextInt();

        System.out.print("Enter the operator : ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') 
        {
            addition(value_1, value_2);
        }

        else if (operator == '-') 
        {
            subtraction(value_1, value_2);
        }

        else if (operator == '*')
        {
            multiplication(value_1, value_2);
        }

        else if (operator == '/')
        {
            divition(value_1, value_2);
        }

        else 
        {
            System.out.print("Wrong input");
        }
    }
}