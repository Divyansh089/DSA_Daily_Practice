public class reverseString {
    public static void reverse(String s , int n ){
        if(n == 0){
            return;
        }
        System.out.print(s.charAt(n-1));
        reverse(s ,n-1);
    }
    public static void main(String []args){
        String s = "divyansh";
        int n  = s.length();
        reverse(s, n);
    }
}
