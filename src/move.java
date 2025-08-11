public class move { // MOVE THE 'X' TO THE END OF THE STRING
    public static void moveAll(String s ,  int n , int c , String ans){
        if(n == s.length()){
            for(int i =0; i< c;i++){
                ans += 'x';

            }
            System.out.println(ans);
            return ;
        }
        if(s.charAt(n) != 'x'){
            ans += s.charAt(n);
            moveAll(s , n + 1 , c , ans);
        }else{
            c++;
            moveAll(s , n+1 , c, ans);
        }
    }
    public static void main(String []args){
        String s = " axbxxcxd";
        moveAll(s , 0 , 0  , "");
    }
}
