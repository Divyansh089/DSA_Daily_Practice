package BinarySearch;

public class kthRoot {
    public static void main(String args[]){
        int n  = 143;
        int k  = 3;
        System.out.println(root(n , k));
    }

    public static int root(int n , int k){
        int lo = 1 , hi = n , ans = 0;
        while(lo <= hi){
            int mid = (lo + hi )/2;
            if(Math.pow(mid , k) <= n){
                lo = mid + 1;
                ans = mid;
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }
}
