package BitMasking;

public class MagicNumber {
    public static void main(String args[]){
        int n = 9;
        System.out.println(NthNumber(n));

    }
    public static int NthNumber(int n ){
        int mul = 5;
        int ans =0;
        while(n>0){
            if((n & 1) != 0){
                ans += mul;
            }

            n >>=1;
            mul = mul * 5;
        }
        return ans;
    }
}
