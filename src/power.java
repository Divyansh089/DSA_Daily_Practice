public class power {
    public static int power(int n  , int p){
        if(n == 0) return 0;
        if(p == 0){
            return 1;
        }

        return n * power(n , p-1);

    }
    public static void main(String [] args){
        int num = 2;
        int p = 5;
        System.out.println(power(num , p));
    }
}
