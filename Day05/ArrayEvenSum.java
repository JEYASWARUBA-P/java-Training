package Day05;

public class ArrayEvenSum {

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of Even Numbers = " + sum);
    }
}
