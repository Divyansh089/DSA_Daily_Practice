package DP;

public class House_RobberII {
    public static void main(String args[]){
        int [] arr = {2,3,2};
        int [] dp = new int [arr.length];
        System.out.println(robber(arr , 0 , dp));
        System.out.print(BottomUp(arr));
    }
    public static int robber(int [] arr , int i , int [] dp){
        if(i < 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = arr[i] + robber(arr , i -2 , dp);
        int dRob = robber(arr , i - 1 , dp);
        return dp[i] = Math.max(rob , dRob);
    }
    public static int BottomUp(int [] arr){
        if(arr.length == 1){
            return arr[0];
        }

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);
        for(int i = 2; i< dp.length;i++){
            int rob = arr[i] + dp[i -2];
            int dRob = dp[i -1];
            dp[i]  = Math.max(rob , dRob);
        }
        return dp[dp.length -1];
    }
}
