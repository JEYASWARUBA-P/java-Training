package Day03;

import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Clear newline

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("Age = " + age);
        System.out.println("Address = " + address);
    }
}
