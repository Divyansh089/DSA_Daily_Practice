package CF;
import java.io.*;


public class SublimeSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int n = Integer.parseInt(parts[1]);
            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(x);
            }
        }
    }
}
