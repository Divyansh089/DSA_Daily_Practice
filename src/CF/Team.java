package CF;

import java.util.Scanner;

public class Team {
    static  int c = 0;
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            StringBuilder sb = new StringBuilder();
            for(int  i = 0;i<3;i++){
                sb.append(sc.nextInt());
            }
            int a = Integer.parseInt(sb.toString() , 2);
            if(a  == 3 || a == 5 || a == 6 || a== 7){
                c++;
            }
        }
        System.out.println(c);
    }
}
