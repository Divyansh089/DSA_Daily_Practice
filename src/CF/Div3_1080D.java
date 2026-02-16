package CF;

import java.util.*;

public class Div3_1080D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] f = new long[n + 1];
            for (int i = 1; i <= n; i++) f[i] = sc.nextLong();

            long[] d = new long[n + 2];
            for (int i = 2; i <= n; i++) {
                d[i] = f[i] - f[i - 1];
            }

            long[] a = new long[n + 1];

            for (int i = 2; i <= n - 1; i++) {
                a[i] = (d[i + 1] - d[i]) / 2;
            }

            long pref = 0;
            for (int i = 2; i <= n - 1; i++) pref += a[i];

            long S = (d[2] - d[n]) / 2;
            a[1] = (S - pref) / 2;
            a[n] = a[1] - S;

            for (int i = 1; i <= n; i++) {
                out.append(a[i]);
                if (i < n) out.append(" ");
            }
            out.append('\n');
        }

        System.out.print(out);
        sc.close();
    }
}
