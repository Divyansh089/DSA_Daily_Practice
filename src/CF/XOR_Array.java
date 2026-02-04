package CF;

import java.util.*;

public class XOR_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();

            int[] pref = new int[n + 1];
            for (int i = 0; i <= n; i++) pref[i] = i;
            pref[r] = l - 1;

            for (int i = 1; i <= n; i++) {
                if (i > 1) out.append(' ');
                out.append(pref[i] ^ pref[i - 1]);
            }
            out.append('\n');
        }
        System.out.print(out);
        sc.close();
    }
}

