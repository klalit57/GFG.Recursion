package GFG;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int n){
        if(n==0){
            return;
        }
        decimalToBinary(n/2);
        System.out.print(n%2);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        decimalToBinary(n);
    }

}
