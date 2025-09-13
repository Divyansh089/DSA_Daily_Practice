package CF;

import java.util.Scanner;

public class BitPlus{
    static int x = 0;
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            String op = sc.next();
            if(op.equals("X++") || op.equals("++X")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
