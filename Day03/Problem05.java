package Day03;

import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
    }
}
