package Day03;

public class Problem03 {

    public static boolean isPalindrome(int x) {

        int original = x;
        int reverse = 0;

        while (x > 0) {

            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int num = 121;

        System.out.println(isPalindrome(num));
    }
}