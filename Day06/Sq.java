package Day06;
import java.util.Scanner;

public class Sq {
    static int square(int a){
        int sq=a*a;
        return sq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int value = sc.nextInt();
        System.out.println(square(value));
         
        sc.close();
        
    }
    
}
