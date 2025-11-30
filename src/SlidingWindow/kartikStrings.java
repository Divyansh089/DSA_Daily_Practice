package SlidingWindow;

public class kartikStrings {
    public static void main(String args[]){
        String s = "aabababbabaaaaaaabbaa";
        int k =3;
        System.out.println(Math.max(maxLen( k,s , 'a') , maxLen(k, s, 'b')));
    }

    public static int maxLen(int k , String s , char ch){
        int si = 0 , ei  = 0 , ans = 0 , flip = 0;

        while(ei < s.length()){
            if(s.charAt(ei) == ch) flip++;

            while(flip > k){
                if(s.charAt(si) == ch){
                    flip--;
                }
                si++;
            }
            ans = Math.max(ans , ei - si + 1);
            ei++;
        }
        return ans;
    }
}
