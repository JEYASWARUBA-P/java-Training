package Day02;

//Divisor Game

public class Problem04 {

    public static boolean divisorGame(int n) {

        return n % 2 == 0;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(divisorGame(n));
    }
}
