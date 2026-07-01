package Day06;

import java.util.Scanner;

public class SmallestOfThree {

    static int smallest(int a,int b, int c){
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else 
            return c;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(smallest(a, b,c) + " is the Smallest");    
        
        sc.close();
     }

    
}
