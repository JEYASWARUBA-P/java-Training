package Day06;

import java.util.Scanner;

public class Problem06 {

    static int large(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(large(a, b) + " is the largest");    
        
        sc.close();
     }

    
}
