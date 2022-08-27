package GFG;

import java.util.Scanner;

public class NthFibonacciNumber {
   /* public static int nthFibonacci1(int a , int b , int n , int i){
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        int c = a + b;
        a = b;
        b = c;
        if(i==n){
            return c;
        }
        return nthFibonacci1(a, b, n,i++);
    }*/

    public static int nthFibonacci2(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return nthFibonacci2(n-1)+nthFibonacci2(n-2);
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthFibonacci2(n));
        System.out.println();
        //System.out.println(nthFibonacci1(n,0,1,3));


    }
}
