package Day04;

import java.util.Scanner;

public class calc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println("Answer = " + (a + b));
                break;

            case '-':
                System.out.println("Answer = " + (a - b));
                break;

            case '*':
                System.out.println("Answer = " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Answer = " + (a / b));
                else
                    System.out.println("Division by zero is not allowed.");
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
