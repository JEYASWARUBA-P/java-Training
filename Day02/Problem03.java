package Day02;

//Minimum Cuts to Divide a Circle

public class Problem03 {

    public static int numberOfCuts(int n) {

        if (n == 1)
            return 0;

        if (n % 2 == 0)
            return n / 2;
        if (n % 2 != 0)
            return n;

        return n;
    }

    public static void main(String[] args) {

        int n = 3;

        System.out.println(numberOfCuts(n));
    }
}