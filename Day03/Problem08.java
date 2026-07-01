package Day03;

public class Problem08 {

    public static void main(String[] args) {

        int number = -1234;

        int temp = Math.abs(number);
        int reverse = 0;

        while (temp != 0) {

            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        reverse = -reverse;

        System.out.println("Reverse = " + reverse);
    }
}
