package DP;
import java.util.Arrays;
public class MinPathSum {
    public static void main(String args[]) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
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

    public  static int paths(int [][] grid , int cr , int cc , int [][] dp ){
        if(cc < 0|| cc >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr == grid.length -1){
            return grid[cr][cc];
        }
        if(dp[cr][cc] != -666666){
            return dp[cr][cc];
        }
        int ld = paths(grid , cr + 1 , cc - 1 , dp);
        int rd = paths(grid , cr + 1 , cc + 1 , dp);
        int d  = paths(grid , cr  +1 , cc  , dp);
        return dp[cr][cc] = Math.min(rd , Math.min(ld , d )) + grid[cr][cc];
    }

}
