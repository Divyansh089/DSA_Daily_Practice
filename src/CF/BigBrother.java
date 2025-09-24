package CF;

import java.util.Scanner;

public class BigBrother {
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int c = 0;
        while(n<=m){
            c++;
            n *=3;
            m *= 2;
        }
        System.out.println(c);
    }
}
