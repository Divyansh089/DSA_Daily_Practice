package Recursion;

public class Gen_Parentheses {
    public static void main(String args[]){
        int n =3;
        gen(  n , 0 ,   0 , "" );
    }
    public static void gen(int n , int open , int close , String ans){
        if(open == n  && close == n){
            System.out.println(ans);
            return;
        }
        if(open  > n  || close > open) return ;
        gen(n , open + 1 , close , ans + "(");
        gen(n , open , close + 1 , ans + ")");
    }
}
