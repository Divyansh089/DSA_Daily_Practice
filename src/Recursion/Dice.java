package Recursion;

public class Dice {
    public static void  main (String args[]){
        int n = 4;
        path(n , 0 , "");
    }
    public static void path( int n , int curr, String ans){
        if(curr > n) return;
        if(curr == n){
            System.out.println(ans);
            return;
        }
        path(n , curr +1 , ans + "1");
        path(n , curr + 2 , ans +"2");
        path(n , curr +3 , ans +"3");
    }
}
