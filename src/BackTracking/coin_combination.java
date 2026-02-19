package BackTracking;

public class coin_combination {
    public static void main(String args[]){
        int coins [] = {2,3,5};
        int amt = 8;
        //permutation(coins , amt , "");
        combination(coins , amt , "" , 0);
    }
    public static void permutation(int [] coins , int amt , String ans){
        if( amt == 0){
            System.out.println(ans);
            return;
        }
        for(int i  = 0;i<coins.length;i++){
            if(amt >= coins[i]){
                permutation(coins , amt -coins[i] , ans + coins[i]);
            }
        }
    }public static void combination(int [] coins , int amt , String ans , int idx){
        if( amt == 0){
            System.out.println(ans);
            return;
        }
        for(int i  = idx;i<coins.length;i++){
            if(amt >= coins[i]){
                combination(coins , amt -coins[i] , ans + coins[i] , i);
            }
        }
    }
}
