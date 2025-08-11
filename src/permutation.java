public class permutation { // print all the permutation of the given string
    public static void printPermutation(String str , String per){
        if(str.isEmpty()){
            System.out.println(per);
            return;
        }
        for(int i  =0 ;i<str.length();i++){
            String newStr = str.substring(0,i) + str.substring(i + 1);
            printPermutation(newStr , per + str.charAt(i));
        }
    }

    public static void main(String [] args){
        String s = "abc";
        printPermutation(s , "");
    }
}
