package GFG;

import java.util.Scanner;

public class Print1ToN {
    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.print(n+" ");
    }
    public static void printNTo1(int n) {  // Tail recursive call
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        printNTo1(n - 1);
    }
    public static void tailRecursivePrint1ToN(int n , int x) {  //Tail Recursive

        if (x == n+1) {
            return;
        }
        System.out.print(x+" ");
        tailRecursivePrint1ToN(n,x+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1ToN(n);
        System.out.println();
        printNTo1(n);
        System.out.println();
        tailRecursivePrint1ToN(n ,1);
        System.out.println();

    }
}
