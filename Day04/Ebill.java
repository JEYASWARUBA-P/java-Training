package Day04;

public class Ebill{

    public static void main(String[] args) {

        int units = 120;
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else {
            bill = (100 * 2) + (units - 100) * 3;
        }

        System.out.println("Electricity Bill = " + bill);
    }
}