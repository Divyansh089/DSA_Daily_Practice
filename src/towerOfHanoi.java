import java.net.StandardSocketOptions;


public class towerOfHanoi {
    public static int count = 0;
    public static void tower(int n , String s , String h , String d ){
        if(n == 0 ){
            //System.out.println("Transferring disk " + n + " from " + s + " to " + d);
            return ;
        }

        tower(n-1 , s , d , h );
        //System.out.println("Transferring disk " + n + " from " + s + " to " + d);
        count++;
        tower(n-1 , h , s , d );

    }

    public static void main(String [] args){

        int n = 3;
        tower(n , "source" , "helper", "destination");
        System.out.println(count);
    }
}
