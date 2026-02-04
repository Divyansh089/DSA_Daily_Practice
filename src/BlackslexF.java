import java.util.*;

public class BlackslexF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode = sc.next();
        int t = sc.nextInt();

        char[] mp = new char[]{'r', 'g', 'b'};

        if (mode.equals("first")) {
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                int[] hd = new int[n + 1];
                Arrays.fill(hd, -1);
                int[] to = new int[2 * m];
                int[] nx = new int[2 * m];
                int ei = 0;

                for (int i = 0; i < m; i++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    to[ei] = b; nx[ei] = hd[a]; hd[a] = ei++;
                    to[ei] = a; nx[ei] = hd[b]; hd[b] = ei++;
                }

                int[] ds = new int[n + 1];
                Arrays.fill(ds, -1);
                int[] q = new int[n];
                int l = 0, r = 0;

                ds[1] = 0;
                q[r++] = 1;

                while (l < r) {
                    int u = q[l++];
                    for (int e = hd[u]; e != -1; e = nx[e]) {
                        int v = to[e];
                        if (ds[v] == -1) {
                            ds[v] = ds[u] + 1;
                            q[r++] = v;
                        }
                    }
                }

                char[] col = new char[n];
                for (int i = 1; i <= n; i++) col[i - 1] = mp[ds[i] % 3];

                System.out.println(new String(col));
            }
        } else {
            while (t-- > 0) {
                int qn = sc.nextInt();
                while (qn-- > 0) {
                    int d = sc.nextInt();
                    String c = sc.next();

                    boolean hr = false, hg = false, hb = false;
                    for (int i = 0; i < d; i++) {
                        char ch = c.charAt(i);
                        if (ch == 'r') hr = true;
                        else if (ch == 'g') hg = true;
                        else hb = true;
                    }

                    int cnt = (hr ? 1 : 0) + (hg ? 1 : 0) + (hb ? 1 : 0);
                    if (cnt == 1) {
                        System.out.println(1);
                        continue;
                    }

                    char miss = !hr ? 'r' : (!hg ? 'g' : 'b');
                    char want;
                    if (miss == 'r') want = 'b';
                    else if (miss == 'g') want = 'r';
                    else want = 'g';

                    int ans = 1;
                    for (int i = 0; i < d; i++) {
                        if (c.charAt(i) == want) {
                            ans = i + 1;
                            break;
                        }
                    }

                    System.out.println(ans);
                }
            }
        }
    }
}
