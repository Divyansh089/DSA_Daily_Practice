package BinarySearch;
import java.util.*;
public class AggressiveCows {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int [] stall = new int[n];

            for(int i = 0;i < n;i++) stall[i] = sc.nextInt();
            Arrays.sort(stall);
            System.out.println(minDis(stall , c));
        }

    }

    public static int minDis(int [] stall , int c){
        int lo  =0 , hi =  stall[stall.length -1] - stall[0];
        int ans = 0;
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(isPossible(stall , c , mid)){
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int [] stall , int c , int mid){
        int cow = 1;
        int pos = stall[0];
        for(int i =1;i<stall.length;i++){
            if(stall[i] - pos >= mid){
                cow++;
                pos = stall[i];
            }
            if(cow == c) return true;
        }
        return false;

    }

}
