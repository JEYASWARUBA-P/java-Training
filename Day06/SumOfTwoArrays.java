package Day06;

import java.util.Arrays;

public class SumOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] sum = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println(Arrays.toString(sum));
    }
}