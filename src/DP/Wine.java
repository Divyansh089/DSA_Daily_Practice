package DP;

public class Wine { // future based dp
    public static void main(String args[]){
        int [] wine = {2 , 3, 5 ,1, 4};
        System.out.println(maxProfit(wine , 0 , wine.length  - 1, 1));
        System.out.println((maxBU(wine)));
    }
    public static int maxBU(int [ ] wine){
        int [] [] dp = new int[wine.length][wine.length];
        int y = wine.length;
        for(int i = 0;i< dp.length;i++){
            dp[i][i] = wine[i] * y;
        }
        y--;
        for(int gap =1;gap<dp.length;gap++){
            for(int j = gap;j<dp.length;j++){
                int i  = j - gap;
                int fs = wine[i] * y + dp[i-1][j];
                int ls = wine[j] * y + dp[i][j-1];
                dp[i][j] = Math.max(fs , ls);
            }
            y--;
        }
        return dp[0][dp.length - 1];
    }

    public static int maxProfit(int[] wine , int i  , int j , int y){
        if(i > j){
            return 0;
        }
        int fs = wine[i] * y + maxProfit(wine


                , i+1 , j , y  + 1);
        int ls = wine[j] * y + maxProfit(wine , i , j-1 , y+1);
        return Math.max(fs , ls);
    }
}
