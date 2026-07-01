package Day04;

import java.util.Scanner;

public class TempSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
