package CF;

import java.util.Scanner;

public class StonesTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for(int i  = 0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) c++;
        }
        System.out.println(c);
    }
}
