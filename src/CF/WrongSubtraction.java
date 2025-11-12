package CF;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        long n = sc.nextInt() , k = sc.nextInt();
        while(k-- >0){
            if(n %10 == 0){
                n /= 10;
            }else{
                n -= 1;
            }
        }
        System.out.println(n);
    }
}
