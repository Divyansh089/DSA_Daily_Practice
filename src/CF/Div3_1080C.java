package CF;

import java.util.*;

public class Div3_1080C {

    static boolean f(int a, int b) {
        return a != b && a + b != 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int INF = (int)1e9;
            int[] dp = new int[7];
            int[] next = new int[7];

            for (int v = 1; v <= 6; v++) {
                dp[v] = (a[0] == v ? 0 : 1);
            }

            for (int i = 1; i < n; i++) {
                Arrays.fill(next, INF);

                for (int v = 1; v <= 6; v++) {
                    for (int u = 1; u <= 6; u++) {
                        if (f(u, v)) {
                            int cost = dp[u] + (a[i] == v ? 0 : 1);
                            if (cost < next[v]) next[v] = cost;
                        }
                    }
                }

                int[] tmp = dp;
                dp = next;
                next = tmp;
            }

            int ans = INF;
            for (int v = 1; v <= 6; v++) ans = Math.min(ans, dp[v]);
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
