package CF;

import java.io.*;
import java.util.*;

public class Little_Fairy_Painting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        final long L = 1_000_000_000_000_000_000L;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashSet<Long> S = new HashSet<>();
            ArrayList<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());
                list.add(x);
                S.add(x);
            }
            if (L <= n) {
                out.append(list.get((int)L - 1)).append('\n');
                continue;
            }
            int K = S.size();
            long T = Long.MAX_VALUE;
            for (long v : S) if (v >= K && v < T) T = v;
            if (T == Long.MAX_VALUE) {
                long ans = K + (L - n) - 1;
                out.append(ans).append('\n');
            } else {
                long steps = T - K;
                long pos = L - n;
                if (pos <= steps) out.append(K + pos - 1).append('\n');
                else out.append(T).append('\n');
            }
        }
        System.out.print(out.toString());
    }
}


