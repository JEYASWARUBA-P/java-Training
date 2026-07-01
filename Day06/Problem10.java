package Day06;
import java.util.Scanner;
public class Problem10 {
    static int SumOfDigit(int a){
        int count=0;
        if(a>0){
            while(a%10 != 0){
                count++;
            }
        }
        else{
            count=0;
        }
           return count; 
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
         
        System.out.print("Sum of the digit is " + SumOfDigit(a) );

        sc.close();

    }
    
}