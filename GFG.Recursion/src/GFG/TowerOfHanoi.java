package GFG;

public class TowerOfHanoi {
    private static void towerOfHanoi1(int n, char a, char b, char c){
        if(n>0) {
            towerOfHanoi1(n - 1, 'a', 'c', 'b');
            System.out.println("Move " +n+ " from " +a+" to " +c );
            towerOfHanoi1(n - 1, 'b', 'a', 'c');
        }
    }

    private static void towerOfHanoi2(int n, char a ,char b , char c){
       if(n==1){
          System.out.println("Move disk 1 from "+a+" to "+c);
          return;
       }
        towerOfHanoi2(n-1,a,c,b);
        System.out.println("Move disk "+n+" from "+a+" to "+c);
        towerOfHanoi2(n-1,b,a,c);
    }



    public static void main(String[] args){

        towerOfHanoi1(3,'a','b','c');
        towerOfHanoi2(3,'a','b','c');







    }
}
