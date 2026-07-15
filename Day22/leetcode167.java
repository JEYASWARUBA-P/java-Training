package Day22;
import java.util.Arrays;

public class leetcode167 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1}; // 1-based indexing
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{-1, 0};
    }

    public static void main(String[] args) {

        leetcode167 obj = new leetcode167();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
