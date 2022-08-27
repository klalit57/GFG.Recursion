package GFG;
import java.util.Scanner;

public class RecursionLog {
    public static int log(int n){
        if(n==1){
            return 0;
        }
        return 1+ log(n/2);

    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(log(n));
    }
}
