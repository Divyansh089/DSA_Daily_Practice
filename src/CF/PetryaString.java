package CF;
import java.util.Scanner;
public class PetryaString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(compare(s1 , s2));

    }
    public static int compare(String s1 , String s2){
        if(s1.compareToIgnoreCase(s2) == 0) return 0;
        return (s1.compareToIgnoreCase(s2) >0 ? 1: -1);
    }
}
