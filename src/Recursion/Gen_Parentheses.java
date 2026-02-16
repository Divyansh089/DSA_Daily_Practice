package Recursion;

import java.util.*;

public class Gen_Parentheses {
    public static void main(String args[]){
        int n =3;
        List<String> ll = new ArrayList<>();
        gen(  n , 0 ,   0 , ""  , ll);
    }
    public static void gen(int n , int open , int close , String ans , List<String> ll){
        if(open == n  && close == n){
            ll.add(ans);
            return;
        }
        if(open  > n  || close > open) return ;
        gen(n , open + 1 , close , ans + "(" , ll);
        gen(n , open , close + 1 , ans + ")" , ll);
    }
}
