package Day05;
import java.util.Scanner;

public class Print2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();

        int[][] arr = new int[2][3];

        System.out.println("Enter 6 elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2-D Array:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
