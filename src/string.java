import java.util.*;
public class string {
    // String Builder
    public static void main (String []args ){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        // for reversing a string
        for(int i =0; i< sb.length()/2 ; i++){
            int  b = sb.length() -1 -i;
            char fChar = sb.charAt(i), bChar = sb.charAt(b);
            sb.setCharAt(i,bChar);
            sb.setCharAt(b,fChar);
        }
        System.out.println(sb);
    }
}
