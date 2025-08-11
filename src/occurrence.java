public class occurrence {
    // find the first and the last occurrence of a charactor in a String
    public static void find(String s , char x , int n , int f , int l){
        if(n == s.length() -1 ){
            System.out.println("First " + f +" , " + " last " + l);
            return ;
        }
        if(s.charAt(n) == x){
            if(f == -1){
                f = n;
            }else{
                l = n;
            }
        }
        find(s , x , n + 1 , f , l);

    }
    public static void  main(String []args){
        String s = "divyanshpatel";
        char x = 'a';
        find(s , x , 0 , -1 , -1);
    }
}
