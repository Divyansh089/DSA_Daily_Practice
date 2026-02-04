import java.util.*;

public class BlackslexB {
    static long ab(int x) {
        return x < 0 ? -(long)x : (long)x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            long sum = 0;
            for (int i = 0; i < n - 1; i++) sum += ab(a[i] - a[i + 1]);

            long best = sum;

            best = Math.min(best, sum - ab(a[0] - a[1]));
            best = Math.min(best, sum - ab(a[n - 2] - a[n - 1]));

            for (int i = 1; i < n - 1; i++) {
                long left = ab(a[i - 1] - a[i]);
                long right = ab(a[i] - a[i + 1]);
                long mid = ab(a[i - 1] - a[i + 1]);
                long cur = sum - left - right + mid;
                if (cur < best) best = cur;
            }

            System.out.println(best);
        }
    }
}
