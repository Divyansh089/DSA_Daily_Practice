public class placeTiles { // place tiles of i xm in a floor of n xm and count the total number of way how you can put them
    public static int ways(int n  , int m){
        if(n < m){
            return 1;
        }
        if(n == m){
            return 2;
        }
        int v = ways(n - m , m);
        int h = ways(n-1 , m);
        return h + v;
    }
    public  static void main(String []args){
        int n = 4 , m=2;
        System.out.println(ways(n , m));
    }
}
