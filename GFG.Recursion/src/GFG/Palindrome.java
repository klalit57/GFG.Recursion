package GFG;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome1(String str,int start ,int end) { //My code
        if(start>=end){
            return true;
        }
        if(str.charAt(start)==str.charAt(end)){
            return isPalindrome1(str,start+1,end-1);
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome2(String str,int start ,int end) { //GFG
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && isPalindrome2(str,start+1,end-1);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(isPalindrome1(str,0,str.length()-1));
        System.out.println();
        System.out.println(isPalindrome2(str,0,str.length()-1));


    }
}
