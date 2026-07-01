package Day01;

//second largest number in an array

import java.util.Scanner;

public class Problem14{
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 20, 40};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}