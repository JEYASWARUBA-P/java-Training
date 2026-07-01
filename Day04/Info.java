package Day04;

import java.util.Scanner;

public class Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
