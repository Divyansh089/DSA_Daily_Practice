public class subSequence { // print all the possible subsequence of a string
    public static void printSub(String str , int n , String newStr){
        if(n == str.length()){
            System.out.println(newStr);
            return;
        }
        printSub(str , n+1 , newStr + str.charAt(n)); // want to
        printSub(str , n+1 , newStr); // not want to
    }
    public static void main(String [] args){
        String s = "abc";
        printSub(s , 0 , "");
    }
}
