package DP;
import java.util.*;

public class Burst_Ballons {
    public static void main(String args[]) {
        int [] nums = {3,1,5,8};
        int[] a = new int[nums.length + 2];
        a[0] =a[a.length - 1] = 1;
        for(int i  = 0;i<nums.length;i++){
            a[i+1] = nums[i];
        }
        int [][] dp = new int [a.length][a.length];
        for(int[] s: dp){
            Arrays.fill(s , -1);
        }
        System.out.println(burst(a , 0 , a.length -1 , dp));
    }

    public static int burst(int[] a, int i , int j , int[][] dp){
        if(j-i +1 == 2){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MIN_VALUE;
        for(int k = i + 1;k<j;k++){
            int left  = burst(a , i , k , dp);
            int right = burst (a , k ,j , dp);
            int self = a[i]* a[j]*a[k];
            ans = Math.max(ans, left + right+ self);
        }
        return dp[i][j] = ans;
    }
}