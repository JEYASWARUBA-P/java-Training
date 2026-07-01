package Day06;
import java.util.Scanner;
public class Problem05 {
    static int oddeven(int a){
        if(a%2 == 0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    return 0 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers :");
        int a = sc.nextInt();
        oddeven(a);    
        
        sc.close();

    }
    
}
