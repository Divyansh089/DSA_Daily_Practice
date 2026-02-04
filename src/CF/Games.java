//package CF;

import java.util.Scanner;

public class Games {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] h = new int[n] , a = new int[n];
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt(); a[i] = sc.nextInt();
        }
        int []cntH = new int [101] , cntA = new int[101];
        for(int i  = 0;i<n;i++){
            cntH[h[i]] ++ ; cntA[a[i]]++;
        }
        int ans =0;
        for(int i  = 1;i<=100;i++){
            ans += cntH[i] * cntA[i];
        }
        System.out.println(ans);
    }
}
