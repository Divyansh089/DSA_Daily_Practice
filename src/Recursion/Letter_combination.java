package Recursion;
// letter combination of  a phone number
public class Letter_combination {
    static String[] map  = { "" , "" , "abc" , "def" , "ghi"  , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
    public static void main(String args[]){
        String digits = "239";
        combination(digits , "");
    }
    public static void combination(String s , String ans){
        if(s.length() == 0){
            System.out.print(ans + " ");
            return ;
        }
        int num = s.charAt(0) -'0';
        String button = map[num];
        for(int i  =0;i<button.length();i++){
            combination(s.substring(1) , ans + button.charAt(i));
        }
    }
}
