package Day05;

public class DigitCount {
    public static void main(String[] args) {
        int num = 5544875;
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.println("Digits = " + count);
    }
}
