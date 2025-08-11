public class inviteGuest { //invite n numbers of guest in your party and you two ways to do so ,either you can invite them as single or in a pair
    public static int invite(int n ){
        if(n <= 1){
            return 1;
        }
        //single
        int s = invite(n-1);
        //pair
        int p = (n-1) * invite(n-2);
        return s + p;
    }
    public  static void main(String []args){
        int n  = 4;
        System.out.println(invite(n));
    }
}
