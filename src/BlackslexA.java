import java.util.*;
import java.io.*;

public class BlackslexA {
    public static void main(String args[]){
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n =sc.nextInt();
            int m= sc.nextInt();
            System.out.println( n * m +1);

        }
    }
}
