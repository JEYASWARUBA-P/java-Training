package Day31;

public class LC198 {

    static class Solution {

        public int rob(int[] nums) {

            int prev1 = 0;
            int prev2 = 0;

            for (int num : nums) {

                int temp = Math.max(prev1, prev2 + num);

                prev2 = prev1;
                prev1 = temp;
            }

            return prev1;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(obj.rob(nums));
    }
}
