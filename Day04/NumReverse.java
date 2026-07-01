package Day04;

public class NumReverse {

    public static void main(String[] args) {

        int number = 12345;
        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}
