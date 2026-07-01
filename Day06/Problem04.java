package Day06;
import java.util.Scanner;

public class Problem04{
    static int cube(int a){

        return a*a*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int value = sc.nextInt();
        System.out.println(cube(value));

        sc.close();
        
    }
    
}