public class pathMaze {// count the total number of possible in a maze from (0,0) to (n,m) rules:
                        // (i) you can move only one point at a time
                        // (ii) you can move either right or down
    public static int countPath(int i , int j , int n, int m ){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //for moving right
        int right = countPath(i , j +1, n , m );
        //for moving down
        int down = countPath(i +1 , j , n , m);
        return right + down;

    }

    public static void main(String [] args){
        int n = 3 , m = 3;
        System.out.println(countPath(0, 0 , n, m));
    }
}
