package BitMasking;
// BitMasking : Bit(0/1) , Mask ( variable)

//& -> bit wise and , | ->or , ~ -> not  , ^ -> xor , >> -> right shift , << -> left shift
public class BM {
    //odd / even without %
    public static void main(String args[]){
        int n = 89;
        System.out.println(((n &1) == 1) ? "odd"  :"even");

        byte b = 127;
        System.out.println(Integer.MIN_VALUE << 1); // a>>n  : a/2 ^ n

        System.out.println((byte) -22);
    }


}
