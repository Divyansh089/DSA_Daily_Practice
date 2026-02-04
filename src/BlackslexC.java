import java.util.*;

public class BlackslexC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long a = Long.MAX_VALUE;
            long b = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long v = sc.nextLong();
                if (v < a) {
                    b = a;
                    a = v;
                } else if (v < b) {
                    b = v;
                }
            }

            long res = Math.max(a, b - a);
            System.out.println(res);
        }
    }
}
