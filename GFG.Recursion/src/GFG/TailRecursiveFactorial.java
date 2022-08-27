package GFG;

import java.util.Scanner;

public class TailRecursiveFactorial {
    public static int factTailRecursive(int n, int fact){
        if(n==0 || n==1){
            return fact;
        }
        fact=n*fact;
        return factTailRecursive(n-1,fact);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factTailRecursive(n,1));
    }
}
