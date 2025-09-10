package DP;
import java.util.Arrays;
public class MinPathSumII {
    public static void main(String args[]) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int [] a: dp){
            Arrays.fill(a , -666666);
        }
        int ans = Integer.MAX_VALUE;
        for(int col = 0 ;col < matrix[0].length;col++){
            ans = Math.min(ans , paths(matrix , 0 , col, dp));
        }
        System.out.println(ans);
    }

    public static int paths(int [][] grid , int cr , int cc , int [][] dp ){

        if(cr == grid.length -1){
            return grid[cr][cc];
        }
        if(dp[cr][cc] != -666666){
            return dp[cr][cc];
        }
        int ans  = Integer.MAX_VALUE;
        for(int i  =0;i< grid[0].length;i++){
            if(i == cc){
                continue;
            }
            ans = Math.min(ans , paths(grid , cr + 1 , i , dp));
        }
        return dp[cr][cc] = ans + grid[cr][cc];
    }
}
