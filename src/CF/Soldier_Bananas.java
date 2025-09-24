package CF;


import java.util.Scanner;

public class Soldier_Bananas {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt() , w = sc.nextInt();
        long amt = ((k*w)*(w+1))/2;
        long ask = amt -n;
        System.out.println(ask<0? 0: ask);
    }
}
