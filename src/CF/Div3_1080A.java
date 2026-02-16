package CF;

import java.util.*;

public class Div3_1080A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 67) {
                    f = true;
                }
            }
            System.out.println((f) ? "YES" :"NO");

        }

    }

}

