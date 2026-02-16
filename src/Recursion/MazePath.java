package Recursion;

public class MazePath {
    public static void main(String args[]){
        int m  = 2 , n  = 2;
        paths(m , n , 0 , 0 , "");
    }
    public static void paths(int  m , int n , int h , int v , String ans){
        if(m ==  h && n ==v ){
            System.out.println(ans);
            return;
        }
        if(v >n || h > m) return ;
        paths(m , n ,h + 1 , v , ans  +"H" );
        paths( m  , n , h , v+1 , ans +"V");
    }
}
