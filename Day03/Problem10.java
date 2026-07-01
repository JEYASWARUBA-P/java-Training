package Day03;

public class Problem10 {

    public static void main(String[] args) {

        int number = 987654;
        int count = 0;

        while (number != 0) {

            count++;
            number = number / 10;
        }

        System.out.println("Number of Digits = " + count);
    }
}