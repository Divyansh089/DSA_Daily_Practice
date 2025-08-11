// find the sum of first n natural numbers using recursion.
public class sum {
    public static void printSum(int i , int n , int s){
        if(i == n){
            s += i;
            System.out.println(s);
            return;
        }
        s += i;
        printSum(i +1 , n , s);
    }
    public static void main(String [] args){
        int n = 10;
        printSum(1 , n , 0);
    }
}
