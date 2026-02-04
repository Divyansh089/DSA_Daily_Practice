package CF;

import java.util.*;

public class A1742{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
            if(a + b == c || a + c == b || c + b == a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
