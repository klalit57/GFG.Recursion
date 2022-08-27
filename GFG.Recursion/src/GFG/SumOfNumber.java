package GFG;
import java.util.Scanner;

public class SumOfNumber {
    public static int sumOfNaturalNumber1(int n, int sum){
        if(n==0){
            return sum;
        }
        sum=sum+n;
        return sumOfNaturalNumber1(n-1,sum);
    }

    public static int sumOfNaturalNumber2(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNaturalNumber2(n-1);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(sumOfNaturalNumber1(n, 0));
        System.out.println();

        System.out.println(sumOfNaturalNumber2(n));
    }
}
