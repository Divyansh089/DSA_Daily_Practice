package CF;

import java.util.HashSet;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> ans = new HashSet<>();
        for(char a :s.toCharArray()){
            ans.add(a);
        }
        System.out.println((ans.size() % 2 == 0 )? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
