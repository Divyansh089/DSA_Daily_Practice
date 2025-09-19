package CF;

import java.util.Scanner;

public class word {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        int u = 0 , l=0;
        for(int i = 0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                u++;
            }else{
                l++;
            }
        }
        System.out.println((l>=u)?s.toLowerCase():s.toUpperCase());

    }
}
