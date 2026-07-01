package Day05;

import java.util.Scanner;

public class StoreArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Stored Elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
