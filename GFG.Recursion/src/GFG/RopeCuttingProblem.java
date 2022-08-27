package GFG;

import java.util.Scanner;

public class RopeCuttingProblem {
    static int ropeCut(int l,int a,int b,int c){
        if(l==0){
            return 0;
        }
        if(l<0){
            return -1;
        }

        int res=Math.max(ropeCut(l-a, a, b, c),
                Math.max(ropeCut(l-b, a, b, c),
                        ropeCut(l-c, a, b, c)));
        if(res==-1){
            return -1;
        }
        return res+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(ropeCut(l,a,b,c));

    }
}
