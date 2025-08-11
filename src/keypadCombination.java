public class keypadCombination {
    public static String[] keypad  = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
    public static int c = 0;
    public static void printComb(String s , int n , String comb){
        if(n == s.length()){
            //System.out.println(comb);
            c++;
            return;
        }
        String map = keypad[s.charAt(n) - '0'];
        for(int i = 0 ; i < map.length();i++){
            printComb(s , n + 1 , comb + map.charAt(i));
        }
    }
    public static void main(String [] args){
        String s = "94";
        printComb(s , 0 , "");
        System.out.println("count " + c);
    }
}
