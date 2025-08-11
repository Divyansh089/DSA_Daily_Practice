public class fac {
    public static int printFac(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * printFac(n-1);
    }
    public static void main(String [] args){
        int n = 5;
        System.out.println(printFac(n));
    }
}
