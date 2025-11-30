package SlidingWindow;

public class LC713 {
    public static void main(String args[]){
        int [] arr = {1 , 2 , 3,  4 , 2};
        int si =0, ei=0 ,ans =0 , p =1 , k =10;
        while(ei<arr.length){
            p  *=  arr[ei]; // growing
            while(p>=k && si <= ei){ // shinking
                p /= arr[si];
                si++;
            }

            ans += (ei - si + 1);
            ei++;
        }
        System.out.println(ans);
    }
}
