package Day02;

// A Number After a Double Reversal

public class Problem02 {

    public static boolean isSameAfterReversals(int num) {

        if (num == 0 || num % 10 != 0)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        int num = 526;

        System.out.println(isSameAfterReversals(num));
    }
}