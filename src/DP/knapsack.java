package DP;

import java.util.*;
public class knapsack {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] value = new int[n];
        int [] weight = new int[n];
        for(int i =0;i<n;i++){
            value[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            weight[i] = sc.nextInt();
        }

        int total = sc.nextInt();

        int [][] dp = new int[total + 1][n];
        for(int[] a:dp){
            Arrays.fill(a ,-1);
        }
        System.out.print(knapsack(weight , value , total ,0, dp));
    }
    public static int knapsack(int[] wt , int [] val , int cap , int i , int[][] dp){
        if(cap == 0 || i == wt.length){
            return 0;
        }
        if(dp[cap][i] != -1){
            return dp[cap][i];
        }
        int inc = 0 , exe = 0;
        if(cap >= wt[i]){
            inc = val[i] + knapsack(wt , val , cap -wt[i] , i + 1 , dp);
        }
        exe = knapsack(wt , val , cap , i + 1 , dp);
        return  dp[cap][i] = Math.max(inc , exe);
    }
}
