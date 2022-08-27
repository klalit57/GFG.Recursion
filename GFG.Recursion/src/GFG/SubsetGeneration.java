package GFG;

import java.util.Scanner;

public class SubsetGeneration {
    public static void subsetGeneration(String str,String curr ,int i){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        subsetGeneration(str,curr,i+1);
        subsetGeneration(str,curr+str.charAt(i),i+1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        subsetGeneration(str,"", 0);
    }
}
