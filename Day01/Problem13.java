package Day01;

//swaping of two numbers

public class Problem13 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
