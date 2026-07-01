package Day06;
import java.util.Scanner;
public class Problem08 {
    static int fact(int a){
        int pdt=1;
        for(int i=1; i<= a; i++)
            pdt*=i;
        return pdt;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
         
        System.out.print("factorial of " + a + " is " + fact(a) );

        sc.close();

    }
    
}
