**package GFG;


public class SubsetSum{
    public static int subSetSum( int []array , int n , int sum){
        if(n==0){
            return (sum==0)? 1:0;
        }
        return subSetSum(array,n-1,sum)+subSetSum(array,n-1 ,sum-array[n-1]);

    }
    public static void main(String [] args){
        int [] array= {10,20,15};
        System.out.println(subSetSum(array,3,25));
    }

}
