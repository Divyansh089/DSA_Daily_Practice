package DP;

import java.util.Arrays;

//Problem: 115(Distinct Subsequences)
public class DS {
    public static void main(String args[]){
        String s = "rabbbit";
        String t = "rabbit";
        int [][] dp = new int [s.length()][t.length()];
        for(int [] a: dp){
            Arrays.fill(a , -1);
        }
        System.out.println(Distinct(s , t , 0 , 0 , dp));
    }
    public static int Distinct(String s,  String t , int i  , int j , int [][] dp ){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int inc = 0 , exc = 0;
        if(s.charAt(i) == t.charAt(j)){
            inc = Distinct(s , t, i + 1 , j + 1 , dp);
        }
        exc = Distinct(s , t , i + 1 , j , dp);
        return dp[i][j] = inc + exc;
    }
}
