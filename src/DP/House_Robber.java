package DP;
// Problem 198 LeetCode
import java.util.Arrays;
public class House_Robber {
    public static void main(String args[]){
        int []arr = {2,7,9,3,1};
        int [] dp = new int [arr.length];
        Arrays.fill(dp , -1);
        System.out.println(robber(arr , 0 , dp));
    }
    public static int robber(int [] arr , int i , int[] dp){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = arr[i] + robber(arr , i + 2 , dp);
        int dRob =  robber(arr , i + 1 , dp);
        return dp[i] = Math.max(rob , dRob);
    }
}
