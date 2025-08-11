import java.util.HashSet;
public class SSUnique {
    public static HashSet<String> hs = new HashSet<>();
    public static void printUnique(String str , int n , String newStr ,HashSet<String> hs  ){
        if(n == str.length()){
            if(hs.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                hs.add(newStr);
                return;
            }
        }
        printUnique(str , n + 1 , newStr  + str.charAt(n) ,hs);
        printUnique(str , n+ 1 , newStr , hs);

    }
    public static void main(String [] args){

        String s = "aaa";
        printUnique(s , 0 , "" , hs);
    }
}
