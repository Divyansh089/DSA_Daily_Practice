import java.util.*;
public class BitMask {
    public static boolean getBit(int pos , int num){
        int bm = 1<<pos;
        if((bm & num) != 0 ) {
            return true;
        }
        return false;
    }
    public static int setBit(int pos , int num){
        int bm =1 << pos;
        return (bm | num);
    }
    public static int clearBit(int pos , int num){
        int bm  = 1 << pos;
        return (~(bm) & num);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bit Manipulation\nfor Get Bit press: b\nfor Set Bit press: s\nfor Clear Bit press: c\nfor Update Bit press: u");
        String ch = sc.next();
        System.out.println("Enter the position of bit:");
        int pos = sc.nextInt();
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(ch.toLowerCase().compareTo("b") == 0 ){
            System.out.println(getBit(pos , num) ? "Bit is one" : "Bit is zero");
        }else if(ch.toLowerCase().compareTo("s") == 0){
            System.out.println(Integer.toBinaryString(setBit(pos , num)));
        }else if(ch.toLowerCase().compareTo("c") == 0){
            System.out.println(Integer.toBinaryString(clearBit(pos , num)));
        }else if(ch.toLowerCase().compareTo("u") == 0){
            System.out.println("Enter the updated Bit:");
            int upBit = sc.nextInt();
            if(upBit == 1){ //use clear bit function
                System.out.println(Integer.toBinaryString(clearBit(pos, num)));
            }else{
                System.out.println(Integer.toBinaryString(setBit(pos , num)));
            }
        }else{
            System.out.println("Enter a valid input.");
        }
    }
}
