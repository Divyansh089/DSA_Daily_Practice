package DP;

import java.util.Arrays;

public class coin_changeII {
    public static void main(String args[]){
        int amt = 5;
        int [] coins = {1,2,5};
        int dp[][] = new int[amt + 1][coins.length];
        for(int [] a: dp){
            Arrays.fill(a , -1);
        }
        System.out.println(coin(coins , amt , 0 ,dp));
        System.out.println(coinBU(coins ,amt));
    }
    public static int coin(int [] coin , int amt , int i , int [] [] dp){
        if(amt == 0) return 1;
        if(i == coin.length) return 0;
        if(dp[amt][i] != -1) return dp[amt][i];
        int inc = 0 , exc = 0;
        if(amt >= coin[i]){
            inc = coin(coin , amt - coin[i] , i , dp);
        }
        exc = coin(coin , amt , i + 1 , dp);
        return dp[amt][i] = inc + exc;
    }
    public static int coinBU(int [] coin , int amt ){
        int dp[][] = new int[coin.length + 1][amt + 1];
        for(int i = 0;i < dp.length;i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i< dp.length;i++){
            for(int am = 1;am <dp[0].length;am++){
                int inc = 0 , exc = 0;
                if(am >= coin[i-1]){
                    inc = dp[i][am-coin[i-1]];
                }
                exc = dp[i-1][am];
                dp[i][am] = inc + exc;
            }
        }
        return dp[dp.length -1][dp[0].length -1];
    }
}
