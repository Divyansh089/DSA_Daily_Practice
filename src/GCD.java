public class GCD {
    public static int gcd(int a , int b){
        if(a == 0 ){

            return b;
        }
        if(b == 0) {

            return a;
        }
        if(a<b && a != 0 && b != 0){
            return gcd(a , b%a);
        }else{
            return gcd(a%b, b);
        }
    }
    public static void main(String [] args){
        int a  = 25, b = 280;
        System.out.println("HCF = " + gcd(a , b));
        System.out.println("LCM = " + (a  * b)/gcd(a , b));

    }
}
