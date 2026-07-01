package Day02;

public class Problem09 {

    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;
        double time = 2;

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest = " + compoundInterest);
    }
}
